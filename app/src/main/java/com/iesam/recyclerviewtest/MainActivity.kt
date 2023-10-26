package com.iesam.recyclerviewtest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.iesam.recyclerviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val superheroAdapter = SuperHeroAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupView()
        bind()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupView() {
        binding.apply {
            list.layoutManager = LinearLayoutManager(
                this@MainActivity,
                LinearLayoutManager.VERTICAL,
                false
            )
            superheroAdapter.setEvent { heroId ->
                navigateToDetail(heroId)
            }
            list.adapter = superheroAdapter
        }
    }

    private fun bind() {
        superheroAdapter.submitList(ApiMock.getSuperHeroes())
    }

    private fun navigateToDetail(heroId: Int) {
        val intent = Intent(this, SuperHeroDetailActivity::class.java)
        intent.putExtra(SuperHeroDetailActivity.HERO_ID_PARAM, heroId)
        startActivity(intent)
    }
}