package com.example.youloh

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private val COUNT_OF_BUTTONS = 12
    private var random = Random.nextInt(COUNT_OF_BUTTONS)
    private var buttons = emptyList<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButtons()
    }

    private fun setupButtons() {
        buttons = listOf(
            findViewById(R.id.button01),
            findViewById(R.id.button02),
            findViewById(R.id.button03),
            findViewById(R.id.button04),
            findViewById(R.id.button05),
            findViewById(R.id.button06),
            findViewById(R.id.button07),
            findViewById(R.id.button08),
            findViewById(R.id.button09),
            findViewById(R.id.button10),
            findViewById(R.id.button11),
            findViewById(R.id.button12),
        )
        buttons.forEach { it.setOnClickListener(::checkImLoh) }
    }

    private fun checkImLoh(view: View) {
        if (view !is Button) return

        if (view == buttons[random]) {
            popal(view)
        } else {
            view.text = "Мимо !"
            view.setBackgroundColor(Color.GREEN)
        }
    }

    private fun popal(view: View) {
        val button: Button = view as Button
        button.text = "ТЫ ЛОХ !!!"
        button.setBackgroundColor(Color.RED)

        val random2 = Random.nextInt(12)
        random = random2
    }
}


