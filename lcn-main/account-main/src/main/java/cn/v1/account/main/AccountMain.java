package cn.v1.account.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountMain {

    private static Logger logger = LoggerFactory.getLogger(AccountMain.class);

    private static void getLocalIp() {
        try {
            System.out.println("服务暴露的ip: "
                    + java.net.InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        getLocalIp();
        logger.info("开始启动asset");


        ClassPathXmlApplicationContext
                context = new ClassPathXmlApplicationContext(
                "classpath:META-INF/spring/spring-*.xml");
        context.start();

        synchronized (AccountMain.class) {
            while (true) {
                try {
                    AccountMain.class.wait();
                } catch (Throwable e) {
                }
            }
        }


    }
}
