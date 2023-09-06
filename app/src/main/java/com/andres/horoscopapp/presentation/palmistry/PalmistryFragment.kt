package com.andres.horoscopapp.presentation.palmistry

import android.view.LayoutInflater
import android.view.ViewGroup
import com.andres.horoscopapp.databinding.FragmentPalmistryBinding
import com.andres.horoscopapp.presentation.utils.VBBaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PalmistryFragment: VBBaseFragment<FragmentPalmistryBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentPalmistryBinding
    get() = FragmentPalmistryBinding::inflate

    override fun setup() {
    }
}