package org.motechproject.spike.log.service.test.controller;

import org.motechproject.spike.log.service.MotechLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class LogServiceTestController {

    @Autowired
    @Qualifier("motechLogService")
    private MotechLogService logService;

    @RequestMapping("/log")
    @ResponseBody
    public String log() {
        logService.error("...........................................");
        logService.debug("Debug log for {0}", "LogServiceTest bundle");
        logService.info("Info log for {0}", "LogServiceTest bundle");
        logService.warn("Warn log for {0}", "LogServiceTest bundle");
        logService.error("Error log for {0}", "LogServiceTest bundle");
        logService.error("...........................................");

        return "[LogServiceTest] Logged at " + new Date();
    }
}
