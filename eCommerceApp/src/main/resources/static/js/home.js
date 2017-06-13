$(document).ready(function () {
	var username = $("#username").val();
    $("#home").click(function () {
    	window.location = '/home'+"?name="+username;
    });
    $("#viewCart").click(function () {
    	var username = $("#username").val();
		var url= "http://localhost:8080/getCart/"+username;
    	$.get(url,function(data){
    		window.location = "/viewCart/"+username+"?name="+username;
    	});
    });
    $("#viewOrders").click(function () {
    	var username = $("#username").val();
    	window.location = '/viewOrders/'+username+"?name="+username;
    });
    $("#updateUser").click(function () {
    	var username = $("#username").val();
    	window.location = '/updateUser/'+username+"?name="+username;
		
    });
    $("#updateAddress").click(function () {
    	var username = $("#username").val();
    	window.location = '/updateUser/'+username+"?name="+username;
    });
    $("#logout").click(function () {
    	var username = $("#username").val();
    	window.location = '/logout';
    });
});

