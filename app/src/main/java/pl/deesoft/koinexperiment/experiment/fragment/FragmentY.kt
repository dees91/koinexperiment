package pl.deesoft.koinexperiment.experiment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.scope.ScopeFragment
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parameterSetOf
import pl.deesoft.koinexperiment.databinding.FragmentFragmentYBinding
import pl.deesoft.koinexperiment.experiment.ParentViewModel

class FragmentY : ScopeFragment() {

    private val activityViewModel: ParentViewModel by activityViewModel()
    private val viewModel: FragmentYViewModel by viewModel { parameterSetOf(activityViewModel.getNumber()) }
    private lateinit var binding: FragmentFragmentYBinding

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

    private fun bindView(inflater: LayoutInflater, parent: ViewGroup?): FragmentFragmentYBinding {
        return FragmentFragmentYBinding.inflate(inflater, parent, false)
    }
}
