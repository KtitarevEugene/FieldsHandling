package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class STInvTranspClauseEntityPK implements Serializable {
    @Id
    @Column(name = "TRANSPCLAUSE_ID")
    private Integer transpclauseId;
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
} 
