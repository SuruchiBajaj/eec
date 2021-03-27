package com.example.version

import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var topAnim: Animation? = null
    var bottomAnim: Animation? = null
    lateinit var image: ImageView
    lateinit var logo: TextView
    lateinit var slogan:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        topAnim=AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim=AnimationUtils.loadAnimation(this, R.anim.bottom_animation);


        image=findViewById(R.id.imageView);
        logo=findViewById(R.id.title_tv);
        slogan=findViewById(R.id.desc_tv);

        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);
    }
}