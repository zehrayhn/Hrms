package Hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrms.entities.concretes.Deneme;


public interface denemeDao extends JpaRepository<Deneme,Integer>{ 

}
