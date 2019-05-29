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
@Table(name = "S_KIND_CAR", schema = "NSI_ETR")
//@IdClass(SKindCarEntityPK.class)
/**Классификатор родов вагонов (для заявок) **/
public class SKindCarEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "RV_ID")
    private Integer rvId;
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;
    @Column(name = "RV_CODE", length = 5)
    private String rvCode;
    @Column(name = "RV_NAME", length = 50)
    private String rvName;
    @Column(name = "RV_SHORT_NAME", length = 25)
    private String rvShortName;
    @Column(name = "RV_SIGN", length = 1)
    private String rvSign;
    @Column(name = "ZAGRUZ_MAX")
    private Integer zagruzMax;
    @Column(name = "RV_COD1", length = 4)
    private String rvCod1;
}
 