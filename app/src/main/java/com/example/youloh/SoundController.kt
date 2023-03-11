package com.example.youloh

import android.content.Context
import android.media.SoundPool
import kotlin.random.Random

class SoundController(
    private val context: Context
) {
    private val sounds = listOf(
        R.raw.m17

    )
    private val ids = mutableListOf<Int>()
    private val soundPool = SoundPool.Builder()
        .setMaxStreams(50)
        .build()
        .also { pool ->
            sounds.forEach {
                ids.add(pool.load(context, it, 1))
            }
        }

    fun playRandomSound() {
     //   val randomIndex = Random.nextInt(ids.size - 1)
        soundPool.play(ids[0], 1.0f, 1.0f, 0, 0, 1.0f)
    }
}