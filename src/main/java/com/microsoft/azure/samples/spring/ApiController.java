package com.microsoft.azure.samples.spring;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.samples.spring.batch.BatchRepository;

import org.dom4j.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class ApiController {

    @Autowired
    BatchRepository batchRepository;

    @RequestMapping("/")
    public String index() {
        return "Unknown request! Please refer documentation at www.apis.antarang.com";
    }

    @GetMapping("/batches")
    public @ResponseBody String batches() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(batchRepository.listAllBatches());

    }
}
