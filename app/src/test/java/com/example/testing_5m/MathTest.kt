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
        assertEquals("please enter smth",math?.add("",""))
    }

    @Test
    fun CheckNumber(){
        assertEquals("caanot add letters",math?.add("fe","jfiwe"))
    }
    @Test
    fun dotAddCase(){
        assertEquals("4.0",math?.add("2.0","2.0"))
    }
    @Test
    fun nagativeAddCase(){
        assertEquals("-4",math?.add("-1","-3"))
    }


    @After
    fun detach(){
        math=null
    }
}