package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiEtran;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.TimeActiveNsiEntity;
import ru.generator.service.annotations.Description;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_BLANC_TYPE", schema = "NSI_ETR")
/**Классификатор типов печатных форм. **/
public class SBlancTypeEntity extends TimeActiveNsiEntity implements NsiEtran {
    @Id
    @XmlPath("BLANC_ID/@value")
    @Column(name = "BLANC_ID")
    @Description(value = "Идентификатор")
    private Integer blancId;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 100)
    @Description(value = "Наименование")
    private String name;
    @XmlPath("CODE/@value")
    @Column(name = "CODE")
    @Description(value = "Код")
    private Integer code;
    @XmlPath("MNEMO/@value")
    @Column(name = "MNEMO", length = 15)
    @Description(value = "Мнемокод")
    private String mnemo;
    @XmlPath("NUMBERED/@value")
    @Column(name = "NUMBERED")
    @Description(value = "Признак номерной отправки")
    private Integer numbered;

//    public SBlancTypeEntity() {
//    }
//
//    public SBlancTypeEntity(Integer blancId) {
//        this.blancId = blancId;
//    }
}
 