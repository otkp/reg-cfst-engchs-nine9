package org.epragati.controller;


import org.apache.commons.lang3.StringUtils;
import org.epragati.constants.MessageKeys;
import org.epragati.service.EngineChassisNoService;
import org.epragati.util.AppMessages;
import org.epragati.util.GateWayResponse;
import org.epragati.vo.EngineChassisNoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author krishnarjun.pampana
 *
 */

@CrossOrigin
@RestController
public class EngineChassisNoController {

	private static final Logger logger = LoggerFactory.getLogger(EngineChassisNoController.class);

	@Autowired
	private EngineChassisNoService engineChassisNoService;

	@Autowired
	private AppMessages appMessages;
	

	@PostMapping(value = "engineChassisNoValidation", produces = { MediaType.APPLICATION_JSON_VALUE })
	public GateWayResponse<String> chassisEngineNoValidation(@RequestBody EngineChassisNoVO engineChassisNoVO ) {

		String engineChassisNo = engineChassisNoService.engineChassisNoValidation(engineChassisNoVO);
		if(StringUtils.isNotBlank(engineChassisNo)){
			return new GateWayResponse<>(HttpStatus.OK,engineChassisNo,appMessages.getResponseMessage(MessageKeys.MESSAGE_SUCCESS));	
		}
		logger.debug(appMessages.getResponseMessage(MessageKeys.SVS_CFST_SERVER_DOWN));
		return new GateWayResponse<>(HttpStatus.BAD_REQUEST,appMessages.getResponseMessage(MessageKeys.SVS_CFST_SERVER_DOWN));
	}
	@GetMapping(value = "ecvSearchTest", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
 public GateWayResponse<?> getWarUpStatus(@RequestHeader("Authorization") String authString) {
		
		if(StringUtils.isNoneEmpty(authString)){
			if(authString.equals("Abcdf77878RhhghJyghjgUhsdhgshfgN")){
				return new GateWayResponse<>(HttpStatus.OK, "Success");
			}
		}
		return new GateWayResponse<>(HttpStatus.OK, "UnAuthorized Requset");
	}
}
