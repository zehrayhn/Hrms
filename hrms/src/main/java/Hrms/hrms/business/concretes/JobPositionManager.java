package Hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import Hrms.hrms.business.abstracts.JobPositionService;
import Hrms.hrms.core.utilities.results.DataResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessDataResult;
import Hrms.hrms.core.utilities.results.SuccessResult;
import Hrms.hrms.dataAccess.abstracts.JobPositionDao;
import Hrms.hrms.entities.concretes.JobPosition;
import javassist.expr.NewArray;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {

		return new SuccessDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(),"Data listelendi");
				
	}

	
	@Override
	public Result add(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
		return new SuccessResult("iş pozisyonu eklendi");
		
	}

}
