package Hrms.hrms.core.utilities.validations;


import java.time.LocalDate;

import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;


public class DateOfBirthValidator {

	public static Result validResult(LocalDate dateOfBirth ) {
		if(dateOfBirth.toString()=="") {
			return new ErrorResult("Doğum tarihi boş bırakılamaz");
			
		}
		
		return new SuccessResult();
	}
	
}
