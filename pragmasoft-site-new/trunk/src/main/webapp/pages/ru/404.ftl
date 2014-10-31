<#import "../contentBase.ftl" as base />
<@base.apply title="Pragmasoft - Error Page">
	<div class="desc">
    <h1>
        <#if Request["javax.servlet.error.exception"]??>
			${Request["javax.servlet.error.exception"].message!}
		<#else>
			Требуемый документ не найден : <br/> <strong>${Request["javax.servlet.error.request_uri"]}</strong>
		</#if>
	</h1>	
	</div>
    <div class="pr-btn-order"><a href="${app}${language}/contactus">Заказать проект</a></div>
</@base.apply>