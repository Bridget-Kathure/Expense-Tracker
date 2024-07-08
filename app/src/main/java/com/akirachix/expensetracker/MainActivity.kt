package com.akirachix.expensetracker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.expensetracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvTracker.layoutManager = LinearLayoutManager(this)
        displayExpenses()


    }

    fun displayExpenses(){
        val expense1 = Tracker("salary", 40000,"1 july 2024")

        val expenseList = listOf(expense1,)
        val expenseAdapter = TrackerAdapter(expenseList)
        binding.rvTracker.adapter = expenseAdapter
    }
}