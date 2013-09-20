<#import "base.ftl" as base />
<@base.apply title="Pragmasoft - Error Page">
    <!--<h1 style="width:512px">
        <#if Request["javax.servlet.error.exception"]??>
			${Request["javax.servlet.error.exception"].message!}
		<#else>
		    The requested document could not be found : <strong>${Request["javax.servlet.error.request_uri"]}</strong>
		</#if>
	</h1>-->
	<h1>The requested document could not be found : </h1>
    
    <!-- Content -->
    
    <div class="content">
        <div class="desc" style="clear:both;">
            <!--<strong>${Request["javax.servlet.error.request_uri"]}</strong>-->
            Hello!
        </div>        
    </div>
</@base.apply> 