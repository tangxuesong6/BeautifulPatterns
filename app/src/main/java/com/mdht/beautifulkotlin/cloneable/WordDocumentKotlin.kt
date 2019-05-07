package com.mdht.beautifulkotlin.cloneable

import android.util.Log
import java.util.*

class WordDocumentKotlin : Cloneable {
     var text: String? = null
    private var images = ArrayList<String>()

    init {
        Log.d("WordDocumentKotlin", "------------WordDocumentKotlin构造函数-----------------")
    }

    @Throws(CloneNotSupportedException::class)
    public override fun clone(): WordDocumentKotlin {
        val doc = super.clone() as WordDocumentKotlin
        doc.text = this.text
        doc.images = this.images.clone() as ArrayList<String>
        return doc
    }

    fun addImage(img: String) {
        this.images.add(img)
    }

    fun showDocument() {
        Log.d("WordDocumentKotlin", "------------Word Content Start-----------------")
        Log.d("WordDocumentKotlin", "Text : " + text!!)
        Log.d("WordDocumentKotlin", "Images List : ")
        for (imgName in images) {
            Log.d("WordDocumentKotlin", "image name : $imgName")
        }
        Log.d("WordDocumentKotlin", "------------Word Content End-----------------")
    }
}