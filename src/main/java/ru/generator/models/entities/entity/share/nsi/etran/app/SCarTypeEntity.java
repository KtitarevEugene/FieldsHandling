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
@Table(name = "S_CAR_TYPE", schema = "NSI_ETR")
//@IdClass(SCarTypeEntityPK.class)
/**Классификатор родов вагонов (для заявок) **/
public class SCarTypeEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "CAR_TYPE_ID")
    private Integer carTypeId;
    @Column(name = "CAR_TYPE_CODE", length = 4)
    private String carTypeCode;
    @Column(name = "NAME", length = 250)
    private String name;
    @Column(name = "SHORT_NAME", length = 20)
    private String shortName;
    @Column(name = "KIND_CAR_ID", length = 5)
    private String kindCarId;
    @Column(name = "WAG_TYPE_ID", length = 3)
    private String wagTypeId;
    @Column(name = "CODE_RPP", length = 2)
    private String codeRpp;
    @Column(name = "INSHORT")
    private Integer inshort;
}
 