package com.minitest_11.repository;

import com.minitest_11.model.Computer;
import com.minitest_11.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComputerRepository extends CrudRepository <Computer,Long> {
    Iterable<Computer> findAllByType(Type type);

    Page<Computer> findAll(Pageable pageable);

    Page<Computer> findAllByCodeContaining(String code, Pageable pageable);
}
