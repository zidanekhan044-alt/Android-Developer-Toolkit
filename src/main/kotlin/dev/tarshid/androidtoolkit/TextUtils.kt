
package dev.tarshid.androidtoolkit

/**
 * Text utility functions for Android Developer Toolkit.
 *
 * Provides reusable operations for everyday text processing.
 */
object TextUtils {

    /**
     * Removes leading and trailing whitespace
     * and replaces consecutive whitespace with one space.
     */
    fun normalizeWhitespace(text: String): String {
        return text.trim().replace(Regex("\\s+"), " ")
    }

    /**
     * Checks whether text contains only letters and digits.
     */
    fun isAlphanumeric(text: String): Boolean {
        return text.isNotEmpty() && text.all { it.isLetterOrDigit() }
    }

    /**
     * Counts the number of words in a text.
     */
    fun wordCount(text: String): Int {
        return normalizeWhitespace(text)
            .takeIf { it.isNotEmpty() }
            ?.split(" ")
            ?.size ?: 0
    }

    /**
     * Checks whether text is a palindrome.
     * Ignores spaces, punctuation and letter case.
     */
    fun isPalindrome(text: String): Boolean {
        val cleaned = text
            .filter { it.isLetterOrDigit() }
            .lowercase()

        return cleaned.isNotEmpty() &&
            cleaned == cleaned.reversed()
    }

    /**
     * Reverses the supplied text.
     */
    fun reverse(text: String): String {
        return text.reversed()
    }
}
