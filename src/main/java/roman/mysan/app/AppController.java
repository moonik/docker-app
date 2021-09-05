package roman.mysan.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class AppController {

    @GetMapping("/hello")
    public String getHello() {
        return "HEYA";
    }
}
