package business;

import business.custom_exceptions.CustomNotFoundException;
import data.dtos.UserDTO;
import data.entities.User;
import data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(UserDTO userDTO){
        var user = new User();
        user.setDni(userDTO.getDni());
        user.setName(userDTO.getName());
        return userRepository.save(user);
    }

    public User findOneById(Long id){
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()) return userOptional.get();
        else throw new CustomNotFoundException("EL usuario con el id " + id + " no existe!");
    }

}
