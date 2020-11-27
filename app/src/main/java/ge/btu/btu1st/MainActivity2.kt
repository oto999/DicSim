package ge.btu.btu1st

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.*
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button.setOnClickListener {
            val backintent = Intent(this,MainActivity::class.java)
            startActivity(backintent)
        }
        button3.setOnClickListener {
            val nextintent = Intent(this,MainActivity3::class.java)
            startActivity(nextintent)
        }
        button5.setOnClickListener {
            var x = (1..6).random()
            var y = (1..6).random()
            textView5.text = x.toString()
            textView6.text = y.toString()
            when {
                x==y && x==6 -> {
                    textView7.text = "Jackpot!"
                    imageView.visibility = View.VISIBLE
                }
                x!=6 || y!=6 -> {
                    textView7.text = ""
                    imageView.visibility = View.INVISIBLE
                    }
                }
            }
        }

    }
