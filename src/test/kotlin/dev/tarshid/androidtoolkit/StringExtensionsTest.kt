
package dev.tarshid.androidtoolkit

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringExtensionsTest {

    @Test
    fun capitalizeFirst() {
        assertEquals("Hello", "hello".capitalizeFirst())
        assertEquals("Hello", "Hello".capitalizeFirst())
        assertEquals("", "".capitalizeFirst())
    }

    @Test
    fun isAlphabetic() {
        assertTrue("Android".isAlphabetic())
        assertFalse("Android123".isAlphabetic())
        assertFalse("".isAlphabetic())
    }

    @Test
    fun isNumeric() {
        assertTrue("123456".isNumeric())
        assertFalse("123abc".isNumeric())
        assertFalse("".isNumeric())
    }

    @Test
    fun initials() {
        assertEquals("TK", "Tarshid Khan".initials())
        assertEquals("JD", "John Doe".initials())
        assertEquals("", "".initials())
    }

    @Test
    fun removeWhitespace() {
        assertEquals(
            "HelloWorld",
            "Hello World".removeWhitespace()
        )
    }

    @Test
    fun reversedText() {
        assertEquals("niltoK", "Kotlin".reversedText())
        assertEquals("", "".reversedText())
        assertEquals("54321", "12345".reversedText())
    }
}
