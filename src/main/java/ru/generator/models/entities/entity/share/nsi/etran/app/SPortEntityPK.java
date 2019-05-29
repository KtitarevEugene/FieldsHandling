package ru.generator.models.entities.entity.share.nsi.etran.app;


import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class SPortEntityPK implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Id
    @Column(name = "RECDATEBEGIN")
    private Date recDateBegin;
    @Id
    @Column(name = "RECDATEEND")
    private Date recDateEnd;
    @Id
    @Column(name = "ST_ID")
    private Integer stId;
} 
