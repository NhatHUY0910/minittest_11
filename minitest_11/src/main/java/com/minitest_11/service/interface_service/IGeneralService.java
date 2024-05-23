package com.minitest_11.service.interface_service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> finById(long id);

    void save(T t);

    void delete(Long id);
}
