package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.TimeActiveNsiEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_CM_MANAGE_PARK", schema = "NSI_ETR")
/**Классификатор парков управления. **/
public class SCmManageParkEntity extends TimeActiveNsiEntity {
    @Id
    @XmlPath("PARK_ID/@value")
    @Column(name = "PARK_ID")
    private Integer parkId;
    @XmlPath("MPARK_NAME/@value")
    @Column(name = "MPARK_NAME", length = 100)
    private String mparkName;
}
 