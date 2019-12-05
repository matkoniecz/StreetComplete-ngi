// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.util;

public interface Serializer
{
	byte[] toBytes(Object object);
	<T> T toObject(byte[] bytes, Class<T> type);
}