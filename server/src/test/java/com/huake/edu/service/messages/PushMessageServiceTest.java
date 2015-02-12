package com.huake.edu.service.messages;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringContextTestCase;

import com.huake.push.entity.PushMessage;
import com.huake.push.service.PushMessageProducer;

@ContextConfiguration(locations = { "/applicationContext.xml", "/applicationContext-jms.xml" })
public class PushMessageServiceTest extends SpringContextTestCase{

	@Autowired
	private PushMessageProducer pushMessageProducer;
	
	@Test
	public void testPush() throws Exception{
		PushMessage pm = new PushMessage();
		pm.setTitle("hello");
		pushMessageProducer.sendQueue(pm);
	}
}
