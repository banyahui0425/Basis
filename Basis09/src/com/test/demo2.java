package com.test;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.params.SetParams;

/**
 * @Creater banyahui
 * @Date 2019/12/05 下午 21:53
 * @Description jedis pool
 */
public class demo2 {
    public static void main(String[] args) {
        GenericObjectPoolConfig config=new GenericObjectPoolConfig();
        config.setMaxIdle(30);
        config.setMaxTotal(50);
        config.setMaxWaitMillis(3000);
        config.setMinIdle(10);
        JedisPool jedisPool= new JedisPool(config, "localhost", 6379);
        Jedis jedis = jedisPool.getResource();

        String key1 = jedis.get("key1");
        System.out.println("key1 = " + key1);

        for (int i = 0; i < 10; i++) {
            Jedis jedis2 = jedisPool.getResource();
            String key11 = jedis2.get("key1");
            System.out.println("key11 = " + key11);
        }

        String set = jedis.set("key2", "value2", SetParams.setParams().ex(10));
        System.out.println("set = " + set);

    }
}
