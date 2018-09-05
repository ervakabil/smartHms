package com.etiya.hms.model.common;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
 

@Data
@EqualsAndHashCode(callSuper=false, of={"id"})
public class Footprint {

    @CreatedBy
    private Signature createdBy;

    @CreatedDate
    private Date createdDate;

    @LastModifiedBy
    private Signature lastModifiedBy;

    @LastModifiedDate
    private Date lastModifiedDate;

    @Version
    private Long version;

    @Id
    private ObjectId id;
 
 

}