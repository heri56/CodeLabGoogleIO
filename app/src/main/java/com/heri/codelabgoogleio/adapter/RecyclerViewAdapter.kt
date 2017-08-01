package com.heri.codelabgoogleio.adapter

import android.support.v7.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.heri.codelabgoogleio.R
import com.heri.codelabgoogleio.model.IniDataView
import kotlinx.android.synthetic.main.layoutadapterdata.view.*

/**
 * Created by heri on 7/31/17.
 */

class RecyclerViewAdapter(private val rvData: ArrayList<IniDataView>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        var tvTitle: TextView
        var tvSubtitle: TextView
//        var tvTitl = v.tv_title
//        var tvSubtitl = v.tv_subtitle

        init {
            tvTitle = v.tv_title
            tvSubtitle = v.tv_subtitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // membuat view baru
        val v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutadapterdata, parent, false)
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        val vh = ViewHolder(v)
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
//        val name = rvData[position]
        val data : IniDataView = rvData[position]
        holder?.tvTitle?.text = data.title
        holder?.tvSubtitle?.text = data.subtitle
    }

    // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
    override fun getItemCount(): Int {
        return rvData.size //To change body of created functions use File | Settings | File Templates.
    }
}