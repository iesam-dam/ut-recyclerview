package com.iesam.recyclerviewtest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

class SuperHeroAdapter : ListAdapter<SuperHero, SuperHeroViewHolder>(SuperHeroDiffUtil()) {

    lateinit var onClick: (heroId: Int) -> Unit

    fun setEvent(onClick: (Int) -> Unit) {
        this.onClick = onClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_superhero_item, parent, false)
        return SuperHeroViewHolder(view)
    }

    override fun getItemCount(): Int = currentList.size

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.bind(currentList[position], onClick)
    }
}