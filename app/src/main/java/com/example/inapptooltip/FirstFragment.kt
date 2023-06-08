package com.example.inapptooltip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.inapptooltip.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)



        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentFirstBinding.bind(view)
        _binding = binding

        setUpAdapter()

        binding.apply {
            renderBtn.setOnClickListener {
                //passing the data
                val direction = FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                    tooltipEt.text.toString(),
                    sizeEt.text.toString().toInt(),
                    paddingEt.text.toString().toInt(),
                    colorEt.text.toString(),
                    bgColorEt.text.toString(),
                    radiusEt.text.toString().toInt(),
                    ttWidthEt.text.toString().toInt(),
                    arrWidthEt.text.toString().toInt(),
                    arrHeightEt.text.toString().toInt()
                )
                findNavController().navigate(direction)
            }
        }
    }

    private fun setUpAdapter() {
        val buttons = resources.getStringArray(R.array.buttons)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, buttons)
        binding?.autoCompleteTextView?.setAdapter(arrayAdapter)
    }
}