package com.wy.sharding.sphere;

import com.wy.sharding.sphere.entity.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author wy
 * @description
 * @date 2019-05-17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityServiceTest {

    @Resource
    private CityService cityService;
    @Test
    public void getCitys() {
        System.out.println(cityService.getCitys(1,50));
    }
    @Test
    public void save(){
        City peking = City.builder().cityId(3).city("tianjin").countryId(107).build();
        System.out.println(cityService.save(peking));
    }
}