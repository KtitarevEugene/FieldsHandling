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
@Table(name = "S_REGION", schema = "NSI_ETR")
//@IdClass(SRegionEntityPK.class)
/**Классификатор объектов адм.-террит. деления (регионов) **/
public class SRegionEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "RG_ID")
    private Integer rgId;
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;
    @Column(name = "RG_CODE", length = 7)
    private String rgCode;
    @Column(name = "RG_CN_ID")
    private Integer rgCnId;
    @Column(name = "RG_NAME", length = 60)
    private String rgName;
    @Column(name = "SHORTNAME", length = 30)
    private String shortname;
    @Column(name = "RG_FR_ID")
    private Integer rgFrId;
    @Column(name = "RG_EC_ID")
    private Integer rgEcId;
}
 