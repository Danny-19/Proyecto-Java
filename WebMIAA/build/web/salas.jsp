<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form method="POST" action="./Salas">
    Cantidad  de Sillas: <input type="text" name="numSillas" required /><br /><br />
    Numero de la Sala: <input type="text" name="numSala" required /><br /><br />
    <input type="submit" value="Crear Sala" />
</form>
<c:set var="var" value="existe"/>  
<c:if test="${salaExiste == var}">
    <p>La sala ya existe</p>
</c:if>
<c:if test="${not empty listaSala}">
    <table style=" text-align: center">

        <tr>
            <th width="120">Numero de la Sala</th>
            <th width="120">Cantidad de Sillas</th>
        </tr>
        <c:forEach items="${listaSala}" var="sala">
            <tr>
                <td>${sala.getNumeroSala()}</td>
                <td>${sala.getCantidadSillas()}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<%@include file="footer.jsp" %>
