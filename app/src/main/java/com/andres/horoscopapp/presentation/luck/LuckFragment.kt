package com.andres.horoscopapp.presentation.luck

import android.view.LayoutInflater
import android.view.ViewGroup
import com.andres.horoscopapp.databinding.FragmentLuckBinding
import com.andres.horoscopapp.presentation.utils.VBBaseFragment

class LuckFragment : VBBaseFragment<FragmentLuckBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentLuckBinding
        get() = FragmentLuckBinding::inflate

    override fun setup() {
    }
}