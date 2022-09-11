package Hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrms.business.abstracts.JobSeekerService;
import Hrms.hrms.core.utilities.results.DataResult;
import Hrms.hrms.core.utilities.results.ErrorResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.core.utilities.results.SuccessDataResult;
import Hrms.hrms.core.utilities.results.SuccessResult;
import Hrms.hrms.core.utilities.verifications.abstracts.EmailVerificationService;
import Hrms.hrms.core.utilities.verifications.abstracts.MernisCheckService;
import Hrms.hrms.dataAccess.abstracts.JobSeekerDao;
import Hrms.hrms.entities.concretes.JobSeeker;
import net.bytebuddy.asm.Advice.This;

@Service
public class JobSeekerManager implements JobSeekerService {

	
	private JobSeekerDao jobSeekerDao;
//	private EmailVerificationService emailVerificationService;
//	private MernisCheckService mernisCheckService;
//	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		//this.emailVerificationService = emailVerificationService;
		//this.mernisCheckService = mernisCheckService;
	}


	
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listelendi.");
	}

	


//	@Override
//	public Result isEmailExist(String email) {
	  //  if(this.jobSeekerDao.findByEmail(email) !=null) {
	//	return new ErrorResult("Bu e-mail hesabı ile daha önce kayıt yapılmıştır.");
		//}
	  //  return new SuccessResult();
//		return null;
//	}


//	@Override
//	public Result isNationalityIdExist(String nationalityId) {
		//if(this.jobSeekerDao.findByNationalityId(nationalityId) != null) {
			//return new ErrorResult("Bu kimlik numarası ile daha önce kayıt yapılmıştır.");
		//}
		//return new SuccessResult();
	//	return null;
//	}
	
	@Override
	public Result add(JobSeeker jobSeeker) {
	   this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("İş arayan kaydedildi.");
	}
	
	
	
//	@Override
//	public Result add(JobSeeker jobSeeker)  {
//		if(!this.isEmailExist(jobSeeker.getEmail()).isSuccess() || !this.isNationalityIdExist(jobSeeker.getNationalityId()).isSuccess()) {
//			return new ErrorResult("failed");
//		}
//	if(!this.emailVerificationService.verifyEmail(jobSeeker.getEmail()).isSuccess()) {
//		return new ErrorResult("Check your email please");
//	}
//	
//	this.jobSeekerDao.saveAndFlush(jobSeeker);
//	return new SuccessResult("Job seeker saved");}
}



