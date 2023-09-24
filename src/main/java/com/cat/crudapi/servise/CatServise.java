package com.cat.crudapi.servise;

import com.cat.crudapi.entity.Cat;

import java.util.List;

public interface CatServise {

    List<Cat> findAll();

    Cat findCatId(int id);

}
