package org.spring.springboot.service.impl;

import org.spring.springboot.dao.PersonDao;
import org.spring.springboot.domain.Person;
import org.spring.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * 业务逻辑实现层
 *
 * @author WJ
 * @date 2018/04/22
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public Person findOne(Long id) {
        return personDao.findOne(id);
    }

    @Override
    public Long savePerson(Person person) {
        return personDao.savePerson(person);
    }

    @Override
    public Long updatePerson(Person person) {
        return personDao.updatePerson(person);
    }

    @Override
    public Long deletePerson(Long id) {
        return personDao.deletePerson(id);
    }
}
