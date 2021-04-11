package pjh.mjc.kotlin3

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import pjh.mjc.kotlin3.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("2021-04-11 Kotlin 2nd")

        var button : TextView = findViewById(R.id.button)
        var edit : EditText = findViewById(R.id.edit)

        button.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                val dialog = layoutInflater.inflate(R.layout.dialog, null)
                builder.setView(dialog)
                val dialogTv = dialog.findViewById<TextView>(R.id.dialogTv)
            if(!(edit.text.isEmpty())) {
                dialogTv.text = edit.text.toString() + " is your typing"
            } else {
                dialogTv.text = "you don't typed sir"
            }
                builder.show()
        }
    }
}