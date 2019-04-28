package com.example.today;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity extends AppCompatActivity implements OnItemSelectedListener {
    Spinner catagory, activity;
    EditText time;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        catagory = (Spinner) findViewById(R.id.activity_spinner);
        activity = (Spinner) findViewById(R.id.activity_spinner2);
        catagory.setOnItemSelectedListener(this);

        time = findViewById(R.id.time_editText);


        Button btn = (Button)findViewById(R.id.Register_button_submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(time.getText().length() != 0){
                Intent intent = new Intent(RegisterActivity.this, MenuActivity.class);
                startActivity(intent);
                    Toast toast = Toast.makeText(getApplicationContext(), "Activity registered", Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Time is needed", Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String spCat = String.valueOf(catagory.getSelectedItem());

        if (spCat.contentEquals("Paid work")) {
            List<String> list = new ArrayList<String>();
            list.add("work");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Passion work")) {
            List<String> list = new ArrayList<String>();
            list.add("Voluntary work");
            list.add("Volunteering");
            list.add("Mentoring");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Professionel development")) {
            List<String> list = new ArrayList<String>();
            list.add("Read academia");
            list.add("Studying");
            list.add("Writing school emails");
            list.add("Calling professional");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Personal development")) {
            List<String> list = new ArrayList<String>();
            list.add("Read news");
            list.add("Read book");
            list.add("Attend personal dev events");
            list.add("Writing private duty emails");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Relationships")) {
            List<String> list = new ArrayList<String>();
            list.add("Calling family");
            list.add("Texting");
            list.add("Writing relationship emails");
            list.add("Talking");
            list.add("Social media");
            list.add("Calling friends");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Play")) {
            List<String> list = new ArrayList<String>();
            list.add("Running");
            list.add("Swimming");
            list.add("Biking");
            list.add("Basketball");
            list.add("Fishing");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Wellness")) {
            List<String> list = new ArrayList<String>();
            list.add("Breathe");
            list.add("Stretch");
            list.add("Yoga");
            list.add("Gym");
            list.add("Walking");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Distractions")) {
            List<String> list = new ArrayList<String>();
            list.add("Snacking");
            list.add("Driving");
            list.add("Snoozing");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Maintenace")) {
            List<String> list = new ArrayList<String>();
            list.add("Shower");
            list.add("Brush teeth");
            list.add("Getting dressed");
            list.add("Cook food");
            list.add("Eat food");
            list.add("Wash dishes");
            list.add("Clean apartment");
            list.add("Shave");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

        if (spCat.contentEquals("Sleep")) {
            List<String> list = new ArrayList<String>();
            list.add("Sleep");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            activity.setAdapter(dataAdapter);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
