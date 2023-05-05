package com.calculator.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            var num1= findViewById<EditText>(R.id.Number1)
            var num2=findViewById<EditText>(R.id.Number2)
            var btn1=findViewById<Button>(R.id.button1)
            var btn6=findViewById<Button>(R.id.button6)
            var btn2=findViewById<Button>(R.id.button2)
            var btn3=findViewById<Button>(R.id.button3)
            var btn4=findViewById<Button>(R.id.button4)
            btn1.setOnClickListener {
                var plusnum1=num1.text.toString().toInt()
                var plusnum2=num2.text.toString().toInt()
                var answer=plusnum1+plusnum2
                Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
            }
            btn2.setOnClickListener {
                var plusnum1=num1.text.toString().toInt()
                var plusnum2=num2.text.toString().toInt()
                var answer2=plusnum1-plusnum2
                Toast.makeText(this,"$answer2",Toast.LENGTH_SHORT).show()
            }
            btn3.setOnClickListener {
                var plusnum1=num1.text.toString().toInt()
                var plusnum2=num2.text.toString().toInt()
                var answer3=plusnum1/plusnum2
                Toast.makeText(this,"$answer3",Toast.LENGTH_SHORT).show()
            }
            btn4.setOnClickListener {
                var plusnum1=num1.text.toString().toInt()
                var plusnum2=num2.text.toString().toInt()
                var answer4=plusnum1*plusnum2
                Toast.makeText(this,"$answer4",Toast.LENGTH_SHORT).show()
            }

            btn6.setOnClickListener {
                num1.setText(" ")
                num2.setText("")
                Toast.makeText(this,"cleared",Toast.LENGTH_SHORT).show()
            }
        }
}