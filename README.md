# shuati001
# 基础

# 二分查找

```java
int mid = left + (right - left) / 2;
```
## 锁

### java中的锁有哪些？

Lock接口

相比synchronized优点：

拥有了锁获取与释放的可操作性、可中断的获取锁以及超时获取锁等多种synchronized关键字所不具备的同步特性。
lock的api

lock()获取锁

lockInterrupttibly()可中断的获取锁

tryLock() 尝试非阻塞的获取锁

unLock()释放锁

newCondition()

队列同步器



leetcode excrcise
## 排序算法
一共有几种排序算法呢？
## 贪心算法
// todo

贪心算法的本质?

T55、跳跃游戏

# JVM
## 垃圾收集器
### CMS
#### cms回收暂停了几次？为什么暂停？
第一次停顿发生在初始标记阶段，初始标记仅仅只是标记一下gc root能关联到的对象。方便后续gc线程和业务线程并发的执行后续的简介标记存活的对象。

第二次停顿发生在重新标记阶段，是为了彻底标记之前被遗漏的部分，即在这一阶段业务线程产生的存活对象进行标记，当然也区分出死亡对象。
