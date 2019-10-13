package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CityActivity extends AppCompatActivity {

    private Button gobtn;
    private EditText cityEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        gobtn=findViewById(R.id.gobtn);
        cityEditText=findViewById(R.id.cityEditText);



        gobtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String city = cityEditText.getText().toString();

                if(city.matches("")){
                    cityEditText.setError("Enter the city name");
                }

                else{

                Intent intent = new Intent(CityActivity.this,MainActivity.class);

                intent.putExtra("city",city);

                //Toast.makeText(CityActivity.this,city+"00",Toast.LENGTH_LONG).show();

                CityActivity.this.startActivity(intent);



                }


            }
        });
    }
}
