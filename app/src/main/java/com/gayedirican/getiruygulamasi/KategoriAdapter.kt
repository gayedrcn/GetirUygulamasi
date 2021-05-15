package com.gayedirican.getiruygulamasi

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.gayedirican.getiruygulamasi.databinding.KategoriCardBinding

class KategoriAdapter(var mContext:Context, var kategoriListesi:List<Kategoriler>) : RecyclerView.Adapter<KategoriAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(kategoriCardBinding: KategoriCardBinding):RecyclerView.ViewHolder(kategoriCardBinding.root){
        var tasarim: KategoriCardBinding
        init {
            this.tasarim = kategoriCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = KategoriCardBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kategori = kategoriListesi.get(position)
        holder.tasarim.textViewKatgori.text = kategori.kategori_ad
        holder.tasarim.imageViewKategori.setImageResource(mContext.resources.getIdentifier(kategori.kategori_resim_ad, "drawable", mContext.packageName))
        holder.tasarim.kategoriCardview.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(kategori)
            Navigation.findNavController(it).navigate(gecis)


        }
    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }
}