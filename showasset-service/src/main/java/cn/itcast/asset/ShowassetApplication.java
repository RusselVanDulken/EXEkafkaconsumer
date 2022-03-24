package cn.itcast.asset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 7w1st22
 * @date 2022/3/22	当前系统日期
 * @time 13:48	当前系统时间
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ShowassetApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowassetApplication.class, args);
    }
}
