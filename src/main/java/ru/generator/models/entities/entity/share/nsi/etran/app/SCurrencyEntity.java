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
@Table(name = "S_CURRENCY", schema = "NSI_ETR")
//@IdClass(SCurrencyEntityPK.class)
/**Классификатор валют **/
public class SCurrencyEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("CUR_ID/@value")
    @Column(name = "CUR_ID")
    @Description(value = "ID валюты. (OLD справочник - COMMON, paramid=12)")
    private Integer curId;
    @XmlPath("CUR_CODE/@value")
    @Column(name = "CUR_CODE", length = 3)
    @Description(value = "Цифровой Код валюты по ISO 4217-2001 \"Межгосударственный классификатор валют МК\"")
    private String curCode;
    @XmlPath("CUR_CODE_LAT/@value")
    @Column(name = "CUR_CODE_LAT", length = 3)
    @Description(value = "Буквенный Код валюты по ISO 4217-2001 \"Межгосударственный классификатор валют МК\"")
    private String curCodeLat;
    @XmlPath("CUR_NAME/@value")
    @Column(name = "CUR_NAME", length = 255)
    @Description(value = "Наименование валюты на русском")
    private String curName;
    @XmlPath("CUR_NAME_LAT/@value")
    @Column(name = "CUR_NAME_LAT", length = 255)
    @Description(value = "Наименование валюты на английском")
    private String curNameLat;
    @XmlPath("CUR_TYPE/@value")
    @Column(name = "CUR_TYPE")
    @Description(value = "ID типа валюты  (COMMON, paramid=304)")
    private Integer curType;

}
 