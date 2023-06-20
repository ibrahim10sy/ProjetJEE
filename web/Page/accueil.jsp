<%-- 
    Document   : Accueil
    Created on : 15 juin 2023, 22:44:27
    Author     : SY
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             div{
                 margin-bottom: 10rem;
             }
            table{
                width: 80%;
                border-radius: 5px;
                border-collapse: collapse;
                margin-top: 8rem;
            }
            th{
                background : darkgray;
                text-transform: uppercase;
                text-align: center;
            }
            td{
                text-transform: uppercase;
                text-align: center;
            }
            a{
                text-decoration: none;
                font-size: 25px;
                font-family: 'Poppins';
                position: absolute;
                bottom: 0;
                color: brown;
}
        </style>
    </head>
    <body>
        
        <c:if test="${!empty sessionScope.pseudo }">
        <h1>Bienvenue ${sessionScope.pseudo}</h1>
        </c:if>
        
          <center>
        <table border="1">
            
            <tr>
                <th>N°</th>
                <th>Nom</th>
                <th>Prenom</th>
                <th>Pseudo</th>
                <th>Email</th>
                <th>MDP</th>
                <th>Confirme MDP</th>
                <th>Action</th>
            </tr>
                  <c:forEach items="${tliste}" var="ins" varStatus="status"> 
             <tr>
                 <td>${status.count}</td>
                <td>${ins.nom}</td>
                <td>${ins.prenom}</td>
                <td>${ins.pseudo}</td>
                <td>${ins.email}</td>
                <td>${ins.mdp}</td> 
                <td>${ins.confirmer}</td> 
                <td></td> 
              
             </tr>
             </c:forEach>
        </table>
    </center>
        
         <a href="${pageContext.request.contextPath}/Page/login.jsp">Déconnexion</a>
    </body>
</html>
