package br.com.gabriellolo.carvalhoodonto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*

class ConfigurarActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configurar)

        supportActionBar?.title = "Olá!"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
