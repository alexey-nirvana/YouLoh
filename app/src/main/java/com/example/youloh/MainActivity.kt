package com.example.youloh

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var button01: Button
    private lateinit var button02: Button
    private lateinit var button03: Button
    private lateinit var button04: Button
    private lateinit var button05: Button
    private lateinit var button06: Button
    private lateinit var button07: Button
    private lateinit var button08: Button
    private lateinit var button09: Button
    private lateinit var button10: Button
    private lateinit var button11: Button
    private lateinit var button12: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button01 = findViewById(R.id.button01)
        button02 = findViewById(R.id.button02)
        button03 = findViewById(R.id.button03)
        button04 = findViewById(R.id.button04)
        button05 = findViewById(R.id.button05)
        button06 = findViewById(R.id.button06)
        button07 = findViewById(R.id.button07)
        button08 = findViewById(R.id.button08)
        button09 = findViewById(R.id.button09)
        button10 = findViewById(R.id.button10)
        button11 = findViewById(R.id.button11)
        button12 = findViewById(R.id.button12)

        val array = arrayOf(
            button01,
            button02,
            button03,
            button04,
            button05,
            button06,
            button07,
            button08,
            button09,
            button10,
            button11,
            button12
        )

        var random = Random.nextInt(array.size)

        fun popal(view: View) {
            val button: Button = view as Button
            button.text = "ТЫ ЛОХ !!!"
            button.setBackgroundColor(Color.RED)

            val random2 = Random.nextInt(12)
            random = random2
        }

        Log.wtf("Random = ", random.toString())

        button01.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button01.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button02.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button02.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button03.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button03.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button04.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button04.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button05.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button05.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button06.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button06.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button07.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button07.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button08.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button08.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button09.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button09.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button10.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button10.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button11.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button11.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }

        button12.setOnClickListener {
            if (it == array[random]) {
                popal(it)
            } else {
                button12.text = "Мимо !"
                it.setBackgroundColor(Color.GREEN)
            }
        }
    }
}


