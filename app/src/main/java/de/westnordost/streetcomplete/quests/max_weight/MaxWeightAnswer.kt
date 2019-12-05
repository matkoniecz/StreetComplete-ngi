// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests.max_weight

sealed class MaxWeightAnswer

data class MaxWeight(val value: WeightMeasure) : MaxWeightAnswer()
object NoMaxWeightSign : MaxWeightAnswer()