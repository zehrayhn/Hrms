package Hrms.hrms.business.abstracts;

import java.util.List;

import Hrms.hrms.core.utilities.results.DataResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
	//Result isEmailExist(String email);
	//Result isNationalityIdExist(String nationalityId);
}
