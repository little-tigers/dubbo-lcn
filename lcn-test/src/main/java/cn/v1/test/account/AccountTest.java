package cn.v1.test.account;

import cn.v1.account.pojo.Account;
import cn.v1.account.service.AccountService;
import cn.v1.shop.pojo.Shop;
import cn.v1.shop.service.ShopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wr
 * @Date: 2018/11/29
 * @Description:
 */
public class AccountTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-*.xml");
      //  AccountService accountService = context.getBean(AccountService.class);
        ShopService shopService = context.getBean(ShopService.class);
        Account account = new Account();
        account.setId("110");
        account.setName("maryu");
        account.setMoney(70d);
        //accountService.save(account);

        Shop shop = new Shop();
        shop.setId("1001");
        shop.setName("飞机");
        shop.setPrice(10000d);
        shopService.save();
    }
}
