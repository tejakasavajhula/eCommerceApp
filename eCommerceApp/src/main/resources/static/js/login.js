$(document).ready(function () {
    $("#doLogin").click(function () {
        var username = $("#username").val();
        var pass = $("#pass").val();
        var url = "http://localhost:8080/getUser/"+username;
        
        $.get(url, function(data, status){
            	if(data.username==username && data.pwd==pass){
            		window.location = "/home/"+"?name="+username;
            	}
            	else{
                    alert("Invalid username/password");            		
            	}
        });
    });
});