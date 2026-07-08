package com.agenticidentity.agentruntime.runtime;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AgentRuntimeService {

    private final ChatClient chatClient;

    public AgentRuntimeService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String think(String prompt) {
        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }
}