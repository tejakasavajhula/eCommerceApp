$(document).ready(function () {
    $("#updateLine").click(function () {
    	var username = $("#username").val();
    	var lineId = $("#lineId").val();
    	var prodId = $("#prodId").val();
    	var prodName = $("#prodName").val();
    	var prodSupplier = $("#prodSupplier").val();
    	var prodPrice = $("#prodPrice").val();
    	var quantity = $("#Quantity").val();
    	var linePrice = $("#linePrice").val();
    	var msg="";
    	var json = {"line_id":lineId,"product":{"id":prodId,"name":prodName,"supplier":prodSupplier,"price":prodPrice},"quantity":quantity,"price_per_line":linePrice};
    	$.ajax({
    		type: 'PUT',
    		contentType: 'application/json',
    		url: "http://localhost:8080/updateLine/"+lineId,
    		//dataType: "json",
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "Line updated successfully";
    			window.location = '/viewCart/'+username+"?name="+username;
    			$("#message5").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/viewCart/'+username+"?name="+username;
    			$("#message5").html(msg);
    		}
    	});
    });
    $("#deleteLine").click(function () {
    	var username = $("#username").val();
    	var lineId = $("#lineId").val();
    	var prodId = $("#prodId").val();
    	var prodName = $("#prodName").val();
    	var prodSupplier = $("#prodSupplier").val();
    	var prodPrice = $("#prodPrice").val();
    	var quantity = $("#lineQuantity").val();
    	var linePrice = $("#linePrice").val();

    	var json = {"line_id":lineId,"product":{"id":prodId,"name":prodName,"supplier":prodSupplier,"price":prodPrice},"quantity":quantity,"price_per_line":linePrice};
    	var msg="";
    	$.ajax({
    		type: 'DELETE',
    		contentType: 'application/json',
    		url: "http://localhost:8080/deleteCartLine/"+username+"/"+lineId,
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "Product removed from the cart";
    			window.location = '/viewCart/'+username+"?name="+username;
    			$("#message5").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/viewCart/'+username+"?name="+username;
    			$("#message5").html(msg);
    		}
    	});
    });
    
    $("#deleteCart").click(function () {
    	var username = $("#username").val();

    	var msg="";
    	$.ajax({
    		type: 'DELETE',
    		contentType: 'application/json',
    		url: "http://localhost:8080/deleteCart/"+username,
    		success: function(){
    			msg = "Cart is deleted for the user";
    			window.location = '/viewCart/'+username+"?name="+username;
    			$("#message5").html(msg);
    		},
    		error: function(){
    			msg = "Cart delete unsuccessful";
    			window.location = '/viewCart/'+username+"?name="+username;
    			$("#message5").html(msg);
    		}
    	});
    });
});

