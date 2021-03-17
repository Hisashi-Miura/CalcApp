package jp.techacademy.hisashi.miura.calcapp

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        var num1:Double=2.0
        var num2:Double=3.0
        var num3:Double=3.0

        button1.setOnClickListener {

            if (editText1.text.toString()=="" || editText2.text.toString()==""){
                textView1.text="２つの値を入力してください。"
            } else {
                num1 = editText1.text.toString().toDouble()
                num2 = editText2.text.toString().toDouble()
                num3 = num1 + num2
                textView1.text =num3.toString()
            }

        }
        button2.setOnClickListener {
            if (editText1.text.toString()=="" || editText2.text.toString()==""){
                textView1.text="２つの値を入力してください。"
            } else {
                num1 = editText1.text.toString().toDouble()
                num2 = editText2.text.toString().toDouble()
                num3 = num1 - num2
                textView1.text =num3.toString()
            }
        }
        button3.setOnClickListener {
            if (editText1.text.toString()=="" || editText2.text.toString()==""){
                textView1.text="２つの値を入力してください。"
            } else {
                num1 = editText1.text.toString().toDouble()
                num2 = editText2.text.toString().toDouble()
                num3 = num1 * num2
                textView1.text =num3.toString()
            }
        }
        button4.setOnClickListener {
            if (editText1.text.toString()=="" || editText2.text.toString()==""){
                textView1.text="２つの値を入力してください。"
            } else {
                num1 = editText1.text.toString().toDouble()
                num2 = editText2.text.toString().toDouble()
                num3 = num1 / num2
                textView1.text =num3.toString()
            }
        }

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
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