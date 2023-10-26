package com.iesam.recyclerviewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SuperHeroDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_super_hero_detail)

        val heroId = intent.extras?.getInt(HERO_ID_PARAM)

    }

    companion object {
        val HERO_ID_PARAM = "KEY_HERO_ID"
    }
}