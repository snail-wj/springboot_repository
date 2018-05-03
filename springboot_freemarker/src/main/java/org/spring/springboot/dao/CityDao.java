package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

import java.util.List;
/**
 * @author WJ
 * @date 2018/04/25
 */
public interface CityDao {

    List<City> findAll();

    City findOne(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
