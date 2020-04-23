package chart1_array;

/**
 * 根据线性表的共有的特点，创建抽象类
 * @author ChenMJ
 * @version LList.class, v 0.1 2020/3/31 10:53 ChenMJ Exp$
 */
public interface LList<T> {
    /**空判断方法*/
    boolean isEmpty();
    /**线性表长度*/
    int size();
    /**返回第i个元素*/
    T get(int index);
    /**设置第i个元素为t*/
    void set(int index,T t);
    /**插入t作为第i个元素*/
    void insert(int index,T t);
    /**在线性表最后插入t*/
    void add(T t);
    /**删除第i个元素*/
    T remove(int i);
    /**删除全部元素*/
    void removeAll();
    /**查找*/
    T search(T key);
}
