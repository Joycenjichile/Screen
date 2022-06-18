package dev.joy.workoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class homeActivity : AppCompatActivity() {
    lateinit var fcvHome:FragmentContainerView
    lateinit var btnHome:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        castView()
        setupBottonNav()
    }
    fun castView(){
        fcvHome= findViewById(R.id.fragmentContainerView)
        btnHome=findViewById(R.id.bnvHome)
    }
    fun setupBottonNav(){
        btnHome.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.plan->{
                    val  transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmentContainerView,PlanFragment())
                    transaction.commit()
                    true
                }
                R.id.track->{
                    val  transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmentContainerView,TrackFragment())
                    transaction.commit()
                    true
                }
                R.id.profile->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, ProfileFragment()).commit()
                    true
                }
                else -> false

            }
        }


        }
    }



