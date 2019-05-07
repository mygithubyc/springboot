/**
 * 
 */
package com.example.demo.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * File： MybatisConfig.java<br>
 * Title: <br>
 * Description: mybatis 配置文件<br>
 * Company: <br>
 * 
 * @author
 * @version
 */
@Configuration
public class MybatisConfig {

	/**
	 * mybatis 配置
	 * @return
	 * @author
	 */
	public ConfigurationCustomizer configurationCustomizer() {
		return new ConfigurationCustomizer() {

			@Override
			public void customize(org.apache.ibatis.session.Configuration configuration) {
				// TODO Auto-generated method stub
				/*自动使用驼峰命名属性映射字段   userId    user_id*/
				configuration.setMapUnderscoreToCamelCase(true);
				/*使用列别名替换列名 select user as User*/
				configuration.setUseColumnLabel(true);
			}
		};
	}
}
