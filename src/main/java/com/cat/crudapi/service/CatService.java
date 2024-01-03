package com.cat.crudapi.service;

import com.cat.crudapi.entity.Cat;

import java.util.List;

public interface CatService {

    List<Cat> findAll();

    Cat findCatId(int id);
}
