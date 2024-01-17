package pl.deesoft.koinexperiment.experiment.fragment

import androidx.lifecycle.ViewModel

class FragmentXViewModel(
    randomNumber: Int
) : ViewModel() {
    val label = "Fragment X got random number $randomNumber"
}