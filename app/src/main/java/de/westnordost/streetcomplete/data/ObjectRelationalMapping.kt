// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data

import android.content.ContentValues
import android.database.Cursor

interface ObjectRelationalMapping<T> {
    fun toContentValues(obj: T): ContentValues
    fun toObject(cursor: Cursor): T
}