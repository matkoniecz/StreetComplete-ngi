// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.osm

import java.io.Serializable

import de.westnordost.osmapi.map.data.BoundingBox
import de.westnordost.osmapi.map.data.LatLon
import de.westnordost.streetcomplete.util.SphericalEarthMath.*

/** Information on the geometry of a quest  */
sealed class ElementGeometry : Serializable {
    abstract val center: LatLon
    // the bbox should not be serialized, his is why the bounds cannot be a (computed) property directly
    abstract fun getBounds(): BoundingBox
}

data class ElementPolylinesGeometry(val polylines: List<List<LatLon>>, override val center: LatLon) : ElementGeometry() {
    @delegate:Transient private val bbox by lazy { enclosingBoundingBox(polylines.flatten()) }
    override fun getBounds(): BoundingBox = bbox
}

data class ElementPolygonsGeometry(val polygons: List<List<LatLon>>, override val center: LatLon) : ElementGeometry() {
    @delegate:Transient private val bbox by lazy { enclosingBoundingBox(polygons.flatten()) }
    override fun getBounds(): BoundingBox = bbox
}

data class ElementPointGeometry(override val center: LatLon) : ElementGeometry() {
    @delegate:Transient private val bbox by lazy { enclosingBoundingBox(listOf(center)) }
    override fun getBounds(): BoundingBox = bbox
}