package base.dbunit;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.triadworks.dbunit.DbUnitManager;
import br.com.triadworks.dbunit.vendors.postgresql.PostgreSqlDbUnitManagerImpl;

@Component
public class DbUnitManagerFactory {

	private final DataSource dataSource;

	@Autowired
	public DbUnitManagerFactory(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Bean
	public DbUnitManager dbUnitManager() {
		DbUnitManager dbUnitManager = new PostgreSqlDbUnitManagerImpl(dataSource);
		return dbUnitManager;
	}
	
}
