package common.api;

import common.conf.Type;

public class ClimateAPI {

	private String restClient(){
		String addr = Type.REGION_REAL_API.getValue();
		String serviceKey = Type.SERVICE_KEY.getValue();
		
		return addr;
	}
}
