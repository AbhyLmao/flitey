package com.termproj.Flitey.repository;


import com.termproj.Flitey.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User,Integer> {
}
