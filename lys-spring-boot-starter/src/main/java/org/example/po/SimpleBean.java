package org.example.po;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author lys
 * @since 2024/6/21 9:25
 */
@EnableConfigurationProperties(SimpleBean.class)
@ConfigurationProperties(prefix = "simple-bean")
public class SimpleBean {

	private String id;

	private String name;

	@Override
	public String toString() {
		return "SimpleBean{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
