package org.demo.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;
import org.demo.core.constants.DemoCoreConstants;

public class DemoCoreManager extends GeneratedDemoCoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( DemoCoreManager.class.getName() );
	
	public static final DemoCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (DemoCoreManager) em.getExtension(DemoCoreConstants.EXTENSIONNAME);
	}
	
}
