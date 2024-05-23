package com.minitest_11.service.implements_service;

import com.minitest_11.model.Type;
import com.minitest_11.repository.ITypeRepository;
import com.minitest_11.service.interface_service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TypeService implements ITypeService {

    @Autowired
    private ITypeRepository repo;

    @Override
    public Iterable<Type> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Type> finById(long id) {
        return repo.findById(id);
    }

    @Override
    public void save(Type type) {
        repo.save(type);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
