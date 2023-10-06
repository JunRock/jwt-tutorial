package com.example.jwttutioral.repository;

import com.example.jwttutioral.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @EntityGraph(attributePaths = "authorities") // 쿼리를 수행할 때 Eager 조회로 authorities 정보를 가져옴
    Optional<User> findOneWithAuthoritiesByUsername(String userName);
}
