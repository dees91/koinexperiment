package pl.deesoft.koinexperiment.experiment

import androidx.lifecycle.ViewModel
import pl.deesoft.koinexperiment.experiment.fragment.SomeDependency

class ParentViewModel(
    private val someDependency: SomeDependency
) : ViewModel() {
    fun getNumber() = someDependency.randomNumber
}
