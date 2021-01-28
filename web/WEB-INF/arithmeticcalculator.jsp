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
        <form>
            <h1>Arithmetic Calculator</h1>
            <p>First: </p><input type="text" name="First" value="${First}"><br>
            <p>Last: </p><input type="text" name="Last" value="${Last}"><br>
            <input type="submit" value="+"><input type="submit" value="-"><input type="submit" value="*"><input type="submit" value="%">
        </form>
            <p>Result: ${message}</p>
            <a href="age">Age Calculator</a>
    </body>
</html>
