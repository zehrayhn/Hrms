package Hrms.hrms.business.abstracts;

import java.util.List;

import Hrms.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
List<JobPosition> getAll();
}
