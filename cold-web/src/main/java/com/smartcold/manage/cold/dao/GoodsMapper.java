package com.smartcold.manage.cold.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smartcold.manage.cold.entity.GoodsEntity;

public interface GoodsMapper {

	public List<GoodsEntity> findGoodsAll();

	public List<GoodsEntity> findGoodsByTypeId(@Param("typeId") int typeId);

	public GoodsEntity findGoodsByName(@Param("typeId") int typeId, @Param("name") String name);
}
