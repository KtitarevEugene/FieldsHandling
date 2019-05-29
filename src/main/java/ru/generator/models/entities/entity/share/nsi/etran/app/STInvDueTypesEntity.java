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
@Table(name = "S_T_INV_DUE_TYPES", schema = "NSI_ETR")
/**Названия типов сборов **/
public class STInvDueTypesEntity implements NsiEtran {
    @Id
    @XmlPath("INVDUETYPE_ID/@value")
    @Column(name = "INVDUETYPE_ID")
    @Description(value = "Идентификатор типа сбора", position = 100)
    private Integer invduetypeId;
    @XmlPath("DUETYPE/@value")
    @Column(name = "DUETYPE", length = 255)
    @Description(value = "Тип сбора", position = 200)
    private String duetype;
    @XmlPath("DUECODE/@value")
    @Column(name = "DUECODE")
    @Description(value = "Код сбора", position = 300)
    private Integer duecode;
    @XmlPath("PLACEUSE/@value")
    @Column(name = "PLACEUSE")
    @Description(value = "1 - по отправлении; 2 - по прибытии", position = 400)
    private Integer placeuse;
    @XmlPath("MAINDUETYPE/@value")
    @Column(name = "MAINDUETYPE")
    @Description(value = "0-нетипизированный платёж, 1- осн.провозная плата, 2-проводники, 3- допсборы, 4-охрана, 5- объявл.ценность, 6-В-Х, 7-пароходство, 8- таможня, 9-транзит", position = 500)
    private Integer mainduetype;
    @XmlPath("SMGSDUECODE/@value")
    @Column(name = "SMGSDUECODE")
    @Description(value = "Код сбора для СМГС", position = 600)
    private Integer smgsduecode;
    @XmlPath("FOR_DOC/@value")
    @Column(name = "FOR_DOC")
    @Description(value = "Платёж на весь документ целиком", position = 700)
    private Integer forDoc;
    @XmlPath("CODE_ASUFR/@value")
    @Column(name = "CODE_ASUFR")
    @Description(value = "Тип услуги (по классификации Трансконтейнера)", position = 800)
    private Integer codeAsufr;

}
 