
# 六大原则
1. 单一职责原则
> 定义:单一职责原则的英文名称是 Single Responsibility Principle，缩写是SRP。即:就一个类而言，应该仅有一个引起它变化的原因。
2. 开闭原则
> 定义:开闭原则的英文全称是 Open Close Principle，缩写是OCP。即:软件中的对象(类、模块、函数等)应该对于扩展是开放的，但是，对于修改是关闭的。

当软件需要变化时，应该尽量通过扩展的方式来实现变化，而不是通过修改已有的代码来实现。(**应该尽量**遵守开闭原则)。
3. 里氏替换原则
> 定义:里氏替换原则的英文全称是 Liskov Substitution Principle，缩写是LSP。LSP的第一种定义是:如果对每一个类型为S的对象O1，都有类型为T的对象O2，是的T定义的所有程序P在所有的对象O1都代换成O2时，程序P的行为没有发生变化，那么类型S是类型T的子类型。上面这种描述确实不太好理解，我们再看看另一个直截了当的定义。里氏替换原则的第二种定义:所有引用基类的地方必须能透明地使用其子类的对象。(==核心原理是抽象==)。

4. 依赖倒置原则
> 定义:依赖倒置原则英文全称是 Dependence Inversion Principle，缩写是DIP。依赖倒置原则在Java语言中的表现就是:模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的。(其实一句话就可以概括:面向接口编程，或者说是面向抽象编程，这里的抽象指的是接口或者抽象类。面向接口编程是面向对象的精髓之一，也就是上面两节强调的抽象。)。

5. 接口隔离原则
> 定义:接口隔离原则英文全称是 InterfaceSegregation Principle，缩写是ISP。即:客户端不应该依赖它不需要的接口。另一种定义是:类间的依赖关系应该建立在最小的接口上。

6. 迪米特原则
> 定义:迪米特原则英文全称为 Law of Demeter，缩写是LOD，也称最少知识原则(Least Knowledge Principle)。虽然名字不同，但描述的是同一个原则:一个对象应该对其他的对象有最少的了解。通俗地讲，一个类应该对自己需要耦合或调用的类知道得最少，类的内部如何实现与调用者或者依赖者没关系，调用者或者依赖者只需要知道它需要的方法即可，其他的可一概不用管。类与类之间的关系越密切，耦合度越大，当一个类发生改变时，对另一个类的影响也越大。迪米特法则还有一个英文解释是 Only talk to your immedate friends，翻译过来就是:只与直接的朋友通信。

# 创建型模式
## 单例模式
> 定义:确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。

>使用场景:确保某个类有且只有一个对象的场景，避免产生多个对象消耗过多的资源，或者某种类型的对象只应该有且只有一个。例如，创建一个对象需要消耗的资源过多，如要访问IO和数据库等资源，这时就要考虑使用单例模式。

* 枚举单例的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/singleton/SingletonEnumJava.java)
* 枚举单例的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/singleton/SingletonEnumKotlin.kt)
* 静态内部类单例的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/singleton/SingletonInnerJava.java)
* 静态内部类单例的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/singleton/SingletonInnerKotlin.kt)
* Kotlin特性(object实现单例，饿汉式) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/singleton/SingletonObject.kt)

Usage
```
                //java 枚举单例
                SingletonEnumJava.INSTANCE.doSomething()
                //kotlin 枚举单例
                SingletonEnumKotlin.INSTANCE.doSomething()
                //java 静态内部类单例
                SingletonInnerJava.getInstance().doSomething()
                //kotlin 静态内部类单例
                SingletonInnerKotlin.instance.doSomething()
                //kotlin object
                SingletonObject.doSomething()
```

## Builder模式
> 定义:将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

> 使用场景:1. 相同的方法，不同的执行顺序，产生不同的事件结果时。2. 多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时。3. 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的作用，这个时候使用建造者模式非常合适。4. 当初始化一个对象特别复杂，如参数多，且很多参数都具有默认值时。

