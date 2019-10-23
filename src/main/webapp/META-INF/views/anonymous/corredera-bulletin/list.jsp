<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
<acme:list-column code="anonymous.corredera-bulletin.list.label.nombre" path="nombre" width="30%"/>
<acme:list-column code="anonymous.corredera-bulletin.list.label.fundador" path="fundador" width="70%"/>
</acme:list>