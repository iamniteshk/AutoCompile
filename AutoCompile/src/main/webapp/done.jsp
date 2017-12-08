<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.showcss {
	display: block;
}

.hidecss {
	display: none;
}
</style>
<title>Auto Compilation</title>
<script type="text/javascript" src="jquery-3.2.1.js">
	
</script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
	integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
	crossorigin="anonymous"></script>
	
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css" />

<script type="text/javascript">
	$(document).ready(function() {
		ShowCustomDialog();
	});

	function ShowCustomDialog() {

		ShowDialogBox('Success', 'Your file has been uploaded! You will soon recieve an email containing the log file and class files or java files(in case of error) shortly', 'Ok', 'exit',
				'GoToAssetList', null);
	}

	function ShowDialogBox(title, content, btn1text, btn2text, functionText,
			parameterList) {
		var btn1css;
		var btn2css;

		if (btn1text == '') {
			btn1css = "hidecss";
		} else {
			btn1css = "showcss";
		}

		$("#lblMessage").html(content);

		$("#dialog").dialog({
			resizable : false,
			title : title,
			modal : true,
			width : '400px',
			height : 'auto',
			bgiframe : false,
			hide : {
				effect : 'scale',
				duration : 400
			},

			buttons : [ {
				text : btn1text,
				"class" : btn1css,
				click : function(event) {
					$("#dialog").dialog('close');
					<%-- var target = $( event.target );
					 // alert (target.nodeName);
					  if ( target.is( "button" ) ) {
						  <%response.sendRedirect("index.jsp");%>
					  } --%>
					  $(location).attr('href',"index.jsp");
				}
			} ]
		});
	}
</script>
</head>
<body>
	<div id="dialog" title="Alert message" style="display: none">
		<div class="ui-dialog-content ui-widget-content">
			<p>
				<span class="ui-icon ui-icon-alert"
					style="float: left; margin: 0 7px 20px 0"></span> <label
					id="lblMessage"> </label>
			</p>
		</div>
	</div>
</body>
</html>