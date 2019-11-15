package org.domestika.RPBComponent

import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.animation.DecelerateInterpolator
import com.facebook.react.views.view.ReactViewGroup


class RoundedProgressBar(context: Context) : ReactViewGroup(context) {

    private val oval = RectF()
    private var centerX: Float = 0F
    private var centerY: Float = 0F

    private val backgroundPaint = Paint().apply {
        color = Color.LTGRAY
        style = Paint.Style.STROKE
        strokeWidth = 10F
    }

    private val progressPaint = Paint().apply {
        color = Color.MAGENTA
        style = Paint.Style.STROKE
        strokeWidth = 20F
    }

    var percent: Float = 0f
        set(value) {
            field = value
            invalidate()
        }

    var radius: Float = 0F
        set(value) {
            field = value
            invalidate()
        }

    var progressWidth: Float = 10F
        set(value) {
            field = value
            setWidth(field, progressPaint)
        }

    var backgroundWidth: Float = 20F
        set(value) {
            field = value
            setWidth(field, backgroundPaint)
        }

    var progressBarColor: String = ""
        set(value) {
            if (value.isNotEmpty()) {
                field = value
                setColor(field, progressPaint)
            }
        }

    var backgroundBarColor: String = ""
        set(value) {
            if (value.isNotEmpty()) {
                field = value
                setColor(field, backgroundPaint)
            }
        }

    private fun setWidth(value: Float, progressPaint: Paint) {
        progressPaint.strokeWidth = value
        requestLayout()
        invalidate()
    }

    private fun setColor(color: String, progressPaint: Paint) {
        progressPaint.color = Color.parseColor(color)
        invalidate()
    }

    override fun onSizeChanged(width: Int, heigth: Int, oldwidht: Int, oldheight: Int) {
        centerX = width.toFloat() / 2
        centerY = heigth.toFloat() / 2
        radius = if (radius == 0F) width.toFloat() / 2 - progressWidth else radius
        oval.set(centerX - radius,
                centerY - radius,
                centerX + radius,
                centerY + radius)
        super.onSizeChanged(width, heigth, oldwidht, oldheight)
    }

    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)

        canvas?.drawCircle(centerX, centerY, radius, backgroundPaint)
        canvas?.drawArc(oval, 270f, 360f * percent, false, progressPaint)
    }

    fun setProgressWithAnimation(progress: Float) {
        val objectAnimator = ObjectAnimator.ofFloat(this, "percent", progress)
        objectAnimator.duration = 500
        objectAnimator.interpolator = DecelerateInterpolator()
        objectAnimator.start()
    }
}