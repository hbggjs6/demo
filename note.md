# 快捷键

```text
Shift + 左键单击	在打开的文件名上按此快捷键，可以关闭当前打开文件
Shift + F10	等效于点击工具栏的 Run 按钮
Ctrl + Shift + 前方向键	光标放在方法名上，将方法移动到上一个方法前面，调整方法排序
Ctrl + Shift + Enter	自动结束代码，行末自动添加分号 （必备）
Alt + Shift + 左键双击，可以同时选择其他行 / 中文句
Alt + Shift + 前方向键	移动光标所在行向上移动
F2	跳转到下一个高亮错误 或 警告位置 （必备）
Alt + f12   编辑器最大化
连按两次Shift	弹出 Search Everywhere 
Ctrl + Alt + L  格式化代码
Ctrl + Shift + /	代码块注释 （必备）
Ctrl + Shift + N	通过文件名定位 / 打开文件 / 目录，打开目录需要在输入的内容后面多加一个正斜杠 （必备）
Ctrl + Shift + U	对选中的代码进行大 / 小写轮流转换 （必备）
Ctrl + O	选择可重写的方法
Ctrl + I	选择可继承的方法
Alt+Insert 选中文件夹 
Shift + F6	对文件 / 文件夹 重命名
Ctrl + Shift + +	展开所有代码
Ctrl + + 展开方法或最近的括号
ctrl + F5 重新运行
Shift + F6   重命名文件/重构文件
Ctrl + Alt + Enter	光标所在行上空出一行，光标定位到新行
Shift+ Enter	光标所在行下空出一行，光标定位到新行
Alt +Enter  显示异常并提出解决方案
Alt +Tab 快速切屏 
```

# 基本后缀大全

```text 
b.if      if(b) { $end$  }          //b为真值的判断
b.else    if(!b){ $end$  }
b.while   while(b)  { $end$ }
b.not   !b    //b取非

b.wn      while(b!=null) { $end$ }  //o为空的判断
o.null   if(o==null){ $end$ }
o.nn     if(o!=null){ $end$ }  

b.iter   for(T  it:b)       //迭代b

b.return return b 
st     String
```

# springboot知识

