package br.com.gabriellolo.carvalhoodonto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*

class NotificacoesActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificacoes)


        supportActionBar?.title = "Notificacoes!"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
