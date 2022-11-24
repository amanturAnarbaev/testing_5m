package com.example.testing_5m

import android.os.Parcel
import android.os.Parcelable
import kotlin.math.round
import kotlin.Boolean as Boolean1

class Math {

    fun add(a: String, b: String): String {
        var result = ""


        if (a.isEmpty() || b.isEmpty()) {
            result = "please enter sth"
        } else if (a.intOrString() || b.intOrString()) {
            result = "cannot add letters"
        } else if (a.toInt() < 0 || b.toInt() < 0) {
            result = "cannot be negative number"
        }// else if () {
//            result = "we don't know this numbers"
//        }
//
        else {
            val n1 = a.toInt()
            val n2 = b.toInt()

            result = (n1 + n2).toString()
        }

        return result
    }


//    fun dotAddCase():Boolean{
//
//    }

    fun divide(a: String, b: String): String {
        var result = ""

        if (a.isEmpty() || b.isEmpty()) {
            result = "please enter sth"
        } else if (a.intOrString() || b.intOrString()) {
            result = "cannot divide letters"
        } else if (a.toInt() < 0 || b.toInt() < 0) {
            result = "cannot be negative number"
        } else if (a.toInt() == 0 || b.toInt() == 0) {
            result = "Math error"
        } else {
            val n1 = a.toInt()
            val n2 = b.toInt()

            result = (n1 / n2).toString()
        }

        return result
    }


    fun String.intOrString(): Boolean1 {
        val v = this.toIntOrNull()
        return when (v) {
            null -> true
            else -> false
        }
    }

}


