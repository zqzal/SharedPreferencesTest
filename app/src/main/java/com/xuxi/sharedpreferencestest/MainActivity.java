package com.xuxi.sharedpreferencestest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: " + "git status修改的状态，git checkout回退修改的内容，git reset取消添加，git diff查看所有文件的更改内容");

        Log.d(TAG, "onCreate: " + "git branch分支的用法，git checkout 切换分支，git merge 合并分支，git branch -D 删除分支");


    }
}
