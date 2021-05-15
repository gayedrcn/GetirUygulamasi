package com.gayedirican.getiruygulamasi

import java.io.Serializable

data class Kategoriler(var kategori_id:Int, var kategori_ad:String, var kategori_resim_ad:String, var kategori_icerik1:String, var kategori_icerik2:String, var kategori_icerik3:String) : Serializable {
}