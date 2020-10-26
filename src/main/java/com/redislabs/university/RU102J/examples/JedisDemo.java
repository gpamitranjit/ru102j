package com.redislabs.university.RU102J.examples;

import redis.clients.jedis.Jedis;

public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.17.0.3", 6379);

        jedis.set("hello", "world");

        System.out.println(jedis.get("hello"));
    }
}
