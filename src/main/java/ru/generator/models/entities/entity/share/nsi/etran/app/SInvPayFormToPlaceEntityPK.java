package ru.generator.models.entities.entity.share.nsi.etran.app;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SInvPayFormToPlaceEntityPK implements Serializable {
    @Id
    @Column(name = "PAY_FORM")
    private Integer payForm;
    @Id
    @Column(name = "PAY_PLACE")
    private Integer payPlace;
} 
