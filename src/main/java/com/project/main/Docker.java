package com.project.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Docker {
	@GetMapping("/test")
    public String getData()
    {
        return "Continuous Monitoring on Docker";
    }

}
