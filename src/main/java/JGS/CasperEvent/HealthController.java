package JGS.CasperEvent;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<String> health(){
        return ResponseEntity.ok("Hello World!");
    }
}

