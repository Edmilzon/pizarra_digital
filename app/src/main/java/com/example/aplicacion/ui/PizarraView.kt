package com.example.aplicacion.ui

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

import com.example.aplicacion.model.DrawModel
import com.example.aplicacion.model.DrawPath

class PizarraView(context: Context, attrs: AttributeSet?):View(context, attrs){
    var model: DrawModel? = null
    private var currentPath: Path? = null
    private var currentPaint: Paint = Paint().apply{
        color= android.graphics.Color.BLACK
        style = Paint.Style.STROKE
        strokeWidth = 8f
        isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas){
        when (event.action){
            MotionEvent.ACTION_DOWN ->{
                
            }
        }
    }
}