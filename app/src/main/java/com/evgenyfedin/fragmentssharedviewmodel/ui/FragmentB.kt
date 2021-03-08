package com.evgenyfedin.fragmentssharedviewmodel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.evgenyfedin.fragmentssharedviewmodel.R
import com.evgenyfedin.fragmentssharedviewmodel.viewmodel.SharedViewModel
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.android.synthetic.main.fragment_b.view.*

class FragmentB : Fragment() {

    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_b, container, false)
        v.button_ok.setOnClickListener { viewModel.setText(edit_text.text) }
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        viewModel.getText().observe(viewLifecycleOwner, { chars -> edit_text.setText(chars) })
    }

}