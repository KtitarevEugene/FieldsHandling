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
@Table(name = "S_DS_STATLIST", schema = "NSI_ETR")
//@IdClass(SDsStatlistEntityPK.class)
/**Названия статей сборов для накопительной ведомости **/
public class SDsStatlistEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @Column(name = "STAT_ID")
    private Integer statId;
    @Column(name = "STAT_CODE", length = 3)
    private String statCode;
    @Column(name = "STAT_NAME", length = 250)
    private String statName;
    @Column(name = "DOR", length = 3)
    private String dor;
    @Column(name = "PRIZNNDS", length = 1)
    private String priznnds;
    @Column(name = "SERVICE_ID")
    private Integer serviceId;
}
 