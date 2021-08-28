package roman.mysan.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/")
public class AppController {

    @GetMapping("/hello")
    public String getHello() {
        return "HEYA";
    }
}
