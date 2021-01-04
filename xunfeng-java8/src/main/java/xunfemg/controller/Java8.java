package xunfemg.controller;

public class Java8 {

    public static void main(String[] args) {
        /*
         *  Java 8 (又称为 jdk 1.8) 是 Java 语言开发的一个主要版本。
         *  Oracle 公司于 2014 年 3 月 18 日发布 Java 8 ，
         * 它支持函数式编程，新的 JavaScript 引擎，新的日期 API，新的Stream API 等。
         *
         * Lambda 表达式 − Lambda 允许把函数作为一个方法的参数（函数作为参数传递到方法中）。
         * 方法引用 − 方法引用提供了非常有用的语法，可以直接引用已有Java类或对象（实例）的方法或构造器。与lambda联合使用，方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
         * 默认方法 − 默认方法就是一个在接口里面有了一个实现的方法。
         * 新工具 − 新的编译工具，如：Nashorn引擎 jjs、 类依赖分析器jdeps。
         * Stream API −新添加的Stream API（java.util.stream） 把真正的函数式编程风格引入到Java中。
         * Date Time API − 加强对日期与时间的处理。
         * Optional 类 − Optional 类已经成为 Java 8 类库的一部分，用来解决空指针异常。
         * Nashorn, JavaScript 引擎 − Java 8提供了一个新的Nashorn javascript引擎，它允许我们在JVM上运行特定的javascript应用。
         */
        Java8 java8 = new Java8();
        //Java Lambda 表达式
        java8.lambda();
        //Java 8 方法引用
        java8.method();
        //Java 8 函数式接口
        java8.functionalInterface();
        //Java 8 默认方法
        java8.defaultfun();
        //Java 8 Stream
        java8.stream();
        //Java 8 Optional 类
        java8.optional();
        //Java 8 Nashorn JavaScript
        java8.nashornJavaScript();
        //Java 8 日期时间 API
        java8.dataTime();
        //Java8 Base64
        java8.base64();
    }

    private void nashornJavaScript() {
    }

    private void base64() {
        /*
        *在Java 8中，Base64编码已经成为Java类库的标准。
        * Java 8 内置了 Base64 编码的编码器和解码器。
        * Base64工具类提供了一套静态方法获取下面三种BASE64编解码器：
        * 基本：输出被映射到一组字符A-Za-z0-9+/，编码不添加任何行标，输出的解码仅支持A-Za-z0-9+/。
        * URL：输出映射到一组字符A-Za-z0-9+_，输出是URL和文件。
        * MIME：输出隐射到MIME友好格式。输出每行不超过76字符，并且使用'\r'并跟随'\n'作为分割。编码输出最后没有行分割。
        * */
    }

    private void dataTime() {
    }

    private void optional() {
        /*
        * Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
        * Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。
        * Optional 类的引入很好的解决空指针异常。
        * */
    }

    private void stream() {
        /*
        *
        * Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。
        * Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。
        * Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
        * 这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
        * 元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。
        * */
    }

    private void defaultfun() {
        /*
        * 默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。
        * 我们只需在方法名前面加个 default 关键字即可实现默认方法。
        * */
    }

    private void functionalInterface() {
        /*
        * 函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
        * 函数式接口可以被隐式转换为 lambda 表达式。
        * Lambda 表达式和方法引用（实际上也可认为是Lambda表达式）上。
        * */
    }

    private void method() {
        /*
         *方法引用通过方法的名字来指向一个方法。
         * 方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
         * 方法引用使用一对冒号 :: 。
         */
    }

    private void lambda() {
        /*Java Lambda 表达式
         *Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
         * Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
         * 使用 Lambda 表达式可以使代码变的更加简洁紧凑。
         * */

    }

}
