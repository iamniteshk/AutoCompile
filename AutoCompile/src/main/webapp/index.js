window.addEventListener("load", function(){

    // Add a keyup event listener to our input element
    var name_input = document.getElementById('svnPath');
    name_input.addEventListener("keyup", function(event){postajax(event)});
    
    var name_input2 = document.getElementById('svnPath2');
    name_input2.addEventListener("keyup", function(event){postajax(event)});
    
    var name_input3 = document.getElementById('svnPath3');
    name_input3.addEventListener("keyup", function(event){postajax(event)});
    
    var name_input4 = document.getElementById('svnPath4');
    name_input4.addEventListener("keyup", function(event){postajax(event)});

    // create one global XHR object 
    // so we can abort old requests when a new one is make
    window.ajaxreq = new XMLHttpRequest();
});

// Autocomplete for form
function postajax(event) {
	
	var list = document.getElementById('project1');
	if(list.value === '--Make a choice--'){
		document.getElementById('svnPath').value = "";
		alert("Please select project name first");
		document.getElementById('project1').focus();
		return false;
	}
	
	console.log("event fired")
    // retireve the input element
    var input = event.target;
	
	console.log(input.value);
	
	var version = document.getElementById('version');
	
	var project = document.getElementById('project1');

    // retrieve the datalist element
    var huge_list = document.getElementById('huge_list');

    // minimum number of characters before we start to generate suggestions
    var min_characters = 7;
    huge_list.innerHTML = "";
    if (input.value.length < min_characters ) { 
    	console.log("less than 7 characters")
        return;
    } else { 
    	console.log("calling..")
        // abort any pending requests
        window.ajaxreq.abort();

        window.ajaxreq.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {

                var response = JSON.parse( this.responseText ); 
                console.log(response);

                // clear any previously loaded options in the datalist
                

                for(var key in response){
                	
                                    // Create a new <option> element.
                    var option = document.createElement('option');
                   // option.value = response[key];
                    option.value = key;

                    // attach the option to the datalist element
                    huge_list.appendChild(option);
                };
            }
        };
        
        console.log("http://niteshkk-lap:8080/myServlet/AppCommonServlet?version="+version.value+"&project="+project.value+"&input="+input.value);

        window.ajaxreq.open("GET", "http://niteshkk-lap:8080/myServlet/AppCommonServlet?version="+version.value+"&project="+project.value+"&input="+input.value, true);
        window.ajaxreq.send()
    }
}