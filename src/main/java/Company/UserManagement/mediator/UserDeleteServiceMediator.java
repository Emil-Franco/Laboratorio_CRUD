package Company.UserManagement.mediator;

import Company.UserManagement.mediator.MediatorInterfazes.DeleteMediator;
import Company.UserManagement.service.ServiceDeleteUser;
import org.springframework.stereotype.Service;

@Service
public class UserDeleteServiceMediator implements DeleteMediator {

    private final ServiceDeleteUser serviceDeleteUser;

    public UserDeleteServiceMediator(ServiceDeleteUser serviceDeleteUser) {
        this.serviceDeleteUser = serviceDeleteUser;
    }

    @Override
    public void deleteuser(Long id) {
        serviceDeleteUser.deleteUser(id);
    }
}
