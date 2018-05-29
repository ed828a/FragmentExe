package com.dew.edward.fragmentexe

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import com.dew.edward.fragmentexe.fragments.ContentFragment
import com.dew.edward.fragmentexe.fragments.PictureFragment
import com.dew.edward.fragmentexe.fragments.TitleFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TitleFragment.OnFragmentInteractionListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment(ContentFragment.newInstance())

        bottomNavigation.setOnNavigationItemSelectedListener{menuItem: MenuItem ->
            when (menuItem.itemId){
                R.id.menuTiger -> {
                    Toast.makeText(this, "you click tiger", Toast.LENGTH_SHORT).show()
                }
                R.id.menuCheetah ->Toast.makeText(this, "you click cheetah", Toast.LENGTH_SHORT).show()
                R.id.menuLion -> Toast.makeText(this, "you click lion", Toast.LENGTH_SHORT).show()
                R.id.menudog -> Toast.makeText(this, "you click dog", Toast.LENGTH_SHORT).show()
            }

            true
        }
    }

    fun setFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        with (fragmentTransaction) {
            add(R.id.fragmentContainer, fragment)
            addToBackStack(null)
            commit()
        }
    }

    override fun onFragmentInteraction() {
        setFragment(PictureFragment.newInstance())
    }

}
