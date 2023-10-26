package com.iesam.recyclerviewtest

class ApiMock {
    companion object {
        fun getSuperHeroes() = mutableListOf<SuperHero>(
            SuperHero(
                1,
                "Superman",
                "SuperHero que vuela",
                "https://free-images.com/md/c8d1/superman_superhero_toy_hero.jpg"
            ),
            SuperHero(
                2,
                "Batman",
                "Batman, hombre murciélago",
                "https://free-images.com/md/2e80/batman_superman_lego_superhero.jpg"
            ),
            SuperHero(
                3,
                "Hulk",
                "Superhero muy fuerte",
                "https://free-images.com/md/232d/hulk_superhero_angry_strong.jpg"
            ),
            SuperHero(
                4,
                "WonderWoman",
                "WonderWoman que vuela",
                "https://free-images.com/md/6b70/wonder_woman_superhero_strong.jpg"
            ),
            SuperHero(
                5,
                "Cat Woman",
                "Mujer gato",
                "https://free-images.com/md/02b7/cat_woman_superhero_hero.jpg"
            ),
            SuperHero(
                6,
                "Robin",
                "Compañero de batman",
                "https://free-images.com/md/a8ea/robin_batman_hero_superhero.jpg"
            ),
        )
    }
}