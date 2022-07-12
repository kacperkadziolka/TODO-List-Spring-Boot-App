package com.kkadziolka.TODOList.TODO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TODORepository extends JpaRepository<TODO, Long> {
}
