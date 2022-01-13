# 1.JAVA基础

## 1.线程

### **1.在 java 中守护线程和本地线程区别？**

方法：setDaemon（boolean）

守护线程服务于别的线程，当主线程结束时守护线程就会结束。

例子：jvm垃圾回收线程。

### **2、线程与进程的区别？**

进程是操作系统分配资源的最小单元，线程是操作系统调度的最小单元。

一个程序至少有一个进程,一个进程至少有一个线程。

## 2.基本

### **1.面向对象的特征有哪些方面？**

1.抽象：一类对象共同特征构造成一个类的过程。关注对象属性和行为，不关注细节。

2.多态性：同一个方法，不同的实现。主要方法重写（继承和抽象类）和方法重载（同一方法名不同参数）。实现：父类对象引用子类对象的方法。

3.继承：继承就是从父类得到继承信息构造成一个子类得过程。

4.封装：封装就是将数据和操作数据的方法绑定起来。只对外界提供访问这些数据的接口。所以实体类一般会把成员变量设置成私有的，然后提供公有setter和getter方法。

### 2.修饰符

![image-20220104200541459](C:\Users\zhang\AppData\Roaming\Typora\typora-user-images\image-20220104200541459.png)

### 3.基本数据类型

Java中的基本数据类型只有8个：byte（-128  -  127）、short、int、long、float、double、char、boolean；除了基本类型（primitive type），剩下的都是引用类型。

#### 4.重载和重写的区别

重载和重写都是多态性的体现，体现的都是一个方法的不同实现。

1.重载体现编译时的多态，重写体现运行时的多态。

2.同一个类中相同方法名，参数列表不同的叫重载。重写是子类重写一个与父类相同方法名并且返回指类值相同的方法。不能比父类申明更多的异常。

### 4.对象类型

#### 1.拆箱 和封箱

	public static void main(String[] args) {
		Integer a = new Integer(3);
		Integer b = 3;				    // 将3自动装箱成Integer类型
		int c = 3;
		System.out.println(a == b);		// false 两个引用没有引用同一对象
		System.out.println(a == c);		// true a自动拆箱成int类型再和c比较
	}
	
	public static void main(String[] args) {
		Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
		
		System.out.println(f1 == f2);//true -128-127
		System.out.println(f3 == f4);//false
	}
#### 2.对象类型有哪些？

1.class

2.interface

3.数组

### 5.**抽象类（abstract class）和接口（interface）有什么异同？**

同：1。抽象类和接口都不能实例化。

​		2。被继承后其中的抽象方法都必须实现。否则该类仍然是抽象类。

异：1.接口更抽象，抽象类可以写构造方法、具体方法、变量。而接口实际都是常量并且只能写抽象方法。

2*.抽象类不一定有抽象方法。有抽象方法的类一定是抽象类。

3.抽象成员可以有不同的作用域修饰符，而接口只能用public。

### 6.创建对象时构造器的调用顺序？

先初始化静态成员，然后调用父类构造器，再初始化非静态成员，最后调用自身构造器。

### 7.**比较一下Java和JavaSciprt**



## 3.String

### **1.String能被继承吗？为什么？**

不可以，因为[String类](https://so.csdn.net/so/search?q=String类)有final修饰符，而final修饰的类是不能被继承的，实现细节不允许改变

### 2.String， Stringbuffer， StringBuilder 的区别。

1.String 字符串常量(final修饰，不可被继承)，String是常量，当创建之后即不能更改。(可以通过StringBuffer和StringBuilder创建String对象(常用的两个字符串操作类)。)
2.StringBuffer 字符串变量（线程安全）,其也是final类别的，不允许被继承，其中的绝大多数方法都进行了同步处理，包括常用的Append方法也做了同步处理(synchronized修饰)。

3.StringBuilder 字符串变量（非线程安全），与StringBuffer不同之处在于最后toString的时候，会直接返回一个新对象。

#### 3.==和equals（）

==比较的是（栈）引用，equals比较unicode；

## 4.异常

常见的运行时异常;

```
ArrayIndexOutOfBoundsException 数组下标越界异常，
ArithmaticException 算数异常 如除数为零
NullPointerException 空指针异常
IllegalArgumentException 不合法参数异常
ClassCastException （类转换异常）
```

常见的受检查的异常：

```
IOException
SQLException
UnsupportedExcetion;
ClassNotFoundException（）
用户自定义异常
```

### 1、Java语言如何进行异常处理

答：Java通过面向对象的方法进行异常处理，提供了良好的接口，把各种不同的异常进行分类。在Java中，每个异常都是一个对象，它是Throwable类或其子类的实例。当一个方法出现异常后便抛出一个异常对象，该对象中包含有异常信息，调用这个对象的方法可以捕获到这个异常并可以对其进行处理。

### 2.**运行时异常与受检异常有何异同？**

异常表示程序运行过程中可能出现的非正常状态。运行时异常表示直接或间接继承了RuntimeException的异常，可以不显式的进行处理比如:ArithmeticException算数异常。受检异常就需要显式处理了，否则编译器就会报错，比如classnotfoundException。Java编译器要求方法必须声明抛出可能发生的受检异常，但是并不要求必须声明抛出未被捕获的运行时异常。

## 5.线程

![这里写图片描述](https://img-blog.csdnimg.cn/img_convert/b01dda620b25be81119f104146111cd4.png)

### 1.创建多线程的方式：

**三种方式都需要new Thread**

1.继承Thread类，重写run

2.实现Runnable接口。重写run。

3.内部匿名类new Thread（new Runnable（）{run（）}



## 6.集合

![image-20220110203441567](C:\Users\zhang\AppData\Roaming\Typora\typora-user-images\image-20220110203441567.png)

**阐述ArrayList、Vector、LinkedList的存储性能和特性。**

ArrayList和Vector和LinkedList是线性结构的容器。

1.ArrayList和Vector底层都是使用数组方式存储数据的，此数组元素数大于实际存储的数据就是方便了增加和插入元素。

2.是使用值索引元素的，每次插入都需要移动元素，所以他们插入慢但是索引数据快。

3.Vector的方法添加了synchronized修饰，所以他是线程安全的，但是性能比ArrayList差的。

LinkedList是双向链表实现的。

1.链表就是将内存零散的内存单元通过附加的引用关联起来，形成了一个可以按序号索引的线性结构，和数组相比的话，他的内存利用率更高。

2.因为链表的特性，插入的时候只需要记录前后项的引用就行了，所以插入速度会快点。但是索引数据需要向前遍历或者向后遍历，所以索引数据会慢一点。

## 7.小细节

### 1.+=有强转类型的作用

### 2.**&&** 短路与 

### 3.Object的hashcode （）是对象的在内存地址，但string

### 4.Java语言的方法调用只支持参数的值传递；

### 5.assert(a > 0); 返回true或者false；

### 6.静态方法无法重写。