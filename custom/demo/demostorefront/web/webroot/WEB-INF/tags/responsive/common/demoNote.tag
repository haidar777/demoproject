<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:htmlEscape defaultHtmlEscape="true"/>

<div class="demo-note">
    <body>
        <form role="form" method="post" name="ordernoteform">
            <fieldset>
                <label for="order_note">Order Note</label>
                <div class="order_note">
                    <textarea class="order_note_form" input type="text" name="ordernote" placeholder=""></textarea>
                </div>
            </fieldset>
        </form>
    </body>
</div>