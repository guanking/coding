package com.coding.kege

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class AppTest : FunSpec({
    test("main") {
        1 + 1 shouldBe 2
    }
    context("app") {
        withData(
            1 + 1 to 2,
            1 + 2 to 3
        ) { (param, result) ->
            param shouldBe result
        }
    }
})
