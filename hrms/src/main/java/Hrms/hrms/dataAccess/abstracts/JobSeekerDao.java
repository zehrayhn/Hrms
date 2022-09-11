package Hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

	JobSeeker findByEmail(String email);
	JobSeeker findByNationalityId(String nationalityId);
	
}
