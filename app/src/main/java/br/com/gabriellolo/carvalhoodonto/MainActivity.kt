package br.com.gabriellolo.carvalhoodonto


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*


class MainActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        var imgLogin = findViewById<ImageView>(R.id.imageView)
        imgLogin.setImageResource(R.drawable.imagem_login)


        botao_login.setOnClickListener { onClickLogin() }


    }

    private fun onClickLogin() {
        val texto_usuario = campo_usuario.text.toString()
        val senha_usuario = campo_senha.text.toString()
        //Toast.makeText(this,
        //    "Clicou no botão: $texto_usuario",
        //                                  Toast.LENGTH_SHORT).show()

        val usuario = "aluno"
        val senha = "impacta"

        if (texto_usuario == usuario && senha_usuario == senha) {

            val intent = Intent(this, TelaInicialActivity::class.java)
            startActivity(intent)
            Toast.makeText(
                this,
                "Login com sucesso!",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            Toast.makeText(
                this,
                "Usuário ou senha incorretos",
                Toast.LENGTH_LONG
            ).show()
        }

    }
}


        //val intent = Intent(this, TelaInicialActivity::class.java)

        //intent.putExtra("nome_usuario", texto_usuario)
        //intent.putExtra("numero", 10)

        //startActivity(intent)

