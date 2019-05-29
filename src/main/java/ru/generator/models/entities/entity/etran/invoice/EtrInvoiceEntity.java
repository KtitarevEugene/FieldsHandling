package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.mapstruct.Mapper;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter.XMLDateTimeAdapterEtran;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by solop on 20.11.2017.
 */
@Mapper
@Data
@Entity
@Table(name = "invoice", schema = "etran_inv", indexes = {
        @Index(columnList = "is_Ktlo_Loaded"),
        @Index(columnList = "inv_last_oper")
})
@XmlRootElement(name = "getInvoiceReply")
@IdClass(value = EtrInvoiceEntityPK.class)
public class EtrInvoiceEntity {
    @Id
    @Column(name = "invoice_id", nullable = false)
    @XmlPath("invoiceID/@value")
    private int invoiceId;
    @Basic
    @Column(name = "inv_unp", nullable = true)
    @XmlPath("invUNP/@value")
    private Integer invUnp;
    @Basic
    @Column(name = "inv_date_create", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateCreate/@value")
    private Date invDateCreate;
    @Basic
    @Column(name = "invoice_state_id", nullable = true)
    @XmlPath("invoiceStateID/@value")
    private Integer invoiceStateId;
    @Basic
    @Column(name = "invoice_state", nullable = true, length = 80)
    @XmlPath("invoiceState/@value")
    private String invoiceState;
    @Basic
    @Id
    @Column(name = "inv_last_oper", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invLastOper/@value")
    private Date invLastOper;
    @Basic
    @Column(name = "inv_need_for_ecp", nullable = true)
    @XmlPath("invNeedForECP/@value")
    private Integer invNeedForEcp;
    @Basic
    @Column(name = "inv_ecp_sign", nullable = true)
    @XmlPath("invEcpSign/@value")
    private Integer invEcpSign;
    @Basic
    @Column(name = "inv_type_id", nullable = true)
    @XmlPath("invTypeID/@value")
    private Integer invTypeId;
    @Basic
    @Column(name = "inv_type_name", nullable = true, length = 255)
    @XmlPath("invTypeName/@value")
    private String invTypeName;

    @Basic
    @Column(name = "inv_blank_type_id", nullable = true)
    @XmlPath("invBlankTypeID/@value")
    private Integer invBlankTypeId;
    @Basic
    @Column(name = "inv_blank_type", nullable = true)
    @XmlPath("invBlankType/@value")
    private Integer invBlankTypeCode;
    @Basic
    @Column(name = "inv_blank_type_name", nullable = true, length = 100)
    @XmlPath("invBlankTypeName/@value")
    private String invBlankTypeName;
    @Basic
    @Column(name = "inv_sender_id", nullable = true)
    @XmlPath("invSenderID/@value")
    private Integer invSenderId;
    @Basic
    @Column(name = "inv_sender_okpo", nullable = true, length = 10)
    @XmlPath("invSenderOKPO/@value")
    private String invSenderOkpo;
    @Basic
    @Column(name = "inv_sender_name", nullable = true, length = 250)
    @XmlPath("invSenderName/@value")
    private String invSenderName;
    @Basic
    @Column(name = "inv_sender_address_id", nullable = true)
    @XmlPath("invSenderAddressID/@value")
    private Integer invSenderAddressId;
    @Basic
    @Column(name = "inv_sender_address", nullable = true, length = 255)
    @XmlPath("invSenderAddress/@value")
    private String invSenderAddress;
    @Basic
    @Column(name = "inv_sender_tgnl", nullable = true, length = 4)
    @XmlPath("invSenderTGNL/@value")
    private String invSenderTgnl;
    @Basic
    @Column(name = "inv_claim_id", nullable = true)
    @XmlPath("invClaimID/@value")
    private Integer invClaimId;
    @Basic
    @Column(name = "inv_claim_number", nullable = true, length = 20)
    @XmlPath("invClaimNumber/@value")
    private String invClaimNumber;
    @Basic
    @Column(name = "inv_otpr_num", nullable = true)
    @XmlPath("invOtprNum/@value")
    private Integer invOtprNum;
    @Basic
    @Column(name = "inv_pod_num", nullable = true)
    @XmlPath("invPodNum/@value")
    private Integer invPodNum;
    @Basic
    @Column(name = "inv_from_country_code", nullable = true, length = 3)
    @XmlPath("invFromCountryCode/@value")
    private String invFromCountryCode;
    @Basic
    @Column(name = "inv_from_country_name", nullable = true, length = 65)
    @XmlPath("invFromCountryName/@value")
    private String invFromCountryName;
    @Basic
    @Column(name = "inv_from_point_code", nullable = true, length = 10)
    @XmlPath("invFromPointCode/@value")
    private String invFromPointCode;
    @Basic
    @Column(name = "inv_from_point_name", nullable = true, length = 100)
    @XmlPath("invFromPointName/@value")
    private String invFromPointName;
    @Basic
    @Column(name = "inv_from_station_code", nullable = true, length = 6)
    @XmlPath("invFromStationCode/@value")
    private String invFromStationCode;
    @Basic
    @Column(name = "inv_from_station_name", nullable = true, length = 80)
    @XmlPath("invFromStationName/@value")
    private String invFromStationName;
    @Basic
    @Column(name = "inv_from_port_code", nullable = true)
    @XmlPath("invFromPortCode/@value")
    private Integer invFromPortCode;
    @Basic
    @Column(name = "inv_from_port_name", nullable = true, length = 250)
    @XmlPath("invFromPortName/@value")
    private String invFromPortName;
    @Basic
    @Column(name = "inv_from_load_way", nullable = true, length = 80)
    @XmlPath("invFromLoadWay/@value")
    private String invFromLoadWay;
    @Basic
    @Column(name = "inv_recip_id", nullable = true)
    @XmlPath("invRecipID/@value")
    private Integer invRecipId;
    @Basic
    @Column(name = "inv_recip_okpo", nullable = true, length = 10)
    @XmlPath("invRecipOKPO/@value")
    private String invRecipOkpo;
    @Basic
    @Column(name = "inv_recip_name", nullable = true, length = 250)
    @XmlPath("invRecipName/@value")
    private String invRecipName;
    @Basic
    @Column(name = "inv_recip_address_id", nullable = true)
    @XmlPath("invRecipAddressID/@value")
    private Integer invRecipAddressId;
    @Basic
    @Column(name = "inv_recip_address", nullable = true, length = 255)
    @XmlPath("invRecipAddress/@value")
    private String invRecipAddress;
    @Basic
    @Column(name = "inv_recip_tgnl", nullable = true, length = 4)
    @XmlPath("invRecipTGNL/@value")
    private String invRecipTgnl;
    @Basic
    @Column(name = "inv_to_country_code", nullable = true, length = 3)
    @XmlPath("invToCountryCode/@value")
    private String invToCountryCode;
    @Basic
    @Column(name = "inv_to_country_name", nullable = true, length = 65)
    @XmlPath("invToCountryName/@value")
    private String invToCountryName;
    @Basic
    @Column(name = "inv_to_point_code", nullable = true, length = 6)
    @XmlPath("invToPointCode/@value")
    private String invToPointCode;
    @Basic
    @Column(name = "inv_to_point_name", nullable = true, length = 100)
    @XmlPath("invToPointName/@value")
    private String invToPointName;
    @Basic
    @Column(name = "inv_to_station_code", nullable = true, length = 6)
    @XmlPath("invToStationCode/@value")
    private String invToStationCode;
    @Basic
    @Column(name = "inv_to_station_name", nullable = true, length = 80)
    @XmlPath("invToStationName/@value")
    private String invToStationName;
    @Basic
    @Column(name = "inv_to_port_code", nullable = true)
    @XmlPath("invToPortCode/@value")
    private Integer invToPortCode;
    @Basic
    @Column(name = "inv_to_port_name", nullable = true, length = 250)
    @XmlPath("invToPortName/@value")
    private String invToPortName;
    @Basic
    @Column(name = "inv_to_load_way", nullable = true, length = 80)
    @XmlPath("invToLoadWay/@value")
    private String invToLoadWay;
    @Basic
    @Column(name = "inv_send_speed_id", nullable = true)
    @XmlPath("invSendSpeedID/@value")
    private Integer invSendSpeedId;
    @Basic
    @Column(name = "inv_send_speed_name", nullable = true, length = 80)
    @XmlPath("invSendSpeedName/@value")
    private String invSendSpeedName;
    @Basic
    @Column(name = "inv_send_kind_id", nullable = true)
    @XmlPath("invSendKindID/@value")
    private Integer invSendKindId;
    @Basic
    @Column(name = "inv_send_kind_name", nullable = true, length = 255)
    @XmlPath("invSendKindName/@value")
    private String invSendKindName;
    @Basic
    @Column(name = "inv_pay_place_id", nullable = true)
    @XmlPath("invPayPlaceID/@value")
    private Integer invPayPlaceId;
    @Basic
    @Column(name = "inv_pay_place_name", nullable = true, length = 80)
    @XmlPath("invPayPlaceName/@value")
    private String invPayPlaceName;
    @Basic
    @Column(name = "inv_pay_form_id", nullable = true)
    @XmlPath("invPayFormID/@value")
    private Integer invPayFormId;
    @Basic
    @Column(name = "inv_pay_form_name", nullable = true, length = 80)
    @XmlPath("invPayFormName/@value")
    private String invPayFormName;
    @Basic
    @Column(name = "inv_ix_tariff_code", nullable = true)
    @XmlPath("invIxTariffCode/@value")
    private Integer invIxTariffCode;
    @Basic
    @Column(name = "inv_ix_tariff_code_gdy", nullable = true)
    @XmlPath("invIxTariffCodeGDY/@value")
    private Integer invIxTariffCodeGdy;
    @Basic
    @Column(name = "inv_plan_car_type_id", nullable = true)
    @XmlPath("invPlanCarTypeID/@value")
    private Integer invPlanCarTypeId;
    @Basic
    @Column(name = "inv_plan_car_type_code", nullable = true)
    @XmlPath("invPlanCarTypeCode/@value")
    private Integer invPlanCarTypeCode;
    @Basic
    @Column(name = "inv_plan_car_type_name", nullable = true, length = 80)
    @XmlPath("invPlanCarTypeName/@value")
    private String invPlanCarTypeName;
    @Basic
    @Column(name = "inv_plan_car_count", nullable = true)
    @XmlPath("invPlanCarCount/@value")
    private Integer invPlanCarCount;
    @Basic
    @Column(name = "inv_plan_car_owner_type_id", nullable = true)
    @XmlPath("invPlanCarOwnerTypeID/@value")
    private Integer invPlanCarOwnerTypeId;
    @Basic
    @Column(name = "inv_plan_car_owner_type_name", nullable = true, length = 255)
    @XmlPath("invPlanCarOwnerTypeName/@value")
    private String invPlanCarOwnerTypeName;
    @Basic
    @Column(name = "inv_plan_cont_tonnage", nullable = true)
    @XmlPath("invPlanContTonnage/@value")
    private Integer invPlanContTonnage;
    @Basic
    @Column(name = "inv_cont_plan_size_big", nullable = true)
    @XmlPath("invContPlanSizeBig/@value")
    private Integer invContPlanSizeBig;
    @Basic
    @Column(name = "inv_plan_cont_count", nullable = true)
    @XmlPath("invPlanContCount/@value")
    private Integer invPlanContCount;
    @Basic
    @Column(name = "inv_plan_cont_owner_type_id", nullable = true)
    @XmlPath("invPlanContOwnerTypeID/@value")
    private Integer invPlanContOwnerTypeId;
    @Basic
    @Column(name = "inv_plan_cont_owner_type_name", nullable = true, length = 255)
    @XmlPath("invPlanContOwnerTypeName/@value")
    private String invPlanContOwnerTypeName;
    @Basic
    @Column(name = "inv_load_type_id", nullable = true)
    @XmlPath("invLoadTypeID/@value")
    private Integer invLoadTypeId;
    @Basic
    @Column(name = "inv_load_type_name", nullable = true, length = 255)
    @XmlPath("invLoadTypeName/@value")
    private String invLoadTypeName;
    @Basic
    @Column(name = "inv_announce_value", nullable = true, precision = 0)
    @XmlPath("invAnnounceValue/@value")
    private Double invAnnounceValue;
    @Basic
    @Column(name = "inv_av_currency_id", nullable = true)
    @XmlPath("invAVCurrencyID/@value")
    private Integer invAvCurrencyId;
    @Basic
    @Column(name = "inv_load_assets_id", nullable = true)
    @XmlPath("invLoadAssetsID/@value")
    private Integer invLoadAssetsId;
    @Basic
    @Column(name = "inv_load_assets_name", nullable = true, length = 255)
    @XmlPath("invLoadAssetsName/@value")
    private String invLoadAssetsName;
    @Basic
    @Column(name = "inv_plan_outsize_code", nullable = true, length = 4)
    @XmlPath("invPlanOutsizeCode/@value")
    private String invPlanOutsizeCode;
    @Basic
    @Column(name = "inv_disp_kind_id", nullable = true)
    @XmlPath("invDispKindID/@value")
    private Integer invDispKindId;
    @Basic
    @Column(name = "inv_resp_person", nullable = true, length = 255)
    @XmlPath("invRespPerson/@value")
    private String invRespPerson;
    @Basic
    @Column(name = "inv_pay_place_rw_code", nullable = true, length = 4)
    @XmlPath("invPayPlaceRwCode/@value")
    private String invPayPlaceRwCode;
    @Basic
    @Column(name = "inv_pay_place_rw_name", nullable = true, length = 30)
    @XmlPath("invPayPlaceRwName/@value")
    private String invPayPlaceRwName;
    @Basic
    @Column(name = "inv_payer_code", nullable = true, length = 10)
    @XmlPath("invPayerCode/@value")
    private String invPayerCode;
    @Basic
    @Column(name = "inv_payerid", nullable = true, precision = 0)
    @XmlPath("invPayerID/@value")
    private Double invPayerId;
    @Basic
    @Column(name = "inv_payer_name", nullable = true, length = 250)
    @XmlPath("invPayerName/@value")
    private String invPayerName;
    @Basic
    @Column(name = "inv_payer_account", nullable = true, length = 20)
    @XmlPath("invPayerAccount/@value")
    private String invPayerAccount;
    @Basic
    @Column(name = "inv_payer_bank", nullable = true, length = 255)
    @XmlPath("invPayerBank/@value")
    private String invPayerBank;
    @Basic
    @Column(name = "inv_frw_sub_code", nullable = true, length = 12)
    @XmlPath("invFRWSubCode/@value")
    private String invFrwSubCode;
    @Basic
    @Column(name = "inv_frw_sub_code2", nullable = true, length = 12)
    @XmlPath("invFRWSubCode2/@value")
    private String invFrwSubCode2;
    @Basic
    @Column(name = "inv_load_claim_id", nullable = true)
    @XmlPath("invLoadClaim_id/@value")
    private Integer invLoadClaimId;
    @Basic
    @Column(name = "inv_load_claim_number", nullable = true, length = 20)
    @XmlPath("invLoadClaim_Number/@value")
    private String invLoadClaimNumber;
    @Basic
    @Column(name = "inv_viza_number", nullable = true, length = 8)
    @XmlPath("invVizaNumber/@value")
    private String invVizaNumber;
    @Basic
    @Column(name = "inv_viza_number_full", nullable = true, length = 38)
    @XmlPath("invVizaNumberFull/@value")
    private String invVizaNumberFull;
    @Basic
    @Column(name = "inv_viza_date", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invVizaDate/@value")
    private Date invVizaDate;
    @Basic
    @Column(name = "inv_viza_org", nullable = true)
    @XmlPath("invVizaOrg/@value")
    private Integer invVizaOrg;
    @Basic
    @Column(name = "inv_viza_org_name", nullable = true, length = 255)
    @XmlPath("invVizaOrgName/@value")
    private String invVizaOrgName;
    @Basic
    @Column(name = "inv_viza_person", nullable = true, length = 50)
    @XmlPath("invVizaPerson/@value")
    private String invVizaPerson;
    @Basic
    @Column(name = "inv_viza_post", nullable = true, length = 100)
    @XmlPath("invVizaPost/@value")
    private String invVizaPost;
    @Basic
    @Column(name = "inv_viza_note", nullable = true, length = 4000)
    @XmlPath("invVizaNote/@value")
    private String invVizaNote;
    @Basic
    @Column(name = "inv_date_expire", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateExpire/@value")
    private Date invDateExpire;
    @Basic
    @Column(name = "inv_scale_type_id", nullable = true)
    @XmlPath("invScaleTypeID/@value")
    private Integer invScaleTypeId;
    @Basic
    @Column(name = "inv_scale_type_name", nullable = true, length = 255)
    @XmlPath("invScaleTypeName/@value")
    private String invScaleTypeName;
    @Basic
    @Column(name = "inv_scale_person_id", nullable = true)
    @XmlPath("invScalePersonID/@value")
    private Integer invScalePersonId;
    @Basic
    @Column(name = "inv_scale_person_name", nullable = true, length = 255)
    @XmlPath("invScalePersonName/@value")
    private String invScalePersonName;
    @Basic
    @Column(name = "inv_scale_precision", nullable = true, precision = 0)
    @XmlPath("invScalePrecision/@value")
    private Double invScalePrecision;
    @Basic
    @Column(name = "inv_check_dep_id", nullable = true)
    @XmlPath("invCheckDepID/@value")
    private Integer invCheckDepId;
    @Basic
    @Column(name = "inv_check_dep_name", nullable = true, length = 255)
    @XmlPath("invCheckDepName/@value")
    private String invCheckDepName;
    @Basic
    @Column(name = "inv_depl_person", nullable = true, length = 80)
    @XmlPath("invDeplPerson/@value")
    private String invDeplPerson;
    @Basic
    @Column(name = "inv_fastening_id", nullable = true)
    @XmlPath("invFasteningID/@value")
    private Integer invFasteningId;
    @Basic
    @Column(name = "inv_dep_norm_doc_id", nullable = true)
    @XmlPath("invDepNormDocID/@value")
    private Integer invDepNormDocId;
    @Basic
    @Column(name = "inv_dep_norm_doc_name", nullable = true, length = 255)
    @XmlPath("invDepNormDocName/@value")
    private String invDepNormDocName;
    @Basic
    @Column(name = "inv_ntu_mtu_number", nullable = true, length = 255)
    @XmlPath("invNTU_MTUNumber/@value")
    private String invNtuMtuNumber;
    @Basic
    @Column(name = "inv_dep_part", nullable = true, length = 8)
    @XmlPath("invDepPart/@value")
    private String invDepPart;
    @Basic
    @Column(name = "inv_dep_arc", nullable = true, length = 8)
    @XmlPath("invDepArc/@value")
    private String invDepArc;
    @Basic
    @Column(name = "inv_dep_sec", nullable = true, length = 8)
    @XmlPath("invDepSec/@value")
    private String invDepSec;
    @Basic
    @Column(name = "inv_dep_cond", nullable = true, length = 4000)
    @XmlPath("invDepCond/@value")
    private String invDepCond;
    @Basic
    @Column(name = "inv_ntu_mtu_date", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invNTU_MTUDate/@value")
    private Date invNtuMtuDate;
    @Basic
    @Column(name = "inv_ntu_clearance", nullable = true, length = 255)
    @XmlPath("invNTUClearance/@value")
    private String invNtuClearance;
    @Basic
    @Column(name = "inv_mtu_scheme", nullable = true, length = 255)
    @XmlPath("invMTUScheme/@value")
    private String invMtuScheme;
    @Basic
    @Column(name = "inv_date_load", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateLoad/@value")
    private Date invDateLoad;
    @Basic
    @Column(name = "inv_fact_date_to_load", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invFactDateToLoad/@value")
    private Date invFactDateToLoad;
    @Basic
    @Column(name = "inv_fact_date_to_load_local", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invFactDateToLoadLocal/@value")
    private Date invFactDateToLoadLocal;
    @Basic
    @Column(name = "inv_date_receiving", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateReceiving/@value")
    private Date invDateReceiving;
    @Basic
    @Column(name = "inv_date_receiving_local", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateReceivingLocal/@value")
    private Date invDateReceivingLocal;
    @Basic
    @Column(name = "inv_fact_date_accept", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invFactDateAccept/@value")
    private Date invFactDateAccept;
    @Basic
    @Column(name = "inv_fio_accept", nullable = true, length = 50)
    @XmlPath("invFIOAccept/@value")
    private String invFioAccept;
    @Basic
    @Column(name = "inv_to_country_empty_code", nullable = true, length = 4)
    @XmlPath("invToCountryEmptyCode/@value")
    private String invToCountryEmptyCode;
    @Basic
    @Column(name = "inv_to_country_empty_name", nullable = true, length = 65)
    @XmlPath("invToCountryEmptyName/@value")
    private String invToCountryEmptyName;
    @Basic
    @Column(name = "inv_to_station_empty_code", nullable = true, length = 6)
    @XmlPath("invToStationEmptyCode/@value")
    private String invToStationEmptyCode;
    @Basic
    @Column(name = "inv_to_station_empty_name", nullable = true, length = 80)
    @XmlPath("invToStationEmptyName/@value")
    private String invToStationEmptyName;
    @Basic
    @Column(name = "inv_number", nullable = true, length = 8)
    @XmlPath("invNumber/@value")
    private String invNumber;
    @Basic
    @Column(name = "inv_unique_number", nullable = true, length = 20)
    @XmlPath("invUniqueNumber/@value")
    private String invUniqueNumber;
    @Basic
    @Column(name = "inv_sign_route_num_circ", nullable = true)
    @XmlPath("invSignRouteNumCirc/@value")
    private Integer invSignRouteNumCirc;
    @Basic
    @Column(name = "inv_route_num_circ", nullable = true, precision = 0)
    @XmlPath("invRouteNumCirc/@value")
    private Double invRouteNumCirc;
    @Basic
    @Column(name = "inv_route_name", nullable = true, length = 20)
    @XmlPath("invRouteName/@value")
    private String invRouteName;
    @Basic
    @Column(name = "inv_route_type_name", nullable = true, length = 255)
    @XmlPath("invRouteTypeName/@value")
    private String invRouteTypeName;
    @Basic
    @Column(name = "inv_goods_cashier", nullable = true, length = 100)
    @XmlPath("invGoodsCashier/@value")
    private String invGoodsCashier;
    @Basic
    @Column(name = "inv_goods_cashier_post", nullable = true, length = 100)
    @XmlPath("invGoodsCashierPost/@value")
    private String invGoodsCashierPost;
    @Basic
    @Column(name = "inv_date_ready", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateReady/@value")
    private Date invDateReady;
    @Basic
    @Column(name = "inv_date_ready_local", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateReadyLocal/@value")
    private Date invDateReadyLocal;
    @Basic
    @Column(name = "inv_date_departure", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateDeparture/@value")
    private Date invDateDeparture;
    @Basic
    @Column(name = "inv_rt_id", nullable = true, precision = 0)
    @XmlPath("invRtID/@value")
    private Double invRtId;
    @Basic
    @Column(name = "inv_date_custom", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateCustom/@value")
    private Date invDateCustom;
    @Basic
    @Column(name = "inv_date_arrive", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateArrive/@value")
    private Date invDateArrive;
    @Basic
    @Column(name = "inv_date_arrive_local", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateArriveLocal/@value")
    private Date invDateArriveLocal;
    @Basic
    @Column(name = "inv_date_delivery", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateDelivery/@value")
    private Date invDateDelivery;
    @Basic
    @Column(name = "inv_date_delivery_local", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateDeliveryLocal/@value")
    private Date invDateDeliveryLocal;
    @Basic
    @Column(name = "inv_date_raskr_ei", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateRaskrEl/@value")
    private Date invDateRaskrEi;
    @Basic
    @Column(name = "inv_date_register", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateRegister/@value")
    private Date invDateRegister;
    @Basic
    @Column(name = "inv_date_register_local", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateRegisterLocal/@value")
    private Date invDateRegisterLocal;
    @Basic
    @Column(name = "inv_date_notification", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("invDateNotification/@value")
    private Date invDateNotification;
    @Basic
    @Column(name = "inv_notification", nullable = true, length = 4000)
    @XmlPath("invNotification/@value")
    private String invNotification;
    @Basic
    @Column(name = "inv_num410", nullable = true)
    @XmlPath("invNum410/@value")
    private Integer invNum410;
    @Basic
    @Column(name = "inv_kpz", nullable = true, length = 17)
    @XmlPath("invKPZ/@value")
    private String invKpz;
    @Basic
    @Column(name = "inv_parent_id", nullable = true)
    @XmlPath("invParentID/@value")
    private Integer invParentId;
    @Basic
    @Column(name = "inv_parent_number", nullable = true, length = 8)
    @XmlPath("invParentNumber/@value")
    private String invParentNumber;
    @Basic
    @Column(name = "warning", nullable = true, length = 4000)
    @XmlPath("warning/@value")
    private String warning;
    @Column(name = "is_ktlo_loaded", nullable = false)
    private Integer isKtloLoaded = 0;
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invAuto")
    @ModelClass(EtrInvAutoEntity.class)
    private Collection<EtrInvAutoEntity> invAuto = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invCar")
    @ModelClass(EtrInvCarEntity.class)
    private Collection<EtrInvCarEntity> invCar = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invCont")
    @ModelClass(EtrInvContEntity.class)
    private Collection<EtrInvContEntity> invCont = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invDev")
    @ModelClass(EtrInvDevEntity.class)
    private Collection<EtrInvDevEntity> invDev = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invDistance")
    @ModelClass(EtrInvDistanceEntity.class)
    private Collection<EtrInvDistanceEntity> invDistance = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invDOC")
    @ModelClass(EtrInvDocEntity.class)
    private Collection<EtrInvDocEntity> invDoc = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invDue")
    @ModelClass(EtrInvDueEntity.class)
    private Collection<EtrInvDueEntity> invDue = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invDueArrive")
    @ModelClass(EtrInvDueArriveEntity.class)
    private Collection<EtrInvDueArriveEntity> invDueArrive = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invDueEnter")
    @ModelClass(EtrInvDueEnterEntity.class)
    private Collection<EtrInvDueEnterEntity> invDueEnter = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invFastener")
    @ModelClass(EtrInvFastenerEntity.class)
    private Collection<EtrInvFastenerEntity> invFastener = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invFreight")
    @ModelClass(EtrInvFreightEntity.class)
    private Collection<EtrInvFreightEntity> invFreight = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invGuide")
    @ModelClass(EtrInvGuideEntity.class)
    private Collection<EtrInvGuideEntity> invGuides = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invJoint")
    @ModelClass(EtrInvJointEntity.class)
    private Collection<EtrInvJointEntity> invJoint = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invMarxe")
    @ModelClass(EtrInvMarxEntity.class)
    private Collection<EtrInvMarxEntity> invMarxe = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invNoteAskm")
    @ModelClass(EtrInvNoteAskmEntity.class)
    private Collection<EtrInvNoteAskmEntity> invNoteAskm = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invOper")
    @ModelClass(EtrInvOperEntity.class)
    private Collection<EtrInvOperEntity> invOper = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invSPC")
    @ModelClass(EtrInvSpcEntity.class)
    private Collection<EtrInvSpcEntity> invSpc = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "invTranspClause")
    @ModelClass(EtrInvTranspClauseEntity.class)
    private Collection<EtrInvTranspClauseEntity> invTranspClause = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "lnk")
    @ModelClass(EtrLnkEntity.class)
    private Collection<EtrLnkEntity> lnk = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "noteFastener")
    @ModelClass(EtrNoteFastenerEntity.class)
    private Collection<EtrNoteFastenerEntity> noteFastener = new ArrayList<>();
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "wayCLS")
    @ModelClass(EtrWayClsEntity.class)
    private Collection<EtrWayClsEntity> wayCls = new ArrayList<>();
}