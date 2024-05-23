package com.minitest_11.service.interface_service;

import com.minitest_11.model.Computer;
import com.minitest_11.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IComputerService extends IGeneralService<Computer> {
    Iterable<Computer> findAllByType(Type type);

    Page<Computer> findAll(Pageable pageable);

    Page<Computer> findAllByCodeContaining(String code, Pageable pageable);
}
