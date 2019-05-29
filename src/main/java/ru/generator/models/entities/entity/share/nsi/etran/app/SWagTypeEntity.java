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
@Table(name = "S_WAG_TYPE", schema = "NSI_ETR")
//@IdClass(SWagTypeEntityPK.class)
/**Классификатор родов вагонов (для накладных) **/
public class SWagTypeEntity implements NsiEtran {
    @Id
    @XmlPath("WAG_TYPE_ID/@value")
    @Column(name = "WAG_TYPE_ID")
    @Description(value = "ID рода вагона", position = 100)
    private Integer wagTypeId;
    //    @Id
    @XmlPath("WAG_TYPE_CODE/@value")
    @Column(name = "WAG_TYPE_CODE")
    @Description(value = "Код рода вагона", position = 200)
    private Integer wagTypeCode;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 40)
    @Description(value = "Наименование рода вагона", position = 300)
    private String name;
    @XmlPath("SHORT_NAME/@value")
    @Column(name = "SHORT_NAME", length = 20)
    @Description(value = "SHORT_NAME", position = 400)
    private String shortName;
    @XmlPath("WAG_TYPE_CODE1/@value")
    @Column(name = "WAG_TYPE_CODE1")
    @Description(value = "WAG_TYPE_CODE1", position = 500)
    private Integer wagTypeCode1;
    @XmlPath("WAG_TYPE_VPU/@value")
    @Column(name = "WAG_TYPE_VPU")
    @Description(value = "WAG_TYPE_VPU", position = 600)
    private Integer wagTypeVpu;
    @XmlPath("KIND_CAR_ID/@value")
    @Column(name = "KIND_CAR_ID")
    @Description(value = "KIND_CAR_ID", position = 700)
    private Integer kindCarId;
    @XmlPath("WANTSEALS/@value")
    @Column(name = "WANTSEALS")
    @Description(value = "Наличие ЗПУ в вагоне (0 - не требуется, 1-разрешено, 2 - обязательно)", position = 800)
    private Integer wantseals;
    @XmlPath("WASH/@value")
    @Column(name = "WASH")
    @Description(value = "Разрешена или нет промывка (0 – запрещена, 1- разрешена)", position = 900)
    private Integer wash;
}
 