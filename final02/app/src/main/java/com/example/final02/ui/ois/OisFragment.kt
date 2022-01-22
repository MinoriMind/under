package com.example.final02.ui.ois

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.final02.databinding.FragmentOisBinding

class OisFragment : Fragment() {

    private lateinit var oisViewModel: OisViewModel
    private var _binding: FragmentOisBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        oisViewModel =
            ViewModelProvider(this).get(OisViewModel::class.java)

        _binding = FragmentOisBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textOis
        oisViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}