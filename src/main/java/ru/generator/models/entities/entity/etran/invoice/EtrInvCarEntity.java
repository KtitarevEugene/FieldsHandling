package ru.generator.models.entities.entity.etran.invoice;

import ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter.XMLDateTimeAdapterEtran;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import org.mapstruct.Mapper;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
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
@Table(name = "inv_car", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvCarEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "car_claim_id", nullable = true, precision = 0)
    @XmlPath("carClaimID/@value")
    private Double carClaimId;
    @Basic
    @Column(name = "car_claim_num_otp", nullable = true, precision = 0)
    @XmlPath("carClaimNumOtp/@value")
    private Double carClaimNumOtp;
    @Basic
    @Column(name = "car_claim_num_pod", nullable = true, precision = 0)
    @XmlPath("carClaimNumPod/@value")
    private Double carClaimNumPod;
    @Basic
    @Column(name = "car_type_id", nullable = true)
    @XmlPath("carTypeID/@value")
    private Integer carTypeId;
    @Basic
    @Column(name = "car_type_code", nullable = true)
    @XmlPath("carTypeCode/@value")
    private Integer carTypeCode;
    @Basic
    @Column(name = "car_type_name", nullable = true, length = 80)
    @XmlPath("carTypeName/@value")
    private String carTypeName;
    @Basic
    @Column(name = "car_number", nullable = true, length = 20)
    @XmlPath("carNumber/@value")
    private String carNumber;
    @Basic
    @Column(name = "car_order", nullable = true)
    @XmlPath("carOrder/@value")
    private Integer carOrder;
    @Basic
    @Column(name = "car_owner_country_code", nullable = true, length = 3)
    @XmlPath("carOwnerCountryCode/@value")
    private String carOwnerCountryCode;
    @Basic
    @Column(name = "car_owner_country_name", nullable = true, length = 65)
    @XmlPath("carOwnerCountryName/@value")
    private String carOwnerCountryName;
    @Basic
    @Column(name = "car_owner_type_id", nullable = true)
    @XmlPath("carOwnerTypeID/@value")
    private Integer carOwnerTypeId;
    @Basic
    @Column(name = "car_owner_type_name", nullable = true, length = 255)
    @XmlPath("carOwnerTypeName/@value")
    private String carOwnerTypeName;
    @Basic
    @Column(name = "car_owner_id", nullable = true)
    @XmlPath("carOwnerID/@value")
    private Integer carOwnerId;
    @Basic
    @Column(name = "car_owner_okpo", nullable = true, length = 10)
    @XmlPath("carOwnerOKPO/@value")
    private String carOwnerOkpoOkpo;
    @Basic
    @Column(name = "car_owner_name", nullable = true, length = 255)
    @XmlPath("carOwnerName/@value")
    private String carOwnerName;
    @Basic
    @Column(name = "car_tenant_id", nullable = true)
    @XmlPath("carTenantID/@value")
    private Integer carTenantId;
    @Basic
    @Column(name = "car_tenant_okpo", nullable = true, length = 10)
    @XmlPath("carTenantOKPO/@value")
    private String carTenantOkpo;
    @Basic
    @Column(name = "car_tenant_name", nullable = true, length = 255)
    @XmlPath("carTenantName/@value")
    private String carTenantName;
    @Basic
    @Column(name = "car_places_count", nullable = true)
    @XmlPath("carPlacesCount/@value")
    private Integer carPlacesCount;
    @Basic
    @Column(name = "car_tonnage", nullable = true, precision = 0)
    @XmlPath("carTonnage/@value")
    private Double carTonnage;
    @Basic
    @Column(name = "car_axles", nullable = true)
    @XmlPath("carAxles/@value")
    private Integer carAxles;
    @Basic
    @Column(name = "car_volume", nullable = true, precision = 0)
    @XmlPath("carVolume/@value")
    private Double carVolume;
    @Basic
    @Column(name = "car_weight_dep", nullable = true, precision = 0)
    @XmlPath("carWeightDep/@value")
    private Double carWeightDep;
    @Basic
    @Column(name = "car_weight_dep_real", nullable = true, precision = 0)
    @XmlPath("carWeightDepReal/@value")
    private Double carWeightDepReal;
    @Basic
    @Column(name = "car_weight_gross", nullable = true, precision = 0)
    @XmlPath("carWeightGross/@value")
    private Double carWeightGross;
    @Basic
    @Column(name = "car_weight_net", nullable = true, precision = 0)
    @XmlPath("carWeightNet/@value")
    private Double carWeightNet;
    @Basic
    @Column(name = "car_weight_add_dev", nullable = true, precision = 0)
    @XmlPath("carWeightAddDev/@value")
    private Double carWeightAddDev;
    @Basic
    @Column(name = "car_add_dev_with_goods", nullable = true, precision = 0)
    @XmlPath("carAddDevWithGoods/@value")
    private Double carAddDevWithGoods;
    @Basic
    @Column(name = "car_prior_freight_code", nullable = true, length = 6)
    @XmlPath("carPriorFreightCode/@value")
    private String carPriorFreightCode;
    @Basic
    @Column(name = "car_prior_freight_name", nullable = true, length = 150)
    @XmlPath("carPriorFreightName/@value")
    private String carPriorFreightName;
    @Basic
    @Column(name = "car_guide_count", nullable = true)
    @XmlPath("carGuideCount/@value")
    private Integer carGuideCount;
    @Basic
    @Column(name = "car_outsize_code", nullable = true, length = 4)
    @XmlPath("carOutsizeCode/@value")
    private String carOutsizeCode;
    @Basic
    @Column(name = "car_frame_weight", nullable = true)
    @XmlPath("carFrameWeight/@value")
    private Integer carFrameWeight;
    @Basic
    @Column(name = "car_frame_wag_num", nullable = true, length = 20)
    @XmlPath("carFrameWagNum/@value")
    private String carFrameWagNum;
    @Basic
    @Column(name = "car_top_height", nullable = true, precision = 0)
    @XmlPath("carTopHeight/@value")
    private Double carTopHeight;
    @Basic
    @Column(name = "car_main_shtab_quantity", nullable = true, precision = 0)
    @XmlPath("carMainShtabQuantity/@value")
    private Double carMainShtabQuantity;
    @Basic
    @Column(name = "car_main_shtab_height", nullable = true, precision = 0)
    @XmlPath("carMainShtabHeight/@value")
    private Double carMainShtabHeight;
    @Basic
    @Column(name = "car_head_shtab_quantity", nullable = true, precision = 0)
    @XmlPath("carHeadShtabQuantity/@value")
    private Double carHeadShtabQuantity;
    @Basic
    @Column(name = "car_forest_volume", nullable = true, precision = 0)
    @XmlPath("carForestVolume/@value")
    private Double carForestVolume;
    @Basic
    @Column(name = "car_liquid_temperature", nullable = true, precision = 0)
    @XmlPath("carLiquidTemperature/@value")
    private Double carLiquidTemperature;
    @Basic
    @Column(name = "car_liquid_height", nullable = true, precision = 0)
    @XmlPath("carLiquidHeight/@value")
    private Double carLiquidHeight;
    @Basic
    @Column(name = "car_liquid_density", nullable = true, precision = 0)
    @XmlPath("carLiquidDensity/@value")
    private Double carLiquidDensity;
    @Basic
    @Column(name = "car_liquid_volume", nullable = true)
    @XmlPath("carLiquidVolume/@value")
    private Integer carLiquidVolume;
    @Basic
    @Column(name = "car_tank_type", nullable = true, length = 3)
    @XmlPath("carTankType/@value")
    private String carTankType;
    @Basic
    @Column(name = "car_ref_num", nullable = true, length = 6)
    @XmlPath("carRefNum/@value")
    private String carRefNum;
    @Basic
    @Column(name = "car_ref_count", nullable = true)
    @XmlPath("carRefCount/@value")
    private Integer carRefCount;
    @Basic
    @Column(name = "car_rolls", nullable = true)
    @XmlPath("carRolls/@value")
    private Integer carRolls;
    @Basic
    @Column(name = "car_connect_code", nullable = true)
    @XmlPath("carConnectCode/@value")
    private Integer carConnectCode;
    @Basic
    @Column(name = "caris_cover", nullable = true)
    @XmlPath("carIsCover/@value")
    private Integer carIsCover;
    @Basic
    @Column(name = "car_sign", nullable = true, length = 4000)
    @XmlPath("carSign/@value")
    private String carSign;
    @Basic
    @Column(name = "car_length", nullable = true, precision = 0)
    @XmlPath("carLength/@value")
    private Double carLength;
    @Basic
    @Column(name = "car_dep_norm_doc_id", nullable = true)
    @XmlPath("carDepNormDocID/@value")
    private Integer carDepNormDocId;
    @Basic
    @Column(name = "car_dep_norm_doc_name", nullable = true, length = 255)
    @XmlPath("carDepNormDocName/@value")
    private String carDepNormDocName;
    @Basic
    @Column(name = "car_dep_part", nullable = true, length = 8)
    @XmlPath("carDepPart/@value")
    private String carDepPart;
    @Basic
    @Column(name = "car_dep_arc", nullable = true, length = 8)
    @XmlPath("carDepArc/@value")
    private String carDepArc;
    @Basic
    @Column(name = "car_dep_sec", nullable = true, length = 8)
    @XmlPath("carDepSec/@value")
    private String carDepSec;
    @Basic
    @Column(name = "car_dep_cond", nullable = true, length = 1500)
    @XmlPath("carDepCond/@value")
    private String carDepCond;
    @Basic
    @Column(name = "car_ntu_mtu_number", nullable = true, length = 255)
    @XmlPath("carNTU_MTUNumber/@value")
    private String carNtuMtuNumber;
    @Basic
    @Column(name = "car_ntu_mtu_date", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("carNTU_MTUDate/@value")
    private Date carNtuMtuDate;
    @Basic
    @Column(name = "car_ntu_clearance", nullable = true, length = 255)
    @XmlPath("carNTUClearance/@value")
    private String carNtuClearance;
    @Basic
    @Column(name = "car_mtu_scheme", nullable = true, length = 255)
    @XmlPath("carMTUScheme/@value")
    private String carMtuScheme;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;

    @OneToMany(mappedBy = "invCar", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "autoGuide")
    @ModelClass(EtrAutoGuideEntity.class)
    private Collection<EtrAutoGuideEntity> autoGuides = new ArrayList<>();
    @OneToMany(mappedBy = "invCar", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "carFastener")
    @ModelClass(EtrCarFastenerEntity.class)
    private Collection<EtrCarFastenerEntity> carFasteners = new ArrayList<>();
    @OneToMany(mappedBy = "invCar", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "carGuide")
    @ModelClass(EtrCarGuideEntity.class)
    private Collection<EtrCarGuideEntity> carGuides = new ArrayList<>();
    @OneToMany(mappedBy = "invCar", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "carSPC")
    @ModelClass(EtrCarSpcEntity.class)
    private Collection<EtrCarSpcEntity> carSpcs = new ArrayList<>();
    @OneToMany(mappedBy = "invCar", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "contCSL")
    @ModelClass(EtrContCslEntity.class)
    private Collection<EtrContCslEntity> contCsls = new ArrayList<>();
    @OneToMany(mappedBy = "invCar", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "fastenerProperty")
    @ModelClass(EtrFastenerPropertyCarEntity.class)
    private Collection<EtrFastenerPropertyCarEntity> fastenerPropertyCar = new ArrayList<>();

}