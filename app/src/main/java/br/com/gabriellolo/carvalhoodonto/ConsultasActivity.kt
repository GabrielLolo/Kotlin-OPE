package br.com.gabriellolo.carvalhoodonto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.toolbar.*

class ConsultasActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultas)


        supportActionBar?.title = "Consultas!"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
