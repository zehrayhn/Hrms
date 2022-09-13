package Hrms.hrms.core.utilities.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessResult;
import Hrms.hrms.entities.concretes.Deneme;
@Service
public class DenemeValidator implements DenemeValidatorService {



	@Override
	public Result addkriter(Deneme deneme) {
	
		Pattern validEmailAdressRegex= Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		
		Matcher matcher= validEmailAdressRegex.matcher(deneme.getEmail());
	
		
		boolean result = matcher.find();
		
		if(deneme.getEmail()=="") {
			return new ErrorResult("Email boş bırakılamaz");
			
		}
			
		else if(!result) {
			return new ErrorResult("Girilen email yanlış formattadır");
			
		}
		return new SuccessResult("ürün eklendi");
	}
	
}
