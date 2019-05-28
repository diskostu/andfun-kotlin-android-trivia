package com.example.android.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        // alternatives: https://developer.android.com/topic/libraries/data-binding/generated-binding#create
//        val binding2: FragmentTitleBinding = FragmentTitleBinding.inflate(inflater)
//        val binding3: FragmentTitleBinding = FragmentTitleBinding.inflate(inflater, container, false)
//
//        val inflater = LayoutInflater.from(context).inflate(R.layout.fragment_title, container, false)
//        val binding4: FragmentTitleBinding? = DataBindingUtil.bind(inflater)

        return binding.root
    }
}