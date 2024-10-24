package spring_react_jwt.spring_boot_jwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import spring_react_jwt.spring_boot_jwt.entity.User;

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository <User ,Long> {

}