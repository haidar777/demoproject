package org.demo.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;
import org.demo.fulfilmentprocess.constants.DemoFulfilmentProcessConstants;

public class DemoFulfilmentProcessManager extends GeneratedDemoFulfilmentProcessManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( DemoFulfilmentProcessManager.class.getName() );
	
	public static final DemoFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (DemoFulfilmentProcessManager) em.getExtension(DemoFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
