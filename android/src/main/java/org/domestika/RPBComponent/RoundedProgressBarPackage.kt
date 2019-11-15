package org.domestika.RPBComponent

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

class RoundedProgressBarPackage : ReactPackage{

    override fun createNativeModules(reactContext: ReactApplicationContext):
            MutableList<NativeModule> = mutableListOf()


    override fun createViewManagers(reactContext: ReactApplicationContext):
            MutableList<ViewManager<out View, out ReactShadowNode<*>>> =
            mutableListOf(RoundedProgressBarViewManager())
}