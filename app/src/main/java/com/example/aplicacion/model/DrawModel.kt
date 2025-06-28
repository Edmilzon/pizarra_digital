package com.example.aplicacion.model

import android.graphics.Path
import android.graphics.Paint

data class DrawPath(val path: Path, val paint: Paint)

class DrawModel {
    val paths = mutableListOf<DrawPath>()

    fun addPath(path: DrawPath){
        paths.add(path)
    }

    fun clear(){
        paths.clear()
    }
}