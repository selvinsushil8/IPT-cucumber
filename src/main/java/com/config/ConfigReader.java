package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties pro;

	public ConfigReader() throws Throwable {

		File f = new File("D:\\Selenium2024\\IPTcucmuber\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
		pro = new Properties();
		pro.load(fis);
	}

	public String getUrl() {
		String prop = pro.getProperty("url");
		return prop;

	}

}
