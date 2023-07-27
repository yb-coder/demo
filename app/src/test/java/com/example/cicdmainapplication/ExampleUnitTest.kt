package com.example.cicdmainapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        assertEquals(4, Calculator().addition(2, 2))
        assertEquals(10, Calculator().addition(6, 4))
        assertEquals(22, Calculator().addition(2, 20))
    }

    @Test
    fun addition_isInCorrect() {
        assertNotEquals(4, 3 + 2)
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(4, Calculator().subtraction(6, 2))
        assertEquals(2, Calculator().subtraction(6, 4))
        assertEquals(202, Calculator().subtraction(222, 20))
    }

    @Test
    fun division_isCorrect() {
        assertEquals(4, Calculator().division(8, 2))
        assertEquals(3, Calculator().division(6, 2))
        assertEquals(22, Calculator().division(220, 10))
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(4, Calculator().multiply(2, 2))
        assertEquals(30, Calculator().multiply(15, 2))
        assertEquals(2200, Calculator().multiply(220, 10))
    }

    @Test
    fun modulus_isCorrect() {
        assertEquals(1, Calculator().modulus(15, 2))
        assertEquals(2, Calculator().modulus(17, 3))
        assertEquals(1, Calculator().modulus(10, 3))
    }
}
