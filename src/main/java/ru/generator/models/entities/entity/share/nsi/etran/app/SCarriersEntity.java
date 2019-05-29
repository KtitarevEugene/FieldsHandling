package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiWithTransIdAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_CARRIERS", schema = "NSI_ETR")
//@IdClass(SCarriersEntityPK.class)
/**Классификатор перевозчиков **/
public class SCarriersEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "CARRIER_ID")
    private Integer carrierId;
    @Column(name = "CARRIER_CODE", length = 4)
    private String carrierCode;
    @Column(name = "SHORTNAME", length = 40)
    private String shortname;
    @Column(name = "ORG_ID")
    private Integer orgId;
}
 