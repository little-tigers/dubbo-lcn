# Lcn-demo 启动

1. 数据库配置示例，lcn-a库下包含t_account表，lcn-b库下包含t_shop表

2. 启动dubbo相关服务如zookeeper等

3. 启动之前，确定先解压z-integrate下的tx-manager-4.1.0，修改application.properties启动参数，运行jar

4. 修改tx.properties，目标地址为tx-manager所安装的地址

5. 启动AccountMain、ShopMain

6. Main启动 AccountTest

   成功之后，将会看到记录不会发生变化，找到ShopServiceImpl中的save 去掉测试NullPointerException异常

   则可以修改成功

问题 ：发现事务异常，java.sql.SQLException: connection holder is null

不能跨服务，这里的跨服务，理解为多个注册中心？
原生demo https://github.com/codingapi/dubbo-lcn-demo