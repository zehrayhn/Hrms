package Hrms.hrms.core.utilities.validations;

import java.util.regex.Pattern;

import java.util.regex.Matcher;
import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;


public class EmailValidator {

	public static Result valid(String email) {
		if(email=="") {
			return new ErrorResult("Email boş bırakılamaz");
			
		}
		
		Pattern validEmailAdressRegex= Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		
		Matcher matcher= validEmailAdressRegex.matcher(email);
	
		
		boolean result = matcher.find();
		if(!result) {
			return new ErrorResult("Girilen email yanlış formattadır");
			
		}
		return new SuccessResult();
	}
}
