package com.curso.ecommerce.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.*;

@Service
public class WatsonAssistantService {
    /*
    @Value("${watson.assistant.apiKey}")
    private String apiKey;

    @Value("${watson.assistant.url}")
    private String apiUrl;

    @Value("${watson.assistant.version}")
    private String apiVersion;

    @Value("${watson.assistant.assistantId}")
    private String assistantId;

    private Assistant assistant;

    @PostConstruct
    public void init() {
        IamAuthenticator authenticator = new IamAuthenticator(apiKey);
        assistant = new Assistant(apiVersion, authenticator);
        assistant.setServiceUrl(apiUrl);
    }

    public String sendMessage(String message) {
        MessageInput input = new MessageInput.Builder()
                .messageType("text")
                .text(message)
                .build();

        MessageOptions options = new MessageOptions.Builder()
                .assistantId(assistantId)
                .input(input)
                .build();

        MessageResponse response = assistant.message(options).execute().getResult();
        return response.getOutput().getGeneric().get(0).toString();
    }*/
}