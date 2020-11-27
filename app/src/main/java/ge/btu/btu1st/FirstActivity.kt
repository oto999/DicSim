package ge.btu.btu1st

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        button6.setOnClickListener {
            if (editTextTextEmailAddress.text.toString() == "ripper" && editTextTextPassword.text.toString() == "pass"){
                val login = Intent(this, MainActivity::class.java)
                startActivity(login)
                Toast.makeText(this, "Wellcome, Skullripper", Toast.LENGTH_SHORT).show()
            }
            else if(editTextTextEmailAddress.text.isEmpty() || editTextTextPassword.text.isEmpty()){
                Toast.makeText(this, "please fill both lines", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Username or password is incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}