package com.ashishshs.custom_spinner24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import java.util.List;

//https://demonuts.com/android-custom-dialog/
public class MainActivity2 extends AppCompatActivity {

    EditText e1;
    RecyclerView r1;
    TextView t1;
    Adapter adapter;
    private List<ModelClass> list;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        e1=findViewById(R.id.e1);
//        r1=findViewById(R.id.r1);
        t1 = findViewById(R.id.tttt);
        list = new ArrayList<>();

        list.add(new ModelClass("DSA", "525"));
        list.add(new ModelClass("Complete", "555"));
        list.add(new ModelClass("Amazon", "555"));
        list.add(new ModelClass("Compiler", "555"));
        list.add(new ModelClass("Git", "555"));
        list.add(new ModelClass("Python", "555"));
        list.add(new ModelClass("Operating", "5"));
        list.add(new ModelClass("Theory", "5"));
        list.add(new ModelClass("aaster of computer, mca", "445"));
        list.add(new ModelClass("aaster of computer, (mca)", "5555"));
        list.add(new ModelClass("Adichunchanagiri University, Mandya", "554445"));
        list.add(new ModelClass("Adichunchanagiri University, Mandya", "555"));
        list.add(new ModelClass("Adamas University, Kolkata", "555"));
        list.add(new ModelClass("Adamas University, Kolkata", "555"));
        list.add(new ModelClass("ARKA Jain University, Seraikela", "555"));
        list.add(new ModelClass("AIPH University, Bhubaneswar", "555"));


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Initialize dialog
                dialog = new Dialog(MainActivity2.this);

                // set custom dialog
                dialog.setContentView(R.layout.dialog_searchable_spinner);

                // set custom height and width
                dialog.getWindow().setLayout(650, 800);

                // set transparent background
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                // show dialog
                dialog.show();


                EditText e1 = dialog.findViewById(R.id.e1);
                RecyclerView r1 = dialog.findViewById(R.id.r1);


//        r1.setHasFixedSize(true);
                r1.setLayoutManager(new LinearLayoutManager(MainActivity2.this));
                adapter = new Adapter(MainActivity2.this, list);
                r1.setAdapter(adapter);

                e1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                        filter(editable.toString());

                    }
                });


            }
        });

        t1.setText(getIntent().getStringExtra("ashish"));

    }


    private void filter(String text) {


        List<ModelClass> filterList = new ArrayList<>();

        try {


            for (ModelClass items : list) {
                if (items.getText().toLowerCase().contains(text.toLowerCase())) {
                    filterList.add(items);
                    Log.i("Ashish", "data" + items.getText());
                }
            }

            if (filterList.isEmpty()) {
                r1.setVisibility(View.VISIBLE);

            } else {

//                r1.setVisibility(View.GONE);
                adapter.filterList(filterList);
            }
        } catch (Exception e) {
            Toast.makeText(MainActivity2.this, "no data ", Toast.LENGTH_SHORT).show();
        }
    }
}