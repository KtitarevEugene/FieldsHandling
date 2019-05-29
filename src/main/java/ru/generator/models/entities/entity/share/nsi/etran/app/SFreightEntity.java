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
@Table(name = "S_FREIGHT", schema = "NSI_ETR")
//@IdClass(SFreightEntityPK.class)
/**Классификатор грузов **/
public class SFreightEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("FR_ID/@value")
    @Column(name = "FR_ID")
    private Integer frId;

    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;

    @XmlPath("FR_CODE_ETSNG/@value")
    @Column(name = "FR_CODE_ETSNG", length = 6)
    private String frCodeEtsng;

    @XmlPath("FR_GG_NUMBER/@value")
    @Column(name = "FR_GG_NUMBER")
    private Integer frGgNumber;

    @XmlPath("FR_CODE_GNG/@value")
    @Column(name = "FR_CODE_GNG", length = 2)
    private String frCodeGng;

    @XmlPath("FR_SHORT_NAME/@value")
    @Column(name = "FR_SHORT_NAME", length = 15)
    private String frShortName;

    @XmlPath("FR_NAME/@value")
    @Column(name = "FR_NAME", length = 250)
    private String frName;

    @XmlPath("FR_CLASS/@value")
    @Column(name = "FR_CLASS", length = 2)
    private String frClass;

    @XmlPath("FR_GO6_ID/@value")
    @Column(name = "FR_GO6_ID")
    private Integer frGo6Id;

    @XmlPath("FR_GO10_ID/@value")
    @Column(name = "FR_GO10_ID")
    private Integer frGo10Id;

    @XmlPath("FR_CO11_ID/@value")
    @Column(name = "FR_CO11_ID")
    private Integer frCo11Id;

    @XmlPath("GUARD/@value")
    @Column(name = "GUARD", length = 1)
    private String guard;

    @XmlPath("SKOROPORT/@value")
    @Column(name = "SKOROPORT", length = 1)
    private String skoroport;

    @XmlPath("NAVAL/@value")
    @Column(name = "NAVAL", length = 1)
    private String naval;

    @XmlPath("NASIP/@value")
    @Column(name = "NASIP", length = 1)
    private String nasip;

    @XmlPath("NALIV/@value")
    @Column(name = "NALIV", length = 1)
    private String naliv;

    @XmlPath("KARANTIN/@value")
    @Column(name = "KARANTIN", length = 1)
    private String karantin;

    @XmlPath("OPENVAGONS/@value")
    @Column(name = "OPENVAGONS", length = 1)
    private String openvagons;

    @XmlPath("SOPROVOD/@value")
    @Column(name = "SOPROVOD", length = 1)
    private String soprovod;

    @XmlPath("SMERZ/@value")
    @Column(name = "SMERZ", length = 1)
    private String smerz;

    @XmlPath("ALPH_EXIST/@value")
    @Column(name = "ALPH_EXIST", length = 1)
    private String alphExist;

    @XmlPath("EXACT_NAME/@value")
    @Column(name = "EXACT_NAME", length = 1)
    private String exactName;

    @XmlPath("FR_CO15_ID/@value")
    @Column(name = "FR_CO15_ID")
    private Integer frCo15Id;
}
 