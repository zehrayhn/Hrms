package Hrms.hrms.core.utilities.validations;

import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;
import Hrms.hrms.entities.concretes.JobSeeker;

public class BaseJobSeekerValidator {
	public static Result JobSeekerCheck(JobSeeker jobSeeker) {
	 
		Result firstNameValidator=FirstNameValidator.validResult(jobSeeker.getFistName());
		Result lastNameValidator=LastNameValidator.validResult(jobSeeker.getLastName());
		Result identityNumberValidator=IdentityNumberValidator.validResult(jobSeeker.getIdentityNumber());
		Result dateOfBirthValidator=DateOfBirthValidator.validResult(jobSeeker.getDateOfBirth());
		
		if(!firstNameValidator.isSuccess()) {
			return new ErrorResult(firstNameValidator.getMessage());
		}
		if(!lastNameValidator.isSuccess()) {
			return new ErrorResult(firstNameValidator.getMessage());
		}
		if(identityNumberValidator.isSuccess()) {
			return new ErrorResult(identityNumberValidator.getMessage());
		}
		if(dateOfBirthValidator.isSuccess()) {
			return new ErrorResult(dateOfBirthValidator.getMessage());
		}
		return new SuccessResult();
	}

}
