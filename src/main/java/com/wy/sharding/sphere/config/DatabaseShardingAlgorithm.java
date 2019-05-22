package com.wy.sharding.sphere.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @author wy
 * @description 分库算法
 * @date 2019-05-17
 */
public class DatabaseShardingAlgorithm implements PreciseShardingAlgorithm {
    @Override
    public String doSharding(Collection collection, PreciseShardingValue preciseShardingValue) {
        return null;
    }
}
