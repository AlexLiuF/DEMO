springboot整合mybatis


关于配置文件多源yml
在项目中配置多套环境的配置方法。
因为现在一个项目有好多环境，开发环境，测试环境，准生产环境，生产环境，每个环境的参数不同，所以我们就可以把每个环境的参数配置到yml文件中，这样在想用哪个环境的时候只需要在主配置文件中将用的配置文件写上就行如application.yml

笔记：在Spring Boot中多环境配置文件名需要满足application-{profile}.yml的格式，其中{profile}对应你的环境标识，比如：

application-dev.yml：开发环境
application-test.yml：测试环境
application-prod.yml：生产环境
至于哪个具体的配置文件会被加载，需要在application.yml文件中通过spring.profiles.active属性来设置，其值对应{profile}值。



sql语句
CREATE TABLE `user` (
  id int(32) NOT NULL AUTO_INCREMENT COMMENT "用户id",
  userName varchar(32) NOT NULL COMMENT "用户名",
  passWord varchar(50) NOT NULL COMMENT "密码",
  realName varchar(32) DEFAULT NULL COMMENT "真实名字",
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT"用户表";