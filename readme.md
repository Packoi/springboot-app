
**项目说明：**

	m站首页改版导库任务项目，用于从cms库导新闻数据到mongodb新闻库，并同步评论数和点击数

**相关技术如下：**

	- 框架：springboot
	- 消息队列：kafka（zookeeper?）
	- 数据库：mongodb
	- 关系型数据库：sqlserver
	- 缓存：redis集群（可用于修改缓存数据供接口项目使用）
	- 定时任务：spring-schedule

**代码结构说明：**

	- com.packoi.app	主函数
	- com.packoi.app.config	配置（包括多数据库配置和redis配置等）
	- com.packoi.app.domain	实体类
	- com.packoi.app.dao.*	多数据源分库dao
	- com.packoi.app.aop.*	切面
	- com.packoi.app.kafka	kafka消息队列相关
	- com.packoi.app.mapper.*	mybatis配置文件
	- com.packoi.app.repository.*	分库相关的Repository
	- com.packoi.app.service.*	逻辑处理类
	- com.packoi.app.utils.*	工具类

	
	
	
	
