package Company.UserManagement.service;

import Company.UserManagement.entity.Users;
import Company.UserManagement.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceFindAllUsers {

    private final UsersRepository usersRepository;

    public ServiceFindAllUsers(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }
}

