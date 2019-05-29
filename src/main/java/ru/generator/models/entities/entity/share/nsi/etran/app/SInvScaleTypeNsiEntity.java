package ru.generator.models.entities.entity.share.nsi.etran.app;

import ru.generator.service.annotations.Description;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;
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
@Table(name = "S_INV_SCALE_TYPE_NSI", schema = "NSI_ETR")
//@IdClass(SInvScaleTypeNsiEntityPK.class)
/**Справочник способов определения массы груза. **/
public class SInvScaleTypeNsiEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("SCALE_TYPE/@value")
    @Column(name = "SCALE_TYPE")
    @Description(value = "Идентификатор метода взвешивания.", position = 100)
    private Integer scaleType;
    @XmlPath("SHORT_NAME/@value")
    @Column(name = "SHORT_NAME", length = 255)
    @Description(value = "Наименование метода взвешивания.", position = 200)
    private String shortName;
    @XmlPath("SCALE_CODE/@value")
    @Column(name = "SCALE_CODE", length = 2)
    @Description(value = "Код способа взвешивания", position = 300)
    private String scaleCode;
    @XmlPath("SMGS_NAME/@value")
    @Column(name = "SMGS_NAME", length = 255)
    @Description(value = "Наименование СМГС", position = 400)
    private String smgsName;
    @XmlPath("FAULT/@value")
    @Column(name = "FAULT")
    @Description(value = "Требуется ввод погрешности (0-нет, 1-да)", position = 500)
    private Integer fault;
}
 