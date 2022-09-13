package Hrms.hrms.core.utilities.validations;

import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;

public class LastNameValidator {

	public static Result validResult(String lastName) {
		if(lastName=="") {
			return new ErrorResult("Soyisim boş bırakılamaz");
			
		}
		
		return new SuccessResult();
	}
	
}
