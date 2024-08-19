package com.coding.kege.hot100

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe


class TwoSumTest : FunSpec({
    context("twoSum") {
        data class Input(val nums: IntArray, val target: Int)

        val sut = TwoSum()
        withData(
            Input(intArrayOf(2, 7, 11, 15), 9) to intArrayOf(0, 1),
            Input(intArrayOf(3, 2, 4), 6) to intArrayOf(1, 2),
            Input(intArrayOf(3, 3), 6) to intArrayOf(0, 1),
            Input(intArrayOf(-3,4,3,90), 0) to intArrayOf(0, 2)
        ) { (input, ret) ->
            sut.twoSum(input.nums, input.target) shouldBe ret
        }
    }
})
