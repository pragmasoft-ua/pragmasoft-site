<#import "base.ftl" as base />
<@base.apply title="Pragmasoft - Error Page" language="${language}">
    <h1>
        <#if Request["javax.servlet.error.exception"]??>
			${Request["javax.servlet.error.exception"].message!}
		<#else>
		    The requested document could not be found : <strong>${Request["javax.servlet.error.request_uri"]}</strong>
		</#if>
	</h1>	
</@base.apply> 