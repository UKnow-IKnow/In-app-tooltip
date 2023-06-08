package com.example.inapptooltip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.inapptooltip.databinding.FragmentSecondBinding
import com.example.tool_tip.Tooltip
import com.example.tool_tip.utils.Position


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding

    private val args : SecondFragmentArgs by  navArgs()

    private var tooltip: Tooltip? = null
    private var showToolTip = false

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

        //getting the data
        val ttText = args.tooltipText
        val textSize = args.textSize.toFloat()
        val padding = args.padding.toFloat()
        val textColor = args.textColor
        val bgColor = args.bgColor
        val radius = args.cRadius
        val ttWidth = args.ttWidth
        val arrWidth = args.arrWidth
        val arrHeight = args.arrHeight


        //render tooltip
        if (!showToolTip){
            binding.button3.postDelayed(
                {
                    Tooltip.on(binding.button3)
                        .text(ttText)
                        .textSize(textSize)
                        .minHeight(30)
                        .minWidth(ttWidth)
                        .iconStart(android.R.drawable.ic_dialog_info)
                        .iconStartSize(30, 30)
                        .color(resources.getColor(R.color.black))
                        .clickToHide(true)
                        .corner(radius)
                        .position(Position.END)
                        .arrowSize(arrHeight,arrWidth)
                        .show(3000)
                    showToolTip = true
                },1000
            )
        }
    }
}