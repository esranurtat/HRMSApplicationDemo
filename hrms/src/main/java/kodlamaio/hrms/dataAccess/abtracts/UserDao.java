package kodlamaio.hrms.dataAccess.abtracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer>{
	Users findUsersByEmail(String email);
}
