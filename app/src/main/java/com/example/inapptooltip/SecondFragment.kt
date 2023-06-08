package com.example.inapptooltip

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.inapptooltip.databinding.FragmentFirstBinding
import com.example.inapptooltip.databinding.FragmentSecondBinding
import com.example.tool_tip.Tooltip
import com.example.tool_tip.utils.Position


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentSecondBinding.bind(view)
        _binding = binding

        binding.button3.setOnClickListener {
            Tooltip.on(binding.button3)
                .text("This is what you want")

                .minHeight(30)
                .minWidth(70)
                .iconStart(android.R.drawable.ic_dialog_info)
                .iconStartSize(30, 30)
                .color(resources.getColor(R.color.purple_200))
                .border(Color.BLACK, 1f)
                .clickToHide(true)
                .corner(15)
                .position(Position.END)
                .arrowSize(30,30)
                .show(3000)
        }
    }
}