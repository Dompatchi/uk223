package ch.noseryoung.uk.domainModels.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // The logic for creating a new authority
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    // The logic for retrieving all authorities
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // logic for retrieving a single authority with a given id
    @Override
    public User findById(int id) {
        return userRepository.findById(id).get();
    }

    // The logic for updating an existing authority with a given id and data
    @Override
    public User updateById(int id, User user) {
        if(userRepository.existsById(id)) {
            user.setId(id);
            userRepository.save(user);

            return user;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    // The logic for deleting an authority with a given id
    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

}
