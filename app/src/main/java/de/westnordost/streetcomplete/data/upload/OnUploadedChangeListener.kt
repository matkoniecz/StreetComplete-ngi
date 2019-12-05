// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.upload

interface OnUploadedChangeListener {
    fun onUploaded()
    fun onDiscarded()
}