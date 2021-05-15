package com.gayedirican.getiruygulamasi

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gayedirican.getiruygulamasi.databinding.UrunlerCardBinding
import com.google.android.material.snackbar.Snackbar

class UrunlerAdapter(var mContext:Context, val urunlerListesi:List<Urunler>):RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(urunlerCardBinding: UrunlerCardBinding):RecyclerView.ViewHolder(urunlerCardBinding.root){
        var cardTasarim: UrunlerCardBinding
        init {
            this.cardTasarim= urunlerCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = UrunlerCardBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)

        holder.cardTasarim.urunNesnesi = urun
        holder.cardTasarim.floatingActionButton2.setOnClickListener {
            Snackbar.make(it,"Eklemek istiyor musunuz ?", Snackbar.LENGTH_LONG)
                .setAction("Evet"){

                    Snackbar.make(it,"Eklendi", Snackbar.LENGTH_LONG).show()

                }.show()
        }
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}