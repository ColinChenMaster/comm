package com.dubbo.handle.register;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.dubbo.utils.invoke.ReflectionHandle;
import com.vipkid.service.ChannelService;

/**
 * 
 * @author VIPKID
 *
 */
@Service
public class ChannelServiceImpl extends ChannelService implements
		GenericService {
	
	@Override
	public Object $invoke(String method, String[] parameterTypes, Object[] args)
			throws GenericException {
		// TODO Auto-generated method stub
		return ReflectionHandle.$invoke(this, method, parameterTypes, args);
	}

}