* Builder模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/builder/StudentConfigJava.java)
* Builder模式的Kotlin实现(利用其特性) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/builder/StudentConfigKotlin.kt)
* Builder模式的Kotlin实现(未利用其特性，仅仅将java代码转为kotlin实现) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/builder/StudentConfigJustSeeSee.kt)

Usage
```
                //java
                val configJava = StudentConfigJava.Builder()
                    .setName("小明")
                    .setFavoriteColor("yellow")
                    .setAge(18)
                    .create()
                Log.d("MainActivity", "java--${configJava.name}喜爱的颜色是${configJava.favoriteColor}")
                //kotlin
                val configKotlin = StudentConfigKotlin.create {
                    setName { "小红" }
                    setAddress { "建国路22号" }
                }
                Log.d("MainActivity", "kotlin--${configKotlin.name}住在${configKotlin.address}")
```
## 原型模式
> 定义:用原型实例指定创建对象的种类，并通过复制这些原型创建新的对象。

>使用场景:1. 类初始化需要消耗非常多的资源，这个资源包括数据、硬件资源等，通过原型复制避免这些消耗。2. 通过new产生一个对象需要非常频繁的数据准备或访问权限，这时可以使用原型模式。3. 一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式复制多个对象供调用者使用，即保护性拷贝。

* 原型模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/cloneable/WordDocumentJava.java)
* 原型模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/cloneable/WordDocumentKotlin.kt)
* 原型模式的Kotlin实现(依赖Kotlin特性，数据类自带copy方法，但是此方法属于浅拷贝，请注意结合自己实际情况使用) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/cloneable/WorldDocumentKotlinCopy.kt)

Usage
```
                //java
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
                //kotlin
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
```
 
## 工厂方法模式
> 定义:定义一个用于创建对象的接口，让子类决定实例化那个类。

> 使用场景:在任何需要生成复杂对象的地方，都可以使用工厂方法模式。复杂对象适合使用工厂模式，用new就可以完成创建的对象无需使用工厂模式。

* 工厂方法模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/factorymethod/java)
* 工厂方法模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/factorymethod/kotlin)

Usage
```
            //java
            ColorFactoryJava.getColor(EnumJava.RED).show()
            //kotlin
            ColorFactoryKotlin.getColor(EnumKotlin.YELLOW)?.show()
```
## 抽象工厂模式
> 定义:为创建一组相关或者是相互依赖的对象提供一个接口，而不需要指定它们的具体类。

> 使用场景:一个对象族有相同的约束时可以使用抽象工厂模式。

* 抽象工厂模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/abstractfactory/java)
* 抽象工厂模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/abstractfactory/kotlin)

Usage
```
                //java
                CarFactoryJava.createFactory(EnumFactoryJava.Q3).createTire().tire()
                //kotlin
                CarFactoryKotlin.createFactory(EnumFactoryKotlin.Q7).createTire().tire()
```
# 行为型模式
## 策略模式
> 定义:策略模式定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。

> 使用场景:1. 针对同一类型问题的多种处理方式，仅仅是具体行为有差别时。2. 需要安全的封装多种同一类型的操作时。3. 出现同一个抽象类有多个子类，而又需要使用if-else或者switch-case来选择具体子类时。

