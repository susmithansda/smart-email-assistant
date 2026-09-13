package com.email.writer.app;

import com.email.writer.app.EmailRequest;
import org.springframework.stereotype.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@Service
public class EmailGeneratorService {
    public String generateEmailResponse(EmailRequest emailRequest){

        Client client = new Client();
        String prompt = buildPrompt(emailRequest);


        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-3.5-flash-lite",
                        prompt,
                        null
                );
        return response.text();
    }

    private String buildPrompt(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a professional email reply for the following email content ." +
                " Please don't generate a subject line. ");
        if(emailRequest.getTone() != null && !emailRequest.getTone().isBlank() )
            prompt.append(" Use a : ").append(emailRequest.getTone()).append(" tone.");
        prompt.append("\nOriginal email : \n").append(emailRequest.getEmailContent());
        return prompt.toString();
    }
}