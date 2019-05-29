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
@Table(name = "S_CONT_SIZE_BIG", schema = "NSI_ETR")
/**Классификатор размеров крупнотоннажных контейнеров. **/
public class SContSizeBigEntity implements NsiEtran {
    @Id
    @XmlPath("CONT_SIZE_ID/@value")
    @Column(name = "CONT_SIZE_ID")
    @Description(value = "Идентификатор размера крупнотоннажного контейнера")
    private Integer contSizeId;
    @XmlPath("HEIGHT/@value")
    @Column(name = "HEIGHT")
    @Description(value = "Номинальная высота в мм")
    private Integer height;
    @XmlPath("WIDTH_F/@value")
    @Column(name = "WIDTH_F")
    @Description(value = "Номинальная длина в футах")
    private Integer widthF;
    @XmlPath("CODE/@value")
    @Column(name = "CODE", length = 2)
    @Description(value = "Код размера")
    private String code;
    @XmlPath("HEIGHTTXT/@value")
    @Column(name = "HEIGHTTXT", length = 225)
    @Description(value = "Номинальная высота в мм с диапазонами")
    private String heighttxt;
    @XmlPath("COMMENTS/@value")
    @Column(name = "COMMENTS", length = 225)
    @Description(value = "Примечания")
    private String comments;
}
 