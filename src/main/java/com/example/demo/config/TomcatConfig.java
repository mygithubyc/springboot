/**
 * 
 */
package com.example.demo.config;

import javax.servlet.MultipartConfigElement;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

/**
 * File： TomcatConfig.java<br>
 * Title: <br>
 * Description: 嵌入式Tomcat配置<br>
 * Company: <br>
 * 
 * @author
 * @version
 */
@Configuration
public class TomcatConfig {

	@Value("${spring.server.port}")
	private int serverPort;

	@Value("${spring.server.acceptorThreadCount}")
	private String acceptorThreadCount;

	@Value("${spring.server.minSpareThreads}")
	private String minSpareThreads;

	@Value("${spring.server.maxSpareThreads}")
	private String maxSpareThreads;

	@Value("${spring.server.maxThreads}")
	private String maxThreads;

	@Value("${spring.server.maxConnections}")
	private String maxConnections;

	@Value("${spring.server.connectionTimeout}")
	private String connectionTimeout;

	@Value("${spring.server.protcol}")
	private String protcol;

	@Value("${spring.server.redirectPort}")
	private String redirectPort;

	@Value("${spring.server.compression}")
	private String compression;

	@Value("${spring.server.maxFileSize}")
	private DataSize maxFileSize;

	@Value("${spring.server.maxRequestSize}")
	private DataSize maxRequestSize;

	/**
	 * 
	 * File： TomcatConfig.java<br>
	 * Title: <br>
	 * Description: 通过TomcatConnectorCustomizer接口实现对嵌入Tomcat的自定义，默认http连接<br>
	 * Company: <br>
	 * 
	 * @author
	 * @version
	 */
	public class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer {

		/**
		 * @param connector
		 * @author
		 */
		@Override
		public void customize(Connector connector) {
			// TODO Auto-generated method stub
			connector.setPort(serverPort);
			connector.setAttribute("acceptorThreadCount", acceptorThreadCount);
			connector.setAttribute("minSpareThreads", minSpareThreads);
			connector.setAttribute("maxSpareThreads", maxSpareThreads);
			connector.setAttribute("maxThreads", maxThreads);
			connector.setAttribute("maxConnections", maxConnections);
			connector.setAttribute("connectionTimeout", connectionTimeout);
			connector.setAttribute("protcol", protcol);
			connector.setAttribute("redirectPort", redirectPort);
			connector.setAttribute("compression", compression);
		}

	}

	/**
	 * web服务器工厂，，用来创建tomcat服务器
	 * 
	 * @return
	 * @author
	 */
	@Bean
	public ServletWebServerFactory servletContainer() {
		// TODO Auto-generated method stub
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
		return tomcat;
	}

	/**
	 * 文件上传大小设置
	 * 
	 * @return
	 * @author
	 */
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		// TODO Auto-generated method stub
		MultipartConfigFactory factory = new MultipartConfigFactory();
		/*单个文件大小*/
		factory.setMaxFileSize(maxFileSize);
		/*总文件大小*/
		factory.setMaxRequestSize(maxRequestSize);
		return factory.createMultipartConfig();
	}
}
