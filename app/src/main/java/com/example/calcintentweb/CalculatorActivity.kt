package com.example.calcintentweb

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class CalculatorActivity : AppCompatActivity() {
    private lateinit var Tv_answer:TextView
    lateinit var edt_firstnumber:EditText
    lateinit var edt_secondnumber:EditText
    lateinit var buttonadd:Button
    lateinit var buttonsubtract:Button
    lateinit var buttonmultiply:Button
    lateinit var buttondivide:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Tv_answer=findViewById(R.id.Txt_Answer)
        edt_firstnumber=findViewById(R.id.Edt_Fnum)
        edt_secondnumber=findViewById(R.id.Edt_Snum)
        buttonsubtract=findViewById(R.id.Btn_Sub)
        buttonadd=findViewById(R.id.Btn_Add)
        buttondivide=findViewById(R.id.Btn_Div)
        buttonmultiply=findViewById(R.id.Btn_Mult)


        buttonadd.setOnClickListener{
            val myfirstnumber=edt_firstnumber.text.toString()
            val mysecondnumber=edt_secondnumber.text.toString()
            if(myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text= "please fill in all inputs"
            } else {
//                    lets now calculate
                    val answer=myfirstnumber.toDouble()+ mysecondnumber.toDouble()
                    Tv_answer.text=answer.toString()
                }

        }

    }
}