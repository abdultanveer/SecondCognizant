package com.example.secondcognizant.activities

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.secondcognizant.R
import com.example.secondcognizant.databinding.ActivityBottomNavBinding

class BottomNavActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavBinding

    var TAG = BottomNavActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
Log.i(TAG,"activity oncreate")
        binding = ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_bottom_nav)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"activity onpause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"activity onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"activity ondestroy")

    }
}