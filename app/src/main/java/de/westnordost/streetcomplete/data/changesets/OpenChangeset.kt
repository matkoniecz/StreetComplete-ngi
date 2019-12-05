// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.changesets

/** A row in the OpenChangeset table  */
data class OpenChangeset(val questType: String, val source: String, val changesetId: Long)