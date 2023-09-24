package com.cat.crudapi.repositry;

import com.cat.crudapi.entity.Cat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CatMapper {

    @Select("SELECT * FROM cats")
    List<Cat> findAll();

    @Select("SELECT * FROM cats WHERE id = #{id}")
    Optional<Cat> findCatId(int id);
}
