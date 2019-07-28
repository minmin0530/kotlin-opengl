package com.continue_jump.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.opengl.GLSurfaceView

class MainActivity : AppCompatActivity() {

    private lateinit var gLView: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        gLView = MyGLSurfaceView(this)
        setContentView(gLView)
    }
}
