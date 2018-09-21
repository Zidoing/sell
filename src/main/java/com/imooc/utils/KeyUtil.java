package com.imooc.utils;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 21/09/2018
 * Time: 22:55
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();

        System.currentTimeMillis();

        int number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);

    }
}