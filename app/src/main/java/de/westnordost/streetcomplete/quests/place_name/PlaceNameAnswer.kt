// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests.place_name

sealed class PlaceNameAnswer

data class PlaceName(val name:String) : PlaceNameAnswer()
object NoPlaceNameSign : PlaceNameAnswer()