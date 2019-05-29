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
@Table(name = "S_JOINT", schema = "NSI_ETR")
//@IdClass(SJointEntityPK.class)
/**Классификатор стыковые станции перехода границ. **/
public class SJointEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Column(name = "ST_EXP_CODE", length = 5)
    private String stExpCode;
    @Column(name = "ST_JOINT_EXP_CODE", length = 5)
    private String stJointExpCode;
    @Id
    @Column(name = "ST_ID")
    private Integer stId;
    @Id
    @Column(name = "ST_JOINT_ID")
    private Integer stJointId;
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;
}
 