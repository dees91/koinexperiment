package pl.deesoft.koinexperiment.experiment.fragment

import androidx.lifecycle.ViewModel

class FragmentYViewModel(
    randomNumber: Int
) : ViewModel() {
    val label = "Fragment Y got random number $randomNumber"
}