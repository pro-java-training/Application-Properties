package com.codve.controller;

import com.codve.Bean.DataSource;
import com.codve.Bean.DataSource2;
import com.codve.Bean.DataSource3;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSourceController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private DataSource2 dataSource2;

    @Autowired
    private DataSource3 dataSource3;

    @RequestMapping(value = "/get1", method = RequestMethod.GET)
    public String get() {
        ObjectMapper objectMapper = new ObjectMapper();
        String result = "";
        try {
            result = objectMapper.writeValueAsString(dataSource);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/get2", method = RequestMethod.GET)
    public String get2() {
        ObjectMapper objectMapper = new ObjectMapper();
        String result = "";
        try {
            result = objectMapper.writeValueAsString(dataSource2);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/get3", method = RequestMethod.GET)
    public String get3() {
        ObjectMapper objectMapper = new ObjectMapper();
        String result = "";
        try {
            result = objectMapper.writeValueAsString(dataSource3);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/get4", method = RequestMethod.GET)
    public String get4() {
        ObjectMapper objectMapper = new ObjectMapper();
        String result = "";
        try {
            result = objectMapper.writeValueAsString(dataSource3);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

}
