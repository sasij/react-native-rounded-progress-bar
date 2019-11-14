package com.domestika.customComponents.RoundedProgressBar

import android.graphics.Color
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp


class RoundedProgressBarViewManager : ViewGroupManager<RoundedProgressBar>() {

    companion object {
        private const val REACT_CLASS = "RoundedProgressBar"
    }

    override fun createViewInstance(reactContext: ThemedReactContext) = RoundedProgressBar(reactContext)

    override fun getName() = REACT_CLASS

    @ReactProp(name = "percentage")
    fun setPercentage(roundedProgressBar: RoundedProgressBar, value: Float) {
        roundedProgressBar.setProgressWithAnimation(value)
    }

    @ReactProp(name = "radius")
    fun setRadius(roundedProgressBar: RoundedProgressBar, value: Float) {
        roundedProgressBar.radius = value
    }

    @ReactProp(name = "progressWidth")
    fun setProgressWidth(roundedProgressBar: RoundedProgressBar, value: Float) {
        roundedProgressBar.progressWidth = value
    }

    @ReactProp(name = "backgroundWidth")
    fun setBackgroundWidth(roundedProgressBar: RoundedProgressBar, value: Float) {
        roundedProgressBar.backgroundWidth = value
    }

    @ReactProp(name = "progressBarColor")
    fun setProgressBarColor(roundedProgressBar: RoundedProgressBar, value: String) {
        roundedProgressBar.progressBarColor = value
    }

    @ReactProp(name = "backgroundBarColor")
    fun setBackgroundBarColor(roundedProgressBar: RoundedProgressBar, value: String) {
        roundedProgressBar.backgroundBarColor = value
    }

    @ReactProp(name = "backgroundColor")
    fun setBackgroundColor(roundedProgressBar: RoundedProgressBar, value: String) {
        roundedProgressBar.setBackgroundColor(Color.parseColor(value))
    }
}