<html>
	<head>
		<title>demo</title>
		<meta charset='utf-8'>
		
	</head>

	<body>
	
		<#-- this is a comment aaaaaaaa -->
		<!-- HTML comment -->
		
		<#include "head.ftl">
		
		hello, ${name},  ${msg}
		<br>
		<#assign contacter="Mr.Lee" info={'phone':'123123','location':'LA'}>
		your contacter :${contacter};
		<br>
		
		phone number : ${info.phone}
		<br>
		location: ${info.location}
		<br>
		
		<#if success=true>
			you have paid you fee;
		<#else>
			you havn't paid you fee yet;
		</#if>
		
		
		<#list goodsList as goods>
	
			<br>	
				${goods_index}
				<br>
			name: ${goods.name} 
			<br>
			price: ${goods.price}
			<br>
			-----------------
		</#list>
		<br>
		
		total :${goodsList?size}, record;
			<br>
		
		<#assign jsonObj="{'bank':'BMO','account':'123123'}">
		<#assign data=jsonObj?eval>
			bank:${data.bank}	<br>
		
			account:${data.account}<br>
		date:${today?date}<br>
		time:${today?time}<br>
		datetime:${today?datetime}<br>
		format:${today?string('yyyy/MM/dd')}<br>
		
		<br>
		points:${point}.
		<br>
		points:${point?c}
		
		
		<br>
		<#if a??>
		a exists
		<#else>
		a dont exist
		</#if>
		
		<br>
		${b!" b don't exist"}
		
		
		
		
		
	</body>
</html>