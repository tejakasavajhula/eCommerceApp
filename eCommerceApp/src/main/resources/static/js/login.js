$(document).ready(function () {
    $("#doLogin").click(function () {
        var username = $("#username").val();
        var pass = $("#pass").val();

        $.get("http://localhost:8080/getAllUsers", function (data) {
            $.each(data, function (i, contact) {
                if (contact.username == username && contact.pwd == pass) {
                    window.location = "home.html";
                } else {
                    msg = "Invalid username or password!";
                }
                $("#message").html(msg);
                
            });

        });
    });
});