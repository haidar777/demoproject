<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:htmlEscape defaultHtmlEscape="true"/>

<div class="demo-note">
    <body>
        <form role="form" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" name="ordernoteform">
            <fieldset>
                <div>
                    <label for="name">Order Note</label><br>
                    <textarea input type="text" name="ordernote" placeholder="" cols="75" rows="3"></textarea>
                </div>
            </fieldset>
        </form>
    </body>
</div>