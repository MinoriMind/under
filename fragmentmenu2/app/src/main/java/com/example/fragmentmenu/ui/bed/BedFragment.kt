package com.example.fragmentmenu.ui.bed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentmenu.databinding.FragmentBedBinding

class BedFragment : Fragment() {

    private lateinit var notificationsViewModel: BedViewModel
    private var _binding: FragmentBedBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(BedViewModel::class.java)

        _binding = FragmentBedBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.text3
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}