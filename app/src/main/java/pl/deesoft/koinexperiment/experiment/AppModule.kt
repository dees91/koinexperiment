package pl.deesoft.koinexperiment.experiment

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import pl.deesoft.koinexperiment.experiment.fragment.FragmentXViewModel
import pl.deesoft.koinexperiment.experiment.fragment.FragmentYViewModel
import pl.deesoft.koinexperiment.experiment.fragment.SomeDependency

val appModule = module {
    scope<ParentActivity> {
        factory { SomeDependency() }
        viewModelOf(::ParentViewModel)
        viewModelOf(::FragmentXViewModel)
        viewModelOf(::FragmentYViewModel)
    }
}
