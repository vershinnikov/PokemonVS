package com.ivv.igor.pokemonvs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Pok extends AppCompatActivity {
    int px=0;
    Bitmap[] p=new Bitmap[151];
    int k=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pok);
        ImageView im=(ImageView)findViewById(R.id.im);
        Bitmap poks10 = BitmapFactory.decodeResource(getResources(), R.drawable.pkm_full);
        px=poks10.getWidth()/10;
        for(int i=0;i<151;i++){
            p[i]=Bitmap.createBitmap(poks10,0+i%10*px,0+px*i/10,px,px);
        }

        im.setImageBitmap(p[0]);
    }
    public void changeImage(View view){
        ImageView im=(ImageView)findViewById(R.id.im);
        im.setImageBitmap(p[k++]);
    }
}
