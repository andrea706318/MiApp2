package com.example.miapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Librerías Checkbox
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


class activity_layout1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout1)

        findViewById<CheckBox>(R.id.checkbox_meat)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Meat is checked: $isChecked")
            }

        findViewById<CheckBox>(R.id.checkbox_cheese)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Cheese is checked: $isChecked")
            }
    }
}