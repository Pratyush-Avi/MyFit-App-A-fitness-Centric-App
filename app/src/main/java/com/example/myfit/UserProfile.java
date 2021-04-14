package com.example.myfit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserProfile extends AppCompatActivity
{
    Button save_creds;
    Spinner ch_gender;
    EditText ename,eage,eheight,ewt,eemail;
    DatabaseReference insertData ;
    Profiles profile;
    long maxid = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        save_creds=(Button) findViewById(R.id.btn_save);
        ch_gender=(Spinner)findViewById(R.id.edit_gender);
        ename=(EditText)findViewById(R.id.edit_name);
        eage=(EditText)findViewById(R.id.edit_age);
        eheight=(EditText)findViewById(R.id.edit_height);
        ewt=(EditText)findViewById(R.id.edit_weight);
        eemail=(EditText)findViewById(R.id.edit_email);
        profile=new Profiles();

        insertData= FirebaseDatabase.getInstance().getReference().child("Profiles");
        insertData.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists())
                    maxid=(snapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        save_creds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertProfile();
            }
        });
    }

    private void insertProfile()
    {
        String name = ename.getText().toString();
        int age = Integer.parseInt(eage.getText().toString().trim());
        float height = Float.parseFloat(eheight.getText().toString().trim());
        float weight = Float.parseFloat(ewt.getText().toString().trim());
        String gender = ch_gender.getSelectedItem().toString();
        String email = eemail.getText().toString();

        profile.setName(name);
        profile.setAge(age);
        profile.setHeight(height);
        profile.setWeight(weight);
        profile.setGender(gender);
        profile.setEmail(email);

        insertData.child(String.valueOf(maxid+1)).setValue(profile);


        Toast.makeText(this, "Profile Created!", Toast.LENGTH_SHORT).show();

        Intent intent2 = new Intent(this, HomePage.class);
        startActivity(intent2);

    }
}