<%-- 
    Document   : Inscrire
    Created on : 15 juin 2023, 22:44:10
    Author     : SY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/style.css"/>
    </head>
    <body>
        <h1>Bienvenue sur la page d'inscription</h1>
        <fieldset>
      <legend>Information personnelle</legend>
      <form action="../MonServlet" method="POST">
        <div>
          <label for="nom">Nom</label>
          <input type="text" name="nom" value="">
        </div>

        <div>
          <label for="prenom">Prenom</label>
          <input type="text" name="prenom" value="">
        </div>
        <div>
          <label for="pseudo">Pseudo</label>
          <input type="text" name="pseudo" value="">
        </div>
        <div>
          <label for="email">Email</label>
          <input type="text" name="email" value="">
        </div>
        <div>
          <label for="mdp">Mot de passe</label>
          <input type="password" name="mdp" value="">
        </div>
        <div>
          <label for="confirmer">Confirmer mot de passe</label>
          <input type="password" name="confirmer" value="">
        </div>
        <div>
          <label>&nbsp;</label>
          <input type="submit" name="envoyer" value="Envoyer">
        </div>

      </form>
    </fieldset>
    </body>
</html>
