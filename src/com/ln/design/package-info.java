/**
 * copied from https://www.runoob.com/design-pattern/design-pattern-intro.html
 *
 * 一、创建型模式（Creational Patterns）
 *      这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。
 *      这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。
 *      1.工厂模式（Factory Pattern）
 *      2.抽象工厂模式（Abstract Factory Pattern）
 *      3.单例模式（Singleton Pattern）
 *      4.建造者模式（Builder Pattern）
 *      5.原型模式（Prototype Pattern）
 *
 * 二、结构型模式（Structural Patterns）
 *      这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
 *      1.适配器模式（Adapter Pattern）
 *      2.桥接模式（Bridge Pattern）
 *      3.过滤器模式（Filter、Criteria Pattern）
 *      4.组合模式（Composite Pattern）
 *      5.装饰器模式（Decorator Pattern）
 *      6.外观模式（Facade Pattern）
 *      7.享元模式（Flyweight Pattern）
 *      8.代理模式（Proxy Pattern）
 *
 * 三、行为型模式（Behavioral Patterns）
 *      这些设计模式特别关注对象之间的通信。
 *      责任链模式（Chain of Responsibility Pattern）
 *      1.命令模式（Command Pattern）
 *      2，解释器模式（Interpreter Pattern）
 *      3.迭代器模式（Iterator Pattern）
 *      4.中介者模式（Mediator Pattern）
 *      5.备忘录模式（Memento Pattern）
 *      6.观察者模式（Observer Pattern）
 *      7.状态模式（State Pattern）
 *      8.空对象模式（Null Object Pattern）
 *      9.策略模式（Strategy Pattern）
 *      10.模板模式（Template Pattern）
 *      11.访问者模式（Visitor Pattern）
 *
 * 四、J2EE 模式
 *      这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。
 *      1.MVC 模式（MVC Pattern）
 *      2.业务代表模式（Business Delegate Pattern）
 *      3.组合实体模式（Composite Entity Pattern）
 *      4.数据访问对象模式（Data Access Object Pattern）
 *      5.前端控制器模式（Front Controller Pattern）
 *      6.拦截过滤器模式（Intercepting Filter Pattern）
 *      7.服务定位器模式（Service Locator Pattern）
 *      8.传输对象模式（Transfer Object Pattern）
 *
 *
 * 设计模式的六大原则
 * 1、开闭原则（Open Close Principle）:对扩展开放，对修改关闭。
 * 2、里氏代换原则（Liskov Substitution Principle）：任何基类可以出现的地方，子类一定可以出现。
 * 3、依赖倒转原则（Dependence Inversion Principle）：针对接口编程，依赖于抽象而不依赖于具体。
 * 4、接口隔离原则（Interface Segregation Principle）：使用多个隔离的接口，比使用单个接口要好。
 * 5、迪米特法则，又称最少知道原则（Demeter Principle）：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。
 * 6、合成复用原则（Composite Reuse Principle）：尽量使用合成/聚合的方式，而不是使用继承。
 *
 */
package com.ln.design;