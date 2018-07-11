package com.virgo.pluto;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.virgo.pluto.activity.TestActivity;
import com.virgo.pluto.base.BaseActivity;
import com.virgo.pluto.test.fragment.FragmentActivity1;

import butterknife.BindView;
import butterknife.ButterKnife;
import hugo.weaving.DebugLog;

public class MainActivity extends BaseActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    LinearLayout content;
    ImageView imageView;

    Bitmap mBitmap;
    @BindView(R.id.test1)
    Button test1;
    @BindView(R.id.fragTest)
    Button fragTest;
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.image)
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        fragTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this, FragmentActivity1.class);
                startActivity(it);
            }
        });

        findViewById(R.id.test1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this, TestActivity.class);
                startActivity(it);
            }
        });
//        hugoTest("hugo", "message");
//
//        Button btn = findViewById(R.id.btn);
//        content = findViewById(R.id.content);
//        imageView = findViewById(R.id.image);
//
//
//        int resId = R.drawable.pic;
//        Bitmap bp = PBitmapUtils.drawableToBitmap(ContextCompat.getDrawable(getBaseContext(), resId));
//        byte[] bytes = PBitmapUtils.bitmapToByte(bp);
//        mBitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
//
//
//        Timer timer = new Timer();
//        TimerTask  task = new TimerTask() {
//            @Override
//            public void run() {
//
//                Log.e(TAG, "bitmap start" );
//
//                int resId = R.drawable.pic;
//                Bitmap bp = PBitmapUtils.drawableToBitmap(ContextCompat.getDrawable(getBaseContext(), resId));
//                byte[] bytes = PBitmapUtils.bitmapToByte(bp);
//
//                BitmapFactory.Options options = new BitmapFactory.Options();
//                options.inBitmap = mBitmap;
//                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length, null);
//
//                Log.e(TAG, "bitmap " + bitmap.hashCode());
////                imageView.setImageBitmap(bitmap);
//            }
//        };
//
//        timer.schedule(task, 100, 100);
//
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final ImageView iv = new ImageView(MainActivity.this);
//
//                int index = (int) (SystemClock.elapsedRealtime() % 4);
//                int resId = 0;
//                if (index == 0) {
//                    resId = R.drawable.pic;
//                } else if (index == 1) {
//                    resId = R.drawable.pic_1;
//                } else if (index == 2) {
//                    resId = R.drawable.pic_2;
//                } else if (index ==3) {
//                    resId = R.drawable.pic_3;
//                }
//
//            }
//        });
    }

    @DebugLog
    public void hugoTest(String tag, String msg) {
        Log.d(tag, msg);
    }

    public void loadImage() {

        for (int i = 0; i < 10; i++) {
            ImageView iv = new ImageView(this);
            Glide.with(this).load(R.drawable.pic).into(iv);
            content.addView(iv);
        }

//        Glide.with(this).load(bytes).asBitmap().into(new SimpleTarget<Bitmap>() {
//            @Override
//            public void onResourceReady(Bitmap bitmap, GlideAnimation<? super Bitmap> glideAnimation) {
//
//            }
//        });
    }

}
