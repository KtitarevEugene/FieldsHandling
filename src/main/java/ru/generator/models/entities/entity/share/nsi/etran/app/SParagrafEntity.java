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
@Table(name = "S_PARAGRAF", schema = "NSI_ETR")
//@IdClass(SParagrafEntityPK.class)
/**Классификатор параграфов грузовых работ **/
public class SParagrafEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "PAR_ID")
    private Integer parId;
    @Column(name = "PAR_CODE", length = 10)
    private String parCode;
    @Column(name = "PAR_NAME", length = 255)
    private String parName;
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;
}
 