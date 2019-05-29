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
@Table(name = "S_STANS2PARA", schema = "NSI_ETR")
//@IdClass(SStans2paraEntityPK.class)
/**Классификатор грузовых работ на станции **/
public class SStans2paraEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "ST_ID")
    private Integer stId;
    @Id
    @Column(name = "PAR_ID")
    private Integer parId;
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;
}
 