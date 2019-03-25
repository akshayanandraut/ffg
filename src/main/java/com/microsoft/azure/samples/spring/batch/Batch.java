package com.microsoft.azure.samples.spring.batch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Table;


@Entity
@Table(value="BATCH")
public class Batch{

    @Id
    @Column(name="BATCH_ID")
    private String batchId;

    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }


}