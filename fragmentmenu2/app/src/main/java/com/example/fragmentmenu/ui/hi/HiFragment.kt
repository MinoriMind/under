package com.example.fragmentmenu.ui.hi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentmenu.R
import com.example.fragmentmenu.databinding.FragmentHiBinding

class HiFragment : Fragment() {

    private lateinit var hiViewModel: HiViewModel
    private var _binding: FragmentHiBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        hiViewModel =
            ViewModelProvider(this).get(HiViewModel::class.java)

        _binding = FragmentHiBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val imageView = root.findViewById(R.id.imageView) as ImageView
        imageView.setImageResource(R.drawable.avatar_1)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}