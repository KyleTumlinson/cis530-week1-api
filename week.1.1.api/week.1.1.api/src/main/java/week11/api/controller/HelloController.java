/*
Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package week11.api.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.LinkedHashMap;

@RestController
@Component
public class HelloController {
    @GetMapping("/api/hello")
    public String sayHello()
    {
        return "Hello Welcome to my first API";
    }

    @GetMapping("/api/info")
    public Map<String, Object> info()
    {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("course", "CIS 530");
        data.put("week", 1);
        data.put("technology", "Spring Boot 4");
        return data;
    }
}
