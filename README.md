# 设计模式学习

## 设计原则

### 1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起

> 把会变化的部分取出并"封装"起来，好让其他部分不受到影响。
> 换句话说，如果每次新的需求一来，都会使某方面的代码发生变化，那么你就可以确定，这部分的代码需要被抽出来，和其他稳定的代码有所区分。

### 2. 针对接口编程，而不是针对实现编程
> “针对接口编程”真正的意思是“针对超类型（supertype）编程”。
> “针对接口编程”关键就在多态”。
> 利用多态，程序可以针对超类型编程，执行时会根据实际状况执行到真正的行为，不会被绑死在超类型的行为上。

### 3. 多用组合，少用继承

### 4. 为了交互对象之间的松耦合设计而努力
- 松耦合的设计之所以能让我们建立有弹性的OO系统，能够应对变化，是因为对象之间的相互依赖降到了最低。

## 设计模式

### 1. 策略模式 Strategy Pattern
> 策略模式定义了算法簇，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。

![avatar](doc/uml/strategy.svg)

### 2. 观察者模式 Observe Pattern
> 观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

- 观察者模式提供了一种对象设计，让主题和观察者之间松耦合。

#### 更新策略
- 推
- 拉

#### Java 内置的观察者模式
- extends java.util.Observable

![avatar](doc/uml/observe.svg)

## 参考资料
- 《Head First 设计模式》ISBN: 9787508353937
- [《Head First 设计模式》源码](https://www.wickedlysmart.com/head-first-design-patterns/)

