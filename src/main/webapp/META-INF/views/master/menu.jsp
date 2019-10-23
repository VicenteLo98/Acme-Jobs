<%--
- menu.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java" import="acme.framework.helpers.PrincipalHelper,acme.entities.roles.Provider,acme.entities.roles.Consumer"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:menu-bar code="master.menu.home">
	<acme:menu-left>
	
		<%--josruialb--%>
		<%--viclopvaz1--%>
		<%--albcorare26--%>
		<%--dansangar2--%>
		
		<acme:menu-option code="master.menu.anonymous" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.favourite-link" action="http://www.example.com/"/>
            <acme:menu-suboption code="master.menu.anonymous.favourite-linkJ" action="https://play.pokemonshowdown.com"/> <%--josruialb--%>
            <acme:menu-suboption code="master.menu.anonymous.favourite-linkV" action="https://www.twitch.tv"/> <%--viclopvaz1--%>
            <acme:menu-suboption code="master.menu.anonymous.favourite-linkA" action="https://www.youtube.com/?hl=es&gl=ES"/> <%--albcorare26--%>
            <acme:menu-suboption code="master.menu.anonymous.favourite-linkD" action="https://smashbros.com/es_ES/"/> <%--dnsangar2--%>
             <acme:menu-suboption code="master.menu.anonymous.favourite-linkAC" action="https://open.spotify.com/browse/featured"/> <%--antcorlav--%>
             
             <acme:menu-separator />
			<acme:menu-suboption code="master.menu.anonymous.sanjose-bulletin" action="/anonymous/sanjose-bulletin/create" />
			<acme:menu-suboption code="master.menu.anonymous.list-sanjose-bulletin" action="/anonymous/sanjose-bulletin/list" />
			<acme:menu-suboption code="master.menu.anonymous.shout" action="/anonymous/shout/create" />
			<acme:menu-suboption code="master.menu.anonymous.list-shout" action="/anonymous/shout/list" />
			
			
		</acme:menu-option>
		
		<acme:menu-option code="master.menu.anonymous2" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous2.lopez-bulletin" action="/anonymous/lopez-bulletin/create" />
			<acme:menu-suboption code="master.menu.anonymous2.list-lopez-bulletin" action="/anonymous/lopez-bulletin/list" />
			
			<acme:menu-separator/>
			
			<acme:menu-suboption code="master.menu.anonymous2.cordon-bulletin" action="/anonymous/cordon-bulletin/create" />
			<acme:menu-suboption code="master.menu.anonymous2.list-cordon-bulletin" action="/anonymous/cordon-bulletin/list" />
			
			<acme:menu-separator/>
			
			<acme:menu-suboption code="master.menu.anonymous2.corredera-bulletin" action="/anonymous/corredera-bulletin/create" />
			<acme:menu-suboption code="master.menu.anonymous2.list-corredera-bulletin" action="/anonymous/corredera-bulletin/list" />
			
		</acme:menu-option>

		<acme:menu-option code="master.menu.administrator" access="hasRole('Administrator')">
			<acme:menu-suboption code="master.menu.administrator.user-accounts" action="/administrator/user-account/list"/>
			<acme:menu-separator/>
			<acme:menu-suboption code="master.menu.administrator.shutdown" action="/master/shutdown"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.provider" access="hasRole('Provider')">
			<acme:menu-suboption code="master.menu.provider.favourite-link" action="http://www.example.com/"/>
	    	<acme:menu-suboption code="master.menu.provider.favourite-linkJ" action="https://play.pokemonshowdown.com"/> <%--josruialb--%>
	    	<acme:menu-suboption code="master.menu.provider.favourite-linkV" action="https://www.twitch.tv"/> <%--viclopvaz1--%>
	    	<acme:menu-suboption code="master.menu.provider.favourite-linkA" action="https://www.youtube.com/?hl=es&gl=ES"/> <%--albcorare26--%>
	    	<acme:menu-suboption code="master.menu.anonymous.favourite-linkD" action="https://smashbros.com/es_ES/"/> <%--dnsangar2--%>		
			<acme:menu-suboption code="master.menu.provider.favourite-linkAC" action="https://open.spotify.com/browse/featured"/> <%--antcorlav--%>
		</acme:menu-option>

		<acme:menu-option code="master.menu.consumer" access="hasRole('Consumer')">
			<acme:menu-suboption code="master.menu.consumer.favourite-link" action="http://www.example.com/"/>
			<acme:menu-suboption code="master.menu.consumer.favourite-linkJ" action="https://play.pokemonshowdown.com"/> <%--josruialb--%>
			<acme:menu-suboption code="master.menu.consumer.favourite-linkV" action="https://www.twitch.tv"/> <%--viclopvaz1--%>	
			<acme:menu-suboption code="master.menu.consumer.favourite-linkA" action="https://www.youtube.com/?hl=es&gl=ES"/> <%--albcorare26--%>
			<acme:menu-suboption code="master.menu.anonymous.favourite-linkD" action="https://smashbros.com/es_ES/"/> <%--dnsangar2--%>
			<acme:menu-suboption code="master.menu.consumer.favourite-linkAC" action="https://open.spotify.com/browse/featured"/> <%--antcorlav--%>
		</acme:menu-option>
	</acme:menu-left>

	<acme:menu-right>
		<acme:menu-option code="master.menu.sign-up" action="/anonymous/user-account/create" access="isAnonymous()"/>
		<acme:menu-option code="master.menu.sign-in" action="/master/sign-in" access="isAnonymous()"/>

		<acme:menu-option code="master.menu.user-account" access="isAuthenticated()">
			<acme:menu-suboption code="master.menu.user-account.general-data" action="/authenticated/user-account/update"/>
			<acme:menu-suboption code="master.menu.user-account.become-provider" action="/authenticated/provider/create" access="!hasRole('Provider')"/>
			<acme:menu-suboption code="master.menu.user-account.provider" action="/authenticated/provider/update" access="hasRole('Provider')"/>
			<acme:menu-suboption code="master.menu.user-account.become-consumer" action="/authenticated/consumer/create" access="!hasRole('Consumer')"/>
			<acme:menu-suboption code="master.menu.user-account.consumer" action="/authenticated/consumer/update" access="hasRole('Consumer')"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.sign-out" action="/master/sign-out" access="isAuthenticated()"/>
	</acme:menu-right>
</acme:menu-bar>

