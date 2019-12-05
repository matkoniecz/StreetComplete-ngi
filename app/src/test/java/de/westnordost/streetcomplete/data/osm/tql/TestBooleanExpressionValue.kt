// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.osm.tql

class TestBooleanExpressionValue(private val value: String) : Matcher<String> {
    override fun matches(obj: String?) = obj == value
    override fun toString() = value
}