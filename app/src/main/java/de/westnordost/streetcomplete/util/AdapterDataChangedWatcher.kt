// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.util

import androidx.recyclerview.widget.RecyclerView

class AdapterDataChangedWatcher(private val callback: () -> Unit) : RecyclerView.AdapterDataObserver() {

    override fun onItemRangeChanged(start: Int, count: Int) { callback() }
    override fun onItemRangeInserted(start: Int, count: Int) { callback() }
    override fun onItemRangeRemoved(start: Int, count: Int) { callback() }
    override fun onItemRangeMoved(from: Int, to: Int, count: Int) { callback() }
}