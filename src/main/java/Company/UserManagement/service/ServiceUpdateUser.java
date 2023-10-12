package Company.UserManagement.service;

import Company.UserManagement.entity.Users;
import Company.UserManagement.repository.UsersRepository;
import org.springframework.stereotype.Service;


@Service
public class ServiceUpdateUser {
    private final UsersRepository usersRepository;

    public ServiceUpdateUser(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public Users updateUsers(Users users){
        usersRepository.findById(users.getId()).ifPresent(existingUser -> users.setId(existingUser.getId()));
        return  usersRepository.save(users);
    }

}
