package com.mdht.beautifulkotlin.cloneable;

import android.util.Log;

import java.util.ArrayList;

public class WordDocumentJava implements Cloneable
{
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocumentJava() {
        Log.d("WordDocumentJava", "------------WordDocumentJava构造函数-----------------");
    }

    @Override
    public WordDocumentJava clone() throws CloneNotSupportedException {
        WordDocumentJava doc = (WordDocumentJava) super.clone();
        doc.mText = this.mText;
        doc.mImages = (ArrayList<String>) this.mImages.clone();
        return doc;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }

    public void showDocument() {
        Log.d("WordDocumentJava", "------------Word Content Start-----------------");
        Log.d("WordDocumentJava", "Text : " + mText);
        Log.d("WordDocumentJava", "Images List : ");
        for (String imgName : mImages) {
            Log.d("WordDocumentJava", "image name : " + imgName);
        }
        Log.d("WordDocumentJava", "------------Word Content End-----------------");
    }
}
