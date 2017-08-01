package com.heri.codelabgoogleio.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.heri.codelabgoogleio.R

class MainActivity : AppCompatActivity() {
    lateinit var btntengah: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Text1.text = "Hello Ini Layout Kotlin"
//        btntengah = findViewById(R.id.ButtonTenggah) as Button
        panggilbuttontenggah()
//        listviewandroid()

    }

    fun panggilbuttontenggah() {
        ButtonTenggah.setOnClickListener {
            toast("Ok ini toast")
            toast("Ok ini toast","Ini tag")
            toast("Ok ini toast","Ini tag", Toast.LENGTH_LONG)
            val intent = Intent(this, KeduaActivity::class.java)
            startActivity(intent)
        }
    }

    fun listviewandroid() {
//        val listview = findViewById(R.id.ListView) as ListView
//        val data : Array<String> = resources.getStringArray(R.array.bahasa)
        val data: Array<String> = resources.getStringArray(R.array.bahasa)
        val adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        ListView.adapter = adapter
    }

    fun toast(pesan: String, tag: String = MainActivity::class.java.simpleName, panjang: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, "[$tag] $pesan", panjang).show()
    }
}
