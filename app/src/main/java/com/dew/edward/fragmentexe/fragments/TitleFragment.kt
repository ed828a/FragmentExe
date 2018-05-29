package com.dew.edward.fragmentexe.fragments


import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.dew.edward.fragmentexe.R
import com.dew.edward.fragmentexe.Utilities.TAG
import kotlinx.android.synthetic.main.fragment_title.*
import kotlinx.android.synthetic.main.fragment_title.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class TitleFragment : Fragment() {
    private lateinit var fragmentListener: OnFragmentInteractionListener

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener){
            fragmentListener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_title, container, false)

        Log.v(TAG, "TitleFragment: leftTopButton: ${view.id_title_left_btn}")

        return view
    }

    interface OnFragmentInteractionListener {

        fun onFragmentInteraction()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        id_title_left_btn.setOnClickListener{
            fragmentListener.onFragmentInteraction()
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = TitleFragment()
    }
}
