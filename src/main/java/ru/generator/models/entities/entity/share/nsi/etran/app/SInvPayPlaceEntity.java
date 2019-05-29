package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiEtran;
import ru.generator.service.annotations.Description;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_INV_PAY_PLACE", schema = "NSI_ETR")
/**Справочник мест проведения расчетов за перевозку. **/
public class SInvPayPlaceEntity implements NsiEtran {
    @Id
    @XmlPath("PAY_PLACE/@value")
    @Column(name = "PAY_PLACE")
    @Description(value = "Идентификатор места, где будет произведен расчет.")
    private Integer payPlace;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 40)
    @Description(value = "Наименование места расчета.")
    private String name;
    @XmlPath("CODE/@value")
    @Column(name = "CODE")
    @Description(value = "Код места расчета.")
    private Integer code;
}
 