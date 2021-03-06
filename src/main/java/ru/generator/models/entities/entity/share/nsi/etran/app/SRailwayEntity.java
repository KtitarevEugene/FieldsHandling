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
@Table(name = "S_RAILWAY", schema = "NSI_ETR")
//@IdClass(SRailwayEntityPK.class)
/**Классификатор железных дорог СНГ **/
public class SRailwayEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("RW_ID/@value")
    @Column(name = "RW_ID")
    @Description(value = "Условный идентификатор")
    private Integer rwId;
    @XmlPath("RW_CODE/@value")
    @Column(name = "RW_CODE", length = 4)
    @Description(value = "Код дороги")
    private String rwCode;
    @XmlPath("RW_SHORT_NAME/@value")
    @Column(name = "RW_SHORT_NAME", length = 3)
    @Description(value = "3-симв. наименование дороги")
    private String rwShortName;
    @XmlPath("RW_NAME/@value")
    @Column(name = "RW_NAME", length = 30)
    @Description(value = "Наименование дороги")
    private String rwName;
    @XmlPath("RW_CN_ID/@value")
    @Column(name = "RW_CN_ID")
    @Description(value = "Условный идентификатор страны")
    private Integer rwCnId;
    @XmlPath("RW_TELEGRAPH_NAME/@value")
    @Column(name = "RW_TELEGRAPH_NAME", length = 5)
    @Description(value = "Короткое наименование для телеграфа")
    private String rwTelegraphName;

}
 