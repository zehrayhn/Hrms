package Hrms.hrms.core.utilities.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;

public class PasswordValidator {
	public static Result validResult(String password, String password2) {
		if(password=="") {
			return new ErrorResult("Şifre alanı boş bırakılamaz.");
		}
		
		 String PASSWORD_PATTERN =
	            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

	    Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
	    
	    Matcher matcher = pattern.matcher(password);
        boolean result =matcher.find();
        if(!result) {
        	return new ErrorResult("İstenilen ölçütlere göre şifre oluşturulmalıdır.");
        }
        
        if(password2==null)
        	{
        	return new ErrorResult("Şifre tekrarı boş bırakılamaz");
        	}
        
        if(!password.equals(password2))
        	{
        	return new ErrorResult("Girilen şifreler aynı olmalıdır");
        	}
        
        return new SuccessResult();
	    
	}

}
