<#include "base.ftl">
<#macro content>
	<!--block1  -->
    <div class="pagebox">
      <div class="botimg">
        <div class="container">
          <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <!--Content-->
                <div class="content">
                  <!-- START NESTED CONTENT -->             
                  <#nested/>
                  <!-- END NESTED CONTENT --> 
                </div>
                <div class="clearfix"></div>
                <!--end content-->
                
                <div class="ftifl">When ideas<br/>
                  &nbsp;&nbsp;&nbsp;&nbsp;turn into real<span>it</span>y
                </div>
            </div>
          </div>
        </div>
      </div>
    </div>
</#macro>
