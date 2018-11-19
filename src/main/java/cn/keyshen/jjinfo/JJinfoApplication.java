package cn.keyshen.jjinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class JJinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JJinfoApplication.class, args);
    }
}
