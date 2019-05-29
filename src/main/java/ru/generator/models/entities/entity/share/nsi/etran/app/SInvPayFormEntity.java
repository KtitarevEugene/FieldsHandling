package ru.generator.models.entities.entity.share.nsi.etran.app;

import ru.generator.service.annotations.Description;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiWithTransIdAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_INV_PAY_FORM", schema = "NSI_ETR")
//@IdClass(SInvPayFormEntityPK.class)
/**Справочник форм расчетов (наличный, безналичный и т.д.) **/
public class SInvPayFormEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("PAY_FORM/@value")
    @Column(name = "PAY_FORM")
    @Description(value = "Идентификатор формы расчета за перевозку.", position = 100)
    private Integer payForm;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 80)
    @Description(value = "Наименование формы расчета за перевозку.", position = 200)
    private String name;
    @XmlPath("CODE/@value")
    @Column(name = "CODE")
    @Description(value = "Код формы расчета за перевозку.", position = 300)
    private Integer code;
    @XmlPath("SHORTNAME/@value")
    @Column(name = "SHORTNAME", length = 20)
    @Description(value = "", position = 400)
    private String shortname;
}
 