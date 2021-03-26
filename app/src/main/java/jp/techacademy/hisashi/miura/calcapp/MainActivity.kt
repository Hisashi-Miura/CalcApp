package jp.techacademy.hisashi.miura.calcapp

import android.os.Bundle
//import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
//import android.util.Log


class MainActivity : AppCompatActivity() {

    fun check():Boolean{
        if (editText1.text.toString()=="" || editText2.text.toString()==""){
            return true
        } else {
            return false
        }
    }
    fun checkzero():Boolean{
        if (editText2.text.toString()=="0"){
            return true
        } else {
            return false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.toolbar))

        var num1:Double

        button1.setOnClickListener {
            if (check() == true){
                Snackbar.make(button1, "２つの値を入力してください。", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                } else {
                    num1 = editText1.text.toString().toDouble()+editText2.text.toString().toDouble()
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE1", num1)
                    startActivity(intent)
                }
        }
        button2.setOnClickListener {
            if (check() == true){
                Snackbar.make(button2, "２つの値を入力してください。", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            } else {
                num1 = editText1.text.toString().toDouble()-editText2.text.toString().toDouble()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", num1)
                startActivity(intent)
            }
        }
        button3.setOnClickListener {
            if (check() == true){
                Snackbar.make(button3, "２つの値を入力してください。", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            } else {
                num1 = editText1.text.toString().toDouble()*editText2.text.toString().toDouble()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", num1)
                startActivity(intent)
            }
        }
        button4.setOnClickListener {
            if (check() == true){
                Snackbar.make(button4, "２つの値を入力してください。", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            } else if(checkzero()==true) {
                Snackbar.make(button4, "ゼロは入力しないでください。", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            } else{
                num1 = editText1.text.toString().toDouble()/editText2.text.toString().toDouble()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", num1)
                startActivity(intent)
            }
        }
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}