package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SDfAccidentCardEntityPK implements Serializable {
    @Id
    @Column(name = "CARD_ID")
    private Integer cardId;
    @Id
    @Column(name = "TRANS_ID")
    private Integer transId;
} 
