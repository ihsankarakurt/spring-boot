package com.example.mapping.repository;

import com.example.mapping.dto.RecordLite;
import com.example.mapping.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query(nativeQuery = true)
    RecordLite findByRecordId(Long recordId);
}
