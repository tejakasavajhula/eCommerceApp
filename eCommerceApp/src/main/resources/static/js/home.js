$(document).ready(function () {
    $("#AddToCart").click(function () {
    	$.ajax({
    		type: 'POST',
    		contentType: 'application/json',
    		url: "http://localhost:8080/getProducts",
    		//dataType: "json",
    		success: function(data){
    			
    		}
    	});
    });
});

