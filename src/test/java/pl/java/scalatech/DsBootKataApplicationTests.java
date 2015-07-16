package pl.java.scalatech;

import java.sql.SQLException;

import javax.sql.DataSource;

import lombok.extern.slf4j.Slf4j;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DsBootKataApplication.class)
@Slf4j
public class DsBootKataApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        Assertions.assertThat(dataSource).isNotNull();
        log.info("url : {} - >  {}", dataSource.getConnection().getMetaData().getURL(), dataSource.getConnection().getMetaData().getDriverName());

    }
}
