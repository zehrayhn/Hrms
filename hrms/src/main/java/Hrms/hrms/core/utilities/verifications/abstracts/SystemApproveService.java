package Hrms.hrms.core.utilities.verifications.abstracts;

import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.entities.concretes.Employer;

public interface SystemApproveService {

	public Result isApprovedFromSystem(Employer employer);
}
