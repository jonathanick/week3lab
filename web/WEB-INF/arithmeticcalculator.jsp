<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 28, 2021, 2:00:12 PM
    Author     : 828200
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>arithmetic</title>
    </head>
    <body>
        <form action="arithmetic" method="post">
            <h1>Arithmetic Calculator</h1>
            <div><p>First: </p><input type="text" name="First" value="${First}"></div><br>
            <div><p>Second: </p><input type="text" name="Second" value="${Second}"></div><br>
            
            <input type="submit" value="+" name="submit"><input type="submit" value="-" name="submit"><input type="submit" value="*"  name="submit"><input type="submit" value="%"  name="submit">
           
        </form>
            <p>Result: ${message}</p>
            <a href="age">Age Calculator</a>
    </body>
</html>
