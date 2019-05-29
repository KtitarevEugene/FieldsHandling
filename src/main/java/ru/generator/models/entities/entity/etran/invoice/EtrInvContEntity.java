package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import org.mapstruct.Mapper;
import ru.generator.service.annotations.IgnoreField;

import javax.persistence.*;

/**
 * Created by solop on 20.11.2017.
 */
@Mapper
@Data
@Entity
@Table(name = "inv_cont", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvContEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "cont_claim_num_otp", nullable = true, precision = 0)
    @XmlPath("contClaimNumOtp/@value")
    private Double contClaimNumOtp;
    @Basic
    @Column(name = "cont_claim_num_pod", nullable = true, precision = 0)
    @XmlPath("contClaimNumPod/@value")
    private Double contClaimNumPod;
    @Basic
    @Column(name = "cont_number", nullable = true, length = 11)
    @XmlPath("contNumber/@value")
    private String contNumber;
    @Basic
    @Column(name = "cont_tonnage_id", nullable = true)
    @XmlPath("contTonnageID/@value")
    private Integer contTonnageId;
    @Basic
    @Column(name = "cont_tonnage", nullable = true)
    @XmlPath("contTonnage/@value")
    private Integer contTonnage;
    @Basic
    @Column(name = "cont_car_order", nullable = true)
    @XmlPath("contCarOrder/@value")
    private Integer contCarOrder;
    @Basic
    @Column(name = "cont_type_big", nullable = true)
    @XmlPath("contTypeBig/@value")
    private Integer contTypeBig;
    @Basic
    @Column(name = "cont_type_big_name", nullable = true, length = 255)
    @XmlPath("contTypeBigName/@value")
    private String contTypeBigName;
    @Basic
    @Column(name = "cont_size_big", nullable = true)
    @XmlPath("contSizeBig/@value")
    private Integer contSizeBigId;
    @Basic
    @Column(name = "cont_width_foot", nullable = true, precision = 0)
    @XmlPath("contWidthFoot/@value")
    private Double contWidthFoot;
    @Basic
    @Column(name = "cont_weight_dep", nullable = true, precision = 0)
    @XmlPath("contWeightDep/@value")
    private Double contWeightDep;
    @Basic
    @Column(name = "cont_places_count", nullable = true)
    @XmlPath("contPlacesCount/@value")
    private Integer contPlacesCount;
    @Basic
    @Column(name = "cont_weight_gross", nullable = true, precision = 0)
    @XmlPath("contWeightGross/@value")
    private Double contWeightGross;
    @Basic
    @Column(name = "cont_weight_net", nullable = true, precision = 0)
    @XmlPath("contWeightNet/@value")
    private Double contWeightNet;
    @Basic
    @Column(name = "cont_volume", nullable = true)
    @XmlPath("contVolume/@value")
    private Integer contVolume;
    @Basic
    @Column(name = "cont_owner_country_code", nullable = true, length = 3)
    @XmlPath("contOwnerCountryCode/@value")
    private String contOwnerCountryCode;
    @Basic
    @Column(name = "cont_owner_vountry_name", nullable = true, length = 65)
    @XmlPath("contOwnerVountryName/@value")
    private String contOwnerVountryName;
    @Basic
    @Column(name = "cont_owner_type_id", nullable = true, length = 3)
    @XmlPath("contOwnerTypeID/@value")
    private String contOwnerTypeId;
    @Basic
    @Column(name = "cont_owner_type_name", nullable = true, length = 255)
    @XmlPath("contOwnerTypeName/@value")
    private String contOwnerTypeName;
    @Basic
    @Column(name = "cont_owner_id", nullable = true, precision = 0)
    @XmlPath("contOwnerId/@value")
    private Double contOwnerId;
    @Basic
    @Column(name = "cont_owner_okpo", nullable = true, length = 10)
    @XmlPath("contOwnerOKPO/@value")
    private String contOwnerOkpo;
    @Basic
    @Column(name = "cont_owner_name", nullable = true, length = 255)
    @XmlPath("contOwnerName/@value")
    private String contOwnerName;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}