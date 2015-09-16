package hg.asset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"hg.asset.*"})
public class HgAssetRegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(HgAssetRegistrationApplication.class, args);
    }
}
