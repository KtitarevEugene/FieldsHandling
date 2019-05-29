package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SAtsIteEntityPK implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
} 
