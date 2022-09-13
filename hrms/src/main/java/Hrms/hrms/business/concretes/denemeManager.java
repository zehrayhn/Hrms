package Hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrms.business.abstracts.denemeService;
import Hrms.hrms.core.utilities.results.DataResult;
import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessDataResult;
import Hrms.hrms.core.utilities.results.SuccessResult;
import Hrms.hrms.core.utilities.validations.DenemeValidatorService;
import Hrms.hrms.dataAccess.abstracts.denemeDao;
import Hrms.hrms.entities.concretes.Deneme;

@Service
public class denemeManager implements denemeService {
private denemeDao denemeDao1;
private DenemeValidatorService denemeValidatorService;	
	@Autowired
	
	public denemeManager(denemeDao denemeDao1,DenemeValidatorService denemeValidatorService) {
		super();
		this.denemeDao1 = denemeDao1;
		this.denemeValidatorService=denemeValidatorService;
	}
	@Override
	public DataResult<List<Deneme>> getAll() {

		return new SuccessDataResult<List<Deneme>>
		(this.denemeDao1.findAll(),"Data listelendi");
				
	}
	@Override
	public Result add(Deneme deneme) {
	if(this.denemeValidatorService.addkriter(deneme).isSuccess()) {
		 this.denemeDao1.save(deneme);
	      }
			//return new SuccessResult("deneme eklendi");}
		return new ErrorResult("salak");
	}
	
	

	
}
