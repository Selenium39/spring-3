# spring-3
```            Spring Aop
1.使用传统的方式(Main.java):
    核心逻辑和其他逻辑冗余度高，大部分为重复代码
2.使用代理(Main1.java)
    1.新建代理类:
        1.获取即将被代理对象并与代理类关联
        ２.代理并获取对象
          ClassLoader loader=Computer.class.getClassLoader();
          Class []interfaces={Computer.class};
          InvocationHandler handler=new InvocationHandler(Proxy proxy,Method method,Object[] args){
                                      method.invoke(computer,args);
                                      }
          Proxy.newProxyInstance(ClassLoader loader,Class[] interfaces,InvacationHandler handler);
    2.通过代理类获得对象并调用方法
3.使用Spring Aop
1.概念
    1.切面(Aspect):横切关注点(连接点)被模块化的特殊对象
    2.通知(Advice):切面必须完成的功能
    3.目标(Target):被通知的对象
    4.代理(Proxy):向目标对象引用通知后创建的对象
    5.连接点(Jointpoint):程序执行的位置
    6.切点(Pointcut):程序中客观存在的事务,一个连接点就好比是数据库中的一条记录，而一个切点就好比一条查询条件
2.通过AspectJ注解配置AOP
    1.导包
    2.新建切面类 @Aspect
    3.新建方法  定义前置通知和切点表达式@Before("Excution(public int com.wantao.spring3.ComputerImpl1.add(int, int))")
    4.在配置文件中写<aop:aspectj-autoproxy></aop:aspectj-autoproxy>代表自动生成被@Aspect标注的代理对象
  　注意:1.如果想获得切入点的具体参数，可在通知的方法中传入JointPoint对象
        2.不管方法时候抛出异常都会执行后置通知
        3.环绕通知使用的是ProceedingJointPoint
        4.@Order(0)设置切面优先级，数字越小，优先级越大
        5.新建一个空方法使用@PointCut来重用切点表达式
```
参考视频:https://ke.qq.com/course/280229
