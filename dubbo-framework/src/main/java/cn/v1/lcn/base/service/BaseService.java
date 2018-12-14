package cn.v1.lcn.base.service;

/**
 * @Auther: wr
 * @Date: 2018/12/12
 * @Description:
 */
public interface BaseService<T> {

    T getById(String id);

    void save(T t);

    void delete(T t);
}
