/**
 * 
 */
package com.example.demo.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * File： DruidConfig.java<br>
 * Title: <br>
 * Description: druid 数据源配置<br>
 * Company: <br>
 * 
 * @author
 * @version
 */
@Configuration
public class DruidConfig {

	private static final Logger log=LoggerFactory.getLogger(DruidConfig.class);
	
	@Value("${spring.datasource.dbUrl}")
	private String dbUrl;

	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;

	@Value("${spring.datasource.username}")
	private String userName;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.initialSize}")
	private int initialSize;

	@Value("${spring.datasource.minIdle}")
	private int minIdle;

	@Value("${spring.datasource.maxActive}")
	private int maxActive;

	@Value("${spring.datasource.maxWait}")
	private int maxWait;

	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;

	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;

	@Value("${spring.datasource.validationQuery}")
	private String validationQuery;

	@Value("${spring.datasource.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${spring.datasource.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${spring.datasource.testOnReturn}")
	private boolean testOnReturn;

	@Value("${spring.datasource.poolPreparedStatements}")
	private boolean  poolPreparedStatements;

	@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
	private int maxPoolPreparedStatementPerConnectionSize;

	@Value("${spring.datasource.filters}")
	private String filters;

	@Value("${spring.datasource.connectionProperties}")
	private String connectionProperties;

	/**
	 * 数据源配置
	 * @return DruidDataSource datasource
	 * @author
	 */
	@Bean(initMethod = "init", destroyMethod = "close")
	@Primary
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();
		datasource.setUrl(dbUrl);
		datasource.setDriverClassName(driverClassName);
		datasource.setUsername(userName);
		datasource.setPassword(password);
		
		/*data source pool configuration*/
		datasource.setInitialSize(initialSize);
		datasource.setMinIdle(minIdle);
		datasource.setMaxActive(maxActive);
		datasource.setMaxWait(maxWait);
		datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		datasource.setValidationQuery(validationQuery);
		datasource.setTestWhileIdle(testWhileIdle);
		datasource.setTestOnBorrow(testOnBorrow);
		datasource.setTestOnReturn(testOnReturn);
		datasource.setPoolPreparedStatements(poolPreparedStatements);
		datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
		try {
			datasource.setFilters(filters);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("druid configuration initialization filter", e);
			//e.printStackTrace();
		}
		datasource.setConnectionProperties(connectionProperties);
		return datasource;
	}
	
	/**
	 *  注册一个StatViewServlet 相当于在web.xml中声明了一个servlet
	 * @return ServletRegistrationBean reg
	 * @author
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletRegistrationBean duridServlet(){
		ServletRegistrationBean reg=new ServletRegistrationBean();
		reg.setServlet(new StatViewServlet());
		reg.addUrlMappings("/monitor/druid/*");
		/*允许登录的ip*/
		reg.addInitParameter("allow", "127.0.0.1");	
		/*设置登录durid 页面的账号密码*/
		reg.addInitParameter("loginUserName", "root");
		reg.addInitParameter("loginPassword", "root");
		/*禁用页面数据 reset all功能*/
		reg.addInitParameter("resetEnable", "flase");
		return reg;
	}
	
	/**
	 * 注册一个：filterRegistrationBean 相当于在web.xml中声明了一个Filter
	 * @return FilterRegistrationBean druidStatFilter
	 * @author
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean druidStatFilter(){
		FilterRegistrationBean druidStatFilter=new FilterRegistrationBean();
		
		druidStatFilter.setFilter(new WebStatFilter());
		/*添加过滤规则*/
		druidStatFilter.addUrlPatterns("/*");
		/*监控选项过滤器*/
		druidStatFilter.addInitParameter("DruidWebStatFilter", "/*");
		/*添加需要忽略*/
		druidStatFilter.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/monitor/druid/*");
		/*配置profileEnable能够监控单个url调用的sql列表*/
		druidStatFilter.addInitParameter("proFileEnable", "true");
		/*当前用户cookie*/
		druidStatFilter.addInitParameter("principalCookieName", "USER_COOKIE");
		/*当前用户session*/
		druidStatFilter.addInitParameter("principalCookieName", "USER_SESSION");
		return druidStatFilter;
	}
}
