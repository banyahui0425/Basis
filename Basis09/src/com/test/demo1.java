package com.test;

import com.bean.account;
import redis.clients.jedis.Jedis;

/**
 * @Creater banyahui
 * @Date 2019/12/05 下午 17:05
 * @Description redis jedis
 */
public class demo1 {
    public static void main(String[] args) {
        Jedis jedis1 = new Jedis("localhost", 6379);
        String set = jedis1.set("key1", "value1");
        System.out.println("set = " + set);

        String key1 = jedis1.get("key1");
        System.out.println("key1 = " + key1);

        account account=new account();
        account.setUserid(1); account.setAnum("aaa");
        account.setId(123);account.setMoney(9999.0);
        jedis1.set("account","{\"id\":88,\"userid\":8,\"anum\":\"888\",\"money\":8888.0}");

        String account1 = jedis1.get("account");
        System.out.println("account1 = " + account1);
    }
}
