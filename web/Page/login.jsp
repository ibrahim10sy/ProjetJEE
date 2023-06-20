<%-- 
    Document   : Login
    Created on : 15 juin 2023, 22:44:48
    Author     : SY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/style2.css">
    </head>
    <body>
        <h1>Page login</h1>
        <form action="../MonServlet2" method="POST">
        <div class="container">
    <div>
      <label for="">Pseudo</label>
      <input type="text" name="pseudo">
    </div>
    <div>
      <label for="">Mot de passe</label>
      <input type="password" name="mdp">
    </div>
     <input class="button" type="submit" value="Se connecter">
    </div>
            </form>
    </body>
</html>
