package com.minitest_11.repository;

import com.minitest_11.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeRepository extends CrudRepository<Type, Long> {
}
