package Company.UserManagement.mediator;

import Company.UserManagement.entity.Users;
import Company.UserManagement.mediator.MediatorInterfazes.UpdateMediator;
import Company.UserManagement.service.ServiceUpdateUser;
import org.springframework.stereotype.Service;


@Service
public class UserUpdateServiceMediator implements UpdateMediator {


    private final ServiceUpdateUser serviceUpdateUser;

    public UserUpdateServiceMediator(ServiceUpdateUser serviceUpdateUser) {
        this.serviceUpdateUser = serviceUpdateUser;
    }

    @Override
    public Users updateUser(Users users) {
        return serviceUpdateUser.updateUsers(users);
    }
}
