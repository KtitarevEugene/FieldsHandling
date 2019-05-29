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
@Table(name = "S_COMMONTYPES", schema = "NSI_ETR")
//@IdClass(SCommontypesEntityPK.class)
/**Названия (таблиц) общих классификаторов **/
public class SCommontypesEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "PARAMID")
    private Integer paramid;
    @Column(name = "NAME", length = 255)
    private String name;
}
 