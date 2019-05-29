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
@Table(name = "S_INV_DEV_TYPE", schema = "NSI_ETR")
/**Справочник типов перевозочных приспособлений, которые могут быть установлены в вагоне и подлежат возврату собственнику. **/
public class SInvDevTypeEntity implements NsiEtran {
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 40)
    @Description(value = "Наименование типа перевозочного приспособления.", position = 100)
    private String name;
    @Id
    @XmlPath("DEV_TYPE/@value")
    @Column(name = "DEV_TYPE")
    @Description(value = "Код типа перевозочного приспособления.", position = 200)
    private Integer devType;
    @XmlPath("SHORT_NAME/@value")
    @Column(name = "SHORT_NAME", length = 20)
    @Description(value = "Краткое наименование", position = 300)
    private String shortName;
}
 