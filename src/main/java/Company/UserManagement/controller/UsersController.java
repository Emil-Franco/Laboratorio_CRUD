package Company.UserManagement.controller;

import Company.UserManagement.entity.Users;
import Company.UserManagement.mediator.*;
import Company.UserManagement.service.ServiceUpdateNameUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api
@RequestMapping("/users")
public class UsersController {

    private final UserCreateServiceMediator userCreateServiceMediator;
    private final UserDeleteServiceMediator userDeleteServiceMediator;
    private final UserAllServiceUserAllMediator userAllServiceMediator;
    private final UserIdServiceMediator userIdServiceMediator;
    private final UserUpdateServiceMediator userUpdateServiceMediator;
    private final ServiceUpdateNameUser serviceUpdateNameUser;

    public UsersController(UserCreateServiceMediator userCreateServiceMediator, UserDeleteServiceMediator userDeleteServiceMediator, UserAllServiceUserAllMediator userAllServiceMediator, UserIdServiceMediator userIdServiceMediator, UserUpdateServiceMediator userUpdateServiceMediator, ServiceUpdateNameUser serviceUpdateNameUser) {
        this.userDeleteServiceMediator = userDeleteServiceMediator;
        this.userAllServiceMediator = userAllServiceMediator;
        this.userCreateServiceMediator = userCreateServiceMediator;
        this.userIdServiceMediator = userIdServiceMediator;
        this.userUpdateServiceMediator = userUpdateServiceMediator;
        this.serviceUpdateNameUser = serviceUpdateNameUser;
    }


    @ApiOperation(value = "Crear un usuario")
    @PostMapping
    public Users postusers(@RequestBody Users users) {
        return userCreateServiceMediator.createuser(users);
    }


    @ApiOperation(value = "Imprimir todos los usuarios")
    @GetMapping("/o")
    public List<Users> getallusers() {
        return userAllServiceMediator.findAllUsers();
    }



    @ApiOperation(value = "Buscar un usuario por su id")
    @GetMapping("/{id}")
    public Users getById(@PathVariable Long id) {
        return userIdServiceMediator.getUserById(id);
    }



    @ApiOperation(value = "Actualizar un usuario")
    @PutMapping("/{id}")
    public Users upgradeusers(@PathVariable Long id, @RequestBody Users users) {
        users.setId(id);
        return userUpdateServiceMediator.updateUser(users);

    }



    @ApiOperation(value = "Actualizar por el nombre")
    @PatchMapping("/{id}/nombre")
    public ResponseEntity<Users> updatenameusers(@PathVariable Long id, @RequestBody String newname){
        Users users = serviceUpdateNameUser.updatenameusers(id,newname);
        if (users != null){
            return ResponseEntity.ok(users);
        }else {
            return ResponseEntity.notFound().build();
        }
    }



    @ApiOperation(value = "Borrar un usuario por su id")
    @DeleteMapping("/{id}")
    public void deleteusers(@PathVariable Long id) {
        userDeleteServiceMediator.deleteuser(id);
    }


}
