package ru.esplit.duser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.esplit.duser.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
