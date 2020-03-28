package com.example.image25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView mImg;
    Button mBtnNext, mBtnPrevious,mbtnRandom,mBtnAutoNext,mBtnAutoPrevious;
    ArrayList<Integer> mArrayImageInteger;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImg = findViewById(R.id.imageview);
        mBtnNext = findViewById(R.id.buttonNext);
        mBtnPrevious = findViewById(R.id.buttonPrevious);
        mbtnRandom = findViewById(R.id.buttonRandom);
        mBtnAutoNext = findViewById(R.id.buttonAutoNext);
        mBtnAutoPrevious = findViewById(R.id.buttonAutoPrevious);
        // tạo mảng hình
        mArrayImageInteger = new ArrayList<>();
        mArrayImageInteger.add(R.drawable.hinh1);
        mArrayImageInteger.add(R.drawable.hinh2);
        mArrayImageInteger.add(R.drawable.hinh3);
        mArrayImageInteger.add(R.drawable.hinh4);
        mArrayImageInteger.add(R.drawable.hinh5);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                count = count >= mArrayImageInteger.size() -1 ? 0 : ++count;
                if (count >= mArrayImageInteger.size() -1){
                    count = 0;
                }
                mImg.setImageResource(mArrayImageInteger.get(count));
            }

        });
    }
}
