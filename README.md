# 计191 郭洳畅 2019310196

# 实验2： PC机模拟


# 一、实验目的：

#### (1) 用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。

#### (2) 掌握构造方法和对象的创建。

#### (3) 了解类与程序的基本结构。

#### (4) 理解类的封装。


# 二、实验要求：

#### (1) CPU类：要求getSpeed()返回speed的值，用setSpeed(int c)方法将参数m的值赋值给speed。

#### (2) HardDisk类：要求getAmount()返回amount的值，用setAmount(int m)方法将参数m的值赋值给amount。

#### (3) PC类：要求setCPU(CPU c)将参数c的值赋值给cpu,用setHardDisk(HardDisk h)方法将参数h的值赋值给HD，用show()方法显示cpu的速度和硬盘的容量。

#### (4) Test主类：main方法中创建CPU对象cpu，cpu 将自己的 speed 设置为2200;main方法中创建HardDisk对象disk，disk将自己的 amount 设置为200;main方法中创建PC对象pc;pc调用setCPU(CPU c)方法，调用实参是cpu;pc调用setHardDisk(HardDisk h)方法，调用实参是disk;pc调用show()方法。


# 附加内容：

#### (1) 类中定义不少于两个构造方法。

#### (2) 每个类定义不少于2个属性，且属性的类型应该多样化。

#### (3) 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断。

#### (4) 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。


# 三、实验方法：

#### （1）首先根据题目要求，将Java应用程序分别写出四个类：PC，CPU，Hard Disk，Test。再向四个类中写出简单的代码结构。

#### （2）挑选需要的对象，使用修饰符private进行封装。

#### （3）根据要求给变量赋值，并通过if语句判断输入的值是否合理。

#### （4）对应上面写好的代码，再定义新的属性和构造方法，使其不少于两个，定义的类型尽量多样化。

#### （5）使用show()语句显示信息。


# 四、核心方法：

####    int getTemp() {
       
####        return temp;
      
####    }
    
####    public void setTemp(int temp) {
    
####    	if(temp>40&&temp<85)
      
####    		this.temp=temp;
        
####    }
    
## 我新定义了一个温度，使用了this.关键字，用来区分对象中的成员变量以及传进来的参数。使用了if语句判断输入的值。因为用了private封装，所以使用到了set和get。


# 五、实验结果：


  



# 六、实验感想：



