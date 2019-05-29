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
@Table(name = "S_INV_SEAL_TYPE", schema = "NSI_ETR")
/**Справочник типов запорно-пломбировочных устройств.  **/
public class SInvSealTypeEntity extends TimeActiveNsiEntity implements NsiEtran {
    @Id
    @XmlPath("SEAL_TYPE/@value")
    @Column(name = "SEAL_TYPE")
    @Description(value = "")
    private Integer sealType;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 40)
    @Description(value = "")
    private String name;
    @XmlPath("SEAL_CODE/@value")
    @Column(name = "SEAL_CODE")
    @Description(value = "Код ЗПУ")
    private Integer sealCode;
    @XmlPath("MNEMO_CODE/@value")
    @Column(name = "MNEMO_CODE", length = 5)
    @Description(value = "Мнемокод")
    private String mnemoCode;
    @XmlPath("SEAL_CODE2/@value")
    @Column(name = "SEAL_CODE2")
    @Description(value = "Дополнительный код ЗПУ")
    private Integer sealCode2;
    @XmlPath("FACTORY_CODE/@value")
    @Column(name = "FACTORY_CODE")
    @Description(value = "Код завода")
    private Integer factoryCode;
}
 