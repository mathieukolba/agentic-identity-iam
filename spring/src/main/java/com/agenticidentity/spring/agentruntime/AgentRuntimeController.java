package com .agenticidentity.spring.agentruntime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentRuntimeController {

    private final AgentRuntimeService agentRuntimeService;

    public AgentRuntimeController(AgentRuntimeService agentRuntimeService) {
        this.agentRuntimeService = agentRuntimeService;
    }

    @GetMapping("/think")
    public String think(@RequestParam String prompt) {
        return agentRuntimeService.think(prompt);
    }
}