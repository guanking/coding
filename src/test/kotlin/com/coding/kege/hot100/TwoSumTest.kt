package com.coding.kege.hot100

import com.sun.jna.StringArray
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe


class TwoSumTest : FunSpec({
    val sut = TwoSum()

    context("twoSum") {
        data class Input(val nums: IntArray, val target: Int) {

        }

        withData(
            Input(intArrayOf(2, 7, 11, 15), 9) to intArrayOf(0, 1),
            Input(intArrayOf(3, 2, 4), 6) to intArrayOf(1, 2),
            Input(intArrayOf(3, 3), 6) to intArrayOf(0, 1),
            Input(intArrayOf(-3, 4, 3, 90), 0) to intArrayOf(0, 2)
        ) { (input, ret) ->
            sut.twoSum(input.nums, input.target) shouldBe ret
        }
    }

    context("groupAnagrams") {
        withData(
            arrayOf("eat", "tea", "tan", "ate", "nat", "bat") to setOf(
                setOf("bat"), setOf("nat", "tan"),
                setOf(
                    "ate", "eat", "tea"
                )
            ),
            arrayOf("") to setOf(setOf(""))
        ) { (strs, ret) ->
            sut.groupAnagrams(strs).map { it.toSet() }.toSet() shouldBe ret
        }
    }
})
