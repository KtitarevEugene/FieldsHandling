package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SJointEntityPK implements Serializable {
    @Id
    @Column(name = "ST_ID")
    private Integer stId;
    @Id
    @Column(name = "ST_JOINT_ID")
    private Integer stJointId;
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
} 
