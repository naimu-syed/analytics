package com.graphql.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.analytics.entity.DataRecord;

@Repository
public interface DataRecordRepository extends JpaRepository<DataRecord, Integer> {
}
