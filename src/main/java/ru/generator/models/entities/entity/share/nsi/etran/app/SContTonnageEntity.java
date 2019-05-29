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
@Table(name = "S_CONT_TONNAGE", schema = "NSI_ETR")
/**Классификатор тоннажностей контейнеров. **/
public class SContTonnageEntity implements NsiEtran {
    @Id
    @XmlPath("CONT_TONNAGE_ID/@value")
    @Column(name = "CONT_TONNAGE_ID")
    @Description(value = "Идентификатор Тоннажности контейнера")
    private Integer contTonnageId;
    @XmlPath("TONNAGE/@value")
    @Column(name = "TONNAGE")
    @Description(value = "Тоннаж (тонны)")
    private Integer tonnage;
    @XmlPath("TONNAGE_TYPE_ID/@value")
    @Column(name = "TONNAGE_TYPE_ID")
    @Description(value = "Тип контейнера: 2 - Среднетоннажный, 3 - Крупнотоннажный. COMMON категория 160\n")
    private Integer tonnageTypeId;
    @XmlPath("SHORT_NAME/@value")
    @Column(name = "SHORT_NAME", length = 20)
    @Description(value = "Наименование")
    private String shortName;
    @XmlPath("KOL_USL/@value")
    @Column(name = "KOL_USL")
    @Description(value = "Количество условных контейнеров")
    private Integer kolUsl;

}
 