/*
Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package week11.api.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.Map;
import java.util.LinkedHashMap;

@RestController
@Component
public class HelloController {

    // A controller mapping for a hello message mapped to localhost:8080/api/hello
    @GetMapping("/api/hello")
    public String sayHello()
    {
        return "Welcome to CIS 530 - Week 1 REST API!";
    }

    /* A controller mapping for mapping object retrieval mapped to localhost:8080/api/info
        This gets a very simple set of information in a json format
     */
    @GetMapping("/api/info")
    public Map<String, Object> info()
    {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("university", "Bellevue University");
        data.put("semester", "Fall");
        data.put("instructor", "Krasso");
        data.put("course", "CIS 530");
        data.put("week", 1);
        data.put("technology", "Spring Boot 4");
        LocalTime currentTime = LocalTime.now();
        data.put("time", currentTime);
        return data;
    }
}
