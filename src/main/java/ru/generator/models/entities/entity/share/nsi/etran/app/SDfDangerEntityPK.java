package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SDfDangerEntityPK implements Serializable {
    @Id
    @Column(name = "DANGER_ID")
    private Integer dangerId;
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
} 
