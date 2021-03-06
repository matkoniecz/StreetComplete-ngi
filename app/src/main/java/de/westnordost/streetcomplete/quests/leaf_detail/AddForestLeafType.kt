// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests.leaf_detail

import de.westnordost.osmapi.map.data.BoundingBox
import de.westnordost.osmapi.map.data.Element
import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.data.osm.OsmElementQuestType
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder
import de.westnordost.streetcomplete.data.osm.download.MapDataWithGeometryHandler
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao
import de.westnordost.streetcomplete.data.osm.tql.getQuestPrintStatement
import de.westnordost.streetcomplete.data.osm.tql.toGlobalOverpassBBox

class AddForestLeafType(private val overpassServer: OverpassMapDataDao) : OsmElementQuestType<String> {
    override val commitMessage = "Add leaf type"
    override val icon = R.drawable.ic_quest_leaf

    override fun download(bbox: BoundingBox, handler: MapDataWithGeometryHandler): Boolean {
        return overpassServer.getAndHandleQuota(getOverpassQuery(bbox), handler)
    }

    private fun getOverpassQuery(bbox: BoundingBox) = """
        ${bbox.toGlobalOverpassBBox()}
        (
          way[landuse = forest][!leaf_type](if: length()<700.0);
          relation[landuse = forest][!leaf_type](if: length()<700.0);
          way[natural = wood][!leaf_type](if: length()<700.0);
          relation[natural = wood][!leaf_type](if: length()<700.0);
        );
        ${getQuestPrintStatement()}""".trimIndent()

    override fun isApplicableTo(element: Element):Boolean? = null

    override fun getTitle(tags: Map<String, String>) = R.string.quest_leafType_title

    override fun createForm() = AddForestLeafTypeForm()

    override fun applyAnswerTo(answer: String, changes: StringMapChangesBuilder) {
        changes.add("leaf_type", answer)
    }
}