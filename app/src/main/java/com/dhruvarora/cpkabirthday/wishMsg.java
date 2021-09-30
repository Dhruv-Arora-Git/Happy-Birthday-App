package com.dhruvarora.cpkabirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class wishMsg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_msg);

    }
    protected void onPause() {
        if (this.isFinishing()){ //basically BACK was pressed from this activity
//            Toast.makeText(wishMsg.this, "God Bless You 😇", Toast.LENGTH_SHORT).show();
        }
        Context context = getApplicationContext();
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> taskInfo = am.getRunningTasks(1);
        if (!taskInfo.isEmpty()) {
            ComponentName topActivity = taskInfo.get(0).topActivity;
            if (!topActivity.getPackageName().equals(context.getPackageName())) {

                Toast.makeText(wishMsg.this, "Party to deke jao 😋", Toast.LENGTH_SHORT).show();
            }
            else {

//                Toast.makeText(wishMsg.this, "Happy Birthday Gagan 🤗", Toast.LENGTH_SHORT).show();
            }
        }
        super.onPause();
    }
}