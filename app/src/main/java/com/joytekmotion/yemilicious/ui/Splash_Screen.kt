package com.joytekmotion.yemilicious.ui

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.joytekmotion.yemilicious.R

class Splash_Screen : AppCompatActivity() {
    val SPLASH_SCREEN = 5000
    lateinit var music: MediaPlayer

    private lateinit var topAnimation: Animation
    private lateinit var bottomAnimation: Animation

    private lateinit var centerlogo: ImageView
    private lateinit var word1: TextView

    private lateinit var travelvehicle: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        travelvehicle = findViewById(R.id.travelvehicle)

//hide status bar

        val actionBar = supportActionBar
        actionBar!!.hide()

        //creating two animations
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bot_animation)

        centerlogo = findViewById(R.id.centerlogo)
        word1 = findViewById(R.id.word1)



        word1.animation = topAnimation
        centerlogo.animation = topAnimation
        travelvehicle.animation = bottomAnimation

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN.toLong())

    }
}