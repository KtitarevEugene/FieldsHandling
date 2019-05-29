package ru.generator.models.entities.entity.share.nsi.etran.app;

import ru.generator.service.annotations.Description;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiEtran;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_INV_SPEED_KIND", schema = "NSI_ETR")
/**Классификатор скорости доставки. **/
public class SInvSpeedKindEntity implements NsiEtran {
    @Id
    @XmlPath("SPEED/@value")
    @Column(name = "SPEED")
    @Description(value = "Идентификатор типа скорости перевозки.")
    private Integer speed;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 40)
    @Description(value = "Наименование скорости перевозки.")
    private String name;
    @XmlPath("SPEED_CODE/@value")
    @Column(name = "SPEED_CODE")
    @Description(value = "Код скорости")
    private Integer speedCode;
}
 