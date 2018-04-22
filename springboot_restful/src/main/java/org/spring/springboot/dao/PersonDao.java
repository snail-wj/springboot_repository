package org.spring.springboot.dao;

import org.spring.springboot.domain.Person;

import java.util.List;
/**
 * 人员Dao接口类
 *
 * @author WJ
 * @date 2018/04/22
 */
public interface PersonDao {

    List<Person> findAll();

    Person findOne(Long id);

    Long savePerson(Person person);

    Long updatePerson(Person person);

    Long deletePerson(Long id);
}
