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
@Table(name = "S_CONT_TYPE_BIG", schema = "NSI_ETR")
/**Классификатор типов крупнотоннажных контейнеров. **/
public class SContTypeBigEntity implements NsiEtran {
    @Id
    @XmlPath("CONT_TYPE_ID/@value")
    @Column(name = "CONT_TYPE_ID")
    @Description(value = "Идентификатор типа крупнотоннажного контейнера")
    private Integer contTypeId;
    @XmlPath("TYPE_NAME/@value")
    @Column(name = "TYPE_NAME", length = 225)
    @Description(value = "Наименование типа")
    private String typeName;
    @XmlPath("DETAIL/@value")
    @Column(name = "DETAIL", length = 225)
    @Description(value = "Конструктивные особенности")
    private String detail;
    @XmlPath("CODE/@value")
    @Column(name = "CODE", length = 6)
    @Description(value = "Код")
    private String code;
    @XmlPath("KIND_ID/@value")
    @Column(name = "KIND_ID")
    @Description(value = "Идентификатор вида контейнера: 1 - Реф, 2 - Танк, 3- Универсальный. COMMON категория 161\n")
    private Integer kindId;
}
 