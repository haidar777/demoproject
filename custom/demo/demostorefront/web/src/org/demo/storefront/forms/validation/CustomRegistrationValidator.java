package org.demo.storefront.forms.validation;

import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import org.demo.storefront.forms.CustomRegisterForm;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.annotation.Resource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component("customRegistrationValidator")
public class CustomRegistrationValidator implements Validator{


    /**
     * Validates registration forms.
     */

    @Resource(name = "configurationService")
    private ConfigurationService configurationService;

    @Override
    public boolean supports(final Class<?> aClass)
    {
        return CustomRegisterForm.class.equals(aClass);
    }

    @Override
    public void validate(final Object object, final Errors errors)
    {
        final CustomRegisterForm customregisterForm = (CustomRegisterForm) object;
        final String titleCode = customregisterForm.getTitleCode();
        final String firstName = customregisterForm.getFirstName();
        final String lastName = customregisterForm.getLastName();
        final String userid = customregisterForm.getUserid();
        final String email = customregisterForm.getEmail();
        final String pwd = customregisterForm.getPwd();
        final String checkPwd = customregisterForm.getCheckPwd();
        final boolean termsCheck = customregisterForm.isTermsCheck();

        validateTitleCode(errors, titleCode);
        validateName(errors, firstName, "firstName", "register.firstName.invalid");
        validateName(errors, lastName, "lastName", "register.lastName.invalid");

        if (StringUtils.length(firstName) + StringUtils.length(lastName) > 255)
        {
            errors.rejectValue("lastName", "register.name.invalid");
            errors.rejectValue("firstName", "register.name.invalid");
        }

        validateUserid(errors, userid);
        validateEmail(errors, email);
        validatePassword(errors, pwd);
        comparePasswords(errors, pwd, checkPwd);
        validateTermsAndConditions(errors, termsCheck);
    }

    protected void comparePasswords(final Errors errors, final String pwd, final String checkPwd)
    {
        if (StringUtils.isNotEmpty(pwd) && StringUtils.isNotEmpty(checkPwd) && !StringUtils.equals(pwd, checkPwd))
        {
            errors.rejectValue("checkPwd", "validation.checkPwd.equals");
        }
        else
        {
            if (StringUtils.isEmpty(checkPwd))
            {
                errors.rejectValue("checkPwd", "register.checkPwd.invalid");
            }
        }
    }

    protected void validatePassword(final Errors errors, final String pwd)
    {
        if (StringUtils.isEmpty(pwd))
        {
            errors.rejectValue("pwd", "register.pwd.invalid");
        }
        else if (StringUtils.length(pwd) < 6 || StringUtils.length(pwd) > 255)
        {
            errors.rejectValue("pwd", "register.pwd.invalid");
        }
    }

    protected void validateEmail(final Errors errors, final String email)
    {
        if (StringUtils.isEmpty(email))
        {
            errors.rejectValue("email", "register.email.invalid");
        }
        else if (StringUtils.length(email) > 255 || !validateEmailAddress(email))
        {
            errors.rejectValue("email", "register.email.invalid");
        }
    }

    protected void validateName(final Errors errors, final String name, final String propertyName, final String property)
    {
        if (StringUtils.isBlank(name))
        {
            errors.rejectValue(propertyName, property);
        }
        else if (StringUtils.length(name) > 255)
        {
            errors.rejectValue(propertyName, property);
        }
    }

    protected void validateUserid(final Errors errors, final String userid)
    {
        if (StringUtils.isEmpty(userid))
        {
            errors.rejectValue("userid", "register.userid.invalid");
        }
        else if (StringUtils.length(userid) < 6 || StringUtils.length(userid) > 255)
        {
            errors.rejectValue("userid", "register.userid.invalid");
        }
    }

    protected void validateTitleCode(final Errors errors, final String titleCode)
    {
        if (StringUtils.isNotEmpty(titleCode) && StringUtils.length(titleCode) > 255)
        {
            errors.rejectValue("titleCode", "register.title.invalid");
        }
    }

    protected boolean validateEmailAddress(final String email)
    {
        final Matcher matcher = Pattern.compile(configurationService.getConfiguration().getString(WebConstants.EMAIL_REGEX))
                .matcher(email);
        return matcher.matches();
    }

    protected void validateTermsAndConditions(final Errors errors, final boolean termsCheck)
    {
        if (!termsCheck)
        {
            errors.rejectValue("termsCheck", "register.terms.not.accepted");
        }
    }
}
