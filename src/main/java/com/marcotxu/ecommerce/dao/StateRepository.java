package com.marcotxu.ecommerce.dao;

import com.marcotxu.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface StateRepository extends JpaRepository<State, Integer> {

    // we don't need pagination so there is no need to return Page
    List<State> findByCountryCode(@Param("code") String code);
}
