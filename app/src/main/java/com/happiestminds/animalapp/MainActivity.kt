package com.happiestminds.animalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun buttonClick(view: View) {
        when(view.id){
            R.id.wildB ->
            {
                val frag = AnimalFragment.newInstance(2,2)
                supportFragmentManager.beginTransaction()
                    .add(R.id.frameL,frag)
                    .addToBackStack(null)
                    .commit()
            }
            R.id.domesticB ->
            {
                val frag = AnimalFragment.newInstance(2,1)
                supportFragmentManager.beginTransaction()
                    .add(R.id.frameL,frag)
                    .addToBackStack(null)
                    .commit()
            }
        }

    }
}