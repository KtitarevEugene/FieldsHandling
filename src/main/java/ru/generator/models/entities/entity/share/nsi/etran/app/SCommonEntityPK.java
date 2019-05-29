package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SCommonEntityPK implements Serializable {
    //    @Id
//    @Column(name = "TRANS_ID")
//    private Integer transId;
    @Id
    @Column(name = "PARAM_ID")
    private Integer paramid;
    @Id
    @Column(name = "ID")
    private Integer id;
} 
