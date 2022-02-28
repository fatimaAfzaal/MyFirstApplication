package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv,nm;
    String n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)this.findViewById(R.id.button);
        tv=(TextView)this.findViewById(R.id.textView);
        nm=(TextView)this.findViewById(R.id.editTextTextPersonName);
    }

    public void toastDemo(View view) {
        tv.setText("WELCOME to Andriod Development");
        n=nm.getText().toString();
        Toast t= Toast.makeText(this,"Asalam o Alikum Mr/Miss "+n,Toast.LENGTH_LONG);
        t.show();
    }
}