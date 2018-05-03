package org.spring.springboot.service;

import org.spring.springboot.domain.City;

import java.util.List;

/**
 * @author WJ
 * @date 2018/04/26
 */
public interface CityService {

    List<City> findAll();


    City findOne(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);

}
