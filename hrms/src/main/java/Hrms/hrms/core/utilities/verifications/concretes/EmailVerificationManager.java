package Hrms.hrms.core.utilities.verifications.concretes;

import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;
import Hrms.hrms.core.utilities.verifications.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public Result verifyEmail(String email) {
		
		return new SuccessResult();
	}

	
}
