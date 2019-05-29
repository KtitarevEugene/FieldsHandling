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
@Table(name = "S_DEPARTMENT", schema = "NSI_ETR")
//@IdClass(SDepartmentEntityPK.class)
/**Отделения железных дорог **/
public class SDepartmentEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "DP_ID")
    private Integer dpId;
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;
    @Column(name = "DP_RW_ID")
    private Integer dpRwId;
    @Column(name = "DP_CODE", length = 2)
    private String dpCode;
    @Column(name = "DP_NAME", length = 60)
    private String dpName;
}
 