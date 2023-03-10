package com.example.youloh.sound

import android.content.Context
import android.media.SoundPool
import com.example.youloh.R
import kotlin.random.Random

class SoundController(
    private val context: Context
) {
    private val sounds = listOf(
        R.raw.m1, R.raw.m2, R.raw.m3, R.raw.m4, R.raw.m5, R.raw.m6, R.raw.m7, R.raw.m8,
        R.raw.m9, R.raw.m10, R.raw.m11, R.raw.m12, R.raw.m13, R.raw.m16,
        R.raw.m17, R.raw.m18, R.raw.m19, R.raw.m20, R.raw.m21, R.raw.m22,
        R.raw.m23, R.raw.m24,
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
        val randomIndex = Random.nextInt(ids.size - 1)
        soundPool.play(ids[randomIndex], 1.0f, 1.0f, 0, 0, 1.0f)
    }
}