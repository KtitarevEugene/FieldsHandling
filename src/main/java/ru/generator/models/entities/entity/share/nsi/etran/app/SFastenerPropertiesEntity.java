package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.TimeActiveNsiEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_FASTENER_PROPERTIES", schema = "NSI_ETR")
//@IdClass(SFastenerPropertiesEntityPK.class)
/**Классификатор дополнительных параметров средств крепления грузов. **/
public class SFastenerPropertiesEntity extends TimeActiveNsiEntity {
    @Id
    @Column(name = "FASTENER_ID")
    private Integer fastenerId;
    @Id
    @Column(name = "PROPERTY_ID")
    private Integer propertyId;
    @Column(name = "PROPERTY_NAME", length = 4000)
    private String propertyName;
    @Column(name = "PROPERTY_VALUE", length = 4000)
    private String propertyValue;
}
 