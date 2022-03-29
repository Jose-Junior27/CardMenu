package br.com.cardmenu.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.cardmenu.R

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_List)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        updateList()
    }

    private fun bindViews() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList() {
        val list = arrayListOf(
                Contact(
                        "Combo Big Picanha",
                        "Picannha Dupla \n" +
                                "Fritas \n"+
                                "Refri 500",
                        "R$15.00",
                        R.mipmap.ic_launcher_foreground

                ),
                Contact(
                        "Combo X-Tudo",
                        "Hamburguer e Salada \n" +
                                "Fritas \n" +
                                "Refri 500",
                        "R$12.00",
                        R.mipmap.ic_launcher_1_foreground
                ),
                Contact(
                        "Combo Americano",
                        "Churrasco e Salada \n" +
                                "Fritas \n" +
                                "Refri 500",
                        "R$14.00",
                        R.drawable.ic_paid
                ),
                Contact(
                        "Combo Burguer Duplo",
                        "Hamburguer duplo\n" +
                                "Fritas \n" +
                                "Refri 500",
                        "R$15.00",
                        R.drawable.ic_paid
                )
        )
        adapter.updateList(list)
    }

}