package com.dew.edward.fragmentexe.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast


import com.dew.edward.fragmentexe.R
import com.dew.edward.fragmentexe.Utilities.TAG
import kotlinx.android.synthetic.main.fragment_title.*
import kotlinx.android.synthetic.main.fragment_title.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class TitleFragment : Fragment() {

    private var leftTopButton: ImageButton? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_title, container, false)

        leftTopButton = view.id_title_left_btn
        Log.v(TAG, "TitleFragment: leftTopButton: $leftTopButton")
        leftTopButton?.setOnClickListener{
            Toast.makeText(activity, "this is an ImageButton in Title Fragment.", Toast.LENGTH_SHORT).show()
        }

        return view
    }


    companion object {

        @JvmStatic
        fun newInstance() = TitleFragment()
    }
}
