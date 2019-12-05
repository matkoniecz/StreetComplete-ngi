// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests.oneway.data

import de.westnordost.osmapi.map.data.LatLon

data class TrafficFlowSegment(val fromPosition: LatLon, val toPosition: LatLon)