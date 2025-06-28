package com.example.aplicacion

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

import com.example.aplicacion.model.DrawModel
import com.example.aplicacion.controller.PizarraController
import com.example.aplicacion.ui.PizarraView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val model = DrawModel()
        val controller = PizarraController(model)

        val pizarraView = PizarraView(this, null)
        pizarraView.model = model

        setContentView(
            FrameLayout(this).apply {
                addView(pizarraView)
            }
        )
    }
}