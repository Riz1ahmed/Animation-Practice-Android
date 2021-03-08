package com.example.animationpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rotation=AnimationUtils.loadAnimation(this,R.anim.rotation)
        val translation=AnimationUtils.loadAnimation(this,R.anim.translation)
        val scaleUp=AnimationUtils.loadAnimation(this,R.anim.scaling_up)
        val scaleDown=AnimationUtils.loadAnimation(this,R.anim.scaling_down)
        val alpha=AnimationUtils.loadAnimation(this,R.anim.alpha)
        val multi=AnimationUtils.loadAnimation(this,R.anim.multi_anim)
        val showAnim=AnimationUtils.loadAnimation(this,R.anim.show_anim)

        findViewById<Button>(R.id.btnRotation).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).startAnimation(rotation)
        }
        findViewById<Button>(R.id.btnTranslation).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).startAnimation(translation)
        }
        findViewById<Button>(R.id.btnScaling).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).startAnimation(scaleUp)
        }
        findViewById<Button>(R.id.btnAlpha).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).startAnimation(alpha)
        }
        findViewById<Button>(R.id.btnMulti).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).startAnimation(multi)
        }
        findViewById<Button>(R.id.hide).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).startAnimation(scaleDown)
            findViewById<ImageView>(R.id.imageView).visibility=View.GONE
        }
        findViewById<Button>(R.id.show).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).startAnimation(showAnim)
            findViewById<ImageView>(R.id.imageView).visibility=View.VISIBLE
        }

    }
}