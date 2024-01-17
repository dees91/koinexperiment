package pl.deesoft.koinexperiment.experiment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.scope.ScopeFragment
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parameterSetOf
import pl.deesoft.koinexperiment.databinding.FragmentFragmentXBinding
import pl.deesoft.koinexperiment.experiment.ParentViewModel

class FragmentX : ScopeFragment() {

    private val activityViewModel: ParentViewModel by activityViewModel()
    private val viewModel: FragmentXViewModel by viewModel { parameterSetOf(activityViewModel.getNumber()) }
    private lateinit var binding: FragmentFragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = bindView(inflater, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.label.text = viewModel.label
    }

    private fun bindView(inflater: LayoutInflater, parent: ViewGroup?): FragmentFragmentXBinding {
        return FragmentFragmentXBinding.inflate(inflater, parent, false)
    }
}
