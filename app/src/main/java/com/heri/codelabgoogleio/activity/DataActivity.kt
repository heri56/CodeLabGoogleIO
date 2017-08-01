package com.heri.codelabgoogleio.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_data.*

import com.heri.codelabgoogleio.R
import com.heri.codelabgoogleio.adapter.RecyclerViewAdapter
import android.support.v7.widget.LinearLayoutManager
import com.heri.codelabgoogleio.model.IniDataView


class DataActivity : AppCompatActivity() {

    private var rvView: RecyclerView? = null
    private var adapter: RecyclerView.Adapter<*>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var dataSet: ArrayList<IniDataView>? = null

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        dataSet = ArrayList()
        initDataset()

        rvView = Rview
        rvView!!.setHasFixedSize(true)

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = LinearLayoutManager(this)
        rvView!!.layoutManager = layoutManager

        adapter = RecyclerViewAdapter(dataSet!!)
        rvView!!.adapter = adapter

    }

    private fun initDataset() {

        /**
         * Tambahkan item ke dataset
         * dalam prakteknya bisa bermacam2
         * tidak hanya String seperti di kasus ini
         */
//        val us = ArrayList<IniDataView>()
//        us.add("ok","kk")
        dataSet!!.add(IniDataView("Alfred","Jl. Silicon Valley"))
        dataSet!!.add(IniDataView("Bonch","Jl. 165 "))
        dataSet!!.add(IniDataView("Cesscau","Jl. Paris"))
        dataSet!!.add(IniDataView("Dendra", "Jl. Chiampla"))
        dataSet!!.add(IniDataView("Edward","Jl. Surabaya"))
        dataSet!!.add(IniDataView("Franklin","Jl. Menteng"))
        dataSet!!.add(IniDataView("Giovanni","Jl. Madiun"))
        dataSet!!.add(IniDataView("Handrianto Ginanjar","Jl. ESQ"))
        dataSet!!.add(IniDataView("Inggrid","Jl. Sultan Agung "))
        dataSet!!.add(IniDataView("John","Jl. Minang"))

    }
}