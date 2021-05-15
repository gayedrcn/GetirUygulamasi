package com.gayedirican.getiruygulamasi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.gayedirican.getiruygulamasi.databinding.FragmentAraBinding
import kotlin.collections.ArrayList


class AraFragment : Fragment() {
    private lateinit var tasarim: FragmentAraBinding
    private lateinit var adapter: UrunlerAdapter
    private lateinit var urunlerListesi:ArrayList<Urunler>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_ara, container, false)
        urunlerListesi=ArrayList()
        val u1 = Urunler("La Lorraine Simit")
        val u2 = Urunler("Nemlendiricili Sıvı Sabun")
        val u3 = Urunler("Lezita Çıtır Muhteşem Üçlü")
        val u4 = Urunler("Scotch Brite Silgi Sünger")
        val u5 = Urunler("Persil Hijyen")
        val u6 = Urunler("Coco Pops Şenlik Paketi")
        val u7 = Urunler("Milka & Kuzeyden İkilisi")
        val u8 = Urunler("Toblerone & Su İkilisi")
        val u9 = Urunler("Eti Karam & Su İkilisi")
        val u10 = Urunler("Portakal")
        val u11 = Urunler("Çağla")
        val u12 = Urunler("Yeşil Elma")
        val u13 = Urunler("Kiri & Etimek İkilisi")
        val u14 = Urunler("Uno Gurme Sandviç Ekmeği")
        val u15 = Urunler("UNO Lavaş")
        val u16 = Urunler("Namet Yemeklik Kuşbaşı")
        val u17 = Urunler("Erpiliç Baget")
        val u18 = Urunler("Erpiliç Bonfile")
        val u19 = Urunler("Eti Mutluluk Paketi")
        val u20 = Urunler("Ülker Sütlü")
        val u21 = Urunler("Ülker Antep Fıstıklı")
        val u22 = Urunler("Nogger Sandviç")
        val u23 = Urunler("Algida Big Bold")
        val u24 = Urunler("Bounty Dondurma")
        val u25 = Urunler("Tavuk Teriyaki")
        val u26 = Urunler("Hindi Fümeli")
        val u27 = Urunler("Kaşarlı Sandviç")
        val u28 = Urunler("Danone Yarım Yağlı")
        val u29 = Urunler("Sütaş Süt")
        val u30 = Urunler("Sek Süt")
        val u31 = Urunler("Tadım Yer Fıstıklı")
        val u32 = Urunler("Piko Fındık")
        val u33 = Urunler("Piko Chia")
        val u34 = Urunler("Sensodyne Onarım")
        val u35 = Urunler("Colgate Çocuk Diş Macunu")
        val u36 = Urunler("Colgate Ağız Bakım İkilisi")
        val u37 = Urunler("Lysol Dezenfektan")
        val u38 = Urunler("Domestos Pembe Güç")
        val u39 = Urunler("Dixi Yaban Gülü")


        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)
        urunlerListesi.add(u8)
        urunlerListesi.add(u9)
        urunlerListesi.add(u10)
        urunlerListesi.add(u11)
        urunlerListesi.add(u12)
        urunlerListesi.add(u13)
        urunlerListesi.add(u14)
        urunlerListesi.add(u15)
        urunlerListesi.add(u16)
        urunlerListesi.add(u17)
        urunlerListesi.add(u18)
        urunlerListesi.add(u19)
        urunlerListesi.add(u20)
        urunlerListesi.add(u21)
        urunlerListesi.add(u22)
        urunlerListesi.add(u23)
        urunlerListesi.add(u24)
        urunlerListesi.add(u25)
        urunlerListesi.add(u26)
        urunlerListesi.add(u27)
        urunlerListesi.add(u28)
        urunlerListesi.add(u29)
        urunlerListesi.add(u30)
        urunlerListesi.add(u31)
        urunlerListesi.add(u32)
        urunlerListesi.add(u33)
        urunlerListesi.add(u34)
        urunlerListesi.add(u35)
        urunlerListesi.add(u36)
        urunlerListesi.add(u37)
        urunlerListesi.add(u38)
        urunlerListesi.add(u39)


        adapter = UrunlerAdapter(requireContext(), urunlerListesi)
        tasarim.urunlerAdapter = adapter
        return tasarim.root
    }

}