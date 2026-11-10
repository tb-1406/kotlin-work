// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here

    "Correct median for size=1" {
        median(listOf(42.0f)) shouldBe(42.0f plusOrMinus tolerance)
    }
    
    "Correct median for size=2"{
        median(listOf(2.0f, 4.0f)) shouldBe(3.0f plusOrMinus tolerance)
    }

    "Correct median for size=3"{
        median(listOf(1.0f, 5.0f, 3.0f)) shouldBe(3.0f plusOrMinus tolerance)
    }

    "Correct median for size=4"{
        median(listOf(10.0f, 20.0f, 30.0f, 40.0f)) shouldBe(25.0f plusOrMinus tolerance)
    }
})
