# springboot-demo介绍
不是教程是个人项目实践总结;  
为了使pom看上去优雅，需依赖[framework-boot-parent](https://github.com/agncao/framework-boot-parent.git)下的各starter,例如framework-boot-starter;

## springboot-quickstart
一个简单的hello world web小程序，简单的示范了：  
1. 多模块项目中，当spring-boot程序有自己的母pom时，不用继承Spring Boot的提供的父工程spring-boot-starter-parent
2. 如何配置thymeleaf;
3. 静态文件和模板文件均不放在maven模板创建的resources目录之下，而是放在自定义文件夹webapp之下，并将此文件夹设置为资源文件路径;
4. spring-boot如何整合log4j2;
## springboot-thymeleaf
示范最常用的thymeleaf语法：
1. 标签只有在th:if中条件成立时才显示(比如当前用户拥有某权限时,"提交"按钮自才可见); 
2. 示范引用js文件、css文件;
3. 示范循环语句，例如用于<table>标签的每一行;
4. 日期格式化语句;
5. 三元运算;
6. 此module已经包含了springboot-quickstart
## spring cloud demo
### springcloud-eureka
1. 注册中心;
2. 注册中心cluster（待实现）
### springboot-rest
1. 生产者，restful api，注册在springcloud-eureka server
2. swagger
### springcloud-zuul
1. 通过反向代理
2. 同样注册在springcloud-eureka server，并通过eureka注册中心，实现生产者与消费者的解耦