package com.ofss.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;

import com.ofss.processor.CompileException;

public final class ApplicationGlobal {

	private static ApplicationGlobal instance = null;
	private static Properties props_12_0_1 = null;
	private static Properties props_12_0_2 = null;
	private static Properties props_12_0_3 = null;

	public static synchronized ApplicationGlobal getInstance() {
		return instance;
	}

	public static void initInstance() throws IOException {
		if (instance == null) {
			instance = new ApplicationGlobal();
		}
	}

	private ApplicationGlobal() throws IOException {
		loadParams();
	}

	private void loadParams() throws IOException {
		InputStream instr1, instr2, instr3 = null;
		try {
			props_12_0_1 = new Properties();
			props_12_0_2 = new Properties();
			props_12_0_3 = new Properties();

			instr1 = Thread.currentThread().getContextClassLoader().getResourceAsStream("12.0.1_files.properties");
			instr2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("12.0.2_files.properties");
			instr3 = Thread.currentThread().getContextClassLoader().getResourceAsStream("12.0.3_files.properties");

			props_12_0_1.load(instr1);
			props_12_0_2.load(instr2);
			props_12_0_3.load(instr3);
		} catch (Exception e) {
			// e.printStackTrace();
			try {
				throw new CompileException("property file not found in the classpath");
			} catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static Properties getProps(String version) {

		switch (version) {
		case "12.0.1":
			return props_12_0_1;
		case "12.0.2":
			return props_12_0_2;
		case "12.0.3":
			return props_12_0_3;
		}
		return null;
	}
}
