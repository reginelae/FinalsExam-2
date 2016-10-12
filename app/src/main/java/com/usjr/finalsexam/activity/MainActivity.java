package com.usjr.finalsexam.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;

import com.usjr.finalsexam.R;
import com.usjr.finalsexam.adapters.VideoListAdapter;
import com.usjr.finalsexam.fragments.VideoListFragment;

public class MainActivity extends AppCompatActivity implements VideoListAdapter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        VideoListFragment videoListFragment =
                (VideoListFragment) fm.findFragmentById(R.id.videoListFragment);
    }
}
