// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests

import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd
import de.westnordost.streetcomplete.mock
import de.westnordost.streetcomplete.quests.opening_hours.model.Weekdays
import de.westnordost.streetcomplete.quests.postbox_collection_times.*
import org.junit.Test

class AddPostboxCollectionTimesTest {

    private val questType = AddPostboxCollectionTimes(mock())

    @Test fun `apply no signed times answer`() {
        questType.verifyAnswer(
            NoCollectionTimesSign,
            StringMapEntryAdd("collection_times:signed", "no")
        )
    }

    @Test fun `apply collection times answer`() {
        questType.verifyAnswer(
            CollectionTimes(listOf(
                WeekdaysTimes(Weekdays(booleanArrayOf(true)), mutableListOf(60)),
                WeekdaysTimes(Weekdays(booleanArrayOf(false, true)), mutableListOf(120))
            )),
            StringMapEntryAdd("collection_times", "Mo 01:00, Tu 02:00")
        )
    }

}