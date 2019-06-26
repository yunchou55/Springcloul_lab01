package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.Person;
import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FirstController {

    @RequestMapping(value = "/person/{personId}",method = RequestMethod.GET)
    public String findName(@PathVariable("personId") Integer personId){
        Person person = new Person(personId,"CYC",23);
        Map<String,String> parmterMap = Maps.newHashMap();
        parmterMap.put("PersonId",person.getPersonId().toString());
        parmterMap.put("Pname",person.getPname());
        parmterMap.put("Page", String.valueOf(person.getPage()));
        return JSON.toJSONString(parmterMap);
    }
}
