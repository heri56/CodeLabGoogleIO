package com.heri.codelabgoogleio.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.heri.codelabgoogleio.R
import com.heri.codelabgoogleio.adapter.ForecastListAdapter
import com.heri.codelabgoogleio.model.User
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
//        Reycecle.layoutManager = LinearLayoutManager(this)
//        Reycecle.setHasFixedSize(true)
//        Reycecle.adapter = ForecastListAdapter(mutableListOf("A", "B", "C"))

        Reycecle.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val userarray = ArrayList<User>()
       userarray.add(User("Saya","Jalan Duri"))
       userarray.add(User("Aku","Jalan Duri"))
       userarray.add(User("Oke","Jalan Duri"))

        val adpt = ForecastListAdapter(userarray)

        Reycecle.adapter = adpt
        ButtonLanjut()
    }
    fun ButtonLanjut(){
        BtnLanjut.setOnClickListener { val Iniinten : Intent=Intent(applicationContext, DataActivity::class.java)
        startActivity(Iniinten)}
    }
}
