package kf.ai.randommemeapi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
@RestController // This is a REST API
public class RandomMemeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomMemeApiApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("platformName", "LINUX");
        WebDriver driver = new RemoteWebDriver(new URL("http://selenium-chrome:4444/wd/hub"), chromeOptions);
        driver.get("https://www.google.com");
        String title = driver.getTitle();

        String pageSource = driver.getPageSource();
        driver.quit();
        return pageSource;
    }
}
