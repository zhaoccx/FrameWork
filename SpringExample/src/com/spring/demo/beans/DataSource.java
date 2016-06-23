/**
 * 
 */
package com.spring.demo.beans;

import java.util.Properties;

/**
 * @author zhaocc
 *
 */
public class DataSource {

	private Properties properties;

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * 
	 */
	public DataSource() {
		super();
	}

	/**
	 * @param properties
	 */
	public DataSource(Properties properties) {
		super();
		this.properties = properties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataSource [properties=" + properties + "]";
	}

}
