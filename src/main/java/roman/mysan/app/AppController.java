package roman.mysan.app;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class AppController {

    private final AppRepository appRepository;

    @GetMapping("/hello")
    public String getHello() {
        return "HEYA";
    }

    @PostMapping("/hello")
    public void postHello(@RequestParam String hello) {
        appRepository.save(new AppEntity(null, hello));
    }

    @GetMapping("/hellos")
    public List<String> getHellos() {
        return appRepository.findAll()
                .stream()
                .map(AppEntity::getHello)
                .collect(Collectors.toList());
    }
}
