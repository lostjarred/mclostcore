package com.lo93.locore.utils.logger;

import org.apache.logging.log4j.Logger;

public class HelperLoggerMessages {
	private Logger logger;
	private String modid;
	
	public HelperLoggerMessages(Logger loggerin, String modidin){
		this.logger = loggerin;
		this.modid = modidin;
	}
	
	public void logMsgHeartBeat() {
		logger.debug(modid + ": is Loading");
	}
	
	public void logMsgRegModelstart() {
		logger.debug(modid + ": Model Registion Start");
	}
	
	public void logMsgRegModelend() {
		logger.debug(modid + ": Model Registion End");
	}
	
	public void logMsgRegItemstart() {
		logger.debug(modid + "Item Registion Start");
	}
	
	public void logMsgRegItemend() {
		logger.debug(modid + ": Item Registion End");
	}
	
}
