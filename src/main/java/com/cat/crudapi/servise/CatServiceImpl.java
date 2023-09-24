package com.cat.crudapi.servise;

import com.cat.crudapi.entity.Cat;
import com.cat.crudapi.exception.ResourceNotFoundException;
import com.cat.crudapi.repositry.CatMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatServiceImpl implements CatServise {

    private final CatMapper catMapper;

    public CatServiceImpl(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    @Override
    public List<Cat> findAll() {
        return catMapper.findAll();
    }

    @Override
    public Cat findCatId(int id) {
        Optional<Cat> cat = catMapper.findCatId(id);
        // 該当idがDBにない場合は例外
        return cat.orElseThrow(() -> new ResourceNotFoundException("resource not found: " + id));
    }

}
