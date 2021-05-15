package com.gayedirican.getiruygulamasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.gayedirican.getiruygulamasi.databinding.FragmentKategoriDetayBinding


class KategoriDetayFragment : Fragment() {
    private lateinit var tasarim:FragmentKategoriDetayBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_kategori_detay, container, false)
        val b:KategoriDetayFragmentArgs by navArgs()
        val gelenKategori = b.nesne
        tasarim.kategoriNesnesi = gelenKategori
        tasarim.imageView2.setImageResource(resources.getIdentifier(gelenKategori.kategori_resim_ad,"drawable", requireContext().packageName))
        return tasarim.root
    }


}