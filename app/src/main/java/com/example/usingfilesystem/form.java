package com.example.usingfilesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        EditText name = (EditText) findViewById(R.id.Name);
        EditText fname = (EditText) findViewById(R.id.F_Name);
        EditText email = (EditText) findViewById(R.id.Email1);
        EditText dob = (EditText) findViewById(R.id.DOB);
        EditText add = (EditText) findViewById(R.id.Address);
        EditText cell = (EditText) findViewById(R.id.Phone);
        Button save =(Button) findViewById(R.id.Save);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name1 = name.getText().toString();
                String father = fname.getText().toString();
                String mail = email.getText().toString();
                String date = dob.getText().toString();
                String addres = add.getText().toString();
                String phon = cell.getText().toString();

                File path = getApplicationContext().getExternalFilesDir("");
                System.out.println(path.getPath());
                Toast.makeText(getApplicationContext(),path.getPath(), Toast.LENGTH_SHORT).show();
                File filepath = new File(path,"saifotho@gmail.txt");
                FileWriter wrt = null;

                try {
                    wrt = new FileWriter(filepath,true);
                    wrt.write(name1);
                    wrt.write("\n"+father);
                    wrt.write("\n"+mail);
                    wrt.write("\n"+date);
                    wrt.write("\n"+addres);
                    wrt.write("\n"+phon);
                    wrt.close();

                } catch (IOException pp){
                    pp.printStackTrace();
                }



            }
        });




    }

}