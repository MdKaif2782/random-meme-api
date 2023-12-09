package kf.ai.randommemeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // This is a REST API
public class RandomMemeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomMemeApiApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "{\nmessage: Hello World! and fuck you too\n}";
    }

}
