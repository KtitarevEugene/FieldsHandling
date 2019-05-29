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
@Table(name = "S_INV_SEND_TYPE", schema = "NSI_ETR")
/**Классификатор видов отправки. **/
public class SInvSendTypeEntity implements NsiEtran {
    @Id
    @XmlPath("KIND_SEND/@value")
    @Column(name = "KIND_SEND")
    @Description(value = "Справочников видов отправки.", position = 100)
    private Integer kindSend;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 40)
    @Description(value = "Наименование", position = 200)
    private String name;
    @XmlPath("IODV/@value")
    @Column(name = "IODV")
    @Description(value = "Код", position = 300)
    private Integer iodv;
    @XmlPath("SHORT_NAME/@value")
    @Column(name = "SHORT_NAME", length = 5)
    @Description(value = "Аббревиатура вида отправки", position = 400)
    private String shortName;
}
 