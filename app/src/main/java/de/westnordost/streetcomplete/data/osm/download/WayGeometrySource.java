// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.osm.download;

import java.util.List;

import de.westnordost.osmapi.map.data.LatLon;

public interface WayGeometrySource
{
	List<LatLon> getNodePositions(long wayId);
}