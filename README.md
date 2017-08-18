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
当某个子应用要获取restful时，只需从eureka中获取restful服务实例甚至可以直接访问restful api。  
但是这样需要向客户端暴露服务资源，且随着微服务化的不断推进，每个应用所依赖的服务将越来越多，需要在应用中配置服务的资源路径也就变得越来越庞大而费劲。  
这样，使用eureka作为restful服务的注册中心的优势就无法体现出来，使用zuul进行反向代理结合eureka，实现生产者和消费者的解耦。以下是各个服务的部署路径：
1. springcloud-eureka: 127.0.0.1:8761
2. springcloud-zuul: 127.0.0.1:8088
3. springboot-rest: 127.0.0.1:8012
访问 http://127.0.0.1:8088/producer/hello 将路由到 http://127.0.0.1:8012/hello
### springcloud-eureka
1. 注册中心;
2. 注册中心cluster（待实现）
### springboot-rest
1. 工程示范了注册在springcloud-eureka server的restful服务的生产者;
2. spring boot默认把启动类所在包作为basePackage,本工程示范了如何自定义扫描多个基包;
3. spring cloud-整合Swagger2构建RESTful服务的APIs;
4. 自定义[eureka.instance.status-page.url](http://blog.csdn.net/liuchuanhong1/article/details/59064794),实现Eureka页面自动跳转到Swagger2UI界面查看服务接口信息;
### springcloud-zuul
1. 通过反向代理
2. 同样注册在springcloud-eureka server，并通过eureka注册中心，实现生产者与消费者的解耦