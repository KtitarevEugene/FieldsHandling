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
@Table(name = "S_PORT", schema = "NSI_ETR")
//@IdClass(SPortEntityPK.class)
/**Порт **/
public class SPortEntity extends TimeActiveNsiEntity implements NsiEtran {
    @Id
    @XmlPath("ID/@value")
    @Column(name = "ID")
    @Description(value = "Идентификатор порта (ID организации)\n")
    private Integer id;
    //    @Id
    @XmlPath("CODE_OKPO/@value")
    @Column(name = "CODE_OKPO", length = 10)
    @Description(value = "Код ОКПО (7 знаков для портов СНГ)")
    private String codeOkpo;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 250)
    @Description(value = "Наименование порта")
    private String name;
    @XmlPath("SHORTNAME/@value")
    @Column(name = "SHORTNAME", length = 60)
    @Description(value = "Сокращенное наименование ")
    private String shortname;
    //    @Id
    @XmlPath("ST_ID/@value")
    @Column(name = "ST_ID")
    @Description(value = "Условный идентификатор станции")
    private Integer stId;
}
 