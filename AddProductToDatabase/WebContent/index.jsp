<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method = "post" action = "AddProductServlet">
		ProductId:<input type = "text" name = "productid"> <br/>
		ProductName:<input type="text" name="productName"> <br/>
		Price: <input type="text" name="price"><br/>
	
		<button type="submit">Add Product</button>
	</form>
</body>
</html>