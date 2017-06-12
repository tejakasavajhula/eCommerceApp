$(document).ready(function () {
    $("#doRegister").click(function () {
        var username = $("#username").val();
        var pass = $("#pwd").val();
        var firstname = $("#firstname").val();
        var lastname = $("#lastname").val();
        var email = $("#email").val();
        var phone = $("#phone").val();
        var role = $("#role").val();
        var msg;
        var json = {"username":username, "pwd":pass,"firstName":firstname,"lastName":lastname,"email":email,"phone":phone,"role":role};
        
        $.ajax({
    		type: 'POST',
    		contentType: 'application/json',
    		url: "http://localhost:8080/registerUser",
    		//dataType: "json",
    		data: JSON.stringify(json),
    		success: function(data){
    			msg = "Registration Successful";
    			window.location = '/login';
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/register';
    		}
    	});
        $("#message2").html(msg);
    });
});