package com.iesam.recyclerviewtest

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.iesam.recyclerviewtest.databinding.ViewSuperheroItemBinding


class SuperHeroViewHolder(val view: View) :
    RecyclerView.ViewHolder(view) {

    private lateinit var binding: ViewSuperheroItemBinding

    fun bind(model: SuperHero, onClick: (Int) -> Unit) {
        binding = ViewSuperheroItemBinding.bind(view)

        binding.apply {
            image.loadUrl(model.urlImage)
            description.text = model.description
        }
        view.setOnClickListener {
            onClick.invoke(model.id)
        }
    }


}