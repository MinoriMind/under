package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var items: List<Triple<Int, String, String>> = listOf(
        Triple(R.drawable.ic_launcher_foreground, "Роберт", "Шмоберт"),
        Triple(R.drawable.ic_launcher_foreground, "Кирилл", "Данил"),
        Triple(R.drawable.ic_launcher_foreground, "Анастасия", "+22021409"),
        Triple(R.drawable.ic_launcher_foreground, "Ксения", "Поест лапши"),
        Triple(R.drawable.ic_launcher_foreground, "Бочка", "круглая"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecycleAdapter(items)
    }
}