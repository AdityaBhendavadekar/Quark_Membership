package com.example.quarkwidgets;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RadioGroup radioGroup;
    TimePicker time;
    TextView text;

    CheckBox checkBox1, checkBox2;

    Spinner spinner;

    ImageButton imageButton;

    SearchView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking java object to xml id
        time=findViewById(R.id.time);
        text=findViewById(R.id.text);
        checkBox1=findViewById(R.id.checkbox1);
        checkBox2=findViewById(R.id.checkbox2);
        radioGroup=findViewById(R.id.radioGrp);
        spinner=findViewById(R.id.spinner);
        imageButton=findViewById(R.id.imgButton);
        search=findViewById(R.id.search_bar);


        time.setHour(22);
        time.setMinute(30);
        time.setIs24HourView(false);

        checkBox1.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked)
            {
                Toast.makeText(this, "Completed task 1", Toast.LENGTH_SHORT).show();
            }
        }));

        checkBox2.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked)
            {
                Toast.makeText(this, "Completed task 2", Toast.LENGTH_SHORT).show();
            }
        }));

        radioGroup.setOnCheckedChangeListener(((group, checkedId) -> {
            RadioButton radioButton=findViewById(checkedId);
            Toast.makeText(this, "Reminder set for "+radioButton.getText(), Toast.LENGTH_SHORT).show();
        }));

      spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              String item=parent.getItemAtPosition(position).toString();
              Toast.makeText(MainActivity.this, "Selected Item"+ item, Toast.LENGTH_SHORT).show();

          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });

        ArrayList<String>  arrayList= new ArrayList<>();
        arrayList.add("Hindi");
        arrayList.add("Marathi");
        arrayList.add("English");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayList);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner.setAdapter(adapter);


        imageButton.setOnClickListener(v -> time.setBackgroundColor(Color.CYAN));

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String userinput) {
                Toast.makeText(MainActivity.this, "Searching for :"+userinput, Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }
}