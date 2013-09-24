<#import "base.ftl" as base />
<@base.apply title="Pragmasoft - Error Page" language="${language}">
<div class="content"><div class="desc">
    <h1>
        <#if Request["javax.servlet.error.exception"]??>
			${Request["javax.servlet.error.exception"].message!}
		<#else>
		    The requested document could not be found : <strong>${Request["javax.servlet.error.request_uri"]}</strong>
		</#if>
	</h1>	
</div></div> 
</@base.apply> 