package com.heri.codelabgoogleio.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.heri.codelabgoogleio.R
import kotlinx.android.synthetic.main.layout.view.textviewname
import kotlinx.android.synthetic.main.layout.view.texviewaddres
import com.heri.codelabgoogleio.model.User

/**
 * Created by heri on 7/28/17.
 */

class ForecastListAdapter(val userlist: ArrayList<User>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val user : User = userlist[position]
        holder?.txtviename?.text = user.nama
        holder?.txtaddre?.text = user.address
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder{
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    class ViewHolder(iteview: View) : RecyclerView.ViewHolder(iteview){

        val txtviename = iteview.textviewname
        val txtaddre = iteview.texviewaddres
    }
}