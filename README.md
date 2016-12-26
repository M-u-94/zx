项目说明：

1、	Nginx作负载均衡，负责分发Http请求给tomcat处理
2、	前台刷新使用Ajax实现每三秒发起http请求，后台利用Struts2进行请求转发
3、	数据分别存在Mariadb和Redis内存数据库中，其中“刷新”功能数据来源在Redis,“抢票”功能数据来源在Mariadb。 
4、	利用Spring AOP，在用户点击“抢票”后，更新内存数据库Redis中的相应电影的余票数量。
# moana
