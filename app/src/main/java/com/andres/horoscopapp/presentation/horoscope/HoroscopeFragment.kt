package com.andres.horoscopapp.presentation.horoscope

import android.view.LayoutInflater
import android.view.ViewGroup
import com.andres.horoscopapp.databinding.FragmentHoroscopeBinding
import com.andres.horoscopapp.presentation.utils.VBBaseFragment

class HoroscopeFragment : VBBaseFragment<FragmentHoroscopeBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHoroscopeBinding
        get() = FragmentHoroscopeBinding::inflate

    override fun setup() {
    }
}