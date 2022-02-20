<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:htmlEscape defaultHtmlEscape="true"/>

<form action="" method="post" class="" id=email_subscription_form">
    <div class="demo-subscribe">
        <div class="">
            <input type="text" name="email" class="form-control" placeholder="Enter E-mail Address"/>
        </div>
        <div class="">
            <button id="email_sub_btn_submit" class="" data-callback="onSubmit">
                Add E-mail
            </button>
        </div>
    </div>
</form>