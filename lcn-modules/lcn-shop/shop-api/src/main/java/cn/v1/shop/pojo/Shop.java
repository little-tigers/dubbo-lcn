package cn.v1.shop.pojo;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/29
 * @Description:
 */
public class Shop implements Serializable {

    private static final long serialVersionUID = 548179687330043270L;

    private String id;

    private String name;

    private Double price;

    private Integer number;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
