package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiWithTransIdAbstractEntity;
import ru.generator.service.annotations.Description;

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
@Table(name = "S_GNG_FREIGHT", schema = "NSI_ETR")
//@IdClass(SGngFreightEntityPK.class)
/**Гармонизированная номенклатура грузов  (устарело) **/
public class SGngFreightEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("GF_ID/@value")
    @Column(name = "GF_ID")
    @Description(value = "Условный идентификатор")
    private Integer gfId;
    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    @Description(value = "Номер приказа на изменение классификатора")
    private String orderNo;
    @XmlPath("GF_CODE/@value")
    @Column(name = "GF_CODE", length = 6)
    @Description(value = "Код груза")
    private String gfCode;
    @XmlPath("ETSNG/@value")
    @Column(name = "ETSNG", length = 3)
    @Description(value = "Соотв.грузы ЕТСНГ(первые 3зн.кода ЕТСНГ)")
    private String etsng;
    @XmlPath("GF_NAME/@value")
    @Column(name = "GF_NAME", length = 175)
    @Description(value = "Наименование груза")
    private String gfName;
}
 