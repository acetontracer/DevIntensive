package softdesign.com.devintensive.ui.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import softdesign.com.devintensive.R;
import softdesign.com.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";
/*
    protected EditText mEditText;
    //  protected Button mGreenButton, mRedButton;
    protected int mColorMode;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {   // объект со значениями в bundle - состояние ui
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //привязка разметки к нашему активити
        Log.d(TAG, "onCreate()");

       /* mRedButton = (Button) findViewById(R.id.red_btn);
        mGreenButton = (Button) findViewById(R.id.green_btn);
        mEditText = (EditText) findViewById(R.id.textView);

         mRedButton.setOnClickListener(this);
        mGreenButton.setOnClickListener(this);
*/
        if (savedInstanceState == null) {
            //активити запускается впервые
        } else {
            //активити запускалось
/*            mColorMode = savedInstanceState.getInt(ConstantManager.COLOR_MODE_KEY);

            if (mColorMode == Color.RED) {
                mEditText.setBackgroundColor(Color.RED);
            } else {
                mEditText.setBackgroundColor(Color.GREEN);
            }*/
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
               /* case R.id.green_btn:
                    mEditText.setBackgroundColor(Color.GREEN);
                    mColorMode=Color.GREEN;
                    break;
                case R.id.red_btn:
                    mEditText.setBackgroundColor(Color.RED);
                    mColorMode=Color.RED;
                    break;*/
            }
        }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
      /*  Log.d(TAG, "onSaveInstanceState");
        outState.putInt(ConstantManager.COLOR_MODE_KEY, mColorMode);*/
    }
}
