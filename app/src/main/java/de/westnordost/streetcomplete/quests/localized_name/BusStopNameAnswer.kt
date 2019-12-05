// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests.localized_name

sealed class BusStopNameAnswer

object NoBusStopName : BusStopNameAnswer()
data class BusStopName(val localizedNames:List<LocalizedName>) : BusStopNameAnswer()