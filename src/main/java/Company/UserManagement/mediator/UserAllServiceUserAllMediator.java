package Company.UserManagement.mediator;

import Company.UserManagement.entity.Users;
import Company.UserManagement.mediator.MediatorInterfazes.UserAllMediator;
import Company.UserManagement.service.ServiceFindAllUsers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAllServiceUserAllMediator implements UserAllMediator {

    private final ServiceFindAllUsers serviceFindAllUsers;

    public UserAllServiceUserAllMediator(ServiceFindAllUsers serviceFindAllUsers){
        this.serviceFindAllUsers = serviceFindAllUsers;
    }
    @Override
    public List<Users> findAllUsers() {
        return serviceFindAllUsers.findAllUsers();
    }
}
