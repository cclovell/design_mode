package com.cc.model;

public interface IBaseDAO<T> {
    void find(Integer id);
    void insert(T t);
    void delete(Integer id);
    void update(T t);
}
