package com.mdht.beautifulkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import com.mdht.beautifulkotlin.abstractfactory.java.CarFactoryJava
import com.mdht.beautifulkotlin.abstractfactory.java.EnumFactoryJava
import com.mdht.beautifulkotlin.builder.StudentConfigJava
import com.mdht.beautifulkotlin.builder.StudentConfigJustSeeSee
import com.mdht.beautifulkotlin.builder.StudentConfigKotlin
import com.mdht.beautifulkotlin.cloneable.WordDocumentJava
import com.mdht.beautifulkotlin.cloneable.WordDocumentKotlin
import com.mdht.beautifulkotlin.cloneable.WorldDocumentKotlinCopy
import com.mdht.beautifulkotlin.factorymethod.java.ColorFactoryJava
import com.mdht.beautifulkotlin.factorymethod.java.EnumJava
import com.mdht.beautifulkotlin.factorymethod.kotlin.ColorFactoryKotlin
import com.mdht.beautifulkotlin.factorymethod.kotlin.EnumKotlin
import com.mdht.beautifulkotlin.singleton.SingletonEnumJava
import com.mdht.beautifulkotlin.singleton.SingletonEnumKotlin
import com.mdht.beautifulkotlin.singleton.SingletonInnerJava
import com.mdht.beautifulkotlin.singleton.SingletonInnerKotlin

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mTvBuilder: TextView
    private lateinit var mTvSingleton: TextView
    private lateinit var mTvCloneable: TextView
    private lateinit var mTvFactoryMethod: TextView
    private lateinit var mTvAbstractFactory: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initListener()
    }

    private fun initView() {
        mTvSingleton = findViewById<TextView>(R.id.tv_singleton)
        mTvBuilder = findViewById<TextView>(R.id.tv_builder)
        mTvCloneable = findViewById<TextView>(R.id.tv_cloneable)
        mTvFactoryMethod = findViewById<TextView>(R.id.tv_factory_method)
        mTvAbstractFactory = findViewById<TextView>(R.id.tv_abstract_factory)
    }

    private fun initListener() {
        mTvSingleton.setOnClickListener(this)
        mTvBuilder.setOnClickListener(this)
        mTvCloneable.setOnClickListener(this)
        mTvFactoryMethod.setOnClickListener(this)
        mTvAbstractFactory.setOnClickListener(this)
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
                val configJustSeeSee = StudentConfigJustSeeSee.Builder()
                    .setId(12)
                    .setGrade(98)
                    .create()
                Log.d("MainActivity", "kotlin--${configJustSeeSee.id}号学生的成绩是${configJustSeeSee.grade}")

            }
            R.id.tv_cloneable -> {
//                cloneableJava()
                //浅拷贝
//                cloneableKotlinCopy()
                cloneableKotlin()
            }
            R.id.tv_factory_method -> {
                ColorFactoryJava.getColor(EnumJava.RED).show()
                ColorFactoryKotlin.getColor(EnumKotlin.YELLOW)?.show()
            }
            R.id.tv_abstract_factory -> {
                CarFactoryJava.createFactory(EnumFactoryJava.Q3).createTire().tire()
            }

        }
    }

    private fun cloneableKotlinCopy() {
        val worldDocumentKotlinCopy = WorldDocumentKotlinCopy("hello", ArrayList())
        worldDocumentKotlinCopy.text = "kotlin 数据类"
        worldDocumentKotlinCopy.addImage("image 1")
        worldDocumentKotlinCopy.addImage("image 2")
        worldDocumentKotlinCopy.addImage("image 3")
        worldDocumentKotlinCopy.showDocument()
        val worldDocumentKotlinCopy2 = worldDocumentKotlinCopy.copy()
        worldDocumentKotlinCopy2.text = "kotlin 数据类 修改"
        worldDocumentKotlinCopy2.addImage("img four")
        worldDocumentKotlinCopy2.showDocument()
        worldDocumentKotlinCopy.showDocument()
    }

    private fun cloneableJava() {
        val wordDocumentJava = WordDocumentJava()
        wordDocumentJava.text = "这是一篇文档"
        wordDocumentJava.addImage("图片 1")
        wordDocumentJava.addImage("图片 2")
        wordDocumentJava.addImage("图片 3")
        wordDocumentJava.showDocument()
        val wordDocumentJava2 = wordDocumentJava.clone()
        wordDocumentJava2.showDocument()
        wordDocumentJava2.text = "这是修改过的原始文档"
        wordDocumentJava2.showDocument()
        wordDocumentJava.showDocument()
    }

    private fun cloneableKotlin() {
        val wordDocumentKotlin = WordDocumentKotlin()
        wordDocumentKotlin.text = "这是一篇文档"
        wordDocumentKotlin.addImage("图片 1")
        wordDocumentKotlin.addImage("图片 2")
        wordDocumentKotlin.addImage("图片 3")
        wordDocumentKotlin.showDocument()
        val wordDocumentKotlin2 = wordDocumentKotlin.clone()
        wordDocumentKotlin2.showDocument()
        wordDocumentKotlin2.text = "这是修改过的原始文档"
        wordDocumentKotlin2.addImage("add 图片")
        wordDocumentKotlin2.showDocument()
        wordDocumentKotlin.showDocument()
    }
}
