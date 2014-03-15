package kr.co.tdc.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * Spring Context Configuration Settings Abstract Class for Test
 * 
 * @author jhcha
 * @since 1.0
 */
@ContextConfiguration(locations={
	"/context/appContext.xml",
	"/context/appContext-mybatis.xml",
	"file:src/main/webapp/**/*-context.xml"
})
public abstract class AbstractTestSetting extends AbstractTransactionalJUnit4SpringContextTests{
	protected Logger log = LoggerFactory.getLogger(this.getClass());
}
