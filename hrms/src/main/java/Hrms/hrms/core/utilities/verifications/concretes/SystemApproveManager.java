package Hrms.hrms.core.utilities.verifications.concretes;

import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;
import Hrms.hrms.core.utilities.verifications.abstracts.SystemApproveService;
import Hrms.hrms.entities.concretes.Employer;

public class SystemApproveManager implements SystemApproveService {

	@Override
	public Result isApprovedFromSystem(Employer employer) {
	
		return new SuccessResult();
	}

}