* 策略模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/strategy/java)
* 策略模式的Kotlin实现(简单场景可以依赖Kotlin特性，传入表达式来处理，但是建议复杂场景的话使用抽象来解决问题)      
[点我查看](https://github.com/tangxuesong6/BeautifulPatterns/blob/master/app/src/main/java/com/mdht/beautifulkotlin/strategy/kotlin/EatManagerKotlin.kt)

Usage
```
                //java
                val eatManagerJava = EatManagerJava()
                eatManagerJava.setStrategy(SheepJava())
                val strJava = eatManagerJava.eat("Judy")
                //kotlin
                val dog: (String) -> String = { "Dog: " + it + "在吃东西，汪旺旺" }
                val sheep: (String) -> String = { "Sheep: " + it + "在吃东西，咩咩咩" }
                val manager = EatManagerKotlin(dog)
                val strKotlin = manager.eat("Hash")
```
## 状态模式
> 定义:当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。

> 使用场景:1. 一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为。2. 代码中包含大量与对象状态有关的条件语句，例如，一个操作中含有庞大的多分支语句(if-else或switch-case)，且这些分支依赖于该对象的状态。
状态模式将每一个条件分支放入一个独立的类中，这使得你可以根据对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其它对象而独立变化，这样通过多态来去除过多的、重复的if-else等分支语句。

* 状态模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/state/java)
* 状态模式的Kotlin实现(利用了Kotlin的密封类) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/state/kotlin)

Usage
```
                //java
                val loginContextJava = LoginContextJava()
                loginContextJava.logout()
                loginContextJava.forward()
                //kotlin
                val loginContextKotlin = LoginContextKotlin()
                loginContextKotlin.login()
                loginContextKotlin.comment()
```
## 责任链模式
> 定义:使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。

> 使用场景:1. 多个对象可以处理同一请求，但具体由哪个对象处理则在运行时动态决定。2. 在请求处理者不明确的情况下向多个对象中的一个提交一个请求。3. 需要动态指定一组对象处理请求。

* 责任链模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/chainofresponsibility/java)
* 责任链模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/chainofresponsibility/kotlin)

Usage
```
                //java
                val groupLeaderJava = GroupLeaderJava()
                val directorJava = DirectorJava()
                val managerJava = ManagerJava()
                val bossJava = BossJava()

                groupLeaderJava.nextHandler = directorJava
                directorJava.nextHandler = managerJava
                managerJava.nextHandler = bossJava
                groupLeaderJava.handleRequest(50000)
                //kotlin
                val groupLeaderKotlin = GroupLeaderKotlin()
                val directorKotlin = DirectorKotlin()
                val managerKotlin = ManagerKotlin()
                val bossKotlin = BossKotlin()

                groupLeaderKotlin.nextHandler = directorKotlin
                directorKotlin.nextHandler = managerKotlin
                managerKotlin.nextHandler = bossKotlin
                groupLeaderKotlin.handleRequest(6000)
```
## 解释器模式
> 定义:给定一个语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。

> 使用场景:1. 如果某个简单的语言需要解释执行而且可以将该语言中的语句表示为一个抽象语法树时，可以考虑使用解释器模式。2. 在某些特定的领域出现不断重复的问题时，可以将该领域的问题转化为一种语法规则下的语句，然后构建解释器来解释该语句。

* 解释器模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/interpreter/java)
* 解释器模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/interpreter/kotlin)

Usage
```
                //java
                val calculatorJava = CalculatorJava("1 + 2 + 3")
                calculatorJava.calculate()
                //kotlin
                val calculatorKotlin = CalculatorKotlin("2 + 3 + 4 + 1")
                calculatorKotlin.calculate()
```

## 命令模式
> 定义:将一个请求封装成一个对象，从而让用户使用不同的请求把客户端参数化；对请求排队或者记录请求日志，以及支持可撤销的操作。

> 使用场景:1. 需要抽象出待执行的动作，然后以参数的形式提供出来--类似于过程设计中的回调机制，而命令模式正是回调机制的一个面向对象的替代品。2. 在不同的时刻指定、排列和执行请求。一个命令对象可以有与初始请求无关的生存期。3. 需要支持取消操作。 4. 支持修改日志功能，这样当系统崩溃时，这些修改可以被重做一遍。5. 需要支持事务操作。

* 命令模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/command/java)
* 命令模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/command/kotlin)

