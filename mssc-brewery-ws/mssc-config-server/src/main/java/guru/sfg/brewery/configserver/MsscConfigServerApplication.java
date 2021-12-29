package guru.sfg.brewery.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Marcelo dos Santos
 */
@EnableConfigServer
@SpringBootApplication
public class MsscConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscConfigServerApplication.class, args);
    }
}
