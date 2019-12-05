// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.osm

import de.westnordost.osmapi.map.data.Element

data class ElementKey(val elementType: Element.Type, val elementId: Long)