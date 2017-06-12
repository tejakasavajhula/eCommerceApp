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
    	var quantity = $("#quantity").val();
    	var json = {"product":{},"quantity":quantity};
    	var msg="";
    	$.ajax({
    		type: 'POST',
    		contentType: 'application/json',
    		url: "http://localhost:8080/addCartLine"+"/"+username,
    		//dataType: "json",
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "Product added to the cart";
    			window.location = '/home';
    			$("#message3").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/home';
    			$("#message3").html(msg);
    		}
    	});
    });
    $("#updateAddress").click(function () {
    	var username = $("#username").val();
    	var quantity = $("#quantity").val();
    	var json = {"product":{},"quantity":quantity};
    	var msg="";
    	$.ajax({
    		type: 'POST',
    		contentType: 'application/json',
    		url: "http://localhost:8080/addCartLine"+"/"+username,
    		//dataType: "json",
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "Product added to the cart";
    			window.location = '/home'+"?name="+username;
    			$("#message3").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/home'+"?name="+username;
    			$("#message3").html(msg);
    		}
    	});
    });
});

