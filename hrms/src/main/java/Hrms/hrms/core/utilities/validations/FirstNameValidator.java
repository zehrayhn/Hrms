package Hrms.hrms.core.utilities.validations;

import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;

public class FirstNameValidator {

	public static Result validResult (String firstName)
	{
		if (firstName=="") {
			return new ErrorResult("İsim boş olamaz");
		}
		
		return new SuccessResult();
	}
	
}
