package com.sema.my1

import java.util.*

class Dice(val numSides: Int = 6) {
    fun roll(isRangesRandom: Boolean = true): Int{
        return if(isRangesRandom){
            (1..numSides).random()
        }else{
            Random().nextInt(numSides)+1
        }
    }
}