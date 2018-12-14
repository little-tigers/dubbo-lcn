package cn.v1.account.service;

import cn.v1.account.pojo.Account;

/**
 * @Auther: wr
 * @Date: 2018/11/29
 * @Description:
 */
public interface AccountService {

    Account getById(String id);

    void save(Account t);

    void update(Account t);
}
