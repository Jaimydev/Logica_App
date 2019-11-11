package com.example.logica_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.logics_main.*

class LogicsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logics_main)
        initViews()
    }

    private fun initViews() {
        btn_submit.setOnClickListener { onSubmitClick() }
    }

    private fun onSubmitClick() {
        var totalCorrect: Int = 0;
        if(txt_input_0.text.toString().equals("t", ignoreCase = true))
            totalCorrect ++;
        if(txt_input_1.text.toString().equals("f", ignoreCase = true))
            totalCorrect ++;
        if(txt_input_2.text.toString().equals("f", ignoreCase = true))
            totalCorrect ++;
        if(txt_input_3.text.toString().equals("f", ignoreCase = true))
            totalCorrect ++;

        if(totalCorrect == 4)
            Toast.makeText(this, "Everything is correct!", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, " $totalCorrect out of 4 correct!", Toast.LENGTH_SHORT).show()

    }
}
