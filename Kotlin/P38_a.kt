package com.example.two


import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment


class FragmentOne : Fragment() {

    lateinit var view11: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        view11 = inflater.inflate(R.layout.fragment_one, container, false)
        init(container)

        return view11


    }

    private lateinit var buttonListener: OnButtonPress
    private lateinit var colorReq: OnColorReq

    override fun onAttach(context1: Context) {
        super.onAttach(context1)
        buttonListener = try {
            activity as OnButtonPress
        } catch (e: ClassCastException) {
            throw ClassCastException("$context1 must implement" + " onButtonPressed")
        }
        colorReq = try {
            activity as OnColorReq
        } catch (e: ClassCastException) {
            throw ClassCastException("$context1 must implement" + " onColorReq")
        }
    }

    private fun init(root: ViewGroup?) {
        val but: Button = view11.findViewById(R.id.btn1)
        val clear: Button = view11.findViewById(R.id.btn2)
        val orange: Button = view11.findViewById(R.id.btnOrange)
        val grey: Button = view11.findViewById(R.id.btnGrey)
        Toast.makeText(context, "init", Toast.LENGTH_LONG).show()
        but.setOnClickListener {
            buttonListener.onButtonPressed("Button has been Clicked.")
        }
        clear.setOnClickListener {
            buttonListener.onButtonPressed("")
        }
        orange.setOnClickListener() {
            colorReq.onColorRequest(Color.RED)
        }
        grey.setOnClickListener() {
            colorReq.onColorRequest(Color.GRAY)
        }


    }
}