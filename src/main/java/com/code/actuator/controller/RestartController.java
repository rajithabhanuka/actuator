package com.code.actuator.controller;

import com.code.actuator.ActuatorApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestartController {

    @PostMapping("/restart")
    public void restart() {
        ActuatorApplication.restart();
    }

}