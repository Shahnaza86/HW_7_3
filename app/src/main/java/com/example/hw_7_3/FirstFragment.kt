package com.example.hw_7_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.hw_7_3.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

private  lateinit var binding: FragmentFirstBinding
private var list= arrayListOf <Item>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        loadData()
        binding= FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PortretAdapter(list, this::onClick)
        binding.recycleView.adapter=adapter


    }

    private fun onClick(position:Int) {
        //  findNavController().navigate(R.id.secondFragment, bundleOf("key" to list[position]))
        findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment
            (list[position]))


    }


    private fun loadData() {
        list.clear()
        list.add(Item(R.drawable.img, "Alive", "Rich Sanchez"))
        list.add(Item(R.drawable.img_1, "Alive", "Morty Smith"))
        list.add(Item(R.drawable.img_2, "Died", "Albert Einstein"))
        list.add(Item(R.drawable.img_3, "Alive", "Jerry Smith"))
    }
}




