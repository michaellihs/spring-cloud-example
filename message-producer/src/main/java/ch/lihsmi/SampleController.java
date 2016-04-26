package ch.lihsmi;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RefreshScope
@RestController
class SampleController {

    @Value("${message}")
    String name = "World";

    @RequestMapping("/")
    public String home() {
        return "Hello " + name;
    }

}