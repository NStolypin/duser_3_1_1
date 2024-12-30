package ru.esplit.duser.service;

import java.util.List;
import java.util.Optional;

import ru.esplit.duser.models.User;

public interface UserService {
    List<User> getAll();

    void create(User user);

    Optional<User> read(Long id);

    void update(Long id, User updateUser);

    void delete(Long id);
}
