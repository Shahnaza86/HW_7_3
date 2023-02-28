package com.example.hw_7_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import com.example.hw_7_3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

private  lateinit var binding: FragmentSecondBinding
private lateinit var navArgs: SecondFragmentArgs
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val result = arguments?.getSerializable("key") as Item
        arguments?.let {
            navArgs = SecondFragmentArgs.fromBundle(it)

        }

        binding.imageView.setImageResource(navArgs.itemm.image)
        binding.text1.text = navArgs.itemm.name
        binding.text2.text = navArgs.itemm.title
    }


    }


