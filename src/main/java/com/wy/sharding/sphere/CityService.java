package com.wy.sharding.sphere;

import com.alibaba.druid.pool.DruidDataSource;
import com.wy.sharding.sphere.entity.City;
import com.wy.sharding.sphere.repository.CityRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wy
 * @description
 * @date 2019-05-17
 */
@Service
public class CityService {
    @Resource
    private CityRepository cityRepository;

    public List<City> getCitys(int start, int end) {
        return cityRepository.findCities(start, end);
    }

    public Integer save(City city) {
        return cityRepository.save(city);
    }
}
