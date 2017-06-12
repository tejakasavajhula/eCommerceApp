$(document).ready(function () {
    $("#home").click(function () {
    	window.location = '/home';
    });
    $("#viewCart").click(function () {
    	var username = request.getParameter("name");
		var url= "http://localhost:8080/getCart/"+username;
    	$.get(url,function(data){
    		window.location = '/viewCart';
    	});
    });
    $("#viewOrders").click(function () {
    	var username = request.getParameter("name");
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
    			$("#message").html(msg);
    		}
    	});
    });
    $("#updateUser").click(function () {
    	var username = request.getParameter("name");
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
    	var username = request.getParameter("name");
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
});

