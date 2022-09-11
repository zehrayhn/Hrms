package Hrms.hrms.business.abstracts;

import java.util.List;

import Hrms.hrms.core.utilities.results.DataResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.entities.concretes.Deneme;


public interface denemeService {
	DataResult<List<Deneme>> getAll();
    Result add(Deneme deneme);
}
