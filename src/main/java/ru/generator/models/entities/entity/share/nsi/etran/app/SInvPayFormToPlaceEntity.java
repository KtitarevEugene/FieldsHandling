package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_INV_PAY_FORM_TO_PLACE", schema = "NSI_ETR")
@IdClass(SInvPayFormToPlaceEntityPK.class)
/**Связка много ко многим между местом и формой расчетов. **/
public class SInvPayFormToPlaceEntity {
    @Id
    @Column(name = "PAY_FORM")
    private Integer payForm;
    @Id
    @Column(name = "PAY_PLACE")
    private Integer payPlace;
}
 