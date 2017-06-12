$(document).ready(function () {
    $("#doLogin").click(function () {
        var username = $("#username").val();
        var pass = $("#pass").val();
        
        var bool=false;
        $.get("http://localhost:8080/getAllUsers", function (data) {
            $.each(data, function (i, contact) {
                if (contact.username == username && contact.pwd == pass) {
                    bool=true;
                	window.location = "/home";
                }                 
            });
            if(bool==false){
            	msg = "Invalid username or password!";
                $("#message").html(msg);
            }
        });
    });
});