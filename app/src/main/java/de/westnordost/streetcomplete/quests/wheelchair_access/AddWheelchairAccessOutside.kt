// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests.wheelchair_access

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.data.osm.SimpleOverpassQuestType
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao

class AddWheelchairAccessOutside(o: OverpassMapDataDao) : SimpleOverpassQuestType<String>(o) {

    override val tagFilters = "nodes, ways, relations with leisure=dog_park and !wheelchair"
    override val commitMessage = "Add wheelchair access to outside places"
    override val icon = R.drawable.ic_quest_wheelchair_outside

    override fun getTitle(tags: Map<String, String>) = R.string.quest_wheelchairAccess_outside_title

    override fun createForm() = AddWheelchairAccessOutsideForm()

    override fun applyAnswerTo(answer: String, changes: StringMapChangesBuilder) {
        changes.add("wheelchair", answer)
    }
}