package com.rikenson.flashcardapp_rikenson

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val question = findViewById<View>(R.id.question)
        val reponse = findViewById<View>(R.id.reponse)

        question.setOnClickListener {
            question.visibility = View.INVISIBLE
            reponse.visibility = View.VISIBLE
        }

        reponse.setOnClickListener {
            question.visibility = View.VISIBLE
            reponse.visibility = View.INVISIBLE
        }
    }
}