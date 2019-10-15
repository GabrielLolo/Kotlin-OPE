package br.com.gabriellolo.carvalhoodonto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_buscar.*
import kotlinx.android.synthetic.main.toolbar.*

class BuscarActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar)

        supportActionBar?.title = "Olá!"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_buscar.setOnClickListener { onClickMessage() }
    }

    fun onClickMessage() {

        Toast.makeText(
            this,
            "Clicou em buscar!",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId

        if (id == android.R.id.home) {
            finish()
        }
        return true
    }
}

