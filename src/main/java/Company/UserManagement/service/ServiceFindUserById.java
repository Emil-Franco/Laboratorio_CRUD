package Company.UserManagement.service;

import Company.UserManagement.entity.Users;
import Company.UserManagement.repository.UsersRepository;
import org.springframework.stereotype.Service;


@Service
public class ServiceFindUserById {

    private final UsersRepository usersRepository;

    public ServiceFindUserById(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public Users getUserById(Long id){
        return usersRepository.findById(id).orElse(null);
    }


}
