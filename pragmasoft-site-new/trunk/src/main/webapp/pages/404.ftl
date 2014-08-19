<#import "base.ftl" as base />
<@base.apply title="Pragmasoft - Error Page" keywords="Pragmasoft">
	<div class="desc">
    <h1>
        <#if Request["javax.servlet.error.exception"]??>
			${Request["javax.servlet.error.exception"].message!}
		<#elseif language="ru">
			Требуемый документ не найден : <br/> <strong>${Request["javax.servlet.error.request_uri"]}</strong>
		<#else>
			The requested document could not be found : <strong>${Request["javax.servlet.error.request_uri"]}</strong>
		</#if>
	</h1>	
	</div>
</@base.apply>