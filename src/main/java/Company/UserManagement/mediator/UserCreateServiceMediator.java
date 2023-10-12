package Company.UserManagement.mediator;

import Company.UserManagement.entity.Users;
import Company.UserManagement.mediator.MediatorInterfazes.CreateMediator;
import Company.UserManagement.service.ServiceCreateUser;
import org.springframework.stereotype.Service;

@Service
public class UserCreateServiceMediator implements CreateMediator {

    private final ServiceCreateUser serviceCreateUser;

    public UserCreateServiceMediator(ServiceCreateUser serviceCreateUser) {
        this.serviceCreateUser = serviceCreateUser;
    }


    @Override
    public Users createuser(Users users) {
        return serviceCreateUser.createUsers(users);
    }
}
