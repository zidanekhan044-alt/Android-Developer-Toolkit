
package dev.tarshid.androidtoolkit

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TextUtilsTest {

    @Test
    fun normalizeWhitespace() {
        assertEquals(
            "Hello World",
            TextUtils.normalizeWhitespace("  Hello   World  ")
        )
    }

    @Test
    fun isAlphanumeric() {
        assertTrue(TextUtils.isAlphanumeric("Hello123"))
        assertFalse(TextUtils.isAlphanumeric("Hello 123"))
        assertFalse(TextUtils.isAlphanumeric(""))
    }

    @Test
    fun wordCount() {
        assertEquals(3, TextUtils.wordCount("Hello Kotlin World"))
        assertEquals(0, TextUtils.wordCount("   "))
    }

    @Test
    fun isPalindrome() {
        assertTrue(TextUtils.isPalindrome("Madam"))
        assertTrue(TextUtils.isPalindrome("Never odd or even"))
        assertFalse(TextUtils.isPalindrome("Android"))
    }

    @Test
fun reverse() {
    assertEquals(
        "niltoK",
        TextUtils.reverse("Kotlin")
    )
}
        )
    }
}
