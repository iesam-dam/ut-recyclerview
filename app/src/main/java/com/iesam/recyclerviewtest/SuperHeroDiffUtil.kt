package com.iesam.recyclerviewtest

import androidx.recyclerview.widget.DiffUtil

class SuperHeroDiffUtil : DiffUtil.ItemCallback<SuperHero>() {

    override fun areItemsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
        return oldItem == newItem
    }
}