Usage
```
                //java
                val invokerJava = InvokerJava()
                val receiverJava = ReceiverJava()
                invokerJava.setAddCommand(AddCommandJava(receiverJava))
                invokerJava.setRemoveCommand(RemoveCommandJava(receiverJava))
                invokerJava.setAddCommand(AddCommandJava(receiverJava))
                invokerJava.undo()
                invokerJava.processCommands()
                //kotlin
                val invokerKotlin = InvokerKotlin()
                val receiverKotlin = ReceiverKotlin()
                invokerKotlin.setAddCommand(AddCommandKotlin(receiverKotlin))
                invokerKotlin.setRemoveCommand(RemoveCommandKotlin(receiverKotlin))
                invokerKotlin.setAddCommand(AddCommandKotlin(receiverKotlin))
                invokerKotlin.undo()
                invokerKotlin.processCommands()
```
## 观察者模式
> 定义:定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。

> 使用场景:1. 关联行为场景，需要注意的是，关联行为是可拆分的，而不是“组合”关系；2. 事件多级触发场景；3. 跨系统的消息交换场景，如消息队列、事件总线的处理机制。

* 观察者模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/observer/java)
* 观察者模式的Kotlin实现(使用了Kotlin特性--Delegates，类委托) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/observer/kotlin)

Usage
```
                //java
                val devtechFrontierJava = DevTechFrontierJava()
                val coderJava1 = CoderJava("coder-1")
                val coderJava2 = CoderJava("coder-2")
                val coderJava3 = CoderJava("coder-3")
                devtechFrontierJava.addObserver(coderJava1)
                devtechFrontierJava.addObserver(coderJava2)
                devtechFrontierJava.addObserver(coderJava3)
                devtechFrontierJava.postNewPublication("发布啦!")
                //kotlin
                val devTechFrontierKotlin = DevTechFrontierKotlin()
                devTechFrontierKotlin.addMyObserver(CoderKotlin("coder-1"))
                devTechFrontierKotlin.addMyObserver(CoderKotlin("coder-2"))
                devTechFrontierKotlin.postNewPublication = "又发布啦"
```

## 备忘录模式
> 定义:在不破坏封闭的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样，以后就可将该对象恢复到原先保存的状态。

> 使用场景:1. 需要保存一个对象在某一个时刻的状态或部分状态。2. 如果用一个接口来让其他对象得到这些状态，将会暴露对象的实现细节并破坏对象的封装性，一个对象不希望外界直接访问其内部状态，通过中间对象可以间接访问其内部状态。

* 备忘录模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/memento/java)
* 备忘录模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/memento/kotlin)

Usage
```
                //java
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
                //kotlin
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
```

## 迭代器模式
> 定义:提供一种方法顺序访问一个容器对象中的各个元素，而又不需要暴露该对象的内部表示。

> 使用场景:遍历一个容器对象时。

* 迭代器模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/iterator/java)
* 迭代器模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/iterator/kotlin)

Usage
```
                //java
                val aggregateJava = ConcreteAggregateJava<String>()
                aggregateJava.apply {
                    add("Aige")
                    add("Studio\n")
                    add("SM")
                    add("Brother")
                }
                val iteratorJava = aggregateJava.iterator()
                while (iteratorJava.hasNext()){
                    Log.d("MainActivity", "Result is :" + iteratorJava.next())
                }
                //kotlin
                val aggregateKotlin = ConcreteAggregateKotlin<String>()
                aggregateKotlin.apply {
                    add("Hi")
                    add("Kotlin")
                    add("brother")
                }
                val iteratorKotlin = aggregateKotlin.iterator()
                while (iteratorKotlin.hasNext()) {
                    Log.d("MainActivity", "Result is :" + iteratorKotlin.next())
                }
```
## 模板方法模式
> 定义:定义一个操作中的算法的框架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

> 使用场景:1. 多个子类有公有的方法，并且逻辑基本相同时。2. 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。3. 重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。

* 模板方法模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/template/java)
* 模板方法模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/template/kotlin)

