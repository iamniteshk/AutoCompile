package com.ofss.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Map.Entry;

import javax.servlet.ServletException;

import com.ofss.processor.CompileException;

public final class ApplicationGlobal {

	private static ApplicationGlobal instance = null;

	Properties props_12_0_1ELCMController = null;
	Properties props_12_0_1ELCMDao = null;
	Properties props_12_0_1ELCMDto = null;
	Properties props_12_0_1ELCMEJB = null;
	Properties props_12_0_1ELCMEntities = null;
	Properties props_12_0_1ELCMProcess = null;
	Properties props_12_0_1ELCMUtility = null;
	Properties props_12_0_1ELGateway = null;
	Properties props_12_0_1ELGatewayClient = null;
	Properties props_12_0_1ELWebServices = null;
	Properties props_12_0_1FCJBatch = null;
	Properties props_12_0_1FCJBpel = null;
	Properties props_12_0_1FCJCoreDAOOracle = null;
	Properties props_12_0_1FCJGeneralEJB = null;
	Properties props_12_0_1FCJMBean = null;
	Properties props_12_0_1FCJNeoWeb = null;
	Properties props_12_0_1FCJScheduler = null;
	Properties props_12_0_1FCJSMS = null;
	Properties props_12_0_1FCJUtility = null;

	static HashMap<String, String> hash_12_0_1ELCMController = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELCMDao = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELCMDto = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELCMEJB = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELCMEntities = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELCMProcess = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELCMUtility = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELGateway = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELGatewayClient = new HashMap<>();
	static HashMap<String, String> hash_12_0_1ELWebServices = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJBatch = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJBpel = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJCoreDAOOracle = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJGeneralEJB = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJMBean = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJNeoWeb = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJScheduler = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJSMS = new HashMap<>();
	static HashMap<String, String> hash_12_0_1FCJUtility = new HashMap<>();

	Properties props_12_0_2ELCMController = null;
	Properties props_12_0_2ELCMDao = null;
	Properties props_12_0_2ELCMDto = null;
	Properties props_12_0_2ELCMEJB = null;
	Properties props_12_0_2ELCMEntities = null;
	Properties props_12_0_2ELCMProcess = null;
	Properties props_12_0_2ELCMUtility = null;
	Properties props_12_0_2ELGateway = null;
	Properties props_12_0_2ELGatewayClient = null;
	Properties props_12_0_2ELWebServices = null;
	Properties props_12_0_2FCJBatch = null;
	Properties props_12_0_2FCJBpel = null;
	Properties props_12_0_2FCJCoreDAOOracle = null;
	Properties props_12_0_2FCJGeneralEJB = null;
	Properties props_12_0_2FCJMBean = null;
	Properties props_12_0_2FCJNeoWeb = null;
	Properties props_12_0_2FCJScheduler = null;
	Properties props_12_0_2FCJSMS = null;
	Properties props_12_0_2FCJUtility = null;

	static HashMap<String, String> hash_12_0_2ELCMController = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELCMDao = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELCMDto = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELCMEJB = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELCMEntities = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELCMProcess = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELCMUtility = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELGateway = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELGatewayClient = new HashMap<>();
	static HashMap<String, String> hash_12_0_2ELWebServices = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJBatch = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJBpel = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJCoreDAOOracle = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJGeneralEJB = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJMBean = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJNeoWeb = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJScheduler = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJSMS = new HashMap<>();
	static HashMap<String, String> hash_12_0_2FCJUtility = new HashMap<>();

	Properties props_12_0_3ELCMCommon = null;
	Properties props_12_0_3ELCMDto = null;
	Properties props_12_0_3ELCMEJB = null;
	Properties props_12_0_3ELCMEntities = null;
	Properties props_12_0_3ELCMKernel = null;
	Properties props_12_0_3ELCMKernelJpa = null;
	Properties props_12_0_3ELCMKernelSQLJ = null;
	Properties props_12_0_3ELCMUtility = null;
	Properties props_12_0_3ELCMGateway = null;
	Properties props_12_0_3ELCMWeb = null;
	Properties props_12_0_3FCGateway = null;
	Properties props_12_0_3FCJBatch = null;
	Properties props_12_0_3FCJBpel = null;
	Properties props_12_0_3FCJCoreDAOOracle = null;
	Properties props_12_0_3FCJGeneralEJB = null;
	Properties props_12_0_3FCJMBean = null;
	Properties props_12_0_3FCJNeoWeb = null;
	Properties props_12_0_3FCJScheduler = null;
	Properties props_12_0_3FCJSMS = null;
	Properties props_12_0_3FCJUtility = null;
	Properties props_12_0_3FCJWebTab = null;

	static HashMap<String, String> hash_12_0_3ELCMCommon = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMDto = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMEJB = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMEntities = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMKernel = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMKernelJpa = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMKernelSQLJ = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMUtility = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMGateway = new HashMap<>();
	static HashMap<String, String> hash_12_0_3ELCMWeb = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCGateway = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJBatch = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJBpel = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJCoreDAOOracle = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJGeneralEJB = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJMBean = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJNeoWeb = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJScheduler = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJSMS = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJUtility = new HashMap<>();
	static HashMap<String, String> hash_12_0_3FCJWebTab = new HashMap<>();

	public static synchronized ApplicationGlobal getInstance() {
		System.out.println("inside getInstance");
		System.out.println(instance);
		return instance;
	}

