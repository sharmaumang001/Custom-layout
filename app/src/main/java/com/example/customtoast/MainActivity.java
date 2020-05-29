package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.customtoast.R.id;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Pressed(View V){
      showCustomToast("WOOOW!!!! <HAPPY BIRTHDAY>");
    }
    public void showCustomToast(String string){

        LayoutInflater mInflater = getLayoutInflater();
        View layout = mInflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(id.Toast_layoutID));

        TextView mTextView = layout.findViewById(id.mTextviewID);
        mTextView.setText(string);


        Toast mToast = new Toast(getApplicationContext());
                mToast.setGravity(Gravity.CENTER,0,0);
                mToast.setDuration(Toast.LENGTH_SHORT);
                mToast.setView(layout);
                mToast.show();

    }
}