Usage
```
                //java
                var compJava:AbstractComputerJava = CoderComputerJava()
                compJava.startUP()
                compJava = MilitaryComputerJava()
                compJava.startUP()
                //kotlin
                var compKotlin: AbstractComputerKotlin = CoderComputerKotlin()
                compKotlin.startUp()
                compKotlin = MilitaryComputerKotlin()
                compKotlin.startUp()
````

## 访问者模式
> 定义:封装一些作用于某种数据结构中的各元素的操作，它可以在不改变这个数据结构的前提下定义作用于这些元素的新的操作。

> 使用场景:1. 对象结构比较稳定，但经常需要在此对象结构上定义新的操作。2. 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免这些操作“污染”这些对象的类，也不希望在增加新操作时修改这些类。

* 访问者模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/visitor/java)
* 访问者模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/visitor/kotlin)

Usage
```
                //java
                val reportJava = BusinessReportJava()
                Log.d("MainActivity", "======TO CEO ======")
                reportJava.showReport(CEOVisitorJava())
                Log.d("MainActivity", "======TO CTO ======")
                reportJava.showReport(CTOVisitorJava())
                //kotlin
                val reportKotlin = BusinessReportKotlin()
                Log.d("MainActivity", "======TO CEO ======")
                reportKotlin.showReport(CEOVisitorKotlin())
                Log.d("MainActivity", "======TO CTO ======")
                reportKotlin.showReport(CTOVisitorKotlin())
```

## 中介者模式
> 定义:中介者模式包装了一系列对象相互作用的方式，使得这些对象不必相互明显作用。从而使它们可以松散耦合。当某些对象之间的作用发生改变时，不会立即影响其他的一些对象之间的作用。保证这些作用可以彼此独立变化。中介者模式将多对多的相互作用转化为一对多的相互作用。中介者模式将对象的行为和协作抽象化，把对象在小尺度的行为上与其他对象的相互作用分开处理。

> 使用场景:当对象之间的交互操作很多且每个对象的行为操作都依赖彼此时，为防止在修改一个对象的行为时，同时涉及修改很多其他对象的行为，可采用中介者模式来解决紧耦合问题。该模式将对象之间的多对多关系变成一对多关系，中介者对象将系统从网状结构变成以调停者为中心的星形结构，达到降低系统的复杂性，提高可扩展性的作用。

* 中介者模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/mediator/java)
* 中介者模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/mediator/kotlin)

Usage
```
                //java
                val mainBoardJava = MainBoardJava()
                val cd = CDDeviceJava(mainBoardJava)
                val cpu = CPUJava(mainBoardJava)
                val vc = GraphicsCardJava(mainBoardJava)
                val sc = SoundCardJava(mainBoardJava)

                mainBoardJava.setCDDevice(cd)
                mainBoardJava.setCPU(cpu)
                mainBoardJava.setGraphicsCard(vc)
                mainBoardJava.setSoundCard(sc)
                cd.load()
                //kotlin
                val mainBoardKotlin = MainBoardKotlin()
                val cd = CDDevicesKotlin(mainBoardKotlin)
                val cpu = CPUKotlin(mainBoardKotlin)
                val vc = GraphicsCardKotlin(mainBoardKotlin)
                val sc = SoundCardKotlin(mainBoardKotlin)
                mainBoardKotlin.cdDevices = cd
                mainBoardKotlin.cpu = cpu
                mainBoardKotlin.graphicsCardKotlin = vc
                mainBoardKotlin.soundCard = sc
                cd.load()
