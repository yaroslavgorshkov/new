package org.example;

import java.util.List;
import java.util.Optional;

public interface DAO <T>{
    T save(T obj);
    T update(T obj);
    Optional<T> get(Long id);
    void delete(Long id);
    List<T> getALl();
}
