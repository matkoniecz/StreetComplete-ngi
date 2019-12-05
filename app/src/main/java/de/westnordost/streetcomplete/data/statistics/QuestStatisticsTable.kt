// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.statistics

object QuestStatisticsTable {
    const val NAME = "quest_statistics"

    object Columns {
        const val QUEST_TYPE = "quest_type"
        const val SUCCEEDED = "succeeded"
    }

    const val CREATE = """
        CREATE TABLE $NAME (
            ${Columns.QUEST_TYPE} varchar(255) PRIMARY KEY,
            ${Columns.SUCCEEDED} int NOT NULL
        );"""
}