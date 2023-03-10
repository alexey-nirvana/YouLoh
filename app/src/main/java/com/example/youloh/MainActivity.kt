package com.example.youloh

import android.app.AlertDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.youloh.sound.SoundController
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private val COUNT_OF_BUTTONS = 12
    private var random = Random.nextInt(COUNT_OF_BUTTONS)
    private var buttons = emptyList<Button>()
    private var soundController: SoundController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButtons()
        soundController = SoundController(this)
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
        soundController?.playRandomSound()
        val button: Button = view as Button
        button.text = "ТЫ ЛОХ !!!"
        button.setBackgroundColor(Color.RED)
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setTitle("Поздравляю - ТЫ ЛОХ !!!")
        builder.setMessage("Начать игру заново ?")
        builder.setPositiveButton("YES") { dialog, which ->
// Действия при нажатии кнопки соглашения в диалоге: всплывающее сообщение и смена цвета фона                 Toast.makeText(applicationContext,"Ok, we change the app background.",Toast.LENGTH_SHORT).show()
            var i = 1
            for (it in buttons) {
                it.setBackgroundColor(Color.GRAY)
                it.text = "КНОПКА" + i
                i++
            }
            /*  buttons.forEach {
                  it.setBackgroundColor(Color.GRAY)
                  it.text = "КНОПКА"
                  // it.setOnClickListener(::newGame)
              }

             */
        }
        /*
        builder.setNegativeButton("No") { dialog, which ->
            Toast.makeText(applicationContext, "Нет - пидора ответ", Toast.LENGTH_SHORT).show()
        }
         */
        builder.setNeutralButton("Выйти из приложения") { _, _ ->
            Toast.makeText(applicationContext, "Ну и пошёл нахуй", Toast.LENGTH_SHORT)
                .show()
            finishAffinity()
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
        val random2 = Random.nextInt(12)
        random = random2
    }
}



