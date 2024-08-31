package com.marcotxu.ecommerce.dao;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.marcotxu.ecommerce.entity.Country;
import com.marcotxu.ecommerce.entity.State;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "countryWithStates", types = { Country.class })
public interface MyCountryProjection {
    Integer getId();

    String getCode();

    String getName();

//    List<State> getStates();
}
