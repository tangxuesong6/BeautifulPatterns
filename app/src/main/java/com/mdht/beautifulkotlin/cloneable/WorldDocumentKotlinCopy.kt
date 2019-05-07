package com.mdht.beautifulkotlin.cloneable

import android.util.Log

/**
 * 浅拷贝 效率貌似不如clone
 */
data class WorldDocumentKotlinCopy(var text:String,var images:ArrayList<String>){
    init {
        Log.d("WorldDocumentKotlinCopy", "------------WorldDocumentKotlinCopy构造函数-----------------")
    }
    fun addImage(img: String) {
        this.images.add(img)
    }
    fun showDocument() {
        Log.d("WorldDocumentKotlinCopy", "------------Word Content Start-----------------")
        Log.d("WorldDocumentKotlinCopy", "Text : " + text!!)
        Log.d("WorldDocumentKotlinCopy", "Images List : ")
        for (imgName in images) {
            Log.d("WorldDocumentKotlinCopy", "image name : $imgName")
        }
        Log.d("WorldDocumentKotlinCopy", "------------Word Content End-----------------")
    }
}