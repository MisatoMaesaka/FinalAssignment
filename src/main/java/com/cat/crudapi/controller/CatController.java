package com.cat.crudapi.controller;

import com.cat.crudapi.controller.response.CatResponse;
import com.cat.crudapi.entity.Cat;
import com.cat.crudapi.service.CatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {

    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/cats")
    public List<Cat> getCats() {
        return catService.findAll();
    }

    @GetMapping("/cats/{id}")
    public CatResponse findCatId(@PathVariable("id") int id) {
        Cat cat = catService.findCatId(id);
        return new CatResponse(cat);
    }
}
