package com.haoxuan.test;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp/WEB-INF/web.xml")
@ContextConfiguration(locations = {"classpath:springmvc.xml",
        "classpath:applicationContext.xml"})
public class BaseTest {
}
