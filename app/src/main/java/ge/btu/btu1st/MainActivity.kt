package ge.btu.btu1st

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            val newintent= Intent(this, MainActivity2::class.java)
            startActivity(newintent)
        }
        button1.text = "Push!"
        button1.setOnClickListener {
            var x = (1..6).random()
            textView.text = x.toString()
            button1.text = "push again!"
            if(x==6){
                textView3.text = "Lucky!"
                textView3.setTextColor(Color.parseColor("#F1D902"))
            }
            else if(x==1){
                var y = (1..3).random()
                when{
                    y==1 -> {
                        textView3.text = "Better Luck Next Time!"
                        textView3.setTextColor(Color.parseColor("#F60606"))
                    }
                    y==2 -> {
                        textView3.text = "Ouch!"
                        textView3.setTextColor(Color.parseColor("#F60606"))
                    }
                    y==3 -> {
                        textView3.text = "That Can't Be Good"
                        textView3.setTextColor(Color.parseColor("#F60606"))
                    }
                }

            }
            else if (x==2 || x==3 || x==4 || x==5){
                textView3.text = "Not too Shabby"
                textView3.setTextColor(Color.parseColor("#8BC34A"))
            }
            else{
                textView3.text = ""
            }

        }

    }
}