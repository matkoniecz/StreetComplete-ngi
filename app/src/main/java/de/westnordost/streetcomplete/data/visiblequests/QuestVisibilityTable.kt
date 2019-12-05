// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.visiblequests

object QuestVisibilityTable {
    const val NAME = "quest_visibility"

    object Columns {
        const val QUEST_TYPE = "quest_type"
        const val VISIBILITY = "visibility"
    }

    const val CREATE = """
        CREATE TABLE $NAME (
            ${Columns.QUEST_TYPE} varchar(255) PRIMARY KEY,
            ${Columns.VISIBILITY} int NOT NULL
        );"""
}