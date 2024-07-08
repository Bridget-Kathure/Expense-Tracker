package com.akirachix.expensetracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TrackerAdapter<override>(private val items: List<ViewHolder>) :{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.expenses, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount() {} Int{
        return expenseList.size

    }


override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item = expenseList[position]
    holder.ivSalary.text = item.text
    holder.tvSalary.text = item.title
    holder.tvSalaryAmount.text = item.amount
    holder.tvSalaryDate.text = item.date
}



}

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    var tvSalary =itemView.findViewById<TextView>(R.id.tvSalary)
    var tvSalaryAmount = itemView.findViewById<TextView>(R.id.tvSalaryAmount)
    var tvSalaryDate = itemView.findViewById<TextView>(R.id.tvSalaryDate)
}