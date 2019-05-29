package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiWithTransIdAbstractEntity;
import ru.generator.service.annotations.Description;

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
@Table(name = "S_COUNTRY", schema = "NSI_ETR")
//@IdClass(SCountryEntityPK.class)
/**Классификатор стран мира **/
public class SCountryEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("CN_ID/@value")
    @Column(name = "CN_ID")
    @Description(value = "Условный идентификатор")
    private Integer cnId;
    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    @Description(value = "Номер приказа на изменение классификатора")
    private String orderNo;
    @XmlPath("CN_CODE/@value")
    @Column(name = "CN_CODE", length = 4)
    @Description(value = "Код ОКСМ стран мира")
    private String cnCode;
    @XmlPath("CN_NAME/@value")
    @Column(name = "CN_NAME", length = 65)
    @Description(value = "Наименов.полное")
    private String cnName;
    @XmlPath("CN_SHORT_NAME/@value")
    @Column(name = "CN_SHORT_NAME", length = 20)
    @Description(value = "Наименнов.сокр.(рус)")
    private String cnShortName;
    @XmlPath("CN_CODE_SOATO/@value")
    @Column(name = "CN_CODE_SOATO", length = 4)
    @Description(value = "Код СОАТО")
    private String cnCodeSoato;
    @XmlPath("CN_CODE_OSGD/@value")
    @Column(name = "CN_CODE_OSGD", length = 2)
    @Description(value = "Код ОСЖД")
    private String cnCodeOsgd;
    @XmlPath("CN_SIGN/@value")
    @Column(name = "CN_SIGN", length = 1)
    @Description(value = "Тип государства(3–СНГ,4–Прибалтика, 5–Зарубежные)")
    private String cnSign;
    @XmlPath("ADMINCODE/@value")
    @Column(name = "ADMINCODE", length = 2)
    @Description(value = "Код администрации")
    private String admincode;
    @XmlPath("ADMINCODE_LAT/@value")
    @Column(name = "ADMINCODE_LAT", length = 7)
    @Description(value = "Мнемокод администрации ж.д.")
    private String admincodeLat;
    @XmlPath("CODE_LAT/@value")
    @Column(name = "CODE_LAT", length = 2)
    @Description(value = "Код администрации 2-мя латинскими буквами (FI, RU и т.д.)")
    private String codeLat;

//    public SCountryEntity() {
//    }
//
//    public SCountryEntity(Integer cnId) {
//        this.cnId = cnId;
//    }
}
 