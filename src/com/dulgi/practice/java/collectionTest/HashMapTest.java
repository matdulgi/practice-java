package com.dulgi.practice.java.collectionTest;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<TestKey,Object> map = new HashMap<>();
        TestKey testKey1 = new TestKey();
        TestKey testKey2 = new TestKey();
        TestKey testKey3 = new TestKey();
        TestKey testKey4 = new TestKey();

        map.put(testKey1, new Object());
        map.put(testKey2, new Object());
        map.put(testKey3, new Object());
        map.put(testKey4, new Object());

        System.out.println(map.get(testKey4));
    }

    static class TestKey {
    }
}


