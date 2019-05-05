package com.mdht.beautifulkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.mdht.beautifulkotlin.singleton.SingletonEnumJava
import com.mdht.beautifulkotlin.singleton.SingletonEnumKotlin
import com.mdht.beautifulkotlin.singleton.SingletonInnerJava
import com.mdht.beautifulkotlin.singleton.SingletonInnerKotlin

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var mTvSingleton: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initListener()
    }

    private fun initView() {
        mTvSingleton = findViewById<TextView>(R.id.tv_singleton)
    }

    private fun initListener() {
        mTvSingleton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tv_singleton -> {
                SingletonEnumKotlin.INSTANCE.doSomething()
                SingletonEnumJava.INSTANCE.doSomething()
                SingletonInnerKotlin.instance.doSomething()
                SingletonInnerJava.getInstance().doSomething()
            }

        }
    }
}
