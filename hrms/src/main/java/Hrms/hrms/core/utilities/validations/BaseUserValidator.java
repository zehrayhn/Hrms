package Hrms.hrms.core.utilities.validations;

import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;
import Hrms.hrms.entities.concretes.User;


public class BaseUserValidator {

	public static Result checkValuesUser(User user, String paswordAgain) {
		
		Result emailValid=EmailValidator.valid(user.getEmail());
		Result passwordValid=PasswordValidator.validResult(user.getPassword(), paswordAgain);
		
		if(!emailValid.isSuccess())
		{
			return new ErrorResult(emailValid.getMessage());
			
		}
		if(!passwordValid.isSuccess())
		{
			return new ErrorResult(passwordValid.getMessage());
		}
		return new SuccessResult();
		
	}
}
