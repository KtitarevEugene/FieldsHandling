package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SDepartmentEntityPK implements Serializable {
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
    @Id
    @Column(name = "DP_ID")
    private Integer dpId;
} 
