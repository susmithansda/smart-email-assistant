package com.email.writer.app;
import com.email.writer.app.EmailRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(originPatterns = {
        "http://localhost:*",
        "https://mail.google.com",
        "chrome-extension://*"
})
@AllArgsConstructor
public class EmailGeneratorController {
    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        String response = emailGeneratorService.generateEmailResponse(emailRequest);
        return ResponseEntity.ok(response);
    }
}