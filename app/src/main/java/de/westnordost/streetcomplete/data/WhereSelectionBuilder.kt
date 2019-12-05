// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data

class WhereSelectionBuilder {
    private val clauses = ArrayList<String>()
    private val clausesArgs = ArrayList<String>()

    val where: String get() = clauses.joinToString(" AND ") { it }
    val args: Array<String> get() = clausesArgs.toTypedArray()

    fun add(clause: String, vararg args: String) {
        clauses.add(clause)
        clausesArgs.addAll(args)
    }
}