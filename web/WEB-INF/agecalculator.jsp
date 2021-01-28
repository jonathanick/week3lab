<%-- 
    Document   : agecalculator
    Created on : Jan 27, 2021, 8:50:05 PM
    Author     : 828200
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>age</title>
    </head>
    <body>
        <form action="age" method="post"> 
            <h1>Enter you're age: </h1>
           
            <input type="text" name="age" value="${age}">
            <br>
            
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            <p> ${awnser}</p>
        </form>
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
