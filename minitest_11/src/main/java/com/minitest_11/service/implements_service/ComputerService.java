package com.minitest_11.service.implements_service;

import com.minitest_11.model.Computer;
import com.minitest_11.model.Type;
import com.minitest_11.repository.IComputerRepository;
import com.minitest_11.service.interface_service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComputerService implements IComputerService {

    @Autowired
    private IComputerRepository computerRepository;

    @Override
    public Iterable<Computer> findAllByType(Type type) {
        return computerRepository.findAllByType(type);
    }

    @Override
    public Page<Computer> findAll(Pageable pageable) {
        return computerRepository.findAll(pageable);
    }

    @Override
    public Page<Computer> findAllByCodeContaining(String code, Pageable pageable) {
        return computerRepository.findAllByCodeContaining(code, pageable);
    }

    @Override
    public Iterable<Computer> findAll() {
        return computerRepository.findAll();
    }

    @Override
    public Optional<Computer> finById(long id) {
        return computerRepository.findById(id);
    }

    @Override
    public void save(Computer computer) {
        computerRepository.save(computer);
    }

    @Override
    public void delete(Long id) {
        computerRepository.deleteById(id);
    }
}
