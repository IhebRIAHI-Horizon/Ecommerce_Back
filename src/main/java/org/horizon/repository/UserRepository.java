package org.horizon.repository;

import java.util.Optional;

import org.horizon.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	Optional<User> findByUserEmail(String email);

    Boolean existsByUserEmail(String email);
}
