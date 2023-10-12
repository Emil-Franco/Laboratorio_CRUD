package Company.UserManagement.service;


import Company.UserManagement.entity.Users;
import Company.UserManagement.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class  ServiceCreateUser{
    // campo privado y final

    private final UsersRepository usersRepository;
    //Inyecta un bean de tipo UserRepository en el campo userRepository

    public ServiceCreateUser(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public Users createUsers(Users user){
        return usersRepository.save(user);
    }

}
