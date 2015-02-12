package com.huake.edu;

import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;
@ContextConfiguration(locations = { "/applicationContext.xml" })

public class BaseSpringTest extends SpringTransactionalTestCase {

}
