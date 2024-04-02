package com.android.example.myviewmodelfactorypractice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var viewModel: PracticeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //  viewModel = ViewModelProvider(this)[PracticeViewModel::class.java]
        viewModel = ViewModelProvider(this, PracticeViewModelFactory(4)).get(PracticeViewModel::class.java)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        setText()
        button.setOnClickListener {
            increment()
        }
    }

    private fun increment() {
        viewModel.increment()
        setText()
    }

    private fun setText() {
        textView.text = viewModel.getCountOfIncrement().toString()
    }
}