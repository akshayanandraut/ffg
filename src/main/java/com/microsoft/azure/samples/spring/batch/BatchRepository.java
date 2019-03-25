package com.microsoft.azure.samples.spring.batch;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BatchRepository extends JpaRepository<Batch, Long> {

    @Query(value="SELECT BATCH_ID FROM BATCH", nativeQuery=true)
    List<String> listAllBatches();

}