```

# 结构型模式
## 代理模式
> 定义:为其他对象提供一种代理以控制对这个对象的访问。

> 使用场景:当无法或不想直接访问某个对象或访问某个对象存在困难时可以通过一个代理对象来间接访问，为了保证客户端使用的透明性，委托对象与代理对象需要实现相同的接口。

* 代理模式的Java实现(包含静态代理与动态代理) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/proxy/java)
* 代理模式的Kotlin实现(包含静态代理与动态代理) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/proxy/kotlin)
* 代理模式的Kotlin实现(使用Kotlin特性--类委托) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/proxy/kotlin/delegation)

Usage
```
                //静态代理 java
                val xiaoMinJava: ILawsuitJava = XiaoMinJava()
                val lawyerJava = LawyerJava(xiaoMinJava)
                lawyerJava.submit()
                lawyerJava.burden()
                lawyerJava.defend()
                lawyerJava.finish()
                //动态代理 kotlin
                val xiaoMinKotlin: ILawsuitKotlin = XiaoMinKotlin()
                val proxy = DynamicProxyKotlin(xiaoMinKotlin)
                val classLoader = xiaoMinKotlin.javaClass.classLoader
                val lawyerKotlin = Proxy.newProxyInstance(
                    classLoader,
                    arrayOf<Class<*>>(ILawsuitKotlin::class.java),
                    proxy
                ) as ILawsuitKotlin
                lawyerKotlin.submit()
                lawyerKotlin.burden()
                lawyerKotlin.defend()
                lawyerKotlin.finish()
                //类委托 kotlin特性 可以当做是静态代理
                val xiaoMinDelegation = XiaominDelegation()
                val lawyerDelegation = LawyerDelegation(xiaoMinDelegation)
                lawyerDelegation.submit()
                lawyerDelegation.burden()
                lawyerDelegation.defend()
                lawyerDelegation.finish()
```

## 组合模式
> 定义:将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。

> 使用场景:1. 表示对象的部分-整体层次结构时。2. 从一个整体中能够独立出部分模块或功能的场景。

* 组合模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/composite/java)
* 组合模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/composite/kotlin)

Usage
```
                //java
                val root = CompositeJava("Root")
                val branch1 = CompositeJava("Branch1")
                val branch2 = CompositeJava("Branch2")
                val leaf1 = LeafJava("Leaf1")
                val leaf2 = LeafJava("Leaf2")
                branch1.addChild(leaf1)
                branch2.addChild(leaf2)
                root.addChild(branch1)
                root.addChild(branch2)
                root.doSomething()
                //kotlin
                val rootK = CompositeKotlin("RootK")
                val branch1K = CompositeKotlin("Branch1K")
                val branch2K = CompositeKotlin("Branch2K")
                val leaf1K = LeafKotlin("Leaf1K")
                val leaf2K = LeafKotlin("leaf2K")
                branch1K.addChild(leaf1K)
                branch2K.addChild(leaf2K)
                rootK.addChild(branch1K)
                rootK.addChild(branch2K)
                rootK.doSomething()
```

## 适配器模式
> 定义:适配器模式把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。

> 使用场景:1. 系统需要使用现有的类，而此类的接口不符合系统的需要，即接口不兼容。2. 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。3. 需要一个统一的输出接口，而输入端的类型不可预知。

* 适配器模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/adapter/java)
* 适配器模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/adapter/kotlin)

Usage
```
                //java
                val volt = Volt220Java()
                val adapter = VoltAdapterJava(volt)
                Log.d("MainActivity", "adapter: ${adapter.volt5}")
                //kotlin
                val voltKotlin = Volt220Kotlin()
                val adapterKotlin = VoltAdapterKotlin(voltKotlin)
                Log.d("MainActivity", "adapter: ${adapterKotlin.getVolt220()}")
```

## 装饰模式
> 定义:动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式生成子类更为灵活。

> 使用场景:需要透明且动态地扩展类的功能时。

* 装饰模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/decorator/java)
* 装饰模式的Kotlin实现(使用Kotlin特性--类委托) [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/decorator/kotlin)

Usage
```
                //java
                val personJava: PersonJava = BoyJava()
                val clothCheapJava = CheapClothJava(personJava)
                clothCheapJava.dressed()
                //kotlin
                val personKotlin = BoyKotlin()
                val clothExpersiveKotlin = ExpensiveClothKotlin(personKotlin)
                clothExpersiveKotlin.dressed()
