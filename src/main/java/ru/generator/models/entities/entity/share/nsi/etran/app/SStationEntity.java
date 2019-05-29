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
@Table(name = "S_STATION", schema = "NSI_ETR")
//@IdClass(SStationEntityPK.class)
/**Классификатор раздельных пунктов (станций) **/
public class SStationEntity extends NsiWithTransIdAbstractEntity implements Serializable {
    @Id
    @XmlPath("ST_ID/@value")
    @Column(name = "ST_ID")
    @Description(value = "Условный идентификатор станции")
    private Integer stId;
    @XmlPath("ORDER_NO/@value")
    @Column(name = "ORDER_NO", length = 40)
    @Description(value = "Номер приказа на изменение классификатора")
    private String orderNo;
    @XmlPath("ST_CODE/@value")
    @Column(name = "ST_CODE", length = 5)
    @Description(value = "Код ЕСР")
    private String stCode;
    @XmlPath("ST_DP_ID/@value")
    @Column(name = "ST_DP_ID")
    @Description(value = "Условный идентификатор отделения")
    private Integer stDpId;
    @XmlPath("ST_STT_ID/@value")
    @Column(name = "ST_STT_ID")
    @Description(value = "Идентификатор типа разд. пункта")
    private Integer stSttId;
    @XmlPath("ST_RG_ID/@value")
    @Column(name = "ST_RG_ID")
    @Description(value = "Условный идентификатор региона")
    private Integer stRgId;
    @XmlPath("ST_DP_RW_ID/@value")
    @Column(name = "ST_DP_RW_ID")
    @Description(value = "Условный идентификатор дороги")
    private Integer stDpRwId;
    @XmlPath("ST_CN_ID/@value")
    @Column(name = "ST_CN_ID")
    @Description(value = "Ссылка на страну")
    private Integer stCnId;
    @XmlPath("ST_NAME_12CHAR/@value")
    @Column(name = "ST_NAME_12CHAR", length = 12)
    @Description(value = "12-символьное наименование станции")
    private String stName12char;
    @XmlPath("ST_NAME/@value")
    @Column(name = "ST_NAME", length = 40)
    @Description(value = "Полное наименование раздельного пункта")
    private String stName;
    @XmlPath("ST_BORDER_SIGN/@value")
    @Column(name = "ST_BORDER_SIGN", length = 1)
    @Description(value = "Признак пограничного железнодорожного перехода")
    private String stBorderSign;
    @XmlPath("ST_SEA_SIGN/@value")
    @Column(name = "ST_SEA_SIGN", length = 1)
    @Description(value = "Признак перевалки на море")
    private String stSeaSign;
    @XmlPath("ST_RIVER_SIGN/@value")
    @Column(name = "ST_RIVER_SIGN", length = 1)
    @Description(value = "Признак перевалки на реку")
    private String stRiverSign;
    @XmlPath("ST_SEA_IM_EX/@value")
    @Column(name = "ST_SEA_IM_EX", length = 1)
    @Description(value = "Признак перевалки на море (имп-экс)")
    private String stSeaImEx;
    @XmlPath("ST_RIVER_IM_EX/@value")
    @Column(name = "ST_RIVER_IM_EX", length = 1)
    @Description(value = "Признак перевалки на реку (имп-экс)")
    private String stRiverImEx;
    @XmlPath("ST_CAR_SIGN/@value")
    @Column(name = "ST_CAR_SIGN", length = 1)
    @Description(value = "Признак перевалки на автотранспорт")
    private String stCarSign;
    @XmlPath("ST_FERRY_SIGN/@value")
    @Column(name = "ST_FERRY_SIGN", length = 1)
    @Description(value = "Признак перевалки на паромную переправу")
    private String stFerrySign;
    @XmlPath("ST_FERRY_IM_EX/@value")
    @Column(name = "ST_FERRY_IM_EX", length = 1)
    @Description(value = "Признак перевалки на паромную переправу (имп-экс)")
    private String stFerryImEx;
    @XmlPath("ST_NEWBUILD_SIGN/@value")
    @Column(name = "ST_NEWBUILD_SIGN", length = 1)
    @Description(value = "Признак перевалки на новостроящуюся ж.д. линию")
    private String stNewbuildSign;
    @XmlPath("ST_JOINT_SIGN/@value")
    @Column(name = "ST_JOINT_SIGN")
    @Description(value = "Тип стыкового пункта")
    private Integer stJointSign;
    @XmlPath("ST_ADJOIN_CD/@value")
    @Column(name = "ST_ADJOIN_CD", length = 4)
    @Description(value = "(Не используется)")
    private String stAdjoinCd;
    @XmlPath("ST_JCN_ID/@value")
    @Column(name = "ST_JCN_ID")
    @Description(value = "Для межгосуд.стыка-смежн. гос-во")
    private Integer stJcnId;
    @XmlPath("ST_JRW_ID/@value")
    @Column(name = "ST_JRW_ID")
    @Description(value = "Для междорожн.стыка-смежн. дорога")
    private Integer stJrwId;
    @XmlPath("ST_FREIGH_SIGN/@value")
    @Column(name = "ST_FREIGH_SIGN", length = 1)
    @Description(value = "Признак станции, открытой для грузовой работы")
    private String stFreighSign;
    @XmlPath("ST_JOINT_EX/@value")
    @Column(name = "ST_JOINT_EX", length = 1)
    @Description(value = "Признак экспорта международного")
    private String stJointEx;
    @XmlPath("ST_JDP_ID/@value")
    @Column(name = "ST_JDP_ID")
    @Description(value = "Для межотделенч.стыка-смежн. отделение")
    private Integer stJdpId;
    @XmlPath("ST_INTER_SIGN/@value")
    @Column(name = "ST_INTER_SIGN", length = 1)
    @Description(value = "Внешний переход")
    private String stInterSign;
    @XmlPath("UZEL/@value")
    @Column(name = "UZEL")
    @Description(value = "Ссылка на ж/д узел (if any)")
    private Integer uzel;
    @XmlPath("ST_HEAD_ST_ID/@value")
    @Column(name = "ST_HEAD_ST_ID")
    @Description(value = "ID станции обработки документов (вышестоящей)")
    private Integer stHeadStId;
    @XmlPath("ST_CN_ID_REAL/@value")
    @Column(name = "ST_CN_ID_REAL")
    @Description(value = "Страна реальная (не Ж/Д), в которой расположена станция")
    private Integer stCnIdReal;
    @XmlPath("OPOR_STATION_ID/@value")
    @Column(name = "OPOR_STATION_ID")
    @Description(value = "Опорная станция (ссылка на ST_ID)")
    private Integer oporStationId;
    @XmlPath("OPOR_STATION_SIGN/@value")
    @Column(name = "OPOR_STATION_SIGN", length = 1)
    @Description(value = "Признак опорной станции")
    private String oporStationSign;
    @XmlPath("NEWST_JOINT_ID/@value")
    @Column(name = "NEWST_JOINT_ID")
    @Description(value = "Станция примыкания для новостройки")
    private Integer newstJointId;
    @XmlPath("ST_CODE_OSJD/@value")
    @Column(name = "ST_CODE_OSJD", length = 6)
    @Description(value = "Код станции с контрольным знаком - обязателен и для СНГ и для ДЗ")
    private String stCodeOsjd;
}
 