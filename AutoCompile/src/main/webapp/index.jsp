<%@ page language="java" errorPage="error.jsp" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
html, body {
	height: 100%;
	width: 100%
}

body {
	background-color: #2959a0;
	color: #fff;
	font-size: auto;
	font-weight: normal;
	height: 100%;
	overflow: hidden;
}

table {
	border-collapse: separate;
}

input {
	text-align: center;
}

.footer .fa {
	color: red;
}

.footer {
	position: absolute;
	bottom: 0px;
	width: 100%;
}
</style>
<script src="https://use.fontawesome.com/5098c18a86.js"></script>
<title>Auto Compilation</title>
</head>
<body onload="document.form.reset();">

	</br>
	</br>
	<h2 align="center">Welcome Guest!! Thanks for using this
		application.</h2>
	</br>
	</br>


	<form method="post" action="UploadServlet"
		enctype="multipart/form-data" name="form"
 		onsubmit="return validateForm()">
		<table align="center" bgcolor="#2959a0" border="0" width="70%">
			<tr>
				<td colspan="2" align="center" style="height: 40px;">Fill all
					the following fields</td>
			</tr>
			<tr>
				<td>Enter the file SVN path:</td>
				<td><input type="text" name="svnPath"
					style="width: 300px; height: 20px;"
					placeholder="Example: FacilityKernel.java"
					required></td>
			</tr>
			<tr>
				<td>Select the FCUBS version:</td>
				<td><input list="version" name="version" style="height: 20px;"
					required> <datalist id="version">
					<option value="12.0.1"></option>
					<option value="12.0.2"></option>
					<option value="12.0.3"></option>
					</datalist></td>
			</tr>
			<tr>
				<td>Select the jdk version:</td>
				<td><input list="jdk" name="jdk" style="height: 20px;" required>
					<datalist id="jdk">
					<option value="1.5"></option>
					<option value="1.6"></option>
					<option value="1.7"></option>
					</datalist></td>
			</tr>
			<tr>
				<td>Enter the requester email id:</td>
				<td><input type="email" name="email"
					style="width: 300px; height: 20px;" placeholder="xyz@oracle.com"
					required></td>
			</tr>
			<tr>
				<td>Select file to upload:</td>
				<td><input type="file" name="dataFile" id="fileChooser"
					multiple="multiple" required></td>
			</tr>
			<tr>
				<td colspan="2" align="center"
					style="font-size: 50px; height: 2em; width: 2em;"><input
					type="submit" name="Submit" value="generate"></td>
			</tr>
		</table>
	</form>

	<p align="center">
		Note: In case of any issue please write a mail to <a
			href="mailto:nitesh.z.kumar@oracle.com?Subject=Error%20reported"
			target="_top" style="color: white;">Nitesh.z.kumar@oracle.com</a>
		with the issue screenshot.
	<center class="footer">
		<img alt="logo" src="logo.png" width="100" height="100" border="0">
	</center>
	<script>
		function validateForm() {
			var x = document.forms["form"]["svnPath"].value;
			//alert(x.substring(0, x.indexOf("/"));
			if (x.substring(0, x.indexOf("/")) == "ELCMCommon"
					|| x.substring(0, x.indexOf("/")) == "ELCMDto"
					|| x.substring(0, x.indexOf("/")) == "ELCMEJB"
					|| x.substring(0, x.indexOf("/")) == "ELCMEntities"
					|| x.substring(0, x.indexOf("/")) == "ELCMGateway"
					|| x.substring(0, x.indexOf("/")) == "ELCMKernel"
					|| x.substring(0, x.indexOf("/")) == "ELCMKernelJpa"
					|| x.substring(0, x.indexOf("/")) == "ELCMKernelSQLJ"
					|| x.substring(0, x.indexOf("/")) == "ELCMUtility"
					|| x.substring(0, x.indexOf("/")) == "ELCMWeb"
					|| x.substring(0, x.indexOf("/")) == "ELGatewayClient"
					|| x.substring(0, x.indexOf("/")) == "FCGateway"
					|| x.substring(0, x.indexOf("/")) == "FCJBatch"
					|| x.substring(0, x.indexOf("/")) == "FCJBpel"
					|| x.substring(0, x.indexOf("/")) == "FCJCoreDAOOracle"
					|| x.substring(0, x.indexOf("/")) == "FCJGeneralEJB"
					|| x.substring(0, x.indexOf("/")) == "FCJMBean"
					|| x.substring(0, x.indexOf("/")) == "FCJNeoWeb"
					|| x.substring(0, x.indexOf("/")) == "FCJScheduler"
					|| x.substring(0, x.indexOf("/")) == "FCJSMS"
					|| x.substring(0, x.indexOf("/")) == "FCJUtility"
					|| x.substring(0, x.indexOf("/")) == "FCJWebTab")
					 {
				alert("Only filename with extension is required. No need to provide the path.");
				document.forms["form"]["svnPath"].value = "";
				return false;
					 }
				else {
				
				//alert(x.substring(0, x.indexOf("/")));
				return true;
			}
		}
	</script>
</body>
</html>