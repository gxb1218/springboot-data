package com.gxb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import javax.xml.transform.Source;
import java.sql.Connection;

@SpringBootTest
class SpringbootDataApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws Exception{
        System.err.println(dataSource.getClass());
        //创建数据库连接
        Connection connection =dataSource.getConnection();
        System.err.println("connection="+connection);
        //关闭
        connection.close();
    }

}
