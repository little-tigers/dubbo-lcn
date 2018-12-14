package cn.v1.shop.core.impl;

import cn.v1.account.pojo.Account;
import cn.v1.account.service.AccountService;
import cn.v1.shop.core.dao.ShopMapper;
import cn.v1.shop.pojo.Shop;
import cn.v1.shop.service.ShopService;
import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: wr
 * @Date: 2018/11/29
 * @Description:
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper mapper;

    @Autowired
    private AccountService accountService;

    @Transactional()
    public void save(Shop t) {
        Shop shop = mapper.findById("1001");
        shop.setNumber(shop.getNumber()-10);
        mapper.update(shop);
    }

    @Override
    public void delete(Shop shop) {

    }

    @Transactional()
    @TxTransaction(isStart = true)
    public void save() {
        Shop shop = mapper.findById("1001");
        save(shop);
        Account account = accountService.getById("110");
        account.setMoney(account.getMoney()-shop.getPrice());
        accountService.update(account);
        throw new NullPointerException("缺失必要的请求参数");

    }

    @Override
    public Shop getById(String id) {
        return null;
    }

}
