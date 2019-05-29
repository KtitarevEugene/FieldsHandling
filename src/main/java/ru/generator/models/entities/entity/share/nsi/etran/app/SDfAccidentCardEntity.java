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
@Table(name = "S_DF_ACCIDENT_CARD", schema = "NSI_ETR")
//@IdClass(SDfAccidentCardEntityPK.class)
/**Список номеров аварийных карт. **/
public class SDfAccidentCardEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("CARD_ID/@value")
    @Column(name = "CARD_ID")
    @Description(value = "ID", position = 100)
    private Integer cardId;
    @Column(name = "ORDER_NO", length = 40)
    @Description(value = "Номер приказа на изменение классификатора", position = 200)
    private String orderNo;
    @XmlPath("NOMER/@value")
    @Column(name = "NOMER")
    @Description(value = "Номер карты", position = 300)
    private Integer nomer;
    @XmlPath("MAIN_ID/@value")
    @Column(name = "MAIN_ID")
    @Description(value = "Карта основных свойств", position = 400)
    private Integer mainId;
    @XmlPath("FIRE_ID/@value")
    @Column(name = "FIRE_ID")
    @Description(value = "Карта взрыво и пожароопасности", position = 500)
    private Integer fireId;
    @XmlPath("HUMANDANGER_ID/@value")
    @Column(name = "HUMANDANGER_ID")
    @Description(value = "Опасность для человека", position = 600)
    private Integer humandangerId;
    @XmlPath("PROTECT_ID/@value")
    @Column(name = "PROTECT_ID")
    @Description(value = "Средства индивидуальной защиты", position = 700)
    private Integer protectId;
    @XmlPath("ACT_COMMON_ID/@value")
    @Column(name = "ACT_COMMON_ID")
    @Description(value = "Дейсвия общего характера", position = 800)
    private Integer actCommonId;
    @XmlPath("ACT_ROZVAL_ID/@value")
    @Column(name = "ACT_ROZVAL_ID")
    @Description(value = "Дейсвия при развале и россыпи", position = 900)
    private Integer actRozvalId;
    @XmlPath("ACT_FIRE_ID/@value")
    @Column(name = "ACT_FIRE_ID")
    @Description(value = "Действия при пожаре", position = 1000)
    private Integer actFireId;
    @XmlPath("FIRST_HELP_ID/@value")
    @Column(name = "FIRST_HELP_ID")
    @Description(value = "Меры первой помощи", position = 1100)
    private Integer firstHelpId;
}
 