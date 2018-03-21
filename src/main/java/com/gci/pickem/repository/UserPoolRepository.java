package com.gci.pickem.repository;

import com.gci.pickem.data.UserPool;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface UserPoolRepository extends CrudRepository<UserPool, Long> {

    Set<UserPool> findByUserId(Long userId);
}