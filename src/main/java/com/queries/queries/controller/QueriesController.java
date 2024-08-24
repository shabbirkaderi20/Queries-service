package com.queries.queries.controller;

import com.queries.queries.dto.QueryDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queries")
public class QueriesController {

    @PostMapping(path="/createQueries", consumes = "application/json", produces = "application/json")
    public String createQueries(@RequestBody QueryDTO queryDTO) {
        System.out.println(queryDTO.toString());
        return "Hello Chutiyo";
    }

    @GetMapping("/test/{id}")
    public String test(@PathVariable("id") long id) {
        return "Id: "+ id;
    }
}
