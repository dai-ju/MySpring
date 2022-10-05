# MySpring
本项目是一个简化版的spring框架，通过完成spring-aop, spring-beans, spring-context, spring-core四个模块，实现了IOC，AOP，bean的生命周期和作用域，事件监听器，资源加载器，类型转换等核心功能。

• spring-aop中通过jdk动态代理，Cglib，AspectJ实现了AOP

• spring-bean中完成了BeanFactory，Aware，FactoryBean，BeanPostProcessor等接口和其实现类，并且实现了@Autowired，@Value等注解

• spring-context中完成了event部分的相关类来提供事件监听和处理功能

• spring-core中完成了convert和io部分来提供类型转换，资源加载的功能
