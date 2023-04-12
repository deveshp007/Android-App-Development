package com.example.three

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class FragmentOne : Fragment() {

    lateinit var view1: View
    lateinit var lstView: ListView
    private lateinit var txtfrag: FragmentTwo

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view1 = inflater.inflate(R.layout.fragment_one, container, false)

        val arr = arrayOf(
            "Burger 🍔",
            "Pizza 🍕",
            "Chocolate 🍫",
            "Coffee ☕",
            "Shahi Paneer 😋",
            "Cold Drink 🍷",
            "Gulab Jamun 🍨",
            "Paneer Tikka 🥘",
            "Rice Bowl 🍚",
            "Dahi Bhalle \uD83D\uDE0B",
            "Malai Kofta \uD83D\uDE0B",
            "Paneer Dosa 🍕",
            "Ice Cream 🍦"
        )

        lstView = view1.findViewById(R.id.lstView)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, arr)
        lstView.adapter = adapter



        lstView.setOnItemClickListener { adapterView, view, i, l ->
            txtfrag = parentFragmentManager.findFragmentById(R.id.fragment_2) as FragmentTwo
            txtfrag.changeTxt(arr[i])
            lstView.setSelector(R.color.purple_200)
        }
        return view1
    }
}