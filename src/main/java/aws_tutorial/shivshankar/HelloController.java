package aws_tutorial.shivshankar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to AWS tutorial by Shivshankar";
    }

    @GetMapping("/product")
    public String product(){
        return "This is product page";
    }

    @GetMapping("/health")
    public String health() {
        return "Everything is OK";
    }
}

