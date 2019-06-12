package com.example.hw05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "我的總目標是發大財，所以我來選市長", Toast.LENGTH_LONG).show();
    }
    protected void onStart(Bundle savedInstanceState){
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(this, "我當上市長了，爽!高雄一定發大財", Toast.LENGTH_LONG).show();
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "唉呀，大家怎麼對我期望都那麼高，我為什麼要像個小學生站在這裡?", Toast.LENGTH_LONG).show();
    }

    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "Zzzzzzzzz(做發財夢中)", Toast.LENGTH_LONG).show();
    }

    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "本市長帶職參選總統，台灣發大財", Toast.LENGTH_LONG).show();
    }

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "我選上總統回來高雄上班了", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "我去征服宇宙囉~~~~", Toast.LENGTH_LONG).show();
    }

    public void onFinishClick(View view) {finish();}


    public void onWebViewClick(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, WebViewDemo.class);
        startActivity(intent);
    }

    public void onScrollViewClick(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, ScrollViewDemo.class);
        startActivity(intent);
    }

    public void onRatingBarClick(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, RatingBarDemo.class);
        startActivity(intent);
    }

    public void onSeekBarClick(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SeekBarDemo.class);
        startActivity(intent);
    }

    public void onCompoundButtonClick(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, CompoundButtonDemo.class);
        startActivity(intent);
    }

    public void onMenuClick(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MenusDemo.class);
        startActivity(intent);
    }

    public void onSpinnerClick(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SpinnerDemo.class);
        startActivity(intent);
    }
}
