# 观察者模式

## 模式动机

建立一种对象与对象之间的依赖关系，一个对象发生改变时将自动通知其他对象，其他对象将相应作出反应。在此，发生改变的对象成为观察目标，而被通知的对象成为观察者，一个观察目标可以对应多个观察者，而且这些观察者之间没有相互联系，可以根据需要增加和删除观察者，使得系统更易于扩展，这就是观察者模式的动机。

## 模式定义

观察者模式（Observer Pattern）：定义对象间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。观察者模式又叫发布-订阅（Publish/Subscribe）模式、模型-视图（Model/View）模式、源-监听器（Source/Listener）模式或从属者（Dependents）模式。

观察者模式是一种对象行为型模式

## 模式结构

观察者模式包含如下角色：

* Observable:抽象被观察者
* ConcreteObservable:具体被观察者
* Observer:观察者
* ConcreteObserver:具体观察者

## 成员分工

![avatar](./res/charactor.png)

## UML类图

![avatar](./res/UML.jpg)

## 模式分析

* 观察者模式描述了如何建立对象与对象之间的依赖关系，如何构造满足这种需求的系统。
* 这一模式中的关键对象是被观察者和观察者，一旦被观察者的状态发生改变，所有的观察者都将得到通知。
* 作为这个通知的响应，每个观察者都将即时更新自己的状态，以与目标状态同步，这种交互也称为发布-订阅（publish-subscribe）。目标是通知的发布者，它发出通知时并不需要知道谁是它的观察者，可以有任意数目的观察者订阅它并接收通知。

## 优点

观察者模式的优点

* 观察者模式可以实现表示层和数据逻辑层的分离，并定义了稳定的消息更新传递机制，抽象了更新接口，使得可以有各种各样不同的表示层作为具体观察者角色。
* 观察者模式在被观察者和观察者之间建立了一个抽象的耦合。
* 观察者模式支持广播通信。
* 观察者模式符合“开闭原则”的要求。

## 缺点

观察者模式的缺点

* 如果一个被观察者目标对象有很多直接和简介的观察者的话，将所有的观察者都通知到会花费很多时间。
* 如果在观察者和被观察者之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
* 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，仅仅只是知道被观察者发生了变化。

## 适用环境

在以下情况下可以使用观察者模式：

* 一个抽象模型有两个方面，其中一个方面依赖于另一个方面，将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
* 一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
* 一个对象必须通知其他对象，而并不知道这些对象是谁。
* 需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象.... 可以使用观察者模式创建一种链式触发机制。

## 模式应用

观察者模式在软件开发中应用非常广泛，如某电子商务网站可以在执行发送操作后给用户多个发送商品打折信息，某团队战斗游戏中某队友牺牲将给所有队友提示等等，凡是涉及到一对一或者一对多的对象交互场景都可以使用观察者模式。

## 模式扩展

MVC模式

* MVC模式是一种架构模式，它包含三个角色，模型（Model），视图（View）和控制器（Controller）。观察者模式可以用来实现MVC模式，观察者模式中的被观察者就是MVC模式中的模型（Model），而观察者就是MVC中的视图（View），控制器（Controller）充当两者之间的中介者（Mediator）。当模型层的数据发生改变时，视图层将自动改变其显示内容。