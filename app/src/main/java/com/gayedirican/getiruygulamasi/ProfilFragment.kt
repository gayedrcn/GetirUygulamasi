package com.gayedirican.getiruygulamasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.gayedirican.getiruygulamasi.databinding.FragmentAnasayfaBinding
import com.gayedirican.getiruygulamasi.databinding.FragmentProfilBinding

class ProfilFragment : Fragment() {
    private lateinit var tasarim: FragmentProfilBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_profil, container, false)
        return tasarim.root
    }

}