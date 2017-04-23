package com.tm.redisdemo;

import redis.clients.jedis.Jedis;

/**
 * Created by lenovo on 2017/4/23.
 */
public class RedisMain
{
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("106.14.98.121");
        System.out.println("Connection to server sucessfully");


    jedis.set("mykey","gaodandan");
     String keyValue = jedis.get("mykey");

        System.out.println("the key value is:"+keyValue);


    }
}
