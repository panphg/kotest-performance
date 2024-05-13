package com.example

data class Farm(
    val cows: List<Cow>,
    val pigs: List<Pig>
)

data class Cow(
    val name: String,
    val calves: List<Calf>
)

data class Calf(
    val name: String,
    val nickNames: List<String>
)

data class Pig(
    val name: String,
    val piglets: List<Piglet>
)

data class Piglet(
    val name: String,
    val nickNames: List<String>
)