	public static void initInstance() throws IOException {
		System.out.println("inside initInstance");
		System.out.println("checking instance");
		System.out.println(instance == null);
		if (instance == null) {
			instance = new ApplicationGlobal();
			System.out.println(instance);
		}
		try {
			instance.loadParams();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ApplicationGlobal(){
		
	}

	private void loadParams() throws IOException {
		loadParams1201();
		loadParams1202();
		loadParams1203();
	}

	private void loadParams1201() throws IOException {
		InputStream instr_12_0_1ELCMController = null;
		InputStream instr_12_0_1ELCMDao = null;
		InputStream instr_12_0_1ELCMDto = null;
		InputStream instr_12_0_1ELCMEJB = null;
		InputStream instr_12_0_1ELCMEntities = null;
		InputStream instr_12_0_1ELCMProcess = null;
		InputStream instr_12_0_1ELCMUtility = null;
		InputStream instr_12_0_1ELGateway = null;
		InputStream instr_12_0_1ELGatewayClient = null;
		InputStream instr_12_0_1ELWebServices = null;
		InputStream instr_12_0_1FCJBatch = null;
		InputStream instr_12_0_1FCJBpel = null;
		InputStream instr_12_0_1FCJCoreDAOOracle = null;
		InputStream instr_12_0_1FCJGeneralEJB = null;
		InputStream instr_12_0_1FCJMBean = null;
		InputStream instr_12_0_1FCJNeoWeb = null;
		InputStream instr_12_0_1FCJScheduler = null;
		InputStream instr_12_0_1FCJSMS = null;
		InputStream instr_12_0_1FCJUtility = null;

		try {
			props_12_0_1ELCMController = new Properties();
			props_12_0_1ELCMDao = new Properties();
			props_12_0_1ELCMDto = new Properties();
			props_12_0_1ELCMEJB = new Properties();
			props_12_0_1ELCMEntities = new Properties();
			props_12_0_1ELCMProcess = new Properties();
			props_12_0_1ELCMUtility = new Properties();
			props_12_0_1ELGateway = new Properties();
			props_12_0_1ELGatewayClient = new Properties();
			props_12_0_1ELWebServices = new Properties();
			props_12_0_1FCJBatch = new Properties();
			props_12_0_1FCJBpel = new Properties();
			props_12_0_1FCJCoreDAOOracle = new Properties();
			props_12_0_1FCJGeneralEJB = new Properties();
			props_12_0_1FCJMBean = new Properties();
			props_12_0_1FCJNeoWeb = new Properties();
			props_12_0_1FCJScheduler = new Properties();
			props_12_0_1FCJSMS = new Properties();
			props_12_0_1FCJUtility = new Properties();

			instr_12_0_1ELCMController = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELCMController.properties");
			instr_12_0_1ELCMDao = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELCMDao.properties");
			instr_12_0_1ELCMDto = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELCMDto.properties");
			instr_12_0_1ELCMEJB = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELCMEJB.properties");
			instr_12_0_1ELCMEntities = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELCMEntities.properties");
			instr_12_0_1ELCMProcess = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELCMProcess.properties");
			instr_12_0_1ELCMUtility = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELCMUtility.properties");
			instr_12_0_1ELGateway = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELGateway.properties");
			instr_12_0_1ELGatewayClient = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELGatewayClient.properties");
			instr_12_0_1ELWebServices = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1ELWebServices.properties");
			instr_12_0_1FCJBatch = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJBatch.properties");
			instr_12_0_1FCJBpel = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJBpel.properties");
			instr_12_0_1FCJCoreDAOOracle = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJCoreDAOOracle.properties");
			instr_12_0_1FCJGeneralEJB = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJGeneralEJB.properties");
			instr_12_0_1FCJMBean = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJMBean.properties");
			instr_12_0_1FCJNeoWeb = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJNeoWeb.properties");
			instr_12_0_1FCJScheduler = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJScheduler.properties");
			instr_12_0_1FCJSMS = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJSMS.properties");
			instr_12_0_1FCJUtility = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_1FCJUtility.properties");
			
			System.out.println("check 1");

			props_12_0_1ELCMController.load(instr_12_0_1ELCMController);
			props_12_0_1ELCMDao.load(instr_12_0_1ELCMDao);
			props_12_0_1ELCMDto.load(instr_12_0_1ELCMDto);
			props_12_0_1ELCMEJB.load(instr_12_0_1ELCMEJB);
			props_12_0_1ELCMEntities.load(instr_12_0_1ELCMEntities);
			props_12_0_1ELCMProcess.load(instr_12_0_1ELCMProcess);
			props_12_0_1ELCMUtility.load(instr_12_0_1ELCMUtility);
			props_12_0_1ELGateway.load(instr_12_0_1ELGateway);
			props_12_0_1ELGatewayClient.load(instr_12_0_1ELGatewayClient);
			props_12_0_1ELWebServices.load(instr_12_0_1ELWebServices);
			props_12_0_1FCJBatch.load(instr_12_0_1FCJBatch);
			props_12_0_1FCJBpel.load(instr_12_0_1FCJBpel);
			props_12_0_1FCJCoreDAOOracle.load(instr_12_0_1FCJCoreDAOOracle);
			props_12_0_1FCJGeneralEJB.load(instr_12_0_1FCJGeneralEJB);
			props_12_0_1FCJMBean.load(instr_12_0_1FCJMBean);
			props_12_0_1FCJNeoWeb.load(instr_12_0_1FCJNeoWeb);
			props_12_0_1FCJScheduler.load(instr_12_0_1FCJScheduler);
			props_12_0_1FCJSMS.load(instr_12_0_1FCJSMS);
			props_12_0_1FCJUtility.load(instr_12_0_1FCJUtility);
			
			System.out.println("check 2");
			System.out.println(ApplicationGlobal.getInstance());

			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELCMController")
					.entrySet()) {
				hash_12_0_1ELCMController.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 3");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELCMDao")
					.entrySet()) {
				hash_12_0_1ELCMDao.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 4");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELCMDto")
					.entrySet()) {
				hash_12_0_1ELCMDto.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 5");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELCMEJB")
					.entrySet()) {
				hash_12_0_1ELCMEJB.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 6");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELCMEntities")
					.entrySet()) {
				hash_12_0_1ELCMEntities.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 7");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELCMProcess")
					.entrySet()) {
				hash_12_0_1ELCMProcess.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 8");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELCMUtility")
					.entrySet()) {
				hash_12_0_1ELCMUtility.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 9");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELGateway")
					.entrySet()) {
				hash_12_0_1ELGateway.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 10");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELGatewayClient")
					.entrySet()) {
				hash_12_0_1ELGatewayClient.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 11");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "ELWebServices")
					.entrySet()) {
				hash_12_0_1ELWebServices.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 12");
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJBatch")
					.entrySet()) {
				hash_12_0_1FCJBatch.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJBpel")
					.entrySet()) {
				hash_12_0_1FCJBpel.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJCoreDAOOracle")
					.entrySet()) {
				hash_12_0_1FCJCoreDAOOracle.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJGeneralEJB")
					.entrySet()) {
				hash_12_0_1FCJGeneralEJB.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJMBean")
					.entrySet()) {
				hash_12_0_1FCJMBean.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJNeoWeb")
					.entrySet()) {
				hash_12_0_1FCJNeoWeb.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJScheduler")
					.entrySet()) {
				hash_12_0_1FCJScheduler.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJSMS")
					.entrySet()) {
				hash_12_0_1FCJSMS.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.1", "FCJUtility")
					.entrySet()) {
				hash_12_0_1FCJUtility.put((String) entry.getKey(), (String) entry.getValue());
			}
			System.out.println("check 1111");
		} catch (Exception e) {
			 e.printStackTrace();
			/*try {
				throw new CompileException("property file not found in the classpath");
			} catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
		}
	}

	private void loadParams1202() throws IOException {
		InputStream instr_12_0_2ELCMController = null;
		InputStream instr_12_0_2ELCMDao = null;
		InputStream instr_12_0_2ELCMDto = null;
		InputStream instr_12_0_2ELCMEJB = null;
		InputStream instr_12_0_2ELCMEntities = null;
		InputStream instr_12_0_2ELCMProcess = null;
		InputStream instr_12_0_2ELCMUtility = null;
		InputStream instr_12_0_2ELGateway = null;
		InputStream instr_12_0_2ELGatewayClient = null;
		InputStream instr_12_0_2ELWebServices = null;
		InputStream instr_12_0_2FCJBatch = null;
		InputStream instr_12_0_2FCJBpel = null;
		InputStream instr_12_0_2FCJCoreDAOOracle = null;
		InputStream instr_12_0_2FCJGeneralEJB = null;
		InputStream instr_12_0_2FCJMBean = null;
		InputStream instr_12_0_2FCJNeoWeb = null;
		InputStream instr_12_0_2FCJScheduler = null;
		InputStream instr_12_0_2FCJSMS = null;
		InputStream instr_12_0_2FCJUtility = null;

		try {
			props_12_0_2ELCMController = new Properties();
			props_12_0_2ELCMDao = new Properties();
			props_12_0_2ELCMDto = new Properties();
			props_12_0_2ELCMEJB = new Properties();
			props_12_0_2ELCMEntities = new Properties();
			props_12_0_2ELCMProcess = new Properties();
			props_12_0_2ELCMUtility = new Properties();
			props_12_0_2ELGateway = new Properties();
			props_12_0_2ELGatewayClient = new Properties();
			props_12_0_2ELWebServices = new Properties();
			props_12_0_2FCJBatch = new Properties();
			props_12_0_2FCJBpel = new Properties();
			props_12_0_2FCJCoreDAOOracle = new Properties();
			props_12_0_2FCJGeneralEJB = new Properties();
			props_12_0_2FCJMBean = new Properties();
			props_12_0_2FCJNeoWeb = new Properties();
			props_12_0_2FCJScheduler = new Properties();
			props_12_0_2FCJSMS = new Properties();
			props_12_0_2FCJUtility = new Properties();

			instr_12_0_2ELCMController = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELCMController.properties");
			instr_12_0_2ELCMDao = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELCMDao.properties");
			instr_12_0_2ELCMDto = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELCMDto.properties");
			instr_12_0_2ELCMEJB = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELCMEJB.properties");
			instr_12_0_2ELCMEntities = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELCMEntities.properties");
			instr_12_0_2ELCMProcess = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELCMProcess.properties");
			instr_12_0_2ELCMUtility = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELCMUtility.properties");
			instr_12_0_2ELGateway = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELGateway.properties");
			instr_12_0_2ELGatewayClient = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELGatewayClient.properties");
			instr_12_0_2ELWebServices = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2ELWebServices.properties");
			instr_12_0_2FCJBatch = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJBatch.properties");
			instr_12_0_2FCJBpel = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJBpel.properties");
			instr_12_0_2FCJCoreDAOOracle = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJCoreDAOOracle.properties");
			instr_12_0_2FCJGeneralEJB = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJGeneralEJB.properties");
			instr_12_0_2FCJMBean = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJMBean.properties");
			instr_12_0_2FCJNeoWeb = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJNeoWeb.properties");
			instr_12_0_2FCJScheduler = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJScheduler.properties");
			instr_12_0_2FCJSMS = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJSMS.properties");
			instr_12_0_2FCJUtility = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_2FCJUtility.properties");

			props_12_0_2ELCMController.load(instr_12_0_2ELCMController);
			props_12_0_2ELCMDao.load(instr_12_0_2ELCMDao);
			props_12_0_2ELCMDto.load(instr_12_0_2ELCMDto);
			props_12_0_2ELCMEJB.load(instr_12_0_2ELCMEJB);
			props_12_0_2ELCMEntities.load(instr_12_0_2ELCMEntities);
			props_12_0_2ELCMProcess.load(instr_12_0_2ELCMProcess);
			props_12_0_2ELCMUtility.load(instr_12_0_2ELCMUtility);
			props_12_0_2ELGateway.load(instr_12_0_2ELGateway);
			props_12_0_2ELGatewayClient.load(instr_12_0_2ELGatewayClient);
			props_12_0_2ELWebServices.load(instr_12_0_2ELWebServices);
			props_12_0_2FCJBatch.load(instr_12_0_2FCJBatch);
			props_12_0_2FCJBpel.load(instr_12_0_2FCJBpel);
			props_12_0_2FCJCoreDAOOracle.load(instr_12_0_2FCJCoreDAOOracle);
			props_12_0_2FCJGeneralEJB.load(instr_12_0_2FCJGeneralEJB);
			props_12_0_2FCJMBean.load(instr_12_0_2FCJMBean);
			props_12_0_2FCJNeoWeb.load(instr_12_0_2FCJNeoWeb);
			props_12_0_2FCJScheduler.load(instr_12_0_2FCJScheduler);
			props_12_0_2FCJSMS.load(instr_12_0_2FCJSMS);
			props_12_0_2FCJUtility.load(instr_12_0_2FCJUtility);

			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELCMController")
					.entrySet()) {
				hash_12_0_2ELCMController.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELCMDao")
					.entrySet()) {
				hash_12_0_2ELCMDao.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELCMDto")
					.entrySet()) {
				hash_12_0_2ELCMDto.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELCMEJB")
					.entrySet()) {
				hash_12_0_2ELCMEJB.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELCMEntities")
					.entrySet()) {
				hash_12_0_2ELCMEntities.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELCMProcess")
					.entrySet()) {
				hash_12_0_2ELCMProcess.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELCMUtility")
					.entrySet()) {
				hash_12_0_2ELCMUtility.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELGateway")
					.entrySet()) {
				hash_12_0_2ELGateway.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELGatewayClient")
					.entrySet()) {
				hash_12_0_2ELGatewayClient.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "ELWebServices")
					.entrySet()) {
				hash_12_0_2ELWebServices.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJBatch")
					.entrySet()) {
				hash_12_0_2FCJBatch.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJBpel")
					.entrySet()) {
				hash_12_0_2FCJBpel.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJCoreDAOOracle")
					.entrySet()) {
				hash_12_0_2FCJCoreDAOOracle.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJGeneralEJB")
					.entrySet()) {
				hash_12_0_2FCJGeneralEJB.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJMBean")
					.entrySet()) {
				hash_12_0_2FCJMBean.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJNeoWeb")
					.entrySet()) {
				hash_12_0_2FCJNeoWeb.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJScheduler")
					.entrySet()) {
				hash_12_0_2FCJScheduler.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJSMS")
					.entrySet()) {
				hash_12_0_2FCJSMS.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.2", "FCJUtility")
					.entrySet()) {
				hash_12_0_2FCJUtility.put((String) entry.getKey(), (String) entry.getValue());
			}
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

	private void loadParams1203() throws IOException {
		InputStream instr_12_0_3ELCMCommon = null;
		InputStream instr_12_0_3ELCMDto = null;
		InputStream instr_12_0_3ELCMEJB = null;
		InputStream instr_12_0_3ELCMEntities = null;
		InputStream instr_12_0_3ELCMKernel = null;
		InputStream instr_12_0_3ELCMKernelJpa = null;
		InputStream instr_12_0_3ELCMKernelSQLJ = null;
		InputStream instr_12_0_3ELCMUtility = null;
		InputStream instr_12_0_3ELCMGateway = null;
		InputStream instr_12_0_3ELCMWeb = null;
		InputStream instr_12_0_3FCGateway = null;
		InputStream instr_12_0_3FCJBatch = null;
		InputStream instr_12_0_3FCJBpel = null;
		InputStream instr_12_0_3FCJCoreDAOOracle = null;
		InputStream instr_12_0_3FCJGeneralEJB = null;
		InputStream instr_12_0_3FCJMBean = null;
		InputStream instr_12_0_3FCJNeoWeb = null;
		InputStream instr_12_0_3FCJScheduler = null;
		InputStream instr_12_0_3FCJSMS = null;
		InputStream instr_12_0_3FCJUtility = null;
		InputStream instr_12_0_3FCJWebTab = null;

		try {
			props_12_0_3ELCMCommon = new Properties();
			props_12_0_3ELCMDto = new Properties();
			props_12_0_3ELCMEJB = new Properties();
			props_12_0_3ELCMEntities = new Properties();
			props_12_0_3ELCMKernel = new Properties();
			props_12_0_3ELCMKernelJpa = new Properties();
			props_12_0_3ELCMKernelSQLJ = new Properties();
			props_12_0_3ELCMUtility = new Properties();
			props_12_0_3ELCMGateway = new Properties();
			props_12_0_3ELCMWeb = new Properties();
			props_12_0_3FCGateway = new Properties();
			props_12_0_3FCJBatch = new Properties();
			props_12_0_3FCJBpel = new Properties();
			props_12_0_3FCJCoreDAOOracle = new Properties();
			props_12_0_3FCJGeneralEJB = new Properties();
			props_12_0_3FCJMBean = new Properties();
			props_12_0_3FCJNeoWeb = new Properties();
			props_12_0_3FCJScheduler = new Properties();
			props_12_0_3FCJSMS = new Properties();
			props_12_0_3FCJUtility = new Properties();
			props_12_0_3FCJWebTab = new Properties();

			instr_12_0_3ELCMCommon = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMCommon.properties");
			instr_12_0_3ELCMDto = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMDto.properties");
			instr_12_0_3ELCMEJB = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMEJB.properties");
			instr_12_0_3ELCMEntities = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMEntities.properties");
			instr_12_0_3ELCMKernel = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMKernel.properties");
			instr_12_0_3ELCMKernelJpa = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMKernelJpa.properties");
			instr_12_0_3ELCMKernelSQLJ = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMKernelSQLJ.properties");
			instr_12_0_3ELCMUtility = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMUtility.properties");
			instr_12_0_3ELCMGateway = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMGateway.properties");
			instr_12_0_3ELCMWeb = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3ELCMWeb.properties");
			instr_12_0_3FCGateway = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCGateway.properties");
			instr_12_0_3FCJBatch = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJBatch.properties");
			instr_12_0_3FCJBpel = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJBpel.properties");
			instr_12_0_3FCJCoreDAOOracle = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJCoreDAOOracle.properties");
			instr_12_0_3FCJGeneralEJB = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJGeneralEJB.properties");
			instr_12_0_3FCJMBean = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJMBean.properties");
			instr_12_0_3FCJNeoWeb = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJNeoWeb.properties");
			instr_12_0_3FCJScheduler = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJScheduler.properties");
			instr_12_0_3FCJSMS = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJSMS.properties");
			instr_12_0_3FCJUtility = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJUtility.properties");
			instr_12_0_3FCJWebTab = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("12_0_3FCJWebTab.properties");

			props_12_0_3ELCMCommon.load(instr_12_0_3ELCMCommon);
			props_12_0_3ELCMDto.load(instr_12_0_3ELCMDto);
			props_12_0_3ELCMEJB.load(instr_12_0_3ELCMEJB);
			props_12_0_3ELCMEntities.load(instr_12_0_3ELCMEntities);
			props_12_0_3ELCMKernel.load(instr_12_0_3ELCMKernel);
			props_12_0_3ELCMKernelJpa.load(instr_12_0_3ELCMKernelJpa);
			props_12_0_3ELCMKernelSQLJ.load(instr_12_0_3ELCMKernelSQLJ);
			props_12_0_3ELCMUtility.load(instr_12_0_3ELCMUtility);
			props_12_0_3ELCMGateway.load(instr_12_0_3ELCMGateway);
			props_12_0_3ELCMWeb.load(instr_12_0_3ELCMWeb);
			props_12_0_3FCGateway.load(instr_12_0_3FCGateway);
			props_12_0_3FCJBatch.load(instr_12_0_3FCJBatch);
			props_12_0_3FCJBpel.load(instr_12_0_3FCJBpel);
			props_12_0_3FCJCoreDAOOracle.load(instr_12_0_3FCJCoreDAOOracle);
			props_12_0_3FCJGeneralEJB.load(instr_12_0_3FCJGeneralEJB);
			props_12_0_3FCJMBean.load(instr_12_0_3FCJMBean);
			props_12_0_3FCJNeoWeb.load(instr_12_0_3FCJNeoWeb);
			props_12_0_3FCJScheduler.load(instr_12_0_3FCJScheduler);
			props_12_0_3FCJSMS.load(instr_12_0_3FCJSMS);
			props_12_0_3FCJUtility.load(instr_12_0_3FCJUtility);
			props_12_0_3FCJWebTab.load(instr_12_0_3FCJWebTab);

			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMCommon")
					.entrySet()) {
				hash_12_0_3ELCMCommon.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMDto")
					.entrySet()) {
				hash_12_0_3ELCMDto.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMEJB")
					.entrySet()) {
				hash_12_0_3ELCMEJB.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMEntities")
					.entrySet()) {
				hash_12_0_3ELCMEntities.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMKernel")
					.entrySet()) {
				hash_12_0_3ELCMKernel.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMKernelJpa")
					.entrySet()) {
				hash_12_0_3ELCMKernelJpa.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMKernelSQLJ")
					.entrySet()) {
				hash_12_0_3ELCMKernelSQLJ.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMUtility")
					.entrySet()) {
				hash_12_0_3ELCMUtility.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMGateway")
					.entrySet()) {
				hash_12_0_3ELCMGateway.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "ELCMWeb")
					.entrySet()) {
				hash_12_0_3ELCMWeb.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCGateway")
					.entrySet()) {
				hash_12_0_3FCGateway.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJBatch")
					.entrySet()) {
				hash_12_0_3FCJBatch.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJBpel")
					.entrySet()) {
				hash_12_0_3FCJBpel.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJCoreDAOOracle")
					.entrySet()) {
				hash_12_0_3FCJCoreDAOOracle.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJGeneralEJB")
					.entrySet()) {
				hash_12_0_3FCJGeneralEJB.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJMBean")
					.entrySet()) {
				hash_12_0_3FCJMBean.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJNeoWeb")
					.entrySet()) {
				hash_12_0_3FCJNeoWeb.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJScheduler")
					.entrySet()) {
				hash_12_0_3FCJScheduler.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJSMS")
					.entrySet()) {
				hash_12_0_3FCJSMS.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJUtility")
					.entrySet()) {
				hash_12_0_3FCJUtility.put((String) entry.getKey(), (String) entry.getValue());
			}
			for (Entry<Object, Object> entry : ApplicationGlobal.getInstance().getProps("12.0.3", "FCJWebTab")
					.entrySet()) {
				hash_12_0_3FCJWebTab.put((String) entry.getKey(), (String) entry.getValue());
			}
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

	public Properties getProps(String version, String project) {

		switch (version) {
		case "12.0.1":
			switch (project) {
			case "ELCMController":
				return props_12_0_1ELCMController;
			case "ELCMDao":
				return props_12_0_1ELCMDao;
			case "ELCMDto":
				return props_12_0_1ELCMDto;
			case "ELCMEJB":
				return props_12_0_1ELCMEJB;
			case "ELCMEntities":
				return props_12_0_1ELCMEntities;
			case "ELCMProcess":
				return props_12_0_1ELCMProcess;
			case "ELCMUtility":
				return props_12_0_1ELCMUtility;
			case "ELGateway":
				return props_12_0_1ELGateway;
			case "ELGatewayClient":
				return props_12_0_1ELGatewayClient;
			case "ELWebServices":
				return props_12_0_1ELWebServices;
			case "FCJBatch":
				return props_12_0_1FCJBatch;
			case "FCJBpel":
				return props_12_0_1FCJBpel;
			case "FCJCoreDAOOracle":
				return props_12_0_1FCJCoreDAOOracle;
			case "FCJGeneralEJB":
				return props_12_0_1FCJGeneralEJB;
			case "FCJMBean":
				return props_12_0_1FCJMBean;
			case "FCJNeoWeb":
				return props_12_0_1FCJNeoWeb;
			case "FCJScheduler":
				return props_12_0_1FCJScheduler;
			case "FCJSMS":
				return props_12_0_1FCJSMS;
			case "FCJUtility":
				return props_12_0_1FCJUtility;
			}

		case "12.0.2":
			switch (project) {
			case "ELCMController":
				return props_12_0_2ELCMController;
			case "ELCMDao":
				return props_12_0_2ELCMDao;
			case "ELCMDto":
				return props_12_0_2ELCMDto;
			case "ELCMEJB":
				return props_12_0_2ELCMEJB;
			case "ELCMEntities":
				return props_12_0_2ELCMEntities;
			case "ELCMProcess":
				return props_12_0_2ELCMProcess;
			case "ELCMUtility":
				return props_12_0_2ELCMUtility;
			case "ELGateway":
				return props_12_0_2ELGateway;
			case "ELGatewayClient":
				return props_12_0_2ELGatewayClient;
			case "ELWebServices":
				return props_12_0_2ELWebServices;
			case "FCJBatch":
				return props_12_0_2FCJBatch;
			case "FCJBpel":
				return props_12_0_2FCJBpel;
			case "FCJCoreDAOOracle":
				return props_12_0_2FCJCoreDAOOracle;
			case "FCJGeneralEJB":
				return props_12_0_2FCJGeneralEJB;
			case "FCJMBean":
				return props_12_0_2FCJMBean;
			case "FCJNeoWeb":
				return props_12_0_2FCJNeoWeb;
			case "FCJScheduler":
				return props_12_0_2FCJScheduler;
			case "FCJSMS":
				return props_12_0_2FCJSMS;
			case "FCJUtility":
				return props_12_0_2FCJUtility;
			}
		case "12.0.3":
			switch (project) {
			case "ELCMCommon":
				return props_12_0_3ELCMCommon;
			case "ELCMDto":
				return props_12_0_3ELCMDto;
			case "ELCMEJB":
				return props_12_0_3ELCMEJB;
			case "ELCMEntities":
				return props_12_0_3ELCMEntities;
			case "ELCMKernel":
				return props_12_0_3ELCMKernel;
			case "ELCMKernelJpa":
				return props_12_0_3ELCMKernelJpa;
			case "ELCMKernelSQLJ":
				return props_12_0_3ELCMKernelSQLJ;
			case "ELCMUtility":
				return props_12_0_3ELCMUtility;
			case "ELCMGateway":
				return props_12_0_3ELCMGateway;
			case "ELCMWeb":
				return props_12_0_3ELCMWeb;
			case "FCGateway":
				return props_12_0_3FCGateway;
			case "FCJBatch":
				return props_12_0_3FCJBatch;
			case "FCJBpel":
				return props_12_0_3FCJBpel;
			case "FCJCoreDAOOracle":
				return props_12_0_3FCJCoreDAOOracle;
			case "FCJGeneralEJB":
				return props_12_0_3FCJGeneralEJB;
			case "FCJMBean":
				return props_12_0_3FCJMBean;
			case "FCJNeoWeb":
				return props_12_0_3FCJNeoWeb;
			case "FCJScheduler":
				return props_12_0_3FCJScheduler;
			case "FCJSMS":
				return props_12_0_3FCJSMS;
			case "FCJUtility":
				return props_12_0_3FCJUtility;
			case "FCJWebTab":
				return props_12_0_3FCJWebTab;
			}
		}
		return null;
	}

	public static HashMap<String, String> getHash_12_0_1ELCMController() {
		return hash_12_0_1ELCMController;
	}

	public static void setHash_12_0_1ELCMController(HashMap<String, String> hash_12_0_1elcmController) {
		hash_12_0_1ELCMController = hash_12_0_1elcmController;
	}

	public static HashMap<String, String> getHash_12_0_1ELCMDao() {
		return hash_12_0_1ELCMDao;
	}

	public static void setHash_12_0_1ELCMDao(HashMap<String, String> hash_12_0_1elcmDao) {
		hash_12_0_1ELCMDao = hash_12_0_1elcmDao;
	}

	public static HashMap<String, String> getHash_12_0_1ELCMDto() {
		return hash_12_0_1ELCMDto;
	}

	public static void setHash_12_0_1ELCMDto(HashMap<String, String> hash_12_0_1elcmDto) {
		hash_12_0_1ELCMDto = hash_12_0_1elcmDto;
	}

	public static HashMap<String, String> getHash_12_0_1ELCMEJB() {
		return hash_12_0_1ELCMEJB;
	}

	public static void setHash_12_0_1ELCMEJB(HashMap<String, String> hash_12_0_1elcmejb) {
		hash_12_0_1ELCMEJB = hash_12_0_1elcmejb;
	}

	public static HashMap<String, String> getHash_12_0_1ELCMEntities() {
		return hash_12_0_1ELCMEntities;
	}

	public static void setHash_12_0_1ELCMEntities(HashMap<String, String> hash_12_0_1elcmEntities) {
		hash_12_0_1ELCMEntities = hash_12_0_1elcmEntities;
	}

	public static HashMap<String, String> getHash_12_0_1ELCMProcess() {
		return hash_12_0_1ELCMProcess;
	}

	public static void setHash_12_0_1ELCMProcess(HashMap<String, String> hash_12_0_1elcmProcess) {
		hash_12_0_1ELCMProcess = hash_12_0_1elcmProcess;
	}

	public static HashMap<String, String> getHash_12_0_1ELCMUtility() {
		return hash_12_0_1ELCMUtility;
	}

	public static void setHash_12_0_1ELCMUtility(HashMap<String, String> hash_12_0_1elcmUtility) {
		hash_12_0_1ELCMUtility = hash_12_0_1elcmUtility;
	}

	public static HashMap<String, String> getHash_12_0_1ELGateway() {
		return hash_12_0_1ELGateway;
	}

	public static void setHash_12_0_1ELGateway(HashMap<String, String> hash_12_0_1elGateway) {
		hash_12_0_1ELGateway = hash_12_0_1elGateway;
	}

	public static HashMap<String, String> getHash_12_0_1ELGatewayClient() {
		return hash_12_0_1ELGatewayClient;
	}

	public static void setHash_12_0_1ELGatewayClient(HashMap<String, String> hash_12_0_1elGatewayClient) {
		hash_12_0_1ELGatewayClient = hash_12_0_1elGatewayClient;
	}

	public static HashMap<String, String> getHash_12_0_1ELWebServices() {
		return hash_12_0_1ELWebServices;
	}

	public static void setHash_12_0_1ELWebServices(HashMap<String, String> hash_12_0_1elWebServices) {
		hash_12_0_1ELWebServices = hash_12_0_1elWebServices;
	}

	public static HashMap<String, String> getHash_12_0_1FCJBatch() {
		return hash_12_0_1FCJBatch;
	}

	public static void setHash_12_0_1FCJBatch(HashMap<String, String> hash_12_0_1fcjBatch) {
		hash_12_0_1FCJBatch = hash_12_0_1fcjBatch;
	}

	public static HashMap<String, String> getHash_12_0_1FCJBpel() {
		return hash_12_0_1FCJBpel;
	}

	public static void setHash_12_0_1FCJBpel(HashMap<String, String> hash_12_0_1fcjBpel) {
		hash_12_0_1FCJBpel = hash_12_0_1fcjBpel;
	}

	public static HashMap<String, String> getHash_12_0_1FCJCoreDAOOracle() {
		return hash_12_0_1FCJCoreDAOOracle;
	}

	public static void setHash_12_0_1FCJCoreDAOOracle(HashMap<String, String> hash_12_0_1fcjCoreDAOOracle) {
		hash_12_0_1FCJCoreDAOOracle = hash_12_0_1fcjCoreDAOOracle;
	}

	public static HashMap<String, String> getHash_12_0_1FCJGeneralEJB() {
		return hash_12_0_1FCJGeneralEJB;
	}

	public static void setHash_12_0_1FCJGeneralEJB(HashMap<String, String> hash_12_0_1fcjGeneralEJB) {
		hash_12_0_1FCJGeneralEJB = hash_12_0_1fcjGeneralEJB;
	}

	public static HashMap<String, String> getHash_12_0_1FCJMBean() {
		return hash_12_0_1FCJMBean;
	}

	public static void setHash_12_0_1FCJMBean(HashMap<String, String> hash_12_0_1fcjmBean) {
		hash_12_0_1FCJMBean = hash_12_0_1fcjmBean;
	}

	public static HashMap<String, String> getHash_12_0_1FCJNeoWeb() {
		return hash_12_0_1FCJNeoWeb;
	}

	public static void setHash_12_0_1FCJNeoWeb(HashMap<String, String> hash_12_0_1fcjNeoWeb) {
		hash_12_0_1FCJNeoWeb = hash_12_0_1fcjNeoWeb;
	}

	public static HashMap<String, String> getHash_12_0_1FCJScheduler() {
		return hash_12_0_1FCJScheduler;
	}

	public static void setHash_12_0_1FCJScheduler(HashMap<String, String> hash_12_0_1fcjScheduler) {
		hash_12_0_1FCJScheduler = hash_12_0_1fcjScheduler;
	}

	public static HashMap<String, String> getHash_12_0_1FCJSMS() {
		return hash_12_0_1FCJSMS;
	}

	public static void setHash_12_0_1FCJSMS(HashMap<String, String> hash_12_0_1fcjsms) {
		hash_12_0_1FCJSMS = hash_12_0_1fcjsms;
	}

	public static HashMap<String, String> getHash_12_0_1FCJUtility() {
		return hash_12_0_1FCJUtility;
	}

	public static void setHash_12_0_1FCJUtility(HashMap<String, String> hash_12_0_1fcjUtility) {
		hash_12_0_1FCJUtility = hash_12_0_1fcjUtility;
	}

	public static HashMap<String, String> getHash_12_0_2ELCMController() {
		return hash_12_0_2ELCMController;
	}

	public static void setHash_12_0_2ELCMController(HashMap<String, String> hash_12_0_2elcmController) {
		hash_12_0_2ELCMController = hash_12_0_2elcmController;
	}

	public static HashMap<String, String> getHash_12_0_2ELCMDao() {
		return hash_12_0_2ELCMDao;
	}

	public static void setHash_12_0_2ELCMDao(HashMap<String, String> hash_12_0_2elcmDao) {
		hash_12_0_2ELCMDao = hash_12_0_2elcmDao;
	}

	public static HashMap<String, String> getHash_12_0_2ELCMDto() {
		return hash_12_0_2ELCMDto;
	}

	public static void setHash_12_0_2ELCMDto(HashMap<String, String> hash_12_0_2elcmDto) {
		hash_12_0_2ELCMDto = hash_12_0_2elcmDto;
	}

	public static HashMap<String, String> getHash_12_0_2ELCMEJB() {
		return hash_12_0_2ELCMEJB;
	}

	public static void setHash_12_0_2ELCMEJB(HashMap<String, String> hash_12_0_2elcmejb) {
		hash_12_0_2ELCMEJB = hash_12_0_2elcmejb;
	}

	public static HashMap<String, String> getHash_12_0_2ELCMEntities() {
		return hash_12_0_2ELCMEntities;
	}

	public static void setHash_12_0_2ELCMEntities(HashMap<String, String> hash_12_0_2elcmEntities) {
		hash_12_0_2ELCMEntities = hash_12_0_2elcmEntities;
	}

	public static HashMap<String, String> getHash_12_0_2ELCMProcess() {
		return hash_12_0_2ELCMProcess;
	}

	public static void setHash_12_0_2ELCMProcess(HashMap<String, String> hash_12_0_2elcmProcess) {
		hash_12_0_2ELCMProcess = hash_12_0_2elcmProcess;
	}

	public static HashMap<String, String> getHash_12_0_2ELCMUtility() {
		return hash_12_0_2ELCMUtility;
	}

	public static void setHash_12_0_2ELCMUtility(HashMap<String, String> hash_12_0_2elcmUtility) {
		hash_12_0_2ELCMUtility = hash_12_0_2elcmUtility;
	}

	public static HashMap<String, String> getHash_12_0_2ELGateway() {
		return hash_12_0_2ELGateway;
	}

	public static void setHash_12_0_2ELGateway(HashMap<String, String> hash_12_0_2elGateway) {
		hash_12_0_2ELGateway = hash_12_0_2elGateway;
	}

	public static HashMap<String, String> getHash_12_0_2ELGatewayClient() {
		return hash_12_0_2ELGatewayClient;
	}

	public static void setHash_12_0_2ELGatewayClient(HashMap<String, String> hash_12_0_2elGatewayClient) {
		hash_12_0_2ELGatewayClient = hash_12_0_2elGatewayClient;
	}

	public static HashMap<String, String> getHash_12_0_2ELWebServices() {
		return hash_12_0_2ELWebServices;
	}

	public static void setHash_12_0_2ELWebServices(HashMap<String, String> hash_12_0_2elWebServices) {
		hash_12_0_2ELWebServices = hash_12_0_2elWebServices;
	}

	public static HashMap<String, String> getHash_12_0_2FCJBatch() {
		return hash_12_0_2FCJBatch;
	}

	public static void setHash_12_0_2FCJBatch(HashMap<String, String> hash_12_0_2fcjBatch) {
		hash_12_0_2FCJBatch = hash_12_0_2fcjBatch;
	}

	public static HashMap<String, String> getHash_12_0_2FCJBpel() {
		return hash_12_0_2FCJBpel;
	}

	public static void setHash_12_0_2FCJBpel(HashMap<String, String> hash_12_0_2fcjBpel) {
		hash_12_0_2FCJBpel = hash_12_0_2fcjBpel;
	}

	public static HashMap<String, String> getHash_12_0_2FCJCoreDAOOracle() {
		return hash_12_0_2FCJCoreDAOOracle;
	}

	public static void setHash_12_0_2FCJCoreDAOOracle(HashMap<String, String> hash_12_0_2fcjCoreDAOOracle) {
		hash_12_0_2FCJCoreDAOOracle = hash_12_0_2fcjCoreDAOOracle;
	}

	public static HashMap<String, String> getHash_12_0_2FCJGeneralEJB() {
		return hash_12_0_2FCJGeneralEJB;
	}

	public static void setHash_12_0_2FCJGeneralEJB(HashMap<String, String> hash_12_0_2fcjGeneralEJB) {
		hash_12_0_2FCJGeneralEJB = hash_12_0_2fcjGeneralEJB;
	}

	public static HashMap<String, String> getHash_12_0_2FCJMBean() {
		return hash_12_0_2FCJMBean;
	}

	public static void setHash_12_0_2FCJMBean(HashMap<String, String> hash_12_0_2fcjmBean) {
		hash_12_0_2FCJMBean = hash_12_0_2fcjmBean;
	}

	public static HashMap<String, String> getHash_12_0_2FCJNeoWeb() {
		return hash_12_0_2FCJNeoWeb;
	}

	public static void setHash_12_0_2FCJNeoWeb(HashMap<String, String> hash_12_0_2fcjNeoWeb) {
		hash_12_0_2FCJNeoWeb = hash_12_0_2fcjNeoWeb;
	}

	public static HashMap<String, String> getHash_12_0_2FCJScheduler() {
		return hash_12_0_2FCJScheduler;
	}

	public static void setHash_12_0_2FCJScheduler(HashMap<String, String> hash_12_0_2fcjScheduler) {
		hash_12_0_2FCJScheduler = hash_12_0_2fcjScheduler;
	}

	public static HashMap<String, String> getHash_12_0_2FCJSMS() {
		return hash_12_0_2FCJSMS;
	}

	public static void setHash_12_0_2FCJSMS(HashMap<String, String> hash_12_0_2fcjsms) {
		hash_12_0_2FCJSMS = hash_12_0_2fcjsms;
	}

	public static HashMap<String, String> getHash_12_0_2FCJUtility() {
		return hash_12_0_2FCJUtility;
	}

	public static void setHash_12_0_2FCJUtility(HashMap<String, String> hash_12_0_2fcjUtility) {
		hash_12_0_2FCJUtility = hash_12_0_2fcjUtility;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMCommon() {
		return hash_12_0_3ELCMCommon;
	}

	public static void setHash_12_0_3ELCMCommon(HashMap<String, String> hash_12_0_3elcmCommon) {
		hash_12_0_3ELCMCommon = hash_12_0_3elcmCommon;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMDto() {
		return hash_12_0_3ELCMDto;
	}

	public static void setHash_12_0_3ELCMDto(HashMap<String, String> hash_12_0_3elcmDto) {
		hash_12_0_3ELCMDto = hash_12_0_3elcmDto;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMEJB() {
		return hash_12_0_3ELCMEJB;
	}

	public static void setHash_12_0_3ELCMEJB(HashMap<String, String> hash_12_0_3elcmejb) {
		hash_12_0_3ELCMEJB = hash_12_0_3elcmejb;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMEntities() {
		return hash_12_0_3ELCMEntities;
	}

	public static void setHash_12_0_3ELCMEntities(HashMap<String, String> hash_12_0_3elcmEntities) {
		hash_12_0_3ELCMEntities = hash_12_0_3elcmEntities;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMKernel() {
		return hash_12_0_3ELCMKernel;
	}

	public static void setHash_12_0_3ELCMKernel(HashMap<String, String> hash_12_0_3elcmKernel) {
		hash_12_0_3ELCMKernel = hash_12_0_3elcmKernel;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMKernelJpa() {
		return hash_12_0_3ELCMKernelJpa;
	}

	public static void setHash_12_0_3ELCMKernelJpa(HashMap<String, String> hash_12_0_3elcmKernelJpa) {
		hash_12_0_3ELCMKernelJpa = hash_12_0_3elcmKernelJpa;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMKernelSQLJ() {
		return hash_12_0_3ELCMKernelSQLJ;
	}

	public static void setHash_12_0_3ELCMKernelSQLJ(HashMap<String, String> hash_12_0_3elcmKernelSQLJ) {
		hash_12_0_3ELCMKernelSQLJ = hash_12_0_3elcmKernelSQLJ;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMUtility() {
		return hash_12_0_3ELCMUtility;
	}

	public static void setHash_12_0_3ELCMUtility(HashMap<String, String> hash_12_0_3elcmUtility) {
		hash_12_0_3ELCMUtility = hash_12_0_3elcmUtility;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMGateway() {
		return hash_12_0_3ELCMGateway;
	}

	public static void setHash_12_0_3ELCMGateway(HashMap<String, String> hash_12_0_3elcmGateway) {
		hash_12_0_3ELCMGateway = hash_12_0_3elcmGateway;
	}

	public static HashMap<String, String> getHash_12_0_3ELCMWeb() {
		return hash_12_0_3ELCMWeb;
	}

	public static void setHash_12_0_3ELCMWeb(HashMap<String, String> hash_12_0_3elcmWeb) {
		hash_12_0_3ELCMWeb = hash_12_0_3elcmWeb;
	}

	public static HashMap<String, String> getHash_12_0_3FCGateway() {
		return hash_12_0_3FCGateway;
	}

	public static void setHash_12_0_3FCGateway(HashMap<String, String> hash_12_0_3fcGateway) {
		hash_12_0_3FCGateway = hash_12_0_3fcGateway;
	}

	public static HashMap<String, String> getHash_12_0_3FCJBatch() {
		return hash_12_0_3FCJBatch;
	}

	public static void setHash_12_0_3FCJBatch(HashMap<String, String> hash_12_0_3fcjBatch) {
		hash_12_0_3FCJBatch = hash_12_0_3fcjBatch;
	}

	public static HashMap<String, String> getHash_12_0_3FCJBpel() {
		return hash_12_0_3FCJBpel;
	}

	public static void setHash_12_0_3FCJBpel(HashMap<String, String> hash_12_0_3fcjBpel) {
		hash_12_0_3FCJBpel = hash_12_0_3fcjBpel;
	}

	public static HashMap<String, String> getHash_12_0_3FCJCoreDAOOracle() {
		return hash_12_0_3FCJCoreDAOOracle;
	}

	public static void setHash_12_0_3FCJCoreDAOOracle(HashMap<String, String> hash_12_0_3fcjCoreDAOOracle) {
		hash_12_0_3FCJCoreDAOOracle = hash_12_0_3fcjCoreDAOOracle;
	}

	public static HashMap<String, String> getHash_12_0_3FCJGeneralEJB() {
		return hash_12_0_3FCJGeneralEJB;
	}

	public static void setHash_12_0_3FCJGeneralEJB(HashMap<String, String> hash_12_0_3fcjGeneralEJB) {
		hash_12_0_3FCJGeneralEJB = hash_12_0_3fcjGeneralEJB;
	}

	public static HashMap<String, String> getHash_12_0_3FCJMBean() {
		return hash_12_0_3FCJMBean;
	}

	public static void setHash_12_0_3FCJMBean(HashMap<String, String> hash_12_0_3fcjmBean) {
		hash_12_0_3FCJMBean = hash_12_0_3fcjmBean;
	}

	public static HashMap<String, String> getHash_12_0_3FCJNeoWeb() {
		return hash_12_0_3FCJNeoWeb;
	}

	public static void setHash_12_0_3FCJNeoWeb(HashMap<String, String> hash_12_0_3fcjNeoWeb) {
		hash_12_0_3FCJNeoWeb = hash_12_0_3fcjNeoWeb;
	}

	public static HashMap<String, String> getHash_12_0_3FCJScheduler() {
		return hash_12_0_3FCJScheduler;
	}

	public static void setHash_12_0_3FCJScheduler(HashMap<String, String> hash_12_0_3fcjScheduler) {
		hash_12_0_3FCJScheduler = hash_12_0_3fcjScheduler;
	}

	public static HashMap<String, String> getHash_12_0_3FCJSMS() {
		return hash_12_0_3FCJSMS;
	}

	public static void setHash_12_0_3FCJSMS(HashMap<String, String> hash_12_0_3fcjsms) {
		hash_12_0_3FCJSMS = hash_12_0_3fcjsms;
	}

	public static HashMap<String, String> getHash_12_0_3FCJUtility() {
		return hash_12_0_3FCJUtility;
	}

	public static void setHash_12_0_3FCJUtility(HashMap<String, String> hash_12_0_3fcjUtility) {
		hash_12_0_3FCJUtility = hash_12_0_3fcjUtility;
	}

	public static HashMap<String, String> getHash_12_0_3FCJWebTab() {
		return hash_12_0_3FCJWebTab;
	}

	public static void setHash_12_0_3FCJWebTab(HashMap<String, String> hash_12_0_3fcjWebTab) {
		hash_12_0_3FCJWebTab = hash_12_0_3fcjWebTab;
	}
}
