package com.azat.employeeslist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmployeesAdapter(private val employeesList: List<Employees>) :
    RecyclerView.Adapter<EmployeesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeesViewHolder {
        val employeesView = LayoutInflater.from(parent.context)
            .inflate(R.layout.employees_view, parent, false)
        return EmployeesViewHolder(employeesView)
    }

    override fun onBindViewHolder(holder: EmployeesViewHolder, position: Int) {
        val employees = employeesList[position]
        holder.bind(employees)
    }

    override fun getItemCount(): Int {
        return employeesList.size
    }
}