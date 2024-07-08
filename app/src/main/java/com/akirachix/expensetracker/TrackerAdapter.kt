package com.akirachix.expensetracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TrackerAdapter(private val expenseList: List<Tracker>) :
    RecyclerView.Adapter<TrackerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.expenses, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return expenseList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = expenseList[position]
        holder.tvSalary.text = item.title
        holder.tvSalaryAmount.text = item.amount
        holder.tvSalaryDate.text = item.date
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvSalary: TextView = itemView.findViewById(R.id.tvSalary)
        val tvSalaryAmount: TextView = itemView.findViewById(R.id.tvSalaryAmount)
        val tvSalaryDate: TextView = itemView.findViewById(R.id.tvSalaryDate)
    }

}