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
@Table(name = "S_STATION_FOREIGN", schema = "NSI_ETR")
//@IdClass(SStationForeignEntityPK.class)
/**Классификатор иностранных станций (финские и сербские станции) **/
public class SStationForeignEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CN_ID")
    private Integer cnId;
    @Column(name = "CODE")
    private Integer code;
    @Column(name = "ORDER_NO", length = 40)
    private String orderNo;
    @Column(name = "SHORTNAME", length = 10)
    private String shortname;
    @Column(name = "NAME", length = 50)
    private String name;
    @Column(name = "NNAME", length = 50)
    private String nname;
    @Column(name = "BORDER_SIGN", length = 1)
    private String borderSign;
}
 