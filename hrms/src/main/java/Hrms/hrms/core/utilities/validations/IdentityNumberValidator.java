package Hrms.hrms.core.utilities.validations;

import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;

public class IdentityNumberValidator {

	public static Result validResult(String identityNumber) {
		if (identityNumber=="")
		{
			return new ErrorResult("Kimlik numarası boş bırakılamaz");
		}
		
		else if(identityNumber.length()>=12 || identityNumber.length()<=10) 
			{
				return new ErrorResult();
				
			}
		return new SuccessResult();	
		
		
		}
		
	}


