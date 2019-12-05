// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.osm

import java.util.Date

import de.westnordost.streetcomplete.data.Quest
import de.westnordost.streetcomplete.data.QuestStatus
import de.westnordost.streetcomplete.data.osm.changes.StringMapChanges
import de.westnordost.streetcomplete.data.QuestType
import de.westnordost.osmapi.map.data.Element
import de.westnordost.osmapi.map.data.LatLon
import de.westnordost.streetcomplete.data.osm.upload.HasElementTagChanges
import de.westnordost.streetcomplete.data.osm.upload.UploadableInChangeset
import de.westnordost.streetcomplete.util.SphericalEarthMath

/** Represents one task for the user to complete/correct the data based on one OSM element  */
data class OsmQuest(
    override var id: Long?,
    override val osmElementQuestType: OsmElementQuestType<*>, // underlying OSM data
    override val elementType: Element.Type,
    override val elementId: Long,
    override var status: QuestStatus,
    override var changes: StringMapChanges?,
    var changesSource: String?,
    override var lastUpdate: Date,
    override val geometry: ElementGeometry
) : Quest, UploadableInChangeset, HasElementTagChanges {

    constructor(type: OsmElementQuestType<*>, elementType: Element.Type, elementId: Long, geometry: ElementGeometry)
        : this(null, type, elementType, elementId, QuestStatus.NEW, null, null, Date(), geometry)
    
    override val center: LatLon get() = geometry.center
    override val type: QuestType<*> get() = osmElementQuestType

    override val markerLocations: Array<LatLon> get() {
        if (osmElementQuestType.hasMarkersAtEnds && geometry is ElementPolylinesGeometry) {
            val polyline = geometry.polylines[0]
            val length = SphericalEarthMath.distance(polyline)
            if (length > 15 * 4) {
                return arrayOf(
                    SphericalEarthMath.pointOnPolylineFromStart(polyline, 15.0),
                    SphericalEarthMath.pointOnPolylineFromEnd(polyline, 15.0)
                )
            }
        }
        return arrayOf(center)
    }

    override fun isApplicableTo(element: Element) = osmElementQuestType.isApplicableTo(element)

    /* --------------------------- UploadableInChangeset --------------------------- */

    override val source: String get() = changesSource!!
}