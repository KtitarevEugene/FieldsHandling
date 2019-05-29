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
@Table(name = "S_GNG_FREIGHT_2001", schema = "NSI_ETR")
//@IdClass(SGngFreight2001EntityPK.class)
/**Гармонизированная номенклатура грузов (8-значные грузы ГНГ) **/
public class SGngFreight2001Entity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("GF_ID/@value")
    @Column(name = "GF_ID")
    @Description(value = "Условный идентификатор", position = 100)
    private Integer gfId;
    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    @Description(value = "Номер приказа на изменение классификатора", position = 200)
    private String orderNo;
    @XmlPath("GF_CODE/@value")
    @Column(name = "GF_CODE", length = 12)
    @Description(value = "Код груза", position = 300)
    private String gfCode;
    @XmlPath("GF_NAME/@value")
    @Column(name = "GF_NAME", length = 1000)
    @Description(value = "Наименование груза", position = 400)
    private String gfName;
    @XmlPath("ETSNG/@value")
    @Column(name = "ETSNG", length = 51)
    @Description(value = "Соотв.грузы ЕТСНГ (первые 3 зн.кода ЕТСНГ) может быть список через запятую", position = 500)
    private String etsng;
    @XmlPath("GF_CODE_OLD/@value")
    @Column(name = "GF_CODE_OLD", length = 6)
    @Description(value = "Старый код ГНГ", position = 600)
    private String gfCodeOld;
    @XmlPath("FR_ID/@value")
    @Column(name = "FR_ID")
    @Description(value = "Ссылка на груз ЕТСНГ", position = 700)
    private Integer frId;
}
 