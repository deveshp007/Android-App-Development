package com.example.two

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentTwo : Fragment() {

    lateinit var view1: View
    lateinit var txt: TextView


//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        view1 = inflater.inflate(R.layout.fragment_two, container, false)
        return view1
    }

    fun onFragmentInteraction(msg: String) {

        Log.d("Worked", msg)
        txt = view1.findViewById(R.id.txt)
        txt.text = msg
    }

    fun onFragmentInteractionColor(code: Int) {
        view1.setBackgroundColor(code)
    }
}