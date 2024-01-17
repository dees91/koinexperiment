package pl.deesoft.koinexperiment.experiment

import android.os.Bundle
import android.widget.Toast
import org.koin.androidx.scope.ScopeActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import pl.deesoft.koinexperiment.R
import pl.deesoft.koinexperiment.experiment.fragment.FragmentX
import pl.deesoft.koinexperiment.experiment.fragment.FragmentY

class ParentActivity : ScopeActivity() {

    private val activityViewModel: ParentViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)

        if (savedInstanceState == null) {
            val fragmentX = FragmentX()
            val fragmentY = FragmentY()

            supportFragmentManager.beginTransaction()
                .add(R.id.container_fragment_x, fragmentX)
                .commit()

            supportFragmentManager.beginTransaction()
                .add(R.id.container_fragment_y, fragmentY)
                .commit()
        }
        Toast.makeText(this, "In parent: ${activityViewModel.getNumber()}", Toast.LENGTH_LONG).show()
    }
}
