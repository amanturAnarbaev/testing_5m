package com.example.testing_5m

import android.os.Parcel
import android.os.Parcelable
import kotlin.math.round
import kotlin.Boolean as Boolean1

class Math {

    fun add(a: String, b: String): String {
        var result = ""


        if (a.toIntOrNull() != null || b.toIntOrNull() != null) {
            val num1 = a.toInt()
            val num2 = b.toInt()
            result = (num1 + num2).toString()
        }
       else if (a.toDoubleOrNull() != null || b.toDoubleOrNull() != null) {
            result = (a.toDouble()+b.toDouble()).toString()
        } else if (a.toIntOrNull() == null || b.toIntOrNull() == null) {
            result = "cannot add letters"
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "please enter smth"
        } else if (a.toInt() < 0 || b.toInt() < 0) {
            result = "cannot be negative number"
        } else {
            val n1 = a.toInt()
            val n2 = b.toInt()

            result = (n1 + n2).toString()
        }

        return result
    }


    fun divide(a: String, b: String): String {
        var result = ""
        if (a.toIntOrNull() != null || b.toIntOrNull() != null) {
            val num1 = a.toInt()
            val num2 = b.toInt()
            result = (num1 / num2).toString()
        }
        else if (a.toDoubleOrNull() != null || b.toDoubleOrNull() != null) {
            result = (a.toDouble()/b.toDouble()).toString()

        } else if (a.toIntOrNull() == null || b.toIntOrNull() == null) {
            result = "cannot divide letters"
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "please enter smth"
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


}


