package Hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrms.business.abstracts.denemeService;
import Hrms.hrms.core.utilities.results.DataResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessDataResult;


import Hrms.hrms.dataAccess.abstracts.denemeDao;
import Hrms.hrms.entities.concretes.Deneme;

@Service
public class denemeManager implements denemeService {
private denemeDao denemeDao1;
	
	@Autowired
	
	public denemeManager(denemeDao denemeDao1) {
		super();
		this.denemeDao1 = denemeDao1;
	}
	@Override
	public DataResult<List<Deneme>> getAll() {

		return new SuccessDataResult<List<Deneme>>
		(this.denemeDao1.findAll(),"Data listelendi");
				
	}
	@Override
	public Result add(Deneme deneme) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
