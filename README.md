# xmz-springboot
一套基于SpringBoot 2.5.0和JDK1.8的开发框架，整合了JWT，Redis，Mybatis-Plus（包含其后端代码生成工具），MongoBD文件管理等等，整合了一些常用的工具类
## 多环境配置
- 配置文件在resources包下
    - `application.yml`： 基础配置文件
    - `application-dev.yml`：开发环境配置
    - `application-test.yml`：生产环境配置
    - `application-test.yml`：测试环境配置

- 修改`application.yml`的`spring.profiles.active`来配置当前环境

## 使用Logback生成系统日志
### 1. Logback配置文件
- Logback配置文件在resources包下
    - `logback-spring-test.xml`：测试环境日志配置
    - `logback-spring-pro.xml`：生产环境日志配置
### 2. 配置`application.yml`
- 在`application.yml`中test和pro环境的定义中，配置logging.config，达到不同环境使用其对应的logback配置文件的目的

	```yaml
	#test环境：以logback-spring-test.xml为规则输出日志文件
	spring:
	  config:
	    activate:
	      on-profile: test
	logging:
	  config: classpath:logback-spring-${spring.config.activate.on-profile}.xml
	
	---
	
	#pro环境：以logback-spring-pro.xml为规则输出日志文件
	spring:
	  config:
	    activate:
	      on-profile: pro
	logging:
	  config: classpath:logback-spring-${spring.config.activate.on-profile}.xml
	```
