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
@Table(name = "S_DF_DANGER", schema = "NSI_ETR")
//@IdClass(SDfDangerEntityPK.class)
/**Справочник опасных грузов. **/
public class SDfDangerEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("DANGER_ID/@value")
    @Column(name = "DANGER_ID")
    @Description(value = "ID")
    private Integer dangerId;
    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    @Description(value = "Номер приказа на изменение классификатора")
    private String orderNo;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 400)
    @Description(value = "Наименование груза (Синонимы?)")
    private String name;
    @XmlPath("PREFIX/@value")
    @Column(name = "PREFIX", length = 14)
    @Description(value = "Префикс имени")
    private String prefix;
    @XmlPath("CLASSPPOG/@value")
    @Column(name = "CLASSPPOG", length = 4)
    @Description(value = "Класс ППОГ")
    private String classppog;
    @XmlPath("MAIN_ID/@value")
    @Column(name = "MAIN_ID")
    @Description(value = "Ссылка на Danger_ID главного груза (у синонимов)")
    private Integer mainId;
    @XmlPath("CLASSSMGS/@value")
    @Column(name = "CLASSSMGS", length = 4)
    @Description(value = "Класс СМГС")
    private String classsmgs;
    @XmlPath("CLASSRID/@value")
    @Column(name = "CLASSRID", length = 4)
    @Description(value = "Класс РИД")
    private String classrid;
    @XmlPath("CLASSFIN/@value")
    @Column(name = "CLASSFIN", length = 4)
    @Description(value = "Класс по финскому соглашению")
    private String classfin;
    @XmlPath("UNO/@value")
    @Column(name = "UNO")
    @Description(value = "Номер по перечню ООН")
    private Integer uno;
    @XmlPath("CARD_ID/@value")
    @Column(name = "CARD_ID")
    @Description(value = "ID аварийной карты")
    private Integer cardId;
    @XmlPath("CIPHER/@value")
    @Column(name = "CIPHER", length = 4000)
    @Description(value = "Шифр по ППОГ")
    private String cipher;
    @XmlPath("N_SMGS/@value")
    @Column(name = "N_SMGS", length = 4000)
    @Description(value = "Номер по СМГС")
    private String nSmgs;
    @XmlPath("N_RID/@value")
    @Column(name = "N_RID", length = 4000)
    @Description(value = "Номер по РИД")
    private String nRid;
    @XmlPath("DANGERCODE/@value")
    @Column(name = "DANGERCODE", length = 4000)
    @Description(value = "Код опасности по СНГС и РИД")
    private String dangercode;
    @XmlPath("ETSNG/@value")
    @Column(name = "ETSNG", length = 4000)
    @Description(value = "Код ЕТСНГ")
    private String etsng;
    @XmlPath("LABELPPOG/@value")
    @Column(name = "LABELPPOG", length = 4000)
    @Description(value = "Знаки опасности ППОГ")
    private String labelppog;
    @XmlPath("GNG/@value")
    @Column(name = "GNG", length = 4000)
    @Description(value = "Код ГНГ")
    private String gng;
    @XmlPath("LABELSMGS/@value")
    @Column(name = "LABELSMGS", length = 4000)
    @Description(value = "Знаки опасности СМГС")
    private String labelsmgs;
    @XmlPath("EMPTYDANGER/@value")
    @Column(name = "EMPTYDANGER", length = 4000)
    @Description(value = "Перевозка тары на условиях опасного груза")
    private String emptydanger;
    @XmlPath("TOXIC/@value")
    @Column(name = "TOXIC", length = 4000)
    @Description(value = "Мера токсичности по ППОГ")
    private String toxic;
    @XmlPath("PROHIBIT/@value")
    @Column(name = "PROHIBIT", length = 4000)
    @Description(value = "Перевозка запрещена (по СНГС)")
    private String prohibit;
    @XmlPath("ESCORTED/@value")
    @Column(name = "ESCORTED", length = 1)
    @Description(value = "Признак обязательного сопровождения")
    private String escorted;
    @XmlPath("COST/@value")
    @Column(name = "COST")
    @Description(value = "Увеличение провозной платы, соответствует звездочкам в руководстве ППОГ")
    private Integer cost;
    @XmlPath("FORMULA_ADD/@value")
    @Column(name = "FORMULA_ADD", length = 4000)
    @Description(value = "Неформализуемая часть условия")
    private String formulaAdd;
}
 