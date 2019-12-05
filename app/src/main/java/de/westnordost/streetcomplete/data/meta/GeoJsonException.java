// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.meta;

public class GeoJsonException extends RuntimeException
{
	public GeoJsonException(Throwable cause) { super(cause); }
	public GeoJsonException(String message) { super(message); }
	public GeoJsonException(String message, Throwable cause) { super(message, cause); }
}