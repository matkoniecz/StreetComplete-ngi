// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests

import de.westnordost.streetcomplete.data.QuestGroup

interface IsShowingQuestDetails {
    val questId: Long
    val questGroup: QuestGroup
}