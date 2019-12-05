// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests

import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd
import de.westnordost.streetcomplete.mock
import de.westnordost.streetcomplete.quests.max_height.*
import org.junit.Test

class AddMaxHeightTest {

    private val questType = AddMaxHeight(mock())

    @Test fun `apply metric height answer`() {
        questType.verifyAnswer(
            MaxHeight(Meters(3.5)),
            StringMapEntryAdd("maxheight","3.5")
        )
    }

    @Test fun `apply imperial height answer`() {
        questType.verifyAnswer(
            MaxHeight(ImperialFeetAndInches(10, 6)),
            StringMapEntryAdd("maxheight","10'6\"")
        )
    }

    @Test fun `apply default height answer`() {
        questType.verifyAnswer(
            NoMaxHeightSign(true),
            StringMapEntryAdd("maxheight","default")
        )
    }

    @Test fun `apply below default height answer`() {
        questType.verifyAnswer(
            NoMaxHeightSign(false),
            StringMapEntryAdd("maxheight","below_default")
        )
    }
}