```

## 享元模式
> 定义:使用共享对象可有效地支持大量的细粒度的对象。

> 使用场景:1. 系统中存在大量的相似对象。 2. 细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关，也就是说对象没有特定身份。3. 需要缓冲池的场景。

* 享元模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/flyweight/java)
* 享元模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/flyweight/kotlin)

Usage
```
                //java
                val ticketJava01 = TicketFactoryJava.getTicket("北京", "青岛")
                ticketJava01.showTicketInfo("上铺")
                val ticketJava02 = TicketFactoryJava.getTicket("北京", "青岛")
                ticketJava02.showTicketInfo("下铺")
                val ticketJava03 = TicketFactoryJava.getTicket("北京", "青岛")
                ticketJava03.showTicketInfo("坐票")
                //kotlin
                val ticketKotlin01 = TicketFactoryKotlin.getTicket("海南", "上海")
                ticketKotlin01?.showTicketInfo("上铺")
                val ticketKotlin02 = TicketFactoryKotlin.getTicket("海南", "上海")
                ticketKotlin02?.showTicketInfo("下铺")
                val ticketKotlin03 = TicketFactoryKotlin.getTicket("海南", "上海")
                ticketKotlin03?.showTicketInfo("坐票")
```

## 外观模式
> 定义:要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。外观模式提供一个高层次的接口，使得子系统更易于使用。

> 使用场景:1. 为一个复杂子系统提供一个简单接口。子系统往往因为不断演化而变得越来越复杂，甚至可能被替换。大多数模式使用时都会产生更多、更小的类，这使子系统更具可重用性的同时也更容易对子系统进行定制、修改，这种易变性使得隐藏子系统的具体实现变得尤为重要。Facade(外观模式)可以提供一个简单统一的接口，对外隐藏子系统的具体实现、隔离变化。2. 当你需要构建一个层次结构的子系统时，使用Facade模式定义子系统中每层的入口点。如果子系统之间是相互依赖的，你可以让它们仅通过Facade接口进行通信，从而简化了它们之间的依赖关系。

* 外观模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/facade/java)
* 外观模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/facade/kotlin)

Usage
```
                //java
                val nexus6 = MobilePhoneJava()
                nexus6.takePicture()
                nexus6.videoChat()
                //kotlin
                val iphone = MobilePhoneKotlin()
                iphone.dail()
                iphone.closeCamera()
```

## 桥接模式
> 定义:将抽象部分与实现部分分离，使它们都可以独立地进行变化。

> 使用场景:1. 从模式的定义中我们大致可以了解到，这里“桥梁”的作用其实就是连接“抽象部分”与“实现部分”，但是事实上，任何多维度变化类或者说多个树状类之间的耦合都可以使用桥接模式来实现解耦。2. 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，可以通过桥接模式使它们在抽象层建立一个关联关系。3. 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，也可以考虑使用桥接模式。4. 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。

* 桥接模式的Java实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/bridge/java)
* 桥接模式的Kotlin实现 [点我查看](https://github.com/tangxuesong6/BeautifulPatterns/tree/master/app/src/main/java/com/mdht/beautifulkotlin/bridge/kotlin)

Usage
```
                //java
                val implOrdinaryJava = OrdinaryJava()
                val implSugarJava = SugarJava()
                val largeCofeeJava = LargeCoffeeJava(implOrdinaryJava)
                largeCofeeJava.makeCoffee()
                val smallCoffeeJava = SmallCoffeeJava(implSugarJava)
                smallCoffeeJava.makeCoffee()
                //kotlin
                val implOrdinaryKotlin = OrdinaryKotlin()
                val implSugarKotlin = SugarKotlin()
                val largeCoffeeKotlin = LargeCoffeeKotlin(implSugarKotlin)
                largeCoffeeKotlin.makeCoffee()
                val smallCoffeeKotlin = SmallCoffeeKotlin(implOrdinaryKotlin)
                smallCoffeeKotlin.makeCoffee()
```
