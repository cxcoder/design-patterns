###模板方法 - Template Method

定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

![Template Method](https://github.com/cxcoder/design-patterns/blob/master/template-method/template_method.jpg)

###适用场景
- 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现
- 提取子类的公共行为到父类中
- 控制子类扩展，模板方法只在特定点调用 hook 操作，只允许在这些点扩展


###已知应用 
TODO


