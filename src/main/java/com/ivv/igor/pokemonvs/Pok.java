package com.ivv.igor.pokemonvs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Pok extends AppCompatActivity {
    int px=0;
    Bitmap[] p=new Bitmap[151];
    int k=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pok);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.drawable.pkm_full, options);
        int imageHeight = options.outHeight;
        int imageWidth = options.outWidth;
        String imageType = options.outMimeType;
        Bitmap poks10 = BitmapFactory.decodeResource(getResources(), R.drawable.pkm_full);
        px=poks10.getWidth()/10;
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.ll);
        for(int i=0;i<151;i++){
            p[i]=Bitmap.createBitmap(poks10,0+i%10*px,0+px*i/10,px,px);
            ImageView imageView=new ImageView(this);
            imageView.setImageBitmap(p[i]);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            linearLayout.addView(imageView);
        }


    }

}
