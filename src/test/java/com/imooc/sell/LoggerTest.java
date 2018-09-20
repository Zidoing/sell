package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 20/09/2018
 * Time: 22:00
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {


    @Test
    public void test1() {
        String name = "imooc";
        log.debug("debug");
        log.info("info" + name);
        log.error("error");
    }
}