```text
精髓：
1 ). SpringBoot启动会加载大量的自动配置类
2)．我们看我们需要的功能有没有SpringBoot默认写好的自动配置类;
3)、我们再来看这个自动配置类中到底配置了哪些组件;(只要我们要用的组件有，我们就不需要再来配置了)
4)、给容器中自动配置类添加组件的时候，会从properties类中获取某些属性。我们就可以在配置文件中捂定这些属性的值;
XX.XXAutolonfigurartion :自动配查类;给容器中添加组件
xx.xxProperties:装配查义件中相关属性;

1、Spring1.1、简介
. Spring:春天------>给软件行业带来了春天!
. 2002，首次推出了Spring框架的雏形: interface21框架!
. Spring框架即以interface21框架为基础,经过重新设计,并不断丰富其内涵,于2004年3月24日,发布了1.0正式版。
 Rod Johnson ,Spring Framework创始人，著名作者。很难想象Rod Johnson的学历，真的让好多人大吃一惊，他是悉尼大学的博士，然而他的专业不是计算机，而是音乐学。
. spring理念:使现有的技术更加容易使用，本身是一个大杂烩，整合了现有的技术框架!
. SSH : Struct2 + Spring + Hibernate!
. SSM : SpringMvc + Spring + Mybatis!
官网: https:/lspring.io/projects/spring-framework#overview
官方下载地址: http://repo.spring.io/release/org/springframework/spring
GitHub: https:llgithub.com/spring;projects/spring-framework




1.2、优点
. Spring是一个开源的免费的框架（容器）!
. Spring是一个轻量级的、非入侵式的框架!
·控制反转（IOC)，面向切面编程(AOP) !
·支持事务的处理，对框架整合的支持!
总结一句话: Spring就是一个轻量级的控制反转(IOC)和面向切面编程(AOP）的框架!


IOC本质
控制反转loC(Inversion of Control)，是一种设计思想，Dl(依赖注入)是实现loC的一种方法，也有人认为DI只是loC的另一种说法。
没有loC的程序中，我们使用面向对象编程，对象的创建与对象间的依赖关系完全硬编码在程序中，对象的创建由程序自己控制，控制反转后将对象的创建转移给第三方，
个人认为所谓控制反转就是:获得依赖对象的方式反转了。
采用XML方式配置Bean的时候，Bean的定义信息是和实现分离的，而采用注解的方式可以把两者合为一体，Bean的定义信息直接以注解的形式定义在实现类中，从而达到了零配置的目的。
控制反转是一种通过描述（XML或注解）并通过第三方去生产或获取特定对象的方式。在Spring中实现控制反转的是loC容器，其实现方法是依赖注入(Dependency Injection,Dl)。
要实现不同的操作，只需要在xml配置文件中进行修改，所谓的loC,一句话搞定:对象由Spring 来创建，管理，装配!

如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【@Autowired】完成的时候、
我们可以使用@Qualifier(value="xxx")去配置@Autowired的使用，指定一个唯一的bean对象注入!


@Resource和@Autowired的区别:
·都是用来自动装配的，都可以放在属性字段上
.@Autowired通过byType的方式实现，而且必须要求这个对象存在!【常用】
@Resource默认通过byname的方式实现，如果找不到名字，则通过byType实现! 如果两个都找不到的情况下，就报错!【常用】
·执行顺序不同:@Autowired通过byType的方式实现。@Resource默认通过byname的方式实现。

3.衍生的注解
@Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层!
 dao 【@Repository】
 service 【@service】
 controller 【@Controller】
这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean

4.自动装配置
1 - @Autowired :自动装配通过类型。名字
2如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")
3- @Nu77able字段标记了这个注解，说明这个字段可以为null;
4- @Resource:自动装配通过名字。类型。

6.小结
xml 与注解:
o xml更加万能，适用于任何场合!维护简单方便。注解不是自己类使用不了，维护相对复杂!xml与注解最佳实践:
o xml用来管理bean;
。 注解只负责完成属性的注入;
。我们在使用的过程中，只需要注意一个问题:必须让注解生效，就需要开启注解的支持
<!--指定要扫描的包，这个包下的注解就会生效-->
2<context:component-scan base-package=l'com.kuang" />
3<context :annotation-config/>


11.2 Aop在Spring中的作用提供声明式事务;允许用户自定义切面
·横切关注点:跨越应用程序多个模块的方法或功能。即是，与我们业务逻辑无关的，但是我们需要关注的部分，就是横切关注点。如日志，安全，缓存，事务等等...
·切面(ASPECT)︰横切关注点被模块化的特殊对象。即，它是一个类。
·通知(Advice):切面必须要完成的工作。即，它是类中的一个方法。
·目标(Target)∶被通知对象。
·代理(Proxy)︰向目标对象应用通知之后创建的对象。
.切入点(PointCut):切面通知执行的“地点"的定义。
·连接点(JointPoint) :与切入点匹配的执行点

方式一:使用Spring的API接口【主要SpringAPI接口实现】
方式二︰自定义来实现AOP【主要是切面定义】



结论: springboot所有自动配置都是在启动的时候扫描并加载: spring.factories所有的自动配置类都在这里面，
但是不一定生效，要判断条件是否成立，只要导入了对应的start，就有对应的启动器了，有了启动器，我们自动装配就会生效，然后就配置成功!
1.springboot在启动的时候，从类路径下/META-INF/ spring.factories获取指定的值;
⒉将这些自动配置的类导入容器，自动配置就会生效，帮我进行自动配置!
3.以前我们需要自动配置的东西，现在springboot帮我们做了!
4.整合javaEE，解决方案和自动配置的东西都在spring-boot-autoconfigure-2.2.0.RELEASE.jar这个包下
5.它会把所有需要导入的组件，以类名的方式返回，这些组件就会被添加到容器;
6.容器中也会存在非常多的xxxAutoConfiguration的文件(@Bean)，就是这些类给容器中导入了这个场景需要的所有组件，

MVC框架要做哪些事情
1.将url映射到java类或java类的方法﹒
|2.封装用户提交的数据﹒
3.处理请求--调用相关的业务处理--封装响应数据﹒
4.将响应的数据进行渲染. jsp ; html等表示层数据.

2. HandlerMapping为处理器映射。DispatcherServlet调用HandlertMapping,HandlerMapping恨据v求url查找Handler .
3.HandlerExecution表示具体的Handler,其主要作用是根据url查找控制器，如上url被查找控制器为: hello.
4.HandlerExecution将解析后的信息传递始DispatcherServlet,如解析控制器怏射等.5.HandlerAdapter表示处理器适配器，其按照待定的规则去执行Handler,
6. Handleri让兵体的Controller执行。
7.Controller将其休的执行信息返回给HandlerAdapter,如ModelAndView.
8. HandlerAdapter将视图逻辑名或模型传递给DispatcherServlet,
9. DispatcherServlet调用视囵解析器(ViewResolver)来解析HandlerAdapter传递的逻铝视囵名。
10.视图解析器将解析的逻辑视图名传给DispatcherServlet.
11.DispatcherServlet根据视囹解析恐解析的视囵结果，调用具体的视囵。
12.最终视图呈现给用户。
```

