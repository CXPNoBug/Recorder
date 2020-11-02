package com.cxp.recorder;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickLis(View view) {
        switch (view.getId()) {
            case R.id.main_bt1:
                //录音频
                break;
            case R.id.main_bt2:
                //录视频
                break;
        }
    }
}
