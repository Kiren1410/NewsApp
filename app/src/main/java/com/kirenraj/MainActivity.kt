package com.kirenraj.newsapp

import android.content.AbstractThreadedSyncAdapter
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import com.kirenraj.adapter.NewsFeedAdapter

//test2,gvjh
class MainActivity : AppCompatActivity() {

    lateinit var  newsAdapter: NewsFeedAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = getSharedPreferences("production", Context.MODE_PRIVATE)
        val isSignedIn = sharedPref.getBoolean("is_signed_in",false)
        Log.d("justin","is user signed in $isSignedIn")
        if (!isSignedIn) {
            Log.d("justin","going to login screen")
        } else
        {
            Log.d("justin", "user is signed in, display news")
        }

        newsFeed.apply
    }
}
