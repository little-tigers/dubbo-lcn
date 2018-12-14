package cn.v1.account.pojo;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/29
 * @Description:
 */
public class Account implements Serializable {

    private static final long serialVersionUID = 1660449650264440574L;

    private String id;

    private String name;

    private Double money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
