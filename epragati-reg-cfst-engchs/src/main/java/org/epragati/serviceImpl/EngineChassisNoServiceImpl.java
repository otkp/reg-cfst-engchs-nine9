package org.epragati.serviceImpl;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.commons.logging.LogFactory;
import org.epragati.service.EngineChassisNoService;
import org.epragati.vo.EngineChassisNoVO;
import org.springframework.stereotype.Service;
import org.tempuri.EngineNoChassisNoCheck;
import org.tempuri.EngineNoChassisNoCheckLocator;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Service
public class EngineChassisNoServiceImpl implements EngineChassisNoService {
	
	
	@Override
	public String engineChassisNoValidation(EngineChassisNoVO engineChassisNoVO) {
		System.setProperty(LogFactory.FACTORY_PROPERTY, LogFactory.FACTORY_DEFAULT);
		EngineNoChassisNoCheck check = new EngineNoChassisNoCheckLocator();
		try {
			String result = check.getEngineNoChassisNoCheckSoap().checkEngineNoChassisNoOTSI(engineChassisNoVO.getEngineNo(),engineChassisNoVO.getChassisNo());
			return result;
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}

}
