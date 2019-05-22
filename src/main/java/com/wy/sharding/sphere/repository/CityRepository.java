package com.wy.sharding.sphere.repository;

import com.wy.sharding.sphere.entity.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wy
 * @description 城市mapper
 * @date 2019-05-17
 */
@Repository
public interface CityRepository {
    /**
     * 范围查找城市
     *
     * @param startId 左边界
     * @param endId   右边界
     * @return 符合条件的城市列表
     */
    List<City> findCities(@Param("startId")Integer startId, @Param("endId") Integer endId);

    /**
     * 保存记录
     *
     * @param city 城市对象
     * @return affect row
     */
    Integer save(City city);
}
