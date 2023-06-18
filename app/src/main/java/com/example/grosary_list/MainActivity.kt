package com.example.grosary_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {

    lateinit var txtavocado: CardView
    lateinit var txtapple: CardView
    lateinit var txtpawpaw: CardView
    lateinit var txtguava: CardView
    lateinit var txtpineapple: CardView
    lateinit var txtmango: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtavocado = findViewById(R.id.cardavocado)
        txtapple = findViewById(R.id.cardapple)
        txtpawpaw = findViewById(R.id.cardpawpaw)
        txtguava = findViewById(R.id.cardguava)
        txtpineapple = findViewById(R.id.cardpineapple)
        txtmango = findViewById(R.id.cardmango)

        txtavocado.setOnClickListener {
            val intent = Intent(this,avocadoActivity::class.java)
            startActivity(intent)
        }
        txtapple.setOnClickListener {
            val intent = Intent(this,appleActivity::class.java)
            startActivity(intent)
        }
        txtpawpaw.setOnClickListener {
            val intent = Intent(this,pawpawActivity::class.java)
            startActivity(intent)
        }
        txtguava.setOnClickListener {
            val intent = Intent(this,guavaActivity::class.java)
            startActivity(intent)
        }
        txtpineapple.setOnClickListener {
            val intent = Intent(this,pineappleActivity::class.java)
            startActivity(intent)
        }
        txtmango.setOnClickListener {
            val intent = Intent(this,mangoActivity::class.java)
            startActivity(intent)
        }

    }
}