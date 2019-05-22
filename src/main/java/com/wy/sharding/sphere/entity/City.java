package com.wy.sharding.sphere.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author wy
 * @description
 * @date 2019-05-14
 */
@Setter
@Getter
@Builder
@ToString
public class City {
    /**
     * 城市id
     */
    private Integer cityId;
    /**
     * 城市名称
     */
    private String city;
    /**
     * 国家id
     */
    private Integer countryId;
    /**
     * 最后的更新时间
     */
    private LocalDateTime lastUpdate;
}
