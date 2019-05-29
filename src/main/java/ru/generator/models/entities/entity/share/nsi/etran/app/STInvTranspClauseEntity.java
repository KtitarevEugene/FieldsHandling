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
@Table(name = "S_T_INV_TRANSP_CLAUSE", schema = "NSI_ETR")
//@IdClass(STInvTranspClauseEntityPK.class)
/**Справочник условий перевозки. **/
public class STInvTranspClauseEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("TRANSPCLAUSE_ID/@value")
    @Column(name = "TRANSPCLAUSE_ID")
    @Description(value = "Идентификатор условия перевозки")
    private Integer transpclauseId;
    @XmlPath("CC_ID/@value")
    @Column(name = "CC_ID")
    @Description(value = "Идентификатор образующего документа. Для КЗО (тип 3) CONV_COND.CC_DOC_ID. Для прилагаемых док-в (тип 7) COMMON категории 109\n")
    private Integer ccId;
    @XmlPath("TRANSPCLAUSETYPE_ID/@value")
    @Column(name = "TRANSPCLAUSETYPE_ID")
    @Description(value = "Идентификатор типа условия перевозки. COMMON категории 107")
    private Integer transpclausetypeId;
    @XmlPath("DESCRIPTION/@value")
    @Column(name = "DESCRIPTION", length = 4000)
    @Description(value = "Описание")
    private String description;
    @Column(name = "TARIFMARK", length = 20)
    @XmlPath("TARIFMARK/@value")
    @Description(value = "Код тарифной отметки.штемпеля")
    private String tarifmark;
    @XmlPath("STAMPPRINTPLACE_ID/@value")
    @Column(name = "STAMPPRINTPLACE_ID")
    @Description(value = "Место печати отметки/штемпеля. COMMON категории 139\n")
    private Integer stampprintplaceId;
    @XmlPath("SHORTNAME/@value")
    @Column(name = "SHORTNAME", length = 20)
    @Description(value = "Сокращенное наименование")
    private String shortname;
    @XmlPath("CUSTOMTEXTDSCR/@value")
    @Column(name = "CUSTOMTEXTDSCR", length = 100)
    @Description(value = "Описание произвольного текста")
    private String customtextdscr;
    @XmlPath("ERROR_TEXT/@value")
    @Column(name = "ERROR_TEXT", length = 100)
    @Description(value = "Окончание текста выводимой ошибки. Ошибка начинается со слов: «введите, далее из поля».")
    private String errorText;
    @XmlPath("CHECKREQUIRED/@value")
    @Column(name = "CHECKREQUIRED")
    @Description(value = "Требует проверки. NSI_DB.COMMON категори 132")
    private Integer checkrequired;
    @XmlPath("EDITMASK/@value")
    @Column(name = "EDITMASK", length = 255)
    @Description(value = "Маска для ввода если требуются данные")
    private String editmask;
}
 