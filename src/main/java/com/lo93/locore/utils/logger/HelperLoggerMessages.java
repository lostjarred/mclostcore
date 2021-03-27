package com.lo93.locore.utils.logger;

import org.apache.logging.log4j.Logger;

public class HelperLoggerMessages {
	private Logger logger;
	private String modid;
	
	HelperLoggerMessages(Logger loggerin, String modidin){
		this.logger = loggerin;
		this.modid = modidin;
	}
	
	public void logMsgHeartBeat() {
		logger.debug(modid + ": is Loading");
	}
}
