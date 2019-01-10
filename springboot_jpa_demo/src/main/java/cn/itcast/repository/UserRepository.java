package cn.itcast.repository;

import cn.itcast.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {

    public List<User> findAll();

    public User findUserById(Integer id);


    public void saveUser(User user);
}
