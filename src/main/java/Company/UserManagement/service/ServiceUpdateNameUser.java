package Company.UserManagement.service;

import Company.UserManagement.entity.Users;
import Company.UserManagement.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceUpdateNameUser {

    private final UsersRepository userRepository;

    public ServiceUpdateNameUser(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users updatenameusers(Long id, String newname) {
        Optional<Users> usersOptional = userRepository.findById(id);
        if (usersOptional.isPresent()){
            Users users = usersOptional.get();
            users.setName(newname);
            return userRepository.save(users);
        }else {
            return null;
        }
    }
}
