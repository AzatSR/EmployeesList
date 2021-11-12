package com.azat.employeeslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val employeesList:List<Employees> = listOf(
        Employees(R.drawable.antony, "Антон", "Силуанов", 35, "antony@free.so"),
        Employees(R.drawable.boris, "Борис","Ельцин",38, "boris@greed.gu"),
        Employees(R.drawable.gregory, "Григорий", "Распутин", 21, "gregory@mask.be"),
        Employees(R.drawable.nikky, "Николай", "Басков", 33, "nikky@koler.cj"),
        Employees(R.drawable.tim, "Тимофей", "Прокопенко", 24, "tim@writer.xw")
    )
    val employeesRecyclerView:RecyclerView = findViewById(R.id.employees_recycler_view)
    employeesRecyclerView.layoutManager =
        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    employeesRecyclerView.adapter = EmployeesAdapter(employeesList)

    }
}