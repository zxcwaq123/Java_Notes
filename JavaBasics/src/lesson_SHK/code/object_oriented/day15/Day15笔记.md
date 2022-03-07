# Day15笔记

## 一、抽象类与抽象方法

### 1. abstract可以用来修饰的结构：类、方法

### 2. abstract修饰类：抽象类

* 此类不能被实例化

* 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）

* 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作

### 3. abstract修饰方法：抽象方法

* 抽象方法只有方法的声明，没有方法体

* 包含抽象方法的类一定是抽象类，但抽象类中可以没有抽象方法

* 子类中重写了父类中<font color = red>**所有**</font>的抽象方法后，才能实例化

### 4. abstract使用注意点

* abstract不能用来修饰私有(private)方法、静态(static)方法、final方法

### 5. 抽象类的匿名子类

当有抽象类Person时，抽象类不能直接造对象，但可以创建抽象类的匿名子类的对象（多态的使用）。

```java
Person p = new Person(){
    @Override
    public void eat(){
        方法体；
        }
        }
```

### 6.抽象类、多态的应用：模板方法设计模式(TemplateMethod)

## 二、接口(interface)

### 1. Java中，接口和类时两个并列的结构

### 2. 定义接口：定义接口中的成员

#### 2.1 JDK7及以前：只能定义全局常量和抽象方法

* 全局常量：public static final (<font color = red>**但书写可以省略**</font>)

* 抽象方法：public abstract

#### 2.2 JDK8：除上述外，还可以定义静态方法、默认方法

### 3. 接口中不能定义构造器 ——> 意味着接口不能被实例化

### 4. Java开放中，接口通过让类区实现(implement)的方式来使用。

* 如果实现类覆盖了接口中所有的抽象方法，则此实现类可以实例化。

* 如果实现类没有全部覆盖接口中的抽象方法，则此类仍为抽象类，不能实例化。

### 5. Java类可以实现多个接口 ——> 弥补了Java单继承性的局限性。

* 格式

```java
class AA extends BB implements CC, DD, EE{
    
}
```

### 6. 接口与接口之间可以继承（多继承）

```java
interface AA{}

interface BB{}

interface CC extends AA, BB{}
```

### 7. 接口的具体使用：体现多态性(具体使用的是接口实现类的对象实例)

### 8. 接口：实际上可以看作是一种规范

### 9. 接口 (匿名/非匿名) 实现类的 (匿名/非匿名) 对象

* 非匿名实现类的非匿名对象

```java
Phone p1 = new Phone();
```

* 非匿名实现类的匿名对象

```java
com.transferData(new Phone());
```

* 匿名实现类的非匿名对象

```java
USB p1 = new USB(){
    @Override
    public void start{
        方法体；
        }
        };
```

* 匿名实现类的匿名对象

```java
com.transferData(new USB(){
    @Override
    public void start{
        方法体；
        }
});
```

### 10. 接口的应用

* 代理模式(Proxy)

  * 代理模式是为其他对象提供一种代理已控制这个对象的访问

  * 代理类中的方法，包含了被代理类中同名的方法（见Test2_Proxy）。
  

* 工厂模式

  * 工厂模式是将创建对象的具体过程屏蔽隔离起来，达到提高灵活性的目的。

  * 