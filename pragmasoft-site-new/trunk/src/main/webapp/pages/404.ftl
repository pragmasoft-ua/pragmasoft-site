<#import "base.ftl" as base />
<@base.apply title="Pragmasoft - Error Page">
    <h1>
        <#if Request["javax.servlet.error.exception"]??>
			${Request["javax.servlet.error.exception"].message!}
		<#else>
		    The requested resource cannot be found : <strong>${Request["javax.servlet.error.request_uri"]}</strong>
		</#if>
	</h1>
    
    <div class="clearfloats"></div>
    <!-- Content -->
    <div class="content"></div>
</@base.apply> 