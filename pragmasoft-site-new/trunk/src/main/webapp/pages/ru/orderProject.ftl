<#assign headerContent>
	<script src="${app}res/js/jquery.validate.min.js" type="text/javascript"></script>
	<script src="${app}res/js/validate.js" type="text/javascript"></script>
	<script src="${app}res/js/localization/messages_ru.js" type="text/javascript"></script>
</#assign>
<#import "../formContent.ftl" as base />
<@base.apply header=headerContent>
	<form role="form" id="orderForm" action="${app}${language}/email" method="post">
          <h4 class="form-title">Свяжитесь с нами</h4>
        <div>
          <div class="form-group">
            <label for="requesterName">ФИО:</label>
            <input type="text" class="form-control" id="requesterName" name="requesterName" placeholder="">
          </div>
          <div class="form-group">
            <label for="requesterEmail">Электронная почта:</label>
            <input type="email" class="form-control" id="requesterEmail" name="requesterEmail" placeholder="">
          </div>
          <div class="form-group">
            <label for="message">Текст сообщения:</label>
            <textarea class="form-control" rows="6" id="message" name="message"></textarea>
          </div>
        </div>
        <div>
          <input type="submit" class="m-btn" value="Отправить сообщение →"></input>
        </div>
        </div>
      </form>
</@base.apply>