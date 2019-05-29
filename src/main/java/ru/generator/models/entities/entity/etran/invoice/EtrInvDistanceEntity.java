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
@Table(name = "inv_distance", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvDistanceEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "dist_country_code", nullable = true, length = 3)
    @XmlPath("distCountryCode/@value")
    private String distCountryCode;
    @Basic
    @Column(name = "dist_country_name", nullable = true, length = 65)
    @XmlPath("distCountryName/@value")
    private String distCountryName;
    @Basic
    @Column(name = "dist_station_country_id", nullable = true, length = 4)
    @XmlPath("distStationCountryId/@value")
    private String distStationCountryId;
    @Basic
    @Column(name = "dist_station_code", nullable = true, length = 6)
    @XmlPath("distStationCode/@value")
    private String distStationCode;
    @Basic
    @Column(name = "dist_station_name", nullable = true, length = 80)
    @XmlPath("distStationName/@value")
    private String distStationName;
    @Basic
    @Column(name = "dist_port_code", nullable = true)
    @XmlPath("distPortCode/@value")
    private Integer distPortCode;
    @Basic
    @Column(name = "dist_port_name", nullable = true, length = 250)
    @XmlPath("distPortName/@value")
    private String distPortName;
    @Basic
    @Column(name = "dist_load_way", nullable = true, length = 80)
    @XmlPath("distLoadWay/@value")
    private String distLoadWay;
    @Basic
    @Column(name = "dist_track_type_id", nullable = true)
    @XmlPath("distTrackTypeID/@value")
    private Integer distTrackTypeId;
    @Basic
    @Column(name = "dist_track_type_name", nullable = true, length = 255)
    @XmlPath("distTrackTypeName/@value")
    private String distTrackTypeName;
    @Basic
    @Column(name = "dist_transp_type_id", nullable = true)
    @XmlPath("distTranspTypeID/@value")
    private Integer distTranspTypeId;
    @Basic
    @Column(name = "dist_transp_type_name", nullable = true, length = 255)
    @XmlPath("distTranspTypeName/@value")
    private String distTranspTypeName;
    @Basic
    @Column(name = "dist_min_way", nullable = true)
    @XmlPath("distMinWay/@value")
    private Integer distMinWay;
    @Basic
    @Column(name = "dist_recip_id", nullable = true)
    @XmlPath("distRecipID/@value")
    private Integer distRecipId;
    @Basic
    @Column(name = "dist_recip_okpo", nullable = true, length = 10)
    @XmlPath("distRecipOKPO/@value")
    private String distRecipOkpo;
    @Basic
    @Column(name = "dist_recip_name", nullable = true, length = 255)
    @XmlPath("distRecipName/@value")
    private String distRecipName;
    @Basic
    @Column(name = "dist_recip_address_id", nullable = true)
    @XmlPath("distRecipAddressID/@value")
    private Integer distRecipAddressId;
    @Basic
    @Column(name = "dist_recip_address", nullable = true, length = 255)
    @XmlPath("distRecipAddress/@value")
    private String distRecipAddress;
    @Basic
    @Column(name = "dist_recip_tgnl", nullable = true, length = 4)
    @XmlPath("distRecipTGNL/@value")
    private String distRecipTgnl;
    @Basic
    @Column(name = "dist_payerid", nullable = true)
    @XmlPath("distPayerID/@value")
    private Integer distPayerId;
    @Basic
    @Column(name = "dist_payer_code", nullable = true, length = 10)
    @XmlPath("distPayerCode/@value")
    private String distPayerCode;
    @Basic
    @Column(name = "dist_payer_name", nullable = true, length = 250)
    @XmlPath("distPayerName/@value")
    private String distPayerName;
    @Basic
    @Column(name = "dist_pay_place_rwid", nullable = true)
    @XmlPath("distPayPlaceRWID/@value")
    private Integer distPayPlaceRwid;
    @Basic
    @Column(name = "dist_frw_sub_code", nullable = true, length = 12)
    @XmlPath("distFrwSubCode/@value")
    private String distFrwSubCode;
    @Basic
    @Column(name = "dist_sign", nullable = true, length = 255)
    @XmlPath("distSign/@value")
    private String distSign;
    @Basic
    @Column(name = "dist_carrier_id", nullable = true, precision = 0)
    @XmlPath("distCarrierID/@value")
    private Double distCarrierId;
    @Basic
    @Column(name = "dist_power_kind", nullable = true)
    @XmlPath("distPowerKind/@value")
    private Integer distPowerKind;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}