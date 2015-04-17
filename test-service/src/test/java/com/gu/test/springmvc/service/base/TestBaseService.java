package com.gu.test.springmvc.service.base;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>注释</p>
 * @author  bobogu
 * @version $Id: TestBaseService.java, v 0.1 2015年4月17日 下午5:33:23 gushunbin Exp $
 */
@ContextConfiguration(locations = { "/spring/common-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestBaseService {
    protected static final Logger logger = LoggerFactory.getLogger(TestBaseService.class);
}
