package com.xuxi.sharedpreferencestest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button saveData;

    private Button restoreData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: " + "git status修改的状态，git checkout回退修改的内容，git reset取消添加，git diff查看所有文件的更改内容");

        Log.d(TAG, "onCreate: " + "git branch分支的用法，git checkout 切换分支，git merge 合并分支，git branch -D 删除分支");
        saveData = findViewById(R.id.save_button);
        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = getSharedPreferences("data",MODE_PRIVATE).edit();
                editor.putString("name","Andy");
                editor.putInt("age",27);
                editor.putBoolean("married",true);
                editor.apply();

            }
        });

        restoreData = findViewById(R.id.restore_data);
        restoreData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences preferences = getSharedPreferences("data",MODE_PRIVATE);

                String name = preferences.getString("name","");
                int age = preferences.getInt("age",0);
                boolean married = preferences.getBoolean("married",false);
                Log.d(TAG, "name is " + name);
                Log.d(TAG, "age is " + age);
                Log.d(TAG, "married is " + married);
            }
        });


    }
}
