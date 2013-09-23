package base;
 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.triadworks.dbunit.DbUnitManager;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    	"classpath:applicationContext.xml",
	"classpath:applicationContext-test.xml"
})
@Transactional
public abstract class SpringIntegrationTestCase {
 
	@Autowired
	protected DbUnitManager dbUnitManager;
	
}