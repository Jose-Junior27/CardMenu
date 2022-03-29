package br.com.cardmenu.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.widget.ImageViewCompat
import androidx.recyclerview.widget.RecyclerView
import br.com.cardmenu.R
import com.google.android.material.textview.MaterialTextView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {

    private val list : MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_businnes_card, parent, false)
        return ContactAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateList(list: List<Contact>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class ContactAdapterViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView) {

        private val tvName: MaterialTextView = itemView.findViewById(R.id.tv_nome)
        private val tvDescription: MaterialTextView = itemView.findViewById(R.id.tv_descricao)
        private val tvValue: MaterialTextView = itemView.findViewById(R.id.tv_valor)
        private val tvImage: ImageView = itemView.findViewById(R.id.tv_image)

        fun bind(contact: Contact) {
            tvName.text = contact.nome
            tvDescription.text = contact.descricao
            tvValue.text = contact.valor
            tvImage.setImageResource(contact.Imagem)
        }

    }
}