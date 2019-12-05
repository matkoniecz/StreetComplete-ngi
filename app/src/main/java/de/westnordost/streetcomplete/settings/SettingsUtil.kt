// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.settings

import android.view.View
import de.westnordost.streetcomplete.data.QuestType

fun genericQuestTitle(resourceProvider: View, type: QuestType<*>): String {
    // all parameters are replaced by generic three dots
    // it is assumed that quests will not have a ridiculously huge parameter count
    return resourceProvider.resources.getString(type.title, *Array(10){"…"})
}