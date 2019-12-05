// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.ktx

import java.io.File
import java.net.URL

fun URL.saveToFile(file: File) {
    openStream().use { input ->
        file.outputStream().use { output ->
            input.copyTo(output)
        }
    }
}