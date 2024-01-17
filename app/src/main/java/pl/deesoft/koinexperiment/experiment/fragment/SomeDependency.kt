package pl.deesoft.koinexperiment.experiment.fragment

import kotlin.random.Random

class SomeDependency {
    val randomNumber = Random.nextInt(0, 10000)
}
