package br.com.gabriellolo.carvalhoodonto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class OpcoesAdapter(
    val opcoes: List<Opcoes>,
    val onClick: (Opcoes) -> Unit) :
        RecyclerView.Adapter<OpcoesAdapter.OpcoesViewHolder>() {
    class OpcoesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cardNome: TextView
        val cardImg : ImageView
        var cardProgress: ProgressBar
        var cardView: CardView
        init {
            cardNome = view.findViewById<TextView>(R.id.card_nome)
            cardImg = view.findViewById<ImageView>(R.id.card_img)
            cardProgress = view.findViewById<ProgressBar>(R.id.card_progress)
            cardView = view.findViewById<CardView>(R.id.card_opcoes)
        }
    }
    // Quantidade de disciplinas na lista
    override fun getItemCount() = this.opcoes.size
    // inflar layout do adapter
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): OpcoesViewHolder {
// infla view no adapter
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_opcoes, parent, false)
// retornar ViewHolder
        val holder = OpcoesViewHolder(view)
        return holder
    }
    override fun onBindViewHolder(holder: OpcoesViewHolder, position: Int) {
        val context = holder.itemView.context
// recuperar objeto disciplina
        val opcao = opcoes[position]
// atualizar dados de disciplina
        holder.cardNome.text = opcao.nome
        holder.cardProgress.visibility = View.VISIBLE
// download da imagem
        Picasso.with(context).load(opcao.foto).fit().into(holder.cardImg,

            object: com.squareup.picasso.Callback{
                override fun onSuccess() {
                    holder.cardProgress.visibility = View.GONE
                }
                override fun onError() {
                    holder.cardProgress.visibility = View.GONE
                }
            })

// adiciona evento de clique
        holder.itemView.setOnClickListener {onClick(opcao)}
    }
}