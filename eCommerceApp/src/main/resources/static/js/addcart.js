$(document).ready(function () {
$("#AddToCart").click(function () {
    	var username = request.getParameter("name");
    	var quantity = $("#quantity").val();
    	var id = $("#ID").val();
    	var name = $("#NAME").val();
    	var supplier = $("#SUPPLIER").val();
    	var price = $("#PRICE").val();
    	var json = {"product":{"id":id,"name":name,"supplier":supplier,"price":price},"quantity":quantity};
    	$.ajax({
    		type: 'POST',
    		contentType: 'application/json',
    		url: "http://localhost:8080/addCartLine"+"/"+username,
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "Product added to the cart";
    			window.location = '/home';
    			$("#message").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/viewProduct/'+id;
    			$("#message").html(msg);
    		}
    	});
    });
});