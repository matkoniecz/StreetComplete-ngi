// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.ktx

import de.westnordost.streetcomplete.util.Serializer

inline fun <reified T> Serializer.toObject(bytes: ByteArray):T = toObject(bytes, T::class.java)