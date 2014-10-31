<#assign headerContent>
	<script src="${app}res/js/jquery.validate.min.js" type="text/javascript"></script>
	<script src="${app}res/js/validate.js" type="text/javascript"></script>
</#assign>
<#import "../formContent.ftl" as base />
<@base.apply header=headerContent>
	<form role="form" id="orderForm" action="${app}${language}/email" method="post">
          <h4 class="form-title">contact us</h4>
        <div>
          <div class="form-group">
            <label for="requesterName">Name:</label>
            <input type="text" class="form-control" id="requesterName" name="requesterName" placeholder="">
          </div>
          <div class="form-group">
            <label for="requesterEmail">Email:</label>
            <input type="email" class="form-control" id="requesterEmail" name="requesterEmail" placeholder="">
          </div>
          <div class="form-group">
            <label for="message">Message:</label>
            <textarea class="form-control" rows="6" id="message" name="message"></textarea>
          </div>
        </div>
        <div>
          <input type="submit" class="m-btn" value="Send message →"></input>
        </div>
        </div>
      </form>
</@base.apply>