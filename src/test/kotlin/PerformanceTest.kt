package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.nulls.beNull
import io.kotest.matchers.shouldNot
import io.kotest.property.Arb
import io.kotest.property.arbitrary.arbitrary
import io.kotest.property.arbitrary.list
import io.kotest.property.arbitrary.string
import io.kotest.property.checkAll

class PerformanceTest : StringSpec({

    "should run in seconds" {
        checkAll(1000, farmGen) { farm ->
            farm shouldNot beNull()
        }
    }

}) {

    private companion object {

        private val farmGen = arbitrary {
            Farm(
                Arb.list(cowGen, 0..5).bind(),
                Arb.list(pigGen, 0..5).bind()
            )
        }

        private val cowGen = arbitrary {
            Cow(
                Arb.string().bind(),
                Arb.list(calfGen, 0..5).bind()
            )
        }

        private val calfGen = arbitrary {
            Calf(
                Arb.string().bind(),
                Arb.list(Arb.string(), 0..5).bind()
            )
        }

        private val pigGen = arbitrary {
            Pig(
                Arb.string().bind(),
                Arb.list(pigletGen, 0..5).bind()
            )
        }

        private val pigletGen = arbitrary {
            Piglet(
                Arb.string().bind(),
                Arb.list(Arb.string(), 0..5).bind()
            )
        }

    }

}
