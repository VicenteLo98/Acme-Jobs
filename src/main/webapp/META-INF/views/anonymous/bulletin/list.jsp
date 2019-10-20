<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
<acme:list-column code="anonymous.bulletin.list.label.name" path="name" width="30%"/>
<acme:list-column code="anonymous.bulletin.list.label.text" path="text" width="70%"/>
</acme:list>