#javaee

```text
知识点1：string类
StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。

知识点2：正则表达式
1、要注意正则表达式在Java代码中也是一个字符串，所以，对于正则表达式a\&c来说，对应的Java字符串是"a\\&c"，因为\也是Java字符串的转义字符，两个\\实际上表示的是一个\：
2、.代表任意字符 
\d 数字  \D非数字
\w 字母数字下划线  \W 非数字字母下划线
\s 空格或tab键   \S非空格字符
* 任意个字符 +至少一个字符  ？0个或一个字符  {n} n个字符.
复杂匹配
[1-9]
[0-9a-fA-F]
[^1-9]{3}
^表示开头, $表示结尾
\d+? 表示非贪婪匹配 至少匹配一个字符 
string.split()
"a, b ;; c".split("[\\,\\;\\s]+"); // { "a", "b", "c" }

知识点三：JSON映射javabean(导入依赖 jackson-databind)
   InputStream input = new BufferedInputStream(new FileInputStream("C:\\Users\\34775\\Desktop\\book.json"));
   objectMapper mapper = new ObjectMapper();
   mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
   Book book = mapper.readValue(input, Book.class);

知识点4:  xml解析  
    InputStream input1 =new BufferedInputStream(new FileInputStream("C:\\Users\\34775\\Desktop\\book.xml"));
    JacksonXmlModule module = new JacksonXmlModule();
    XmlMapper mapper = new XmlMapper(module);
    Book book = mapper.readValue(input1, Book.class);
知识点五:  Mysql
driver:com.mysql.cj.jdbc.Driver
url:jdbc:mysql://localhost:3306/learnjdbc?useUnicode=true&characterEncoding=utf-8&serveryTimezone=UTC&useSSl=false
username:
password:
 com.mysql.cj.jdbc.Driver
 mysql://localhost:3306/learnjdbc?useUnicode=true&characterEncoding=utf-8&serveryTimezone=UTC&useSSl=false

知识点六:redis
安装
sudo apt install redis-server
启动
redis-server
关闭
redis-cli shutdown # 关闭服务
sudo pkill pid #根据pid杀掉对应进程
查看状态
ps -ef|grep redis
service reids-server start
service reids-server stop
service reids-server restart
service reids-server status
退出 客户端
quit
客户端
redis-cli
默认16个数据库 编号0-15 默认访问0号数据库
select 15 选择15号数据库
创建键值对
set k1 v1 单独创建
mset k1 v1 k2 v2 集体创建
dbsize 获取当前键值对的数量
flushdb 清空当前数据库
flushall 清空所有数据库
save 将数据库保持至磁盘
bgsave 将数据库异步保持至磁盘 （bg background）
lastsave 获取最后一次成功保存的时间
数据库操作
keys 查看指定格式的key，*为通配符 keys *
exists key1 [key2...] 查看是否存在一到多个指定key 并返回存在的数量
type key 按key查看value的数据类型
del key1 [key2...] 按key删除1到多个键值对 返回删除的个数
rename key1 key2 重命名key1 如果key2存在 其值会被覆盖
renamenx key1 key2 key2不存在时重命名key1
move key 数据库编号 按key将一个键值对移动到指定数据库
copy key1 key2 将key1的值拷贝给key2
get key1 查看key1的value值

字符串操作
set key value 添加/修改一个键值对
get key 按key获取value
mset key value [key2 value2...] 添加/修改一个或多个键值对
mget key [key2...] 获取一个或多个value

append key 在原有value后追加内容
strlen key 查看字符串value长度
getrange key startindex endindex 获取范围时【startindex, endindex】的字串 *index从0开始，-n倒数第n个字符

set key value nx 或者 setnx key value 仅在key不存在时，添加一个键值对
set key value xx 仅在key存在时，修改value的值
set key value get 或 getset key value 修改一个键值对，并返回原值，原值不存在时返回nil
msetnx key1 value1 [key2 value2 ...] 批量setnx

如果字符串的内容为整数
incr key 按value 内容增加1 
incrby key 数值   value按指定的数值增加
decr key  value内容减去1
decrby key 数值 value按制定的数值减少

临时键值对
生存时间time to live 简称ttl，键值对被自动删除的秒数，生命倒计时
如果重新set 生存时间ttl将被重置

以下操作支持各种类型
expire key 秒数 设定一个生存时间
ttl key 查看生存时间剩余秒数
pexpire key 毫秒数  设定一个毫秒数生存时间
pttl key 查看剩余毫秒数生存时间
persist key 持久化 取消生存时间
以下操作仅对字符串
set key value ex 秒数  生存时间
setex key 秒数 value  同上 
set key value px 毫秒数 或者 pxset key 毫秒数 value 设置毫秒生存时间
set key value exat unix 秒 设置一个unix秒的过期时刻
set key value pxat unix毫秒 设置一个unix毫秒的过期时刻
set key value keepttl set时不重置ttl



知识点7：springboot_redis
redisTemplate操作不同的数据类型，api和我们的指令是一样的
opsForvalue操作字符串类型String
opsForlist操作list类型
ListopsForSet
opsForHash
opsForzset
opsForGeo
opsForHyperLoglog
```

