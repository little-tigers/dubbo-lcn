package cn.v1.account.core.impl;

import cn.v1.account.core.dao.AccountMapper;
import cn.v1.account.pojo.Account;
import cn.v1.account.service.AccountService;
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
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper mapper;

    @Override
    public Account getById(String id) {
        return mapper.findById(id);
    }

    @Override
    @Transactional
    public void save(Account t) {
        mapper.insert(t);
    }

    @Override
    @Transactional
    @TxTransaction
    public void update(Account t) {
        mapper.update(t);
    }
}
