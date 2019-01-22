package com.example.mudarcor

import android.content.res.Resources
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.RandomAccess
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var fundos = arrayOf("#FFCC0000", "#FFFF8800", "#FF669900", "#FF9933CC", "#FF0099CC", "#FFFF4444","#FFFFBB33","#FF99CC00","#FFAA66CC","#FF33B5E5")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun clique(view: View){

        val tamanhofundos = fundos.size
        val random = java.util.Random().nextInt(tamanhofundos)
        val pick = fundos.get(random)
        val cor = Color.parseColor(pick)
        fundo.setBackgroundColor(cor)

    }
}
