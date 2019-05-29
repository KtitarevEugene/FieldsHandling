package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SParagrafEntityPK implements Serializable {
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
    @Id
    @Column(name = "PAR_ID")
    private Integer parId;
} 
