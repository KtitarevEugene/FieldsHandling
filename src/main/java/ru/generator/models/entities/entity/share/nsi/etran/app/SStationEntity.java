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
@Table(name = "S_STATION", schema = "NSI_ETR")
//@IdClass(SStationEntityPK.class)
/**Классификатор раздельных пунктов (станций) **/
public class SStationEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("ST_ID/@value")
    @Column(name = "ST_ID")
    @Description(value = "Условный идентификатор станции", position = 100)
    private Integer stId;
    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    @Description(value = "Номер приказа на изменение классификатора", position = 200)
    private String orderNo;
    @XmlPath("ST_CODE/@value")
    @Column(name = "ST_CODE", length = 5)
    @Description(value = "Код ЕСР", position = 300)
    private String stCode;
    @XmlPath("ST_DP_ID/@value")
    @Column(name = "ST_DP_ID")
    @Description(value = "Условный идентификатор отделения", position = 400)
    private Integer stDpId;
    @XmlPath("ST_STT_ID/@value")
    @Column(name = "ST_STT_ID")
    @Description(value = "Идентификатор типа разд. пункта", position = 500)
    private Integer stSttId;
    @XmlPath("ST_RG_ID/@value")
    @Column(name = "ST_RG_ID")
    @Description(value = "Условный идентификатор региона", position = 600)
    private Integer stRgId;
    @XmlPath("ST_DP_RW_ID/@value")
    @Column(name = "ST_DP_RW_ID")
    @Description(value = "Условный идентификатор дороги", position = 700)
    private Integer stDpRwId;
    @XmlPath("ST_CN_ID/@value")
    @Column(name = "ST_CN_ID")
    @Description(value = "Ссылка на страну", position = 800)
    private Integer stCnId;
    @XmlPath("ST_NAME_12CHAR/@value")
    @Column(name = "ST_NAME_12CHAR", length = 12)
    @Description(value = "12-символьное наименование станции", position = 900)
    private String stName12char;
    @XmlPath("ST_NAME/@value")
    @Column(name = "ST_NAME", length = 40)
    @Description(value = "Полное наименование раздельного пункта", position = 1000)
    private String stName;
    @XmlPath("ST_BORDER_SIGN/@value")
    @Column(name = "ST_BORDER_SIGN", length = 1)
    @Description(value = "Признак пограничного железнодорожного перехода", position = 1100)
    private String stBorderSign;
    @XmlPath("ST_SEA_SIGN/@value")
    @Column(name = "ST_SEA_SIGN", length = 1)
    @Description(value = "Признак перевалки на море", position = 1200)
    private String stSeaSign;
    @XmlPath("ST_RIVER_SIGN/@value")
    @Column(name = "ST_RIVER_SIGN", length = 1)
    @Description(value = "Признак перевалки на реку", position = 1300)
    private String stRiverSign;
    @XmlPath("ST_SEA_IM_EX/@value")
    @Column(name = "ST_SEA_IM_EX", length = 1)
    @Description(value = "Признак перевалки на море (имп-экс)", position = 1400)
    private String stSeaImEx;
    @XmlPath("ST_RIVER_IM_EX/@value")
    @Column(name = "ST_RIVER_IM_EX", length = 1)
    @Description(value = "Признак перевалки на реку (имп-экс)", position = 1500)
    private String stRiverImEx;
    @XmlPath("ST_CAR_SIGN/@value")
    @Column(name = "ST_CAR_SIGN", length = 1)
    @Description(value = "Признак перевалки на автотранспорт", position = 1600)
    private String stCarSign;
    @XmlPath("ST_FERRY_SIGN/@value")
    @Column(name = "ST_FERRY_SIGN", length = 1)
    @Description(value = "Признак перевалки на паромную переправу", position = 1700)
    private String stFerrySign;
    @XmlPath("ST_FERRY_IM_EX/@value")
    @Column(name = "ST_FERRY_IM_EX", length = 1)
    @Description(value = "Признак перевалки на паромную переправу (имп-экс)", position = 1800)
    private String stFerryImEx;
    @XmlPath("ST_NEWBUILD_SIGN/@value")
    @Column(name = "ST_NEWBUILD_SIGN", length = 1)
    @Description(value = "Признак перевалки на новостроящуюся ж.д. линию", position = 1900)
    private String stNewbuildSign;
    @XmlPath("ST_JOINT_SIGN/@value")
    @Column(name = "ST_JOINT_SIGN")
    @Description(value = "Тип стыкового пункта", position = 2000)
    private Integer stJointSign;
    @XmlPath("ST_ADJOIN_CD/@value")
    @Column(name = "ST_ADJOIN_CD", length = 4)
    @Description(value = "(Не используется)", position = 2100)
    private String stAdjoinCd;
    @XmlPath("ST_JCN_ID/@value")
    @Column(name = "ST_JCN_ID")
    @Description(value = "Для межгосуд.стыка-смежн. гос-во", position = 2200)
    private Integer stJcnId;
    @XmlPath("ST_JRW_ID/@value")
    @Column(name = "ST_JRW_ID")
    @Description(value = "Для междорожн.стыка-смежн. дорога", position = 2300)
    private Integer stJrwId;
    @XmlPath("ST_FREIGH_SIGN/@value")
    @Column(name = "ST_FREIGH_SIGN", length = 1)
    @Description(value = "Признак станции, открытой для грузовой работы", position = 2400)
    private String stFreighSign;
    @XmlPath("ST_JOINT_EX/@value")
    @Column(name = "ST_JOINT_EX", length = 1)
    @Description(value = "Признак экспорта международного", position = 2500)
    private String stJointEx;
    @XmlPath("ST_JDP_ID/@value")
    @Column(name = "ST_JDP_ID")
    @Description(value = "Для межотделенч.стыка-смежн. отделение", position = 2600)
    private Integer stJdpId;
    @XmlPath("ST_INTER_SIGN/@value")
    @Column(name = "ST_INTER_SIGN", length = 1)
    @Description(value = "Внешний переход", position = 2700)
    private String stInterSign;
    @XmlPath("UZEL/@value")
    @Column(name = "UZEL")
    @Description(value = "Ссылка на ж/д узел (if any)", position = 2800)
    private Integer uzel;
    @XmlPath("ST_HEAD_ST_ID/@value")
    @Column(name = "ST_HEAD_ST_ID")
    @Description(value = "ID станции обработки документов (вышестоящей)", position = 2900)
    private Integer stHeadStId;
    @XmlPath("ST_CN_ID_REAL/@value")
    @Column(name = "ST_CN_ID_REAL")
    @Description(value = "Страна реальная (не Ж/Д), в которой расположена станция", position = 3000)
    private Integer stCnIdReal;
    @XmlPath("OPOR_STATION_ID/@value")
    @Column(name = "OPOR_STATION_ID")
    @Description(value = "Опорная станция (ссылка на ST_ID)", position = 3100)
    private Integer oporStationId;
    @XmlPath("OPOR_STATION_SIGN/@value")
    @Column(name = "OPOR_STATION_SIGN", length = 1)
    @Description(value = "Признак опорной станции", position = 3200)
    private String oporStationSign;
    @XmlPath("NEWST_JOINT_ID/@value")
    @Column(name = "NEWST_JOINT_ID")
    @Description(value = "Станция примыкания для новостройки", position = 3300)
    private Integer newstJointId;
    @XmlPath("ST_CODE_OSJD/@value")
    @Column(name = "ST_CODE_OSJD", length = 6)
    @Description(value = "Код станции с контрольным знаком - обязателен и для СНГ и для ДЗ", position = 3400)
    private String stCodeOsjd;
}
 