```java 
public class Sort {      //堆
    public static void main(String[] args) {
        double[] doubles = {0.0, 87.67, 71.0, 96.0, 73.0, 88.0, 55.0};  //找前一百个最大值
        sort(doubles, 6, 3);
        for (int i = 1; i < doubles.length; i++) {
            double v = doubles[i];
            System.out.println(v + " ");
        }
    }
    public static void sort(double[] doubles, int n, int k) {
        min_heap(doubles, k);   //前k个建立堆  后面依次放入堆中   小顶堆  求最大值  比堆顶小的直接舍弃,大的和堆顶换,之后重新建立堆 
        for (int i = k + 1; i <= n; i++) {
            if (doubles[i] > doubles[1]) {
                doubles[1] = doubles[i];
                create_heap(doubles, 1, k);
            }
        }
    }

    public static void min_heap(double[] ds, int len) {
        for (int i = len / 2; i > 0; i--) {
            create_heap(ds, i, len);
        }
    }
    public static void create_heap(double[] ds, int k, int len) {
        ds[0] = ds[k];
        for (int i = 2 * k; i <= len; i *= 2) {
            if (i < len && (ds[i] > ds[i + 1])) {
                i++;
            }
            if (ds[0] < ds[i]) {
                break;
            } else {
                ds[k] = ds[i];
                k = i;
            }
        }
        ds[k] = ds[0];
    }
}

 public static void format() {      //格式化输出数字
        DecimalFormat df = new DecimalFormat();
        // 使用applyPattern方法设置格式化模板
        // #：代表数字，如果位上不存在，则不显示
        // 0:代表数字,如果位上不存在,则显示0
        df.applyPattern("0.0");
        double num = 0.955;
        String str = df.format(num);
        System.out.println(str);

    }
```


