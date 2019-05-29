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
@Table(name = "S_DF_DANGER", schema = "NSI_ETR")
//@IdClass(SDfDangerEntityPK.class)
/**Справочник опасных грузов. **/
public class SDfDangerEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("DANGER_ID/@value")
    @Column(name = "DANGER_ID")
    @Description(value = "ID", position = 100)
    private Integer dangerId;
    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    @Description(value = "Номер приказа на изменение классификатора", position = 200)
    private String orderNo;
    @XmlPath("NAME/@value")
    @Column(name = "NAME", length = 400)
    @Description(value = "Наименование груза (Синонимы?)", position = 300)
    private String name;
    @XmlPath("PREFIX/@value")
    @Column(name = "PREFIX", length = 14)
    @Description(value = "Префикс имени", position = 400)
    private String prefix;
    @XmlPath("CLASSPPOG/@value")
    @Column(name = "CLASSPPOG", length = 4)
    @Description(value = "Класс ППОГ", position = 500)
    private String classppog;
    @XmlPath("MAIN_ID/@value")
    @Column(name = "MAIN_ID")
    @Description(value = "Ссылка на Danger_ID главного груза (у синонимов)", position = 600)
    private Integer mainId;
    @XmlPath("CLASSSMGS/@value")
    @Column(name = "CLASSSMGS", length = 4)
    @Description(value = "Класс СМГС", position = 700)
    private String classsmgs;
    @XmlPath("CLASSRID/@value")
    @Column(name = "CLASSRID", length = 4)
    @Description(value = "Класс РИД", position = 800)
    private String classrid;
    @XmlPath("CLASSFIN/@value")
    @Column(name = "CLASSFIN", length = 4)
    @Description(value = "Класс по финскому соглашению", position = 900)
    private String classfin;
    @XmlPath("UNO/@value")
    @Column(name = "UNO")
    @Description(value = "Номер по перечню ООН", position = 1000)
    private Integer uno;
    @XmlPath("CARD_ID/@value")
    @Column(name = "CARD_ID")
    @Description(value = "ID аварийной карты", position = 1100)
    private Integer cardId;
    @XmlPath("CIPHER/@value")
    @Column(name = "CIPHER", length = 4000)
    @Description(value = "Шифр по ППОГ", position = 1200)
    private String cipher;
    @XmlPath("N_SMGS/@value")
    @Column(name = "N_SMGS", length = 4000)
    @Description(value = "Номер по СМГС", position = 1300)
    private String nSmgs;
    @XmlPath("N_RID/@value")
    @Column(name = "N_RID", length = 4000)
    @Description(value = "Номер по РИД", position = 1400)
    private String nRid;
    @XmlPath("DANGERCODE/@value")
    @Column(name = "DANGERCODE", length = 4000)
    @Description(value = "Код опасности по СНГС и РИД", position = 1500)
    private String dangercode;
    @XmlPath("ETSNG/@value")
    @Column(name = "ETSNG", length = 4000)
    @Description(value = "Код ЕТСНГ", position = 1600)
    private String etsng;
    @XmlPath("LABELPPOG/@value")
    @Column(name = "LABELPPOG", length = 4000)
    @Description(value = "Знаки опасности ППОГ", position = 1700)
    private String labelppog;
    @XmlPath("GNG/@value")
    @Column(name = "GNG", length = 4000)
    @Description(value = "Код ГНГ", position = 1800)
    private String gng;
    @XmlPath("LABELSMGS/@value")
    @Column(name = "LABELSMGS", length = 4000)
    @Description(value = "Знаки опасности СМГС", position = 1900)
    private String labelsmgs;
    @XmlPath("EMPTYDANGER/@value")
    @Column(name = "EMPTYDANGER", length = 4000)
    @Description(value = "Перевозка тары на условиях опасного груза", position = 2000)
    private String emptydanger;
    @XmlPath("TOXIC/@value")
    @Column(name = "TOXIC", length = 4000)
    @Description(value = "Мера токсичности по ППОГ", position = 2100)
    private String toxic;
    @XmlPath("PROHIBIT/@value")
    @Column(name = "PROHIBIT", length = 4000)
    @Description(value = "Перевозка запрещена (по СНГС)", position = 2200)
    private String prohibit;
    @XmlPath("ESCORTED/@value")
    @Column(name = "ESCORTED", length = 1)
    @Description(value = "Признак обязательного сопровождения", position = 2300)
    private String escorted;
    @XmlPath("COST/@value")
    @Column(name = "COST")
    @Description(value = "Увеличение провозной платы, соответствует звездочкам в руководстве ППОГ", position = 2400)
    private Integer cost;
    @XmlPath("FORMULA_ADD/@value")
    @Column(name = "FORMULA_ADD", length = 4000)
    @Description(value = "Неформализуемая часть условия", position = 2500)
    private String formulaAdd;
}
 