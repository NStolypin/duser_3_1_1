package ru.esplit.duser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ru.esplit.duser.models.User;
import ru.esplit.duser.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
       return userRepository.findAll();
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> read(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void update(Long id, User updateUser) {
    
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
