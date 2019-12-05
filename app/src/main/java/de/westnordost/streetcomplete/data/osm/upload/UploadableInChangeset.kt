// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.data.osm.upload

import de.westnordost.osmapi.map.data.Element
import de.westnordost.streetcomplete.data.osm.OsmElementQuestType

interface UploadableInChangeset {
    val source: String
    val osmElementQuestType: OsmElementQuestType<*>
    val elementType: Element.Type
    val elementId: Long
}