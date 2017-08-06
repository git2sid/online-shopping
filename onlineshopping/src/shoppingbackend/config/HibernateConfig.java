package shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
//mport org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="{shoppingbackend.dto}")
@EnableTransactionManagement
public class HibernateConfig {

	private static final String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshopping";
	private static final String DATABASE_DRIVER="org.h2.Driver";
	private static final String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private static final String DATABASE_USERNAME="sid";
	private static final String DATABASE_PASSWORD="";
	
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource dataSource =new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
		
	}
	//always take care of the hibernate version u are using m using 5 so my Builder will also be of 5
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder builder= new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("shoppingbackend.dto");
	
	return builder.buildSessionFactory();
	}
	private Properties getHibernateProperties() {
		Properties properties=new Properties();
		properties.put("hibernate.dialect",DATABASE_DIALECT);
		properties.put("hibernate.show_aql","true");
		properties.put("hibernate.format_sql","true");
		
		return properties;
		
	}
	
	

	@Bean
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
		HibernateTransactionManager hibernateTransactionManager= new HibernateTransactionManager(sessionFactory);
return  hibernateTransactionManager;
}
}
