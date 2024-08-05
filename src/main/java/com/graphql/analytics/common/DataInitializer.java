
  package com.graphql.analytics.common;
  
  import org.springframework.boot.CommandLineRunner;
import
  org.springframework.context.annotation.Bean;
import
  org.springframework.context.annotation.Configuration;

import com.graphql.analytics.entity.DataRecord;
import
  com.graphql.analytics.repository.DataRecordRepository;
  
  @Configuration public class DataInitializer {
  
  @Bean CommandLineRunner initDatabase(DataRecordRepository repository) {
  return args -> { repository.save(new DataRecord("John", 10000));
  repository.save(new DataRecord("Basha", 20000)); }; } }
 