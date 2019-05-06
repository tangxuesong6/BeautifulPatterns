package com.mdht.beautifulkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import com.mdht.beautifulkotlin.builder.StudentConfigJustSeeSee
import com.mdht.beautifulkotlin.builder.StudentConfigJava
import com.mdht.beautifulkotlin.builder.StudentConfigKotlin
import com.mdht.beautifulkotlin.singleton.SingletonEnumJava
import com.mdht.beautifulkotlin.singleton.SingletonEnumKotlin
import com.mdht.beautifulkotlin.singleton.SingletonInnerJava
import com.mdht.beautifulkotlin.singleton.SingletonInnerKotlin

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mTvBuilder: TextView
    private lateinit var mTvSingleton: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initListener()
    }

    private fun initView() {
        mTvSingleton = findViewById<TextView>(R.id.tv_singleton)
        mTvBuilder = findViewById<TextView>(R.id.tv_builder)
    }

    private fun initListener() {
        mTvSingleton.setOnClickListener(this)
        mTvBuilder.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_singleton -> {
                SingletonEnumKotlin.INSTANCE.doSomething()
                SingletonEnumJava.INSTANCE.doSomething()
                SingletonInnerKotlin.instance.doSomething()
                SingletonInnerJava.getInstance().doSomething()
            }
            R.id.tv_builder -> {
                val configJava = StudentConfigJava.Builder()
                    .setName("小明")
                    .setFavoriteColor("yellow")
                    .setAge(18)
                    .create()
                Log.d("MainActivity", "java--${configJava.name}喜爱的颜色是${configJava.favoriteColor}")

                val configKotlin = StudentConfigKotlin.create {
                    setName { "小红" }
                    setAddress { "建国路22号" }
                }
                Log.d("MainActivity", "kotlin--${configKotlin.name}住在${configKotlin.address}")
                val configBadWay = StudentConfigJustSeeSee.Builder()
                    .setId(12)
                    .setGrade(98)
                    .create()
                Log.d("MainActivity", "kotlin--${configBadWay.id}号学生的成绩是${configBadWay.grade}")

            }

        }
    }
}
