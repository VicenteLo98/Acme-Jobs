<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
<acme:list-column code="anonymous.sanjose-bulletin.list.label.name" path="name" width="20%"/>
<acme:list-column code="anonymous.sanjose-bulletin.list.label.secondname" path="secondname" width="20%"/>
<acme:list-column code="anonymous.sanjose-bulletin.list.label.company" path="company" width="60%"/>

</acme:list>