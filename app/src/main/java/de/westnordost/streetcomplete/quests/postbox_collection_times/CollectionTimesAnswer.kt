// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests.postbox_collection_times

sealed class CollectionTimesAnswer

data class CollectionTimes(val times:List<WeekdaysTimes>) : CollectionTimesAnswer()
object NoCollectionTimesSign : CollectionTimesAnswer()