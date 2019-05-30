package com.mdht.beautifulkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import com.mdht.beautifulkotlin.abstractfactory.java.CarFactoryJava
import com.mdht.beautifulkotlin.abstractfactory.java.EnumFactoryJava
import com.mdht.beautifulkotlin.abstractfactory.kotlin.CarFactoryKotlin
import com.mdht.beautifulkotlin.abstractfactory.kotlin.EnumFactoryKotlin
import com.mdht.beautifulkotlin.builder.StudentConfigJava
import com.mdht.beautifulkotlin.builder.StudentConfigJustSeeSee
import com.mdht.beautifulkotlin.builder.StudentConfigKotlin
import com.mdht.beautifulkotlin.chainofresponsibility.java.BossJava
import com.mdht.beautifulkotlin.chainofresponsibility.java.DirectorJava
import com.mdht.beautifulkotlin.chainofresponsibility.java.GroupLeaderJava
import com.mdht.beautifulkotlin.chainofresponsibility.java.ManagerJava
import com.mdht.beautifulkotlin.chainofresponsibility.kotlin.BossKotlin
import com.mdht.beautifulkotlin.chainofresponsibility.kotlin.DirectorKotlin
import com.mdht.beautifulkotlin.chainofresponsibility.kotlin.GroupLeaderKotlin
import com.mdht.beautifulkotlin.chainofresponsibility.kotlin.ManagerKotlin
import com.mdht.beautifulkotlin.cloneable.WordDocumentJava
import com.mdht.beautifulkotlin.cloneable.WordDocumentKotlin
import com.mdht.beautifulkotlin.cloneable.WorldDocumentKotlinCopy
import com.mdht.beautifulkotlin.command.java.AddCommandJava
import com.mdht.beautifulkotlin.command.java.InvokerJava
import com.mdht.beautifulkotlin.command.java.ReceiverJava
import com.mdht.beautifulkotlin.command.java.RemoveCommandJava
import com.mdht.beautifulkotlin.command.kotlin.AddCommandKotlin
import com.mdht.beautifulkotlin.command.kotlin.InvokerKotlin
import com.mdht.beautifulkotlin.command.kotlin.ReceiverKotlin
import com.mdht.beautifulkotlin.command.kotlin.RemoveCommandKotlin
import com.mdht.beautifulkotlin.factorymethod.java.ColorFactoryJava
import com.mdht.beautifulkotlin.factorymethod.java.EnumJava
import com.mdht.beautifulkotlin.factorymethod.kotlin.ColorFactoryKotlin
import com.mdht.beautifulkotlin.factorymethod.kotlin.EnumKotlin
import com.mdht.beautifulkotlin.interpreter.java.CalculatorJava
import com.mdht.beautifulkotlin.interpreter.kotlin.CalculatorKotlin
import com.mdht.beautifulkotlin.iterator.java.ConcreteAggregateJava
import com.mdht.beautifulkotlin.iterator.kotlin.ConcreteAggregateKotlin
import com.mdht.beautifulkotlin.memento.java.CareTakerJava
import com.mdht.beautifulkotlin.memento.java.OriginatorJava
import com.mdht.beautifulkotlin.memento.kotlin.CareTakerKotlin
import com.mdht.beautifulkotlin.memento.kotlin.OriginatorKotlin
import com.mdht.beautifulkotlin.observer.java.CoderJava
import com.mdht.beautifulkotlin.observer.java.DevTechFrontierJava
import com.mdht.beautifulkotlin.observer.kotlin.CoderKotlin
import com.mdht.beautifulkotlin.observer.kotlin.DevTechFrontierKotlin
import com.mdht.beautifulkotlin.singleton.SingletonEnumJava
import com.mdht.beautifulkotlin.singleton.SingletonEnumKotlin
import com.mdht.beautifulkotlin.singleton.SingletonInnerJava
import com.mdht.beautifulkotlin.singleton.SingletonInnerKotlin
import com.mdht.beautifulkotlin.state.java.LoginContextJava
import com.mdht.beautifulkotlin.state.kotlin.LoginContextKotlin
import com.mdht.beautifulkotlin.strategy.java.EatManagerJava
import com.mdht.beautifulkotlin.strategy.java.SheepJava
import com.mdht.beautifulkotlin.strategy.kotlin.EatManagerKotlin
import com.mdht.beautifulkotlin.template.java.AbstractComputerJava
import com.mdht.beautifulkotlin.template.java.CoderComputerJava
import com.mdht.beautifulkotlin.template.java.MilitaryComputerJava
import com.mdht.beautifulkotlin.template.kotlin.AbstractComputerKotlin
import com.mdht.beautifulkotlin.template.kotlin.CoderComputerKotlin
import com.mdht.beautifulkotlin.template.kotlin.MilitaryComputerKotlin

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mTvBuilder: TextView
    private lateinit var mTvSingleton: TextView
    private lateinit var mTvCloneable: TextView
    private lateinit var mTvFactoryMethod: TextView
    private lateinit var mTvAbstractFactory: TextView
    private lateinit var mTvStrategy: TextView
    private lateinit var mTvState: TextView
    private lateinit var mTvChainOfResponsibility: TextView
    private lateinit var mTvInterpreter: TextView
    private lateinit var mTvCommand: TextView
    private lateinit var mTvObserver: TextView
    private lateinit var mTvMemento: TextView
    private lateinit var mTvIterator: TextView
    private lateinit var mTvTemplate: TextView
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
        mTvStrategy = findViewById<TextView>(R.id.tv_strategy)
        mTvState = findViewById<TextView>(R.id.tv_state)
        mTvChainOfResponsibility = findViewById<TextView>(R.id.tv_chain_of_responsibility)
        mTvInterpreter = findViewById<TextView>(R.id.tv_interpreter)
        mTvCommand = findViewById<TextView>(R.id.tv_command)
        mTvObserver = findViewById<TextView>(R.id.tv_observer)
        mTvMemento = findViewById<TextView>(R.id.tv_memento)
        mTvIterator = findViewById<TextView>(R.id.tv_iterator)
        mTvTemplate = findViewById<TextView>(R.id.tv_template)
    }

    private fun initListener() {
        mTvSingleton.setOnClickListener(this)
        mTvBuilder.setOnClickListener(this)
        mTvCloneable.setOnClickListener(this)
        mTvFactoryMethod.setOnClickListener(this)
        mTvAbstractFactory.setOnClickListener(this)
        mTvStrategy.setOnClickListener(this)
        mTvState.setOnClickListener(this)
        mTvChainOfResponsibility.setOnClickListener(this)
        mTvInterpreter.setOnClickListener(this)
        mTvCommand.setOnClickListener(this)
        mTvObserver.setOnClickListener(this)
        mTvMemento.setOnClickListener(this)
        mTvIterator.setOnClickListener(this)
        mTvTemplate.setOnClickListener(this)
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
//                cloneableKotlinCopy()o
                cloneableKotlin()
            }
            R.id.tv_factory_method -> {
                ColorFactoryJava.getColor(EnumJava.RED).show()
                ColorFactoryKotlin.getColor(EnumKotlin.YELLOW)?.show()
            }
            R.id.tv_abstract_factory -> {
                CarFactoryJava.createFactory(EnumFactoryJava.Q3).createTire().tire()
                CarFactoryKotlin.createFactory(EnumFactoryKotlin.Q7).createTire().tire()
            }
            R.id.tv_strategy -> {
                val eatManagerJava = EatManagerJava()
                eatManagerJava.setStrategy(SheepJava())
                val strJava = eatManagerJava.eat("Judy")
                Log.d("MainActivity", strJava)

                val dog: (String) -> String = { "Dog: " + it + "在吃东西，汪旺旺" }
                val sheep: (String) -> String = { "Sheep: " + it + "在吃东西，咩咩咩" }
                val manager = EatManagerKotlin(dog)
                val strKotlin = manager.eat("Hash")
                Log.d("MainActivity", strKotlin)
            }
            R.id.tv_state -> {
                val loginContextJava = LoginContextJava()
                loginContextJava.logout()
                loginContextJava.forward()

                val loginContextKotlin = LoginContextKotlin()
                loginContextKotlin.login()
                loginContextKotlin.comment()
            }
            R.id.tv_chain_of_responsibility -> {
                val groupLeaderJava = GroupLeaderJava()
                val directorJava = DirectorJava()
                val managerJava = ManagerJava()
                val bossJava = BossJava()

                groupLeaderJava.nextHandler = directorJava
                directorJava.nextHandler = managerJava
                managerJava.nextHandler = bossJava
                groupLeaderJava.handleRequest(50000)

                val groupLeaderKotlin = GroupLeaderKotlin()
                val directorKotlin = DirectorKotlin()
                val managerKotlin = ManagerKotlin()
                val bossKotlin = BossKotlin()

                groupLeaderKotlin.nextHandler = directorKotlin
                directorKotlin.nextHandler = managerKotlin
                managerKotlin.nextHandler = bossKotlin
                groupLeaderKotlin.handleRequest(6000)
            }
            R.id.tv_interpreter -> {
                val calculatorJava = CalculatorJava("1 + 2 + 3")
                val calculatorKotlin = CalculatorKotlin("2 + 3 + 4 + 1")
                Log.d("MainActivity", "CalculatorKotlin------${calculatorKotlin.calculate()}")
            }
            R.id.tv_command -> {
                val invokerJava = InvokerJava()
                val receiverJava = ReceiverJava()
                invokerJava.setAddCommand(AddCommandJava(receiverJava))
                invokerJava.setRemoveCommand(RemoveCommandJava(receiverJava))
                invokerJava.setAddCommand(AddCommandJava(receiverJava))
                invokerJava.undo()
                invokerJava.processCommands()

                val invokerKotlin = InvokerKotlin()
                val receiverKotlin = ReceiverKotlin()
                invokerKotlin.setAddCommand(AddCommandKotlin(receiverKotlin))
                invokerKotlin.setRemoveCommand(RemoveCommandKotlin(receiverKotlin))
                invokerKotlin.setAddCommand(AddCommandKotlin(receiverKotlin))
                invokerKotlin.undo()
                invokerKotlin.processCommands()
            }
            R.id.tv_observer -> {
                val devtechFrontierJava = DevTechFrontierJava()
                val coderJava1 = CoderJava("coder-1")
                val coderJava2 = CoderJava("coder-2")
                val coderJava3 = CoderJava("coder-3")
                devtechFrontierJava.addObserver(coderJava1)
                devtechFrontierJava.addObserver(coderJava2)
                devtechFrontierJava.addObserver(coderJava3)
                devtechFrontierJava.postNewPublication("发布啦!")

                val devTechFrontierKotlin = DevTechFrontierKotlin()
                devTechFrontierKotlin.addMyObserver(CoderKotlin("coder-1"))
                devTechFrontierKotlin.addMyObserver(CoderKotlin("coder-2"))
                devTechFrontierKotlin.postNewPublication = "又发布啦"
            }
            R.id.tv_memento -> {
                val originatorJava = OriginatorJava()
                originatorJava.state = "initial state"
                val careTakerJava = CareTakerJava()
                careTakerJava.saveState(originatorJava.createMemento())
                originatorJava.state = "State #1"
                careTakerJava.saveState(originatorJava.createMemento())
                originatorJava.state = "State #2"
                careTakerJava.saveState(originatorJava.createMemento())
                Log.d("MainActivity", "Current State:" + originatorJava.state)
                originatorJava.restore(careTakerJava.restore(1))
                Log.d("MainActivity", "Second saved state:" + originatorJava.state)
                originatorJava.restore(careTakerJava.restore(0))
                Log.d("MainActivity", "First saved state:" + originatorJava.state)

                val originKotlin = OriginatorKotlin("initial state")
                val careTaKerKotlin = CareTakerKotlin()
                careTaKerKotlin.saveState(originKotlin.createMemento())
                originKotlin.state = "State #1"
                careTaKerKotlin.saveState(originKotlin.createMemento())
                originKotlin.state = "State6"
                careTaKerKotlin.saveState(originKotlin.createMemento())
                Log.d("MainActivity", "Current State:" + originKotlin.state)
                originKotlin.restore(careTaKerKotlin.restore(1))
                Log.d("MainActivity", "Second saved state:" + originKotlin.state)
                originKotlin.restore(careTaKerKotlin.restore(0))
                Log.d("MainActivity", "First saved state:" + originKotlin.state)

            }
            R.id.tv_iterator -> {
                val aggregateKotlin = ConcreteAggregateKotlin<String>()
                aggregateKotlin.apply {
                    add("Hi")
                    add("Kotlin")
                    add("brother")
                }
                val iteratorKotlin = aggregateKotlin.iterator()
                while (iteratorKotlin.hasNext()){
                    Log.d("MainActivity", "Result is :" + iteratorKotlin.next())
                }
            }
            R.id.tv_template -> {
                var compKotlin:AbstractComputerKotlin = CoderComputerKotlin()
                compKotlin.startUp()
                compKotlin = MilitaryComputerKotlin()
                compKotlin.startUp()
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
