package com.example.user.travellog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.user.travellog.Services.MyService;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

//        Button btn = (Button) findViewById(R.id.StartButton);
//        btn.setOnClickListener(btnListener);//リスナの登録
//
//        btn  = (Button) findViewById(R.id.StopButton);
//        btn.setOnClickListener(btnListener);//リスナの登録
    }

    private OnClickListener btnListener = new OnClickListener() {
        public void onClick(View v) {

//            switch(v.getId()){
//
////                case R.id.StartButton://startServiceでサービスを起動
//                    startService(new Intent(StartActivity.this, MyService.class));
//                    break;
//                case R.id.StopButton://stopServiceでサービスの終了
//                    stopService(new Intent(StartActivity.this, MyService.class));
//                    break;
//            }
        }
    };
}
