package br.com.gabriellolo.carvalhoodonto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*

class PacientesActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pacientes)

        supportActionBar?.title = "Pacientes!"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
