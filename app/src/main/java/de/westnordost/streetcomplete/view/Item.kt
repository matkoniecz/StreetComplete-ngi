// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.view

data class Item<T>(
    val value: T?,
    val drawableId: Int? = null,
    val titleId: Int? = null,
    val descriptionId: Int? = null,
    val items: List<Item<T>>? = null) {
    val isGroup: Boolean get() = !items.isNullOrEmpty()
}