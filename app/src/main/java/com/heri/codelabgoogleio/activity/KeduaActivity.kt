package com.heri.codelabgoogleio.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_kedua.*
import com.heri.codelabgoogleio.R

class KeduaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)
        tampillistview()
        klik()
    }
    fun tampillistview(){
        val data : Array<String> = resources.getStringArray(R.array.bahasa)
        val layout : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        ListView.adapter = layout
    }
    fun klik(){
        Btn.setOnClickListener {
            val Inten = Intent(this, RecyclerViewActivity::class.java)
        startActivity(Inten)}
    }
}
