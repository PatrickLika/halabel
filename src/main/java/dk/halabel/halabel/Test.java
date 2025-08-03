package dk.halabel.halabel;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping()
public class Test {

    @GetMapping("/test")

    public String getMapping() {
        System.out.println("test");
        return "OK";
    }
}
