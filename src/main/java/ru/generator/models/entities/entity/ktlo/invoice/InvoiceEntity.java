package ru.generator.models.entities.entity.ktlo.invoice;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.swagger.annotations.ApiModel;
import ru.generator.service.annotations.Description;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.models.entities.annotation.Nsi;
import ru.generator.models.entities.entity.share.nsi.etran.app.*;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by solop on 20.11.2017.
 */
@ApiModel(discriminator = "Накладная")
@Data
@Entity
@Table(name = "invoice", schema = "invoice", indexes = {
        @Index(columnList = "invoice_id"),
        @Index(columnList = "source_data")
})
//@IdClass(value = EtrInvoiceEntityPK.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "invoiceDocId")
public class InvoiceEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @Column(name = "invoice_doc_id", nullable = false, length = 36)
    @Description(value = "Идентификатор накладной")
    private String invoiceDocId;

    @Column(name = "invoice_id", nullable = false)
    @Description(value = "Идентификатор накладной")
    private int invoiceId;

    @Basic
    @Column(name = "inv_unp", nullable = true)
    @Description(value = "Уникальный номер перевозки")
    private Integer invUnp;

    @Nsi(nsiClassEntity = SBlancTypeEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_blank_type_id", referencedColumnName = "BLANC_ID")
    @Description(value = "Тип бланка (Код по BLANC_TYPE)")
    @ModelClass(SBlancTypeEntity.class)
    private SBlancTypeEntity invBlankType;

    @Basic
    @Column(name = "inv_number", nullable = true, length = 8)
    @Description(value = "Номер накладной ")
    private String invNumber;

    @Basic
    @Column(name = "invoice_state_id", nullable = true)
    @Description(value = "ID Текущего состояние накладной")
    private Integer invoiceStateId;

    @Basic
    @Column(name = "invoice_state", nullable = true, length = 40)
    @Description(value = "Текущее состояние накладной")
    private String invoiceState;

    @Column(name = "source_data", length = 36)
    @Description(value = "Источник данных ETRAN, KTLO")
    private String sourceData;

    @Column(name = "source_del", length = 36)
    @Description(value = "Источник порчи ETRAN, KTLO")
    private String sourceDel;

    @Basic
    @Column(name = "inv_date_create", nullable = true)
    @Description(value = "Дата создания документа")
    private Date invDateCreate;

    @Basic
    @Column(name = "inv_fact_date_accept", nullable = true)
    @Description(value = "Дата принятия приемосдатчиком")
    private Date invFactDateAccept;

    @Basic
    @Column(name = "inv_date_register_manual", nullable = true)
    @Description(value = "Дата приемосдачи (руч. коррек)")
    private Date invDateRegisterManual;

    @Basic
    @Column(name = "inv_date_expire", nullable = true)
    @Description(value = "Дата истечения срока доставки")
    private Date invDateExpire;

    @Basic
    @Column(name = "inv_date_arrive", nullable = true)
    @Description(value = "Дата и время прибытия груза")
    private Date invDateArrive;

    @Basic
    @Column(name = "inv_date_arrive_local", nullable = true)
    @Description(value = "Дата и время прибытия груза(местная)")
    private Date invDateArriveLocal;

    @Basic
    @Column(name = "inv_date_arrive_manual", nullable = true)
    @Description(value = "Дата прибытия (руч. коррек)")
    private Date invDateArriveManual;

    @Basic
    @Column(name = "inv_date_delivery", nullable = true)
    @Description(value = "Дата и время раскредитования груза (даты выдачи груза, для транзитных и экспортных – дата сдачи на инодорогу) ")
    private Date invDateDelivery;

    @Basic
    @Column(name = "inv_date_delivery_local", nullable = true)
    @Description(value = "Дата и время раскредитования груза (местная) (даты выдачи груза, для транзитных и экспортных – дата сдачи на инодорогу)")
    private Date invDateDeliveryLocal;

    @Basic
    @Column(name = "inv_date_raskr_ei", nullable = true)
    @Description(value = "Дата и время раскредитования груза (электронная) (даты выдачи груза, для транзитных и экспортных – дата сдачи на инодорогу) ")
    private Date invDateRaskrEi;

    @Basic
    @Column(name = "inv_date_delivery_manual", nullable = true)
    @Description(value = "Дата раскредитования (руч. кор)")
    private Date invDateDeliveryManual;

    // TODO: 05.04.2019 СПРАВОЧНИК!!!!!!!!!!!!!  Вид сообщения (ID по НСИ - INV_DISP_KIND
    @Basic
    @Column(name = "inv_disp_kind_ID", nullable = true)
    @Description(value = "Вид сообщения (ID по НСИ - INV_DISP_KIND)")
    private Integer invDispKindId;

    @Nsi(nsiClassEntity = SCommon_122_Entity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_load_type_ID", referencedColumnName = "id")
    @Description(value = "Вид грузовых работ (ID по НСИ - COMMON, тип 122")
    @ModelClass(SCommon_122_Entity.class)
    private SCommon_122_Entity invLoadType;

    @Nsi(nsiClassEntity = SInvSendTypeEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_send_kind_ID", referencedColumnName = "KIND_SEND")
    @Description(value = "Вид отправки (ID по INV_SEND_TYPE)")
    @ModelClass(SInvSendTypeEntity.class)
    private SInvSendTypeEntity invSendKind;

    @Nsi(nsiClassEntity = SInvPayFormEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_pay_form_ID", referencedColumnName = "PAY_FORM")
    @Description(value = "Форма оплаты (PAY_FORM по INV_PAY_FORM)")
    @ModelClass(SInvPayFormEntity.class)
    private SInvPayFormEntity invPayForm;

    @Basic
    @Column(name = "inv_resp_person", nullable = true, length = 255)
    @Description(value = "Ответственный за заполнение")
    private String invRespPerson;

    @Basic
    @Column(name = "inv_ix_tariff_code", nullable = true)
    @Description(value = "Код исключительного тарифа")
    private Integer invIxTariffCode;

    @Basic
    @Column(name = "inv_ix_tariff_code_gdy", nullable = true)
    @Description(value = "Код исключительного тарифа ЖДЯ")
    private Integer invIxTariffCodeGdy;

    @Basic
    @Column(name = "inv_number_manifest_train", nullable = true, length = 2800)
    @Description(value = "№ манифеста поезда")
    private String invNumberManifestTrain;

    @Basic
    @Nsi(nsiClassEntity = SFreightEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_goods_share", referencedColumnName = "FR_ID")
    @Description(value = "Код груза (обобщ.), Наим. груза (обобщ.)")
    @ModelClass(SFreightEntity.class)
    private SFreightEntity invGoodsShare;

    @Basic
    @Nsi(nsiClassEntity = SSumFreightEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_goods_group_share", referencedColumnName = "GG_NUMBER")
    @Description(value = "Код груза (обобщ.), Наим. груза (обобщ.)")
    @ModelClass(SSumFreightEntity.class)
    private SSumFreightEntity invGoodsGroupShare;

    @Transient
    @Description(value = "Кол-во вагонов")
    private Integer invCountCar;

    @Basic
    @Transient
    @Description(value = "Список вагонов")
    private Collection<String> invListCar = new ArrayList<>();

    @Basic
    @Column(name = "inv_sender_id", nullable = true)
    @XmlPath("invSenderID/@value")
    @Description(value = "Грузоотправитель ID")
    private Integer invSenderId;

    @Basic
    @Column(name = "inv_sender_okpo", nullable = true, length = 10)
    @XmlPath("invSenderOKPO/@value")
    @Description(value = "Код ОКПО")
    private String invSenderOkpo;

    @Basic
    @Column(name = "inv_sender_name", nullable = true, length = 250)
    @XmlPath("invSenderName/@value")
    @Description(value = "Имя грузоотправителя")
    private String invSenderName;


//    Плательщик по РФ
//    ОКПО Плательщика


    @Basic
    @Column(name = "inv_number_gu_12", nullable = true, length = 12)
    @Description(value = "Номер ГУ-12 гр. рейс")
    private String invNumberGu12;
    @Basic
    @Column(name = "inv_number_gu_12_empty", nullable = true, length = 12)
    @Description(value = " Номер ГУ-12 порож. рейс")
    private String invNumberGu12Empty;

    @Basic
    @Column(name = "inv_order_number", nullable = true, length = 20)
    @Description(value = "Номер заказа")
    private String invOrderNumber;

    @Basic
    @Column(name = "inv_claim_id", nullable = true)
    @Description(value = "ID или номер заявки, номер отправки, номер графика подач")
    private Integer invClaimId;

    @Basic
    @Column(name = "inv_claim_number", nullable = true, length = 20)
    @Description(value = "Номер заявки - 10 знаков. Для указанния корректировки добавляется префикс «-ИЗМ/» и номер изменения, например «0005345024-ИЗМ/1» При поиске по такого вида номеру учитывается станция отправления - для определения раздвоившихся заявок с изменнной станцией отправления")
    private String invClaimNumber;


    @Nsi(nsiClassEntity = SCountryEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_from_country_id", referencedColumnName = "CN_ID")
    @Description(value = "Страна отправления (код ОКСМ по НСИ - COUNTRY)")
    @ModelClass(SCountryEntity.class)
    private SCountryEntity invFromCountry;

    @Nsi(nsiClassEntity = SRailwayEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_from_road_id", referencedColumnName = "RW_ID")
    @Description(value = "Дорога отправления/выход из СНГ (НСИ - s_railway) ")
    @ModelClass(SRailwayEntity.class)
    private SRailwayEntity invFromRoad;


    @Nsi(nsiClassEntity = SStationEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_from_station_id", referencedColumnName = "ST_ID")
    @Description(value = "Станция отправления/выход из СНГ (код ЕСР по НСИ - STATION) ")
    @ModelClass(SStationEntity.class)
    private SStationEntity invFromStation;

    @Basic
    @Column(name = "inv_frw_sub_code", nullable = true, length = 12)
    @Description(value = "Подкод экспедитора")
    private String invFrwSubCode;

    @Basic
    @Column(name = "inv_frw_sub_code2", nullable = true, length = 12)
    @Description(value = "Подкод контрагента ")
    private String invFrwSubCode2;

    @Nsi(nsiClassEntity = SCountryEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_to_country_id", referencedColumnName = "CN_ID")
    @Description(value = "Страна назначения (код ОКСМ по НСИ - COUNTRY) ")
    @ModelClass(SCountryEntity.class)
    private SCountryEntity invToCountry;

    @Nsi(nsiClassEntity = SRailwayEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_to_road_id", referencedColumnName = "RW_ID")
    @Description(value = "Дорога назначени (НСИ - s_railway) ")
    @ModelClass(SRailwayEntity.class)
    private SRailwayEntity invToRoad;

    @Nsi(nsiClassEntity = SStationEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "inv_to_station_id", referencedColumnName = "ST_ID")
    @Description(value = "Станция назначения/входа в СНГ (код ЕСР по НСИ - STATION)")
    @ModelClass(SStationEntity.class)
    private SStationEntity invToStation;

    @Basic
    @Column(name = "inv_route_type_name", nullable = true, length = 255)
    @Description(value = "Тип маршрута ")
    private String invRouteTypeName;

    @Basic
    @Column(name = "inv_route_name", nullable = true, length = 20)
    @Description(value = "Номер маршрута ")
    private String invRouteName;

    @Basic
    @Column(name = "inv_additional_cargo_info", nullable = true, length = 255)
    @Description(value = "Доп. сведения о грузе")
    private String invAdditionalCargoInfo;

    @Basic
    @Column(name = "inv_sub_code_shipping", nullable = true, length = 12)
    @Description(value = "Подкод перевозки")
    private String invSubCodeShipping;
    @Basic
    @Column(name = "inv_sub_group_tech_sub_code", nullable = true, length = 12)
    @Description(value = "Подгруппа технол. подкода")
    private String invSubGroupTechSubCode;


    @Basic
    @Column(name = "inv_last_oper", nullable = true)
    @Description(value = "Дата последней операции над документом")
    private Date invLastOper;

    @Basic
    @Column(name = "inv_date_receiving", nullable = true)
    @Description(value = "Дата приема с инодороги")
    private Date invDateReceiving;

    @Basic
    @Column(name = "inv_date_receiving_local", nullable = true)
    @Description(value = "Дата приема с инодороги (местная)")
    private Date invDateReceivingLocal;

    @Basic
    @Column(name = "inv_date_register", nullable = true)
    @Description(value = "Дата и время сдачи на инодорогу")
    private Date invDateRegister;

    @Basic
    @Column(name = "inv_date_register_local", nullable = true)
    @Description(value = "Дата и время сдачи на инодорогу (местная)")
    private Date invDateRegisterLocal;

    @Basic
    @Column(name = "is_actual", nullable = false)
    @Description(value = "признак isActual")
    private Integer isActual = 1;


    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Description(value = "НАКЛАДНАЯ: Провозные платежи")
    @ModelClass(value = InvDueEntity.class, fieldTypeName = "parentObject")
    private Collection<InvDueEntity> invDue = new ArrayList<>();

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Description(value = "НАКЛАДНАЯ: Вагоны")
    @ModelClass(value = InvCarEntity.class, fieldTypeName = "parentObject")
    private Collection<InvCarEntity> invCar = new ArrayList<>();

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Description(value = "НАКЛАДНАЯ: Контейнеры")
    @ModelClass(value = InvContEntity.class, fieldTypeName = "parentObject")
    private Collection<InvContEntity> invCont = new ArrayList<>();

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Description(value = "НАКЛАДНАЯ: Маршрут следования")
    @ModelClass(value = InvDistanceEntity.class, fieldTypeName = "parentObject")
    private Collection<InvDistanceEntity> invDistance = new ArrayList<>();

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Description(value = "НАКЛАДНАЯ: Тарифные отметки")
    @ModelClass(value = InvTarifMarkEntity.class, fieldTypeName = "parentObject")
    private Collection<InvTarifMarkEntity> invTarifMark = new ArrayList<>();
}
