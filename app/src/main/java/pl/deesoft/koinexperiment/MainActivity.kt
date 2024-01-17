package pl.deesoft.koinexperiment

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import pl.deesoft.koinexperiment.experiment.ParentActivity
import pl.deesoft.koinexperiment.experiment.appModule
import pl.deesoft.koinexperiment.ui.theme.KoinExperimentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startKoin {
            androidContext(this@MainActivity)
            modules(appModule)
        }

        setContent {
            KoinExperimentTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Button(onClick = {
                            startActivity(Intent(baseContext, ParentActivity::class.java))
                        }) {
                            Text("Parent activity")
                        }
                    }
                }
            }
        }
    }
}
