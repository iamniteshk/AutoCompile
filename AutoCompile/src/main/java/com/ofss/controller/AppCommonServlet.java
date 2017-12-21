package com.ofss.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.ofss.utility.ApplicationGlobal;

public class AppCommonServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	static HashMap<String, String> hash = new HashMap<>();
	HashMap<String, String> result = new HashMap<>();

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String version = req.getParameter("version");
		String project = req.getParameter("project");
		String input = req.getParameter("input");
		if(input.contains(";")){
			input = input.substring(input.indexOf(";")+1);
		}
		System.out.println(version);
		System.out.println(project);
		System.out.println(input);
		
		switch (version) {
		case "12.0.1":
			switch (project) {
			case "ELCMController":
				hash = ApplicationGlobal.getHash_12_0_1ELCMController() ;
				break;
			case "ELCMDao":
				hash = ApplicationGlobal.getHash_12_0_1ELCMDao();
				break;
			case "ELCMDto":
				hash = ApplicationGlobal.getHash_12_0_1ELCMDto();
				break;
			case "ELCMEJB":
				hash = ApplicationGlobal.getHash_12_0_1ELCMEJB();
				break;
			case "ELCMEntities":
				hash = ApplicationGlobal.getHash_12_0_1ELCMEntities();
				break;
			case "ELCMProcess":
				hash = ApplicationGlobal.getHash_12_0_1ELCMProcess();
				break;
			case "ELCMUtility":
				hash = ApplicationGlobal.getHash_12_0_1ELCMUtility();
				break;
			case "ELGateway":
				hash = ApplicationGlobal.getHash_12_0_1ELGateway();
				break;
			case "ELGatewayClient":
				hash = ApplicationGlobal.getHash_12_0_1ELGatewayClient();
				break;
			case "ELWebServices":
				hash = ApplicationGlobal.getHash_12_0_1ELWebServices();
				break;
			case "FCJBatch":
				hash = ApplicationGlobal.getHash_12_0_1FCJBatch();
				break;
			case "FCJBpel":
				hash = ApplicationGlobal.getHash_12_0_1FCJBpel();
				break;
			case "FCJCoreDAOOracle":
				hash = ApplicationGlobal.getHash_12_0_1FCJCoreDAOOracle();
				break;
			case "FCJGeneralEJB":
				hash = ApplicationGlobal.getHash_12_0_1FCJGeneralEJB();
				break;
			case "FCJMBean":
				hash = ApplicationGlobal.getHash_12_0_1FCJMBean();
				break;
			case "FCJNeoWeb":
				hash = ApplicationGlobal.getHash_12_0_1FCJNeoWeb();
				break;
			case "FCJScheduler":
				hash = ApplicationGlobal.getHash_12_0_1FCJScheduler();
				break;
			case "FCJSMS":
				hash = ApplicationGlobal.getHash_12_0_1FCJSMS();
				break;
			case "FCJUtility":
				hash = ApplicationGlobal.getHash_12_0_1FCJUtility();
				break;
			}
			break;

		case "12.0.2":
			switch (project) {
			case "ELCMController":
				hash = ApplicationGlobal.getHash_12_0_2ELCMController() ;
				break;
			case "ELCMDao":
				hash = ApplicationGlobal.getHash_12_0_2ELCMDao();
				break;
			case "ELCMDto":
				hash = ApplicationGlobal.getHash_12_0_2ELCMDto();
				break;
			case "ELCMEJB":
				hash = ApplicationGlobal.getHash_12_0_2ELCMEJB();
				break;
			case "ELCMEntities":
				hash = ApplicationGlobal.getHash_12_0_2ELCMEntities();
				break;
			case "ELCMProcess":
				hash = ApplicationGlobal.getHash_12_0_2ELCMProcess();
				break;
			case "ELCMUtility":
				hash = ApplicationGlobal.getHash_12_0_2ELCMUtility();
				break;
			case "ELGateway":
				hash = ApplicationGlobal.getHash_12_0_2ELGateway();
				break;
			case "ELGatewayClient":
				hash = ApplicationGlobal.getHash_12_0_2ELGatewayClient();
				break;
			case "ELWebServices":
				hash = ApplicationGlobal.getHash_12_0_2ELWebServices();
				break;
			case "FCJBatch":
				hash = ApplicationGlobal.getHash_12_0_2FCJBatch();
				break;
			case "FCJBpel":
				hash = ApplicationGlobal.getHash_12_0_2FCJBpel();
				break;
			case "FCJCoreDAOOracle":
				hash = ApplicationGlobal.getHash_12_0_2FCJCoreDAOOracle();
				break;
			case "FCJGeneralEJB":
				hash = ApplicationGlobal.getHash_12_0_2FCJGeneralEJB();
				break;
			case "FCJMBean":
				hash = ApplicationGlobal.getHash_12_0_2FCJMBean();
				break;
			case "FCJNeoWeb":
				hash = ApplicationGlobal.getHash_12_0_2FCJNeoWeb();
				break;
			case "FCJScheduler":
				hash = ApplicationGlobal.getHash_12_0_2FCJScheduler();
				break;
			case "FCJSMS":
				hash = ApplicationGlobal.getHash_12_0_2FCJSMS();
				break;
			case "FCJUtility":
				hash = ApplicationGlobal.getHash_12_0_2FCJUtility();
				break;
			}
		case "12.0.3":
			switch (project) {
			case "ELCMCommon":
				hash = ApplicationGlobal.getHash_12_0_3ELCMCommon();
				break;
			case "ELCMDto":
				hash = ApplicationGlobal.getHash_12_0_3ELCMDto();
				break;
			case "ELCMEJB":
				hash = ApplicationGlobal.getHash_12_0_3ELCMEJB();
				break;
			case "ELCMEntities":
				hash = ApplicationGlobal.getHash_12_0_3ELCMEntities();
				break;
			case "ELCMKernel":
				hash = ApplicationGlobal.getHash_12_0_3ELCMKernel();
				break;
			case "ELCMKernelJpa":
				hash = ApplicationGlobal.getHash_12_0_3ELCMKernelJpa();
				break;
			case "ELCMKernelSQLJ":
				hash = ApplicationGlobal.getHash_12_0_3ELCMKernelSQLJ();
				break;
			case "ELCMUtility":
				hash = ApplicationGlobal.getHash_12_0_3ELCMUtility();
				break;
			case "ELCMGateway":
				hash = ApplicationGlobal.getHash_12_0_3ELCMGateway();
				break;
			case "ELCMWeb":
				hash = ApplicationGlobal.getHash_12_0_3ELCMWeb();
				break;
			case "FCGateway":
				hash = ApplicationGlobal.getHash_12_0_3FCGateway();
				break;
			case "FCJBatch":
				hash = ApplicationGlobal.getHash_12_0_3FCJBatch();
				break;
			case "FCJBpel":
				hash = ApplicationGlobal.getHash_12_0_3FCJBpel();
				break;
			case "FCJCoreDAOOracle":
				hash = ApplicationGlobal.getHash_12_0_3FCJCoreDAOOracle();
				break;
			case "FCJGeneralEJB":
				hash = ApplicationGlobal.getHash_12_0_3FCJGeneralEJB();
				break;
			case "FCJMBean":
				hash = ApplicationGlobal.getHash_12_0_3FCJMBean();
				break;
			case "FCJNeoWeb":
				hash = ApplicationGlobal.getHash_12_0_3FCJNeoWeb();
				break;
			case "FCJScheduler":
				hash = ApplicationGlobal.getHash_12_0_3FCJScheduler();
				break;
			case "FCJSMS":
				hash = ApplicationGlobal.getHash_12_0_3FCJSMS();
				break;
			case "FCJUtility":
				hash = ApplicationGlobal.getHash_12_0_3FCJUtility();
				break;
			case "FCJWebTab":
				hash = ApplicationGlobal.getHash_12_0_3FCJWebTab();
				break;
			}
		}
		
		for (Entry<String, String> entry : hash.entrySet()) {
			String key = entry.getKey();
			if (key.contains(input)) {
				// System.out.println(key);
				// System.out.println(entry.getValue());
				result.put(key, entry.getValue());
			}
		}
		JSONObject obj = new JSONObject(result);
		resp.setContentType("application/json");
		resp.setHeader("Access-Control-Allow-Origin","*");
		PrintWriter out = resp.getWriter();
		out.print(obj);
		out.flush();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			ApplicationGlobal.initInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
