package org.pentaho.cdf;

import org.pentaho.platform.api.engine.IPentahoSession;

public class CdfSettings  {
	
	
	private static CdfSettings cdfSettings = null;
	
	static CdfSettings getInstance() {
		if(cdfSettings == null) cdfSettings = new CdfSettings();
		return cdfSettings;
	}
	
	public void setValue(String key, Object obj, IPentahoSession userSession){
		CdfSessionCache.getInstance().putInCdfSessionCache(userSession, key, obj);
	}
	
	public Object getValue(String key, IPentahoSession userSession){
		return CdfSessionCache.getInstance().getFromCdfSessionCache(userSession, key);
	}
	
}
