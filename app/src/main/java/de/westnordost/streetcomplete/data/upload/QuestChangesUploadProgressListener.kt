// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.upload

interface QuestChangesUploadProgressListener {
    fun onStarted()
    fun onProgress(success: Boolean)
    fun onError(e: Exception)
    fun onFinished()
}