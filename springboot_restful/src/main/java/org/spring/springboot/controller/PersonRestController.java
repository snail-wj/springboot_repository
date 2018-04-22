package org.spring.springboot.controller;

import org.spring.springboot.domain.Person;
import org.spring.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 人员PersonController 实现 HTTP服务
 *
 * @author WJ
 * @date 2018/04/22
 */

@RestController
public class PersonRestController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/api/person" ,method = RequestMethod.GET)
    public List<Person> findAll(){
        return personService.findAll();
    }

    @RequestMapping(value = "/api/person/{id}", method = RequestMethod.GET)
    public Person findOne(@PathVariable("id") Long id){
        return personService.findOne(id);
    }

    @RequestMapping(value = "/api/person", method = RequestMethod.POST)
    public void savePerson(@RequestBody Person person){
        personService.savePerson(person);
    }

    @RequestMapping(value = "/api/person", method = RequestMethod.PUT)
    public void updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
    }

    @RequestMapping(value = "/api/person/{id}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable("id") Long id){
        personService.deletePerson(id);
    }
}
