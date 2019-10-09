package com.example.proekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var truelogin : String = "LaLYou"
    var truePass : String = "040808xYz"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v : View) {
        var userlogin: EditText = findViewById(R.id.login)
        var usepass: EditText = findViewById(R.id.pass)

        if (truelogin == userlogin.text.toString() && truePass == usepass.text.toString()) {
            -
            var next: Intent = Intent(this, aleal::class.java)
            startActivity(next);


        }
    }
        fun output (text :String ){
            var res: TextView = findViewById(R.id.resultat)
            res.setText("не правильно")
    }
        fun  sum (s1 :String) : String {
            var s3: String = s1 + "Пока,покакай дома"
            return s3

        }


}




