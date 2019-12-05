// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.upload

import de.westnordost.streetcomplete.data.VisibleQuestListener
import java.util.concurrent.atomic.AtomicBoolean

interface Uploader {
    var uploadedChangeListener: OnUploadedChangeListener?
    var visibleQuestListener: VisibleQuestListener?
        get() = null; set(_) {} // default empty implementation

    fun upload(cancelled: AtomicBoolean)
}