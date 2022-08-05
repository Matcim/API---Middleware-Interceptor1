package EsercizioMiddleware1.EsMiddleware1.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.net.http.HttpHeaders;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/time")
public class BasicController {


    @GetMapping
     public LocalDateTime getDateTime(){
        return LocalDateTime.now();
    }
}
