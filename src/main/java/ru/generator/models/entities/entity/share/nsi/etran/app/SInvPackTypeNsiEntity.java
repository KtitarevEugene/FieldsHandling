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
@Table(name = "S_INV_PACK_TYPE_NSI", schema = "NSI_ETR")
//@IdClass(SInvPackTypeNsiEntityPK.class)
/**Справочник типов упаковки. **/
public class SInvPackTypeNsiEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("POCKET/@value")
    @Column(name = "POCKET")
    @Description(value = "Идентификатор типа упаковки.", position = 100)
    private Integer pocket;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 150)
    @Description(value = "Полное наименование типа упаковки.", position = 200)
    private String name;
    @XmlPath("SHORT_NAME/@value")
    @Column(name = "SHORT_NAME", length = 50)
    @Description(value = "Короткое наименование типа упаковки.", position = 300)
    private String shortName;
    @XmlPath("LOAD_TYPE/@value")
    @Column(name = "LOAD_TYPE")
    @Description(value = "Способ погрузки 0 - тарно-штучная, 1 - наливом, 2 - насыпью.", position = 400)
    private Integer loadType;
    @XmlPath("IODV_CODE/@value")
    @Column(name = "IODV_CODE", length = 2)
    @Description(value = "Код ЕК ИОДВ.", position = 500)
    private String iodvCode;
    @XmlPath("CODE_OON/@value")
    @Column(name = "CODE_OON", length = 3)
    @Description(value = "Код упаковки по Рекомендации №21 ЕЭК ООН ", position = 600)
    private String codeOon;
}
 