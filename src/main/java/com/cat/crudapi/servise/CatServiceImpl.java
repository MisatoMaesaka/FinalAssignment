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

/*
 *エラー文
 *2023-09-25T00:08:10.190+09:00  WARN 26394 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'catServiceImpl' defined in file [/Users/maesakamisato/Desktop/RaiseTechproject/crudapi/build/classes/java/main/com/cat/crudapi/servise/CatServiceImpl.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'catMapper' defined in file [/Users/maesakamisato/Desktop/RaiseTechproject/crudapi/build/classes/java/main/com/cat/crudapi/repositry/CatMapper.class]: Cannot resolve reference to bean 'sqlSessionTemplate' while setting bean property 'sqlSessionTemplate'
 */