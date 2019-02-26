package com.train.springboot.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06DataJdbcApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        /*
            https://izhong.me/index.php/archives/78/
            spring boot2.0已经将HikariCP做为了默认的数据源链接池
         */

        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
    }

}
