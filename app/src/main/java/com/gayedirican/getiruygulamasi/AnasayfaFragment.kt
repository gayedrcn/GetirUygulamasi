package com.gayedirican.getiruygulamasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.gayedirican.getiruygulamasi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding
    private lateinit var kategoriListesi:ArrayList<Kategoriler>
    private lateinit var adapter: KategoriAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false)
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        val k1 = Kategoriler(1, "Yeni Ürünler", "yeniurun", "La Lorraine Simit ₺2,49","Nemlendiricili Sıvı Sabun ₺22,90","Lezita Çıtır Muhteşem Üçlü ₺27,95")
        val k2 = Kategoriler(2, "İndirimler", "indirim", "Scotch Brite Silgi Sünger ₺22,90","Persil Hijyen ₺43,99","Coco Pops Şenlik Paketi ₺18,45")
        val k3 = Kategoriler(3, "Su & İçecek", "suicecek", "Milka & Kuzeyden İkilisi ₺21,51","Toblerone & Su İkilisi ₺26,86","Eti Karam & Su İkilisi ₺16,16")
        val k4 = Kategoriler(4, "Meyve&Sebze", "meyvesebze", "Portakal ₺9,45","Çağla ₺9,95","Yeşil Elma ₺6,95")
        val k5 = Kategoriler(5, "Fırından", "firindan", "Kiri & Etimek İkilisi ₺12,87","Uno Gurme Sandviç Ekmeği ₺11,75","UNO Lavaş ₺13,95")
        val k6 = Kategoriler(6, "Temel Gıda", "temelgida", "Namet Yemeklik Kuşbaşı ₺24,75","Erpiliç Baget ₺21,95","Erpiliç Bonfile ₺27,95")
        val k7 = Kategoriler(7, "Atıştırmalık", "atistirmali", "Eti Mutluluk Paketi ₺13,59","Ülker Sütlü ₺5,35","Ülker Antep Fıstıklı ₺7,90")
        val k8 = Kategoriler(8, "Dondurma", "dondurma", "Nogger Sandviç ₺5,00","Algida Big Bold ₺6,00","Bounty Dondurma ₺8,00")
        val k9 = Kategoriler(9, "Yiyecek", "yiyecek", "Tavuk Teriyaki ₺19,45","Hindi Fümeli ₺14,95","Kaşarlı Sandviç ₺12,45")
        val k10 = Kategoriler(10, "Süt & Kahvaltı", "sutkahvalti", "Danone Yarım Yağlı Süt ₺6,99","Sütaş Süt ₺6,95","Sek Süt ₺7,45")
        val k11 = Kategoriler(11, "Fit & Form", "fitform", "Tadım Yer Fıstıklı ₺2,30","Piko Fındık ₺2,75","Piko Chia ₺2,75")
        val k12 = Kategoriler(12, "Kişisel Bakım", "kisiselbakim", "Sensodyne Onarım ₺46,90","Colgate Çocuk Diş Macunu ₺34,90","Colgate Ağız Bakım İkilisi ₺35,50")
        val k13 = Kategoriler(13, "Ev Bakım", "evbakim", "Lysol Dezenfektan ₺39,90","Domestos Pembe Güç ₺8,45","Dixi Yaban Gülü ₺14,90")
        val k14 = Kategoriler(14, "Ev & Yaşam", "evyasam", "Cumhuriyet Gazetesi ₺2,50","Milliyet Gazetesi ₺1,00","Sözcü Gazetesi ₺2,00")
        val k15 = Kategoriler(15, "Teknoloji", "teknoloji", "ttec Type-C Şarj Kablosu ₺29,90","ttec Micro USB Kablo ₺20,90","ttec Iphone Şarj Kablosu ₺49.90")
        val k16 = Kategoriler(16, "Evcil Hayvan", "evcilhayvan", "Proline Yetişkin Ciğerli ₺13,85","Proline Yetişkin Balıklı ₺13,85","Whiskas 2-12 Ay ₺4,99")
        val k17 = Kategoriler(17, "Bebek", "bebis", "Sleepy Natural 2 Beden ₺37,90","Sleepy Natural 3 Beden ₺37,90","Sleepy Natural 4 Beden ₺37,90")
        val k18 = Kategoriler(18, "Cinsel Sağlık", "cinselsaglik", "OKEY Yeşil ₺29,90","OKEY Kırmızı ₺29,90","OKEY Turuncu ₺29,90")
        val k19 = Kategoriler(19, "Giyim", "giyim", "Penti Mikro Siyah ₺13,50","Penti Mat Siyah ₺14,50","Penti Mat Ten ₺14,50")


        kategoriListesi = ArrayList()
        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)
        kategoriListesi.add(k5)
        kategoriListesi.add(k6)
        kategoriListesi.add(k7)
        kategoriListesi.add(k8)
        kategoriListesi.add(k9)
        kategoriListesi.add(k10)
        kategoriListesi.add(k11)
        kategoriListesi.add(k12)
        kategoriListesi.add(k13)
        kategoriListesi.add(k14)
        kategoriListesi.add(k15)
        kategoriListesi.add(k16)
        kategoriListesi.add(k17)
        kategoriListesi.add(k18)
        kategoriListesi.add(k19)

        adapter = KategoriAdapter(requireContext(),kategoriListesi)
        tasarim.rv.adapter = adapter
        return tasarim.root
    }

}