
package dev.tarshid.androidtoolkit

/**
 * String extension utilities for Android Developer Toolkit.
 *
 * Provides reusable operations for everyday string processing.
 */

/**
 * Capitalizes the first character of a string.
 */
fun String.capitalizeFirst(): String {
    return replaceFirstChar {
        if (it.isLowerCase()) it.titlecase() else it.toString()
    }
}

/**
 * Checks whether a string contains only letters.
 */
fun String.isAlphabetic(): Boolean {
    return isNotEmpty() && all { it.isLetter() }
}

/**
 * Checks whether a string contains only digits.
 */
fun String.isNumeric(): Boolean {
    return isNotEmpty() && all { it.isDigit() }
}

/**
 * Extracts initials from a full name.
 */
fun String.initials(): String {
    return trim()
        .split(Regex("\\s+"))
        .filter { it.isNotEmpty() }
        .mapNotNull { it.firstOrNull()?.uppercase() }
        .joinToString("")
}

/**
 * Removes all whitespace from a string.
 */
fun String.removeWhitespace(): String {
    return filterNot { it.isWhitespace() }
}

/**
 * Reverses the string.
 */
fun String.reversedText(): String {
    return reversed()
}
