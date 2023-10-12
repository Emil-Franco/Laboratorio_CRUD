package Company.UserManagement.mediator;

import Company.UserManagement.entity.Users;
import Company.UserManagement.mediator.MediatorInterfazes.IdMediator;
import Company.UserManagement.service.ServiceFindUserById;
import org.springframework.stereotype.Service;

@Service
public class UserIdServiceMediator implements IdMediator {

    private final ServiceFindUserById serviceFindUserById;


    public UserIdServiceMediator(ServiceFindUserById serviceFindUserById){
        this.serviceFindUserById = serviceFindUserById;

    }

    @Override
    public Users getUserById(Long id) {
        return serviceFindUserById.getUserById(id);
    }
}
