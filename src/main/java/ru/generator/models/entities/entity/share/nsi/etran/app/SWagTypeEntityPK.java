package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SWagTypeEntityPK implements Serializable {
    @Id
    @Column(name = "WAG_TYPE_ID")
    private Integer wagTypeId;
    @Id
    @Column(name = "WAG_TYPE_CODE")
    private Integer wagTypeCode;
} 
