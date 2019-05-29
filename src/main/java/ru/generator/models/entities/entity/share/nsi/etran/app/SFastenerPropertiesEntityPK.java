package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SFastenerPropertiesEntityPK implements Serializable {
    @Id
    @Column(name = "FASTENER_ID")
    private Integer fastenerId;
    @Id
    @Column(name = "PROPERTY_ID")
    private Integer propertyId;
} 
