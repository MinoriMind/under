package com.example.fragmentmenu.ui.night

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentmenu.R

class NightFragment : Fragment() {

    companion object {
        fun newInstance() = Fragment()
    }

    private lateinit var nightViewModel: NightViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_night, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        nightViewModel = ViewModelProvider(this).get(NightViewModel::class.java)
        // TODO: Use the ViewModel
    }

}