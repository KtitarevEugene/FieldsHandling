package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SInvScaleTypeNsiEntityPK implements Serializable {
    @Id
    @Column(name = "SCALE_TYPE")
    private Integer scaleType;
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
} 
