package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SContSizeToTonnageEntityPK implements Serializable {
    @Id
    @Column(name = "TONNAGE_ID")
    private Integer tonnageId;
    @Id
    @Column(name = "SIZE_ID")
    private Integer sizeId;
} 
