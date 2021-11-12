package com.azat.employeeslist

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeesViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
@SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
fun bind(employees:Employees){
    val employeesImage:ImageView = itemView.findViewById(R.id.banner_image_view)
    val employeesDescription:TextView = itemView.findViewById(R.id.description_text_view)
    val employeesName:TextView = itemView.findViewById(R.id.name_text_view)
    val employeesAge:TextView = itemView.findViewById(R.id.age_text_view)
    val employeesEmail:TextView = itemView.findViewById(R.id.email_text_view)

    employeesImage.setImageDrawable(itemView.context.getDrawable(employees.imageRes))
    employeesDescription.text = employees.description
    employeesName.text = "Фамилия: ${employees.name}"
    employeesAge.text = "Возраст: ${employees.age}"
    employeesEmail.text = "Email: ${employees.email}"
}
}