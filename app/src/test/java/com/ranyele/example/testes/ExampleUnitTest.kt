package com.ranyele.example.testes

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    var SUT : PositiveNumberValidator? = null

    @Before
    fun setup() {
        SUT = PositiveNumberValidator()
    }

    @Test
    fun testeValorNegativo() {
        val result : Boolean? = SUT?.isPositive(-1)
        assertEquals(result, false)
    }

    @Test
    fun testeValorZerado() {
        val result : Boolean? = SUT?.isPositive(0)
        assertEquals(result, false)
    }

    @Test
    fun testeValorPositivo() {
        val result : Boolean? = SUT?.isPositive(7)
        assertEquals(result, true)
    }
}