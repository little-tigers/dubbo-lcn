package cn.v1.lcn.base.dao;

/**
 * @Auther: wr
 * @Date: 2018/11/29
 * @Description:
 */
public interface BaseMapper<T> {

    T findById(String id);

    void insert(T t);

    void update(T t);

    void delete(T t);
}
