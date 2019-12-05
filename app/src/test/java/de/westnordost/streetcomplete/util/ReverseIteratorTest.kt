// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.util

import org.junit.Test

import org.junit.Assert.*

class ReverseIteratorTest {

    @Test fun reverse() {
        val it = ReverseIterator(listOf("a", "b", "c"))
        assertEquals("c", it.next())
        assertEquals("b", it.next())
        assertEquals("a", it.next())
        assertFalse(it.hasNext())
    }
}