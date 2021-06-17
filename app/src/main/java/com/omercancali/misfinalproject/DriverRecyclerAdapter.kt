package com.omercancali.misfinalproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


//Standingsteki kodların görünmemesi için recyclerview kullanmayı denedim fakat düzgün şekilde implement edemedim :/


class DriverRecyclerAdapter(private var pointsAndDrivers : ArrayList<Driver>) : RecyclerView.Adapter<DriverRecyclerAdapter.DriverHolder>() {

    class DriverHolder(view:View) : RecyclerView.ViewHolder(view) {

        var recyclerDriverText : TextView? = null

        init {
            recyclerDriverText = view.findViewById(R.id.recyclerDriverText)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_view_row,parent,false)
        return DriverHolder(view)
    }

    override fun onBindViewHolder(holder: DriverHolder, position: Int) {
        //holder.recyclerDriverText?.text = pointsAndDrivers.sortedByDescending { driverStatsForPoints -> driverStatsForPoints.points }.toString()
        holder.recyclerDriverText?.text = pointsAndDrivers[position].toString()
    }

    override fun getItemCount(): Int {
        return pointsAndDrivers.size
    }

}