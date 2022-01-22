package com.example.final02.ui.pyb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.final02.databinding.FragmentPybBinding
import com.example.final02.ui.pyb.PybViewModel

class PybFragment : Fragment() {

    private lateinit var oisViewModel: PybViewModel
    private var _binding: FragmentPybBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        oisViewModel =
            ViewModelProvider(this).get(PybViewModel::class.java)

        _binding = FragmentPybBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPyb
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