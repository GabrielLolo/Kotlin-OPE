package br.com.gabriellolo.carvalhoodonto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*
import kotlinx.android.synthetic.main.toolbar.*

class TelaInicialActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)


        val args = intent.extras
        val nome = args?.getString("nome_usuario")
        val n = args?.getInt("numero")

        texto_tela_inicial.setText("Bem vindo!")
        setSupportActionBar(toolbar)


        supportActionBar?.title = "Olá!"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_consultas.setOnClickListener{onClickConsultas()}
        btn_notificacao.setOnClickListener{onClickNotificacao()}
        btn_pacientes.setOnClickListener{onClickPacientes()}
    }



    fun onClickConsultas() {

        val intent = Intent(this, ConsultasActivity::class.java)
        startActivity(intent)
        Toast.makeText(
            this,
            "Clicou em consultas!",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun onClickNotificacao() {

        val intent = Intent(this, NotificacoesActivity::class.java)
        startActivity(intent)
        Toast.makeText(
            this,
            "Clicou em consultas!",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun onClickPacientes() {

        val intent = Intent(this, PacientesActivity::class.java)
        startActivity(intent)
        Toast.makeText(
            this,
            "Clicou em consultas!",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId

        if(id == R.id.action_atualizar){
            Toast.makeText(this,
                "Clicou em atualizar",
                Toast.LENGTH_SHORT).show()
        }
        if(id == R.id.action_configurar){
            Toast.makeText(this,
                "Clicou em configurar",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ConfigurarActivity::class.java)
            startActivity(intent)
        }
        if(id == R.id.action_buscar){
            Toast.makeText(this,
                "Clicou em buscar",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this, BuscarActivity::class.java)
            startActivity(intent)
        } else if (id == android.R.id.home){
            finish()
        }

        return super.onOptionsItemSelected(item)

    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.nav_disciplinas -> {
                Toast.makeText(
                    this,
                    "Clicou nas disciplinas",
                    Toast.LENGTH_SHORT).show()

            }
            R.id.nav_forum ->{
                Toast.makeText(
                    this,
                    "Clicou no forum",
                    Toast.LENGTH_SHORT).show()

                val intent = Intent(this, ForumActivity::class.java)
                startActivity(intent)
            }
        }

        layoutMenuLateral.closeDrawer(GravityCompat.START)

        return true
    }

    private fun configurarMenuLateral(){
        var toogle = ActionBarDrawerToggle(

            this,
            layoutMenuLateral,
            toolbar,
            R.string.open,
            R.string.close
        )

        layoutMenuLateral.addDrawerListener(toogle)
        toogle.syncState()

        menu_lateral.setNavigationItemSelectedListener(this)

}
