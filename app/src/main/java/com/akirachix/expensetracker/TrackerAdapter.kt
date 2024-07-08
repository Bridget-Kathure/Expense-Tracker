package com.akirachix.expensetracker

import android.view.LayoutInflater
import android.view.ViewGroup


class TrackerAdapter(private val items: List<ViewHolder>) :

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.expenses, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount() Int{
        return expenseList.size

    }


override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item = e[position]
    holder.ivSalary.setImageResource(item.imageResource)
    holder.tvSalary.text = item.title
    holder.tvSalaryAmount.text = item.amount
    holder.tvSalaryDate.text = item.date
}



//
//    override fun getItemCount(): Int {
//        return contactsList.size
//    }
//
//    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
//        val contact = contactsList[position]
//        holder.tvName.text = contact.name
//        holder.tvEmail.text = contact.email
//        holder.tvPhoneNumber.text = contact.phoneNumber
//    }


}