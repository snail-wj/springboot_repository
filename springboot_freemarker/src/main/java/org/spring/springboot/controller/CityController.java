package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author WJ
 * @date 2018/04/26
 */
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public String findOne(Model model, @PathVariable("id") Long id){
        model.addAttribute("city" , cityService.findOne(id));
        return "city";
    }


    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public String findAll(Model model){
        List<City> cityList = cityService.findAll();
        model.addAttribute("cityList", cityList);
        return "cityList";
    }
}
