package com.sourcegraph.depuser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jUser {
    public void callLog() {
        Logger log = LogManager.getRootLogger();
        log.debug("DEBUG");
        log.info("INFO");
        log.warn("WARN");
        log.error("ERROR");
    }
}
