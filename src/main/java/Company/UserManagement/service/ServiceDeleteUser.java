package Company.UserManagement.service;

import Company.UserManagement.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceDeleteUser {

    private final UsersRepository usersRepository;

    public ServiceDeleteUser(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public void deleteUser(Long id){
        usersRepository.deleteById(id);
    }
}
