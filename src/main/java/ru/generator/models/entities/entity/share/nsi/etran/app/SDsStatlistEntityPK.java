package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SDsStatlistEntityPK implements Serializable {
    @Id
    @Column(name = "STAT_ID")
    private Integer statId;
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
} 
