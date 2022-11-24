package com.example.testing_5m

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun singlAdd(){
        assertEquals("6",math?.add("2","4"))
    }
    @Test
    fun checkEmpty(){
        assertEquals("you didn't write",math?.add("3","7"))
    }

    @Test
    fun CheckNumber(){
        assertEquals("caanot plus letters",math?.add("fe","jfiwe"))
    }
    @Test
    fun dotAddCase(){
        assertEquals("4.0",math?.add("2.0","2.0"))
    }
    @Test
    fun nagativeAddCase(){
        assertEquals("caanot be negative number",math?.add("-1","-3"))
    }
    @Test
    fun divideToZero(){
        assertEquals("Math Error",math?.divide("0","0"))
    }

    @After
    fun detach(){
        math=null
    }
}