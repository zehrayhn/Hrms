package Hrms.hrms.core.utilities.verifications.abstracts;

import Hrms.hrms.core.utilities.results.Result;

public interface EmailVerificationService {

	public Result verifyEmail(String email);
}
