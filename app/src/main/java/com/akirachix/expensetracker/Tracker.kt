package com.akirachix.expensetracker

import android.icu.text.CaseMap.Title

data class Tracker (
  var title:String,
  var amount: String,
  var date: String
)