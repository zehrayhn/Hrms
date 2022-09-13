package Hrms.hrms.core.utilities.validations;

import org.springframework.stereotype.Service;

import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.entities.concretes.Deneme;

public interface DenemeValidatorService {
	Result addkriter(Deneme deneme);
}
