package ru.generator.models.entities.entity.share.nsi.etran.app;

import ru.generator.service.annotations.Description;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiEtran;
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
@Table(name = "S_FASTENER", schema = "NSI_ETR")
/**Классификатор средств крепления грузов **/
public class SFastenerEntity extends TimeActiveNsiEntity implements NsiEtran {
    @Id
    @XmlPath("FASTENER_ID/@value")
    @Column(name = "FASTENER_ID")
    @Description(value = "Код средства крепления (из АСКМ)", position = 100)
    private Integer fastenerId;
    @XmlPath("FASTENER_NAME/@value")
    @Column(name = "FASTENER_NAME", length = 4000)
    @Description(value = "Наименование средства крепления", position = 200)
    private String fastenerName;

}
 