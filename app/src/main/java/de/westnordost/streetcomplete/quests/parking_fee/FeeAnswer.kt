// SPDX-FileCopyrightText: 2019 Tobias Zwick and contributors
//
// SPDX-License-Identifier: GPL-3.0-only

package de.westnordost.streetcomplete.quests.parking_fee

import de.westnordost.streetcomplete.quests.opening_hours.model.OpeningMonths

sealed class FeeAnswer

object HasFee : FeeAnswer()
object HasNoFee : FeeAnswer()
data class HasFeeAtHours(val hours:List<OpeningMonths>) : FeeAnswer()
data class HasFeeExceptAtHours(val hours:List<OpeningMonths>) : FeeAnswer()