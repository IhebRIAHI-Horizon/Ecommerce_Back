package org.horizon.repository;

import java.util.Optional;

import org.horizon.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	Optional<Role> findByRoleName(String name);
}
