package com.fis;

public interface ICollection<T> {
    void push(T value);
    T pop();
    boolean hasNext();
}
