package com.example.aplicacion.controller

import com.example.aplicacion.model.DrawModel

class PizarraController(private val model: DrawModel) {
    fun clearBoard() {
        model.clear()
    }
} 