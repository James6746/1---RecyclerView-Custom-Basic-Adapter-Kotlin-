package com.example.a1_recyclerviewcustombasicadapterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var studentArrayList: ArrayList<Student>
    lateinit var recyclerView: RecyclerView
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        studentArrayList = ArrayList()
        recyclerView = findViewById(R.id.recycler_view)
        customAdapter = CustomAdapter(this@MainActivity, studentArrayList)
        recyclerView.setAdapter(customAdapter)
        recyclerView.setLayoutManager(LinearLayoutManager(this, RecyclerView.VERTICAL, false))
        addItemsToTheStudentArrayList()
    }

    private fun addItemsToTheStudentArrayList() {
        for (i in 0..19) {
            if (i % 3 == 1) {
                studentArrayList.add(Student("Sobirov Jamshid Sadulla o'g'li", 20))
            } else if (i % 3 == 2) {
                studentArrayList.add(Student("Sobirov Otabek Sadulla o'g'li", 23))
            } else {
                studentArrayList.add(Student("Matchanova Dinora Sadulla qizi", 19))
            }
        }
    }
}