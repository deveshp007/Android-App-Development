package com.example.three

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentTwo : Fragment() {

    lateinit var view2: View
    lateinit var txt: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view2 = inflater.inflate(R.layout.fragment_two, container, false)
        txt = view2.findViewById(R.id.txt)

        return view2
    }

    fun changeTxt(msg: String) {
        txt.text = msg
    }
}