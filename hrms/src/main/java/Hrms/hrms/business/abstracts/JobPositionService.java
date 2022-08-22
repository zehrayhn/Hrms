package Hrms.hrms.business.abstracts;

import java.util.List;

import Hrms.hrms.core.utilities.results.DataResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	DataResult<List<JobPosition>> getAll();
    Result add(JobPosition jobPosition);
}
