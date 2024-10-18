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
## BigDecimalUtil工具
没有什么太复杂的代码。<br/>
先是通过方法名称确定返回值的类型（BigDecimal、Double、String）。<br/>
然后大量的重载方法，用“穷举法”把BigDecimal、Double、String、Integer四种类型进行各种形式的两两组合，进行加减乘除运算。<br/>
运算时非BigDecimal类型的参数会转化成BigDecimal以防止精度缺失。<br/>
### 1. 加法
- 共3种方法
	1. `add(num1, num2, int places)`返回BigDecimal类型的结果
	2. `addToDouble(num1, num2, int places)`返回Double类型的结果
	3. `addToString(num1, num2, int places)`返回String类型的结果
 - 以上3个方法都适用的说明：
	- num1和num2为相加的两个值，可以为BigDecimal、Double、String、Integer四种类型任意类型。
	- num1或num2，如果传入空值，会被赋值为0进行计算。
	- places是一个int类型参数，决定结果取小数点后的几位（四舍五入）。加法不强制要求改参数，不需要的话只写前两个参数就可以了。
		```java
		//add(num1, num2) 加法 返回BigDecimal
		BigDecimal addResult = BigDecimalUtil.add(a, b);
		//add(num1, num2, int places) 加法 返回BigDecimal 同时保留2位小数
		BigDecimal addResult2 = BigDecimalUtil.add(a, b, 2);
		
		//addToDouble(num1, num2) 加法 返回Double
		Double addToDoubleResult = BigDecimalUtil.addToDouble(b, c);
		//add(num1, num2, int places) 加法 返回Double 同时保留2位小数
		BigDecimal addToDoubleResult2 = BigDecimalUtil.addToDouble(a, b, 2);
		
		//addToString(num1, num2) 加法 返回String
		String addToStringResult = BigDecimalUtil.addToString(c, d);
		//addToString(num1, num2, int places) 加法 返回String 同时保留2位小数
		String addToStringResult2 = BigDecimalUtil.addToString(c, d, 2);
		```
### 2. 减法
- 减法，其实跟加法是一个道理，顶多提一句的就是`第一个参数num1是被减数，第二个参数num2是减数`，共3种方法
	1. `subtract(num1, num2, int places)`返回BigDecimal类型的结果
	2. `subtractToDouble(num1, num2, int places)`返回Double类型的结果
	3. `subtractToString(num1, num2, int places)`返回String类型的结果
- 同样不需要四舍五入的取n位小数的话就不需要写第三个参数了。
- 同样，num1或num2，如果传入空值，会被赋值为0进行计算。
### 3. 乘法
- 乘法和加法基本一致，共3种方法
	1. `multiply(num1, num2, int places)`返回BigDecimal类型的结果
	2. `multiplyToDouble(num1, num2, int places)`返回Double类型的结果
	3. `multiplyToString(num1, num2, int places)`返回String类型的结果
- 乘法运算时，num1或num2，如果传入空值，也会被赋值为0进行计算，其实就是不管谁为空，最后都会得到一个为0的结果。
###4. 除法
- 除法大体和减法一样，`第一个参数num1是被除数，第二个参数num2是除数`，共3种方法
	1. `divide(num1, num2, int places)`返回BigDecimal类型的结果
	2. `divideToDouble(num1, num2, int places)`返回Double类型的结果
	3. `divideToString(num1, num2, int places)`返回String类型的结果
- 但除法有一定的特殊性：
	1. 除法中，第三个参数` int places`保留小数的位数必须传入，以应对无限小数。
	2. 第二参数，即被除数，如果传空或者传0话，不会走计算过程，直接返回0作为结果。
