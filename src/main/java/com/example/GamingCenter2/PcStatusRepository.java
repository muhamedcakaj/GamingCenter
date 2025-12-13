package com.example.GamingCenter2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcStatusRepository extends JpaRepository<PcStatusEntity, Long> {
}
