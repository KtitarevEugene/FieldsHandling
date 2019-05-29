package ru.generator.models.entities.entity.share.nsi.etran.app;

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
@Table(name = "S_SUM_FREIGHT", schema = "NSI_ETR")
//@IdClass(SSumFreightEntityPK.class)
/**Номенклатурные группы **/
public class SSumFreightEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("GG_NUMBER/@value")
    @Column(name = "GG_NUMBER")
    private Integer ggNumber;
    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;
    @XmlPath("GG_NAME/@value")
    @Column(name = "GG_NAME", length = 150)
    private String ggName;
    @XmlPath("GG_CHAR_NAME/@value")
    @Column(name = "GG_CHAR_NAME", length = 2)
    private String ggCharName;
    @XmlPath("STAT_MIN/@value")
    @Column(name = "STAT_MIN")
    private Integer statMin;
    @XmlPath("STAT_MAX/@value")
    @Column(name = "STAT_MAX")
    private Integer statMax;
    @XmlPath("GG_TYPE/@value")
    @Column(name = "GG_TYPE", length = 1)
    private String ggType;
    @XmlPath("GG_NEED_WEIGHT/@value")
    @Column(name = "GG_NEED_WEIGHT", length = 1)
    private String ggNeedWeight;
}
 