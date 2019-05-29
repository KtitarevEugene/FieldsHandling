package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import org.mapstruct.Mapper;
import ru.generator.service.annotations.IgnoreField;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by solop on 20.11.2017.
 */
@Mapper
@Data
@Entity
@Table(name = "inv_freight", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvFreightEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "freight_code", nullable = true, length = 6)
    @XmlPath("freightCode/@value")
    private String freightCode;
    @Basic
    @Column(name = "freight_name", nullable = true, length = 150)
    @XmlPath("freightName/@value")
    private String freightName;
    @Basic
    @Column(name = "freight_exact_name", nullable = true, length = 255)
    @XmlPath("freightExactName/@value")
    private String freightExactName;
    @Basic
    @Column(name = "freight_gng_id", nullable = true)
    @XmlPath("freightGNGID/@value")
    private Integer freightGngId;
    @Basic
    @Column(name = "freight_gng_code", nullable = true, length = 12)
    @XmlPath("freightGNGCode/@value")
    private String freightGngCode;
    @Basic
    @Column(name = "freight_gng_name", nullable = true, length = 1000)
    @XmlPath("freightGNGName/@value")
    private String freightGngName;
    @Basic
    @Column(name = "freight_additional", nullable = true, length = 255)
    @XmlPath("freightAdditional/@value")
    private String freightAdditional;
    @Basic
    @Column(name = "freight_pack_type_id", nullable = true)
    @XmlPath("freightPackTypeID/@value")
    private Integer freightPackTypeId;
    @Basic
    @Column(name = "freight_pack_type_name", nullable = true, length = 80)
    @XmlPath("freightPackTypeName/@value")
    private String freightPackTypeName;
    @Basic
    @Column(name = "freight_pocket_count", nullable = true)
    @XmlPath("freightPocketCount/@value")
    private Integer freightPocketCount;
    @Basic
    @Column(name = "freight_package_count", nullable = true)
    @XmlPath("freightPackageCount/@value")
    private Integer freightPackageCount;
    @Basic
    @Column(name = "freight_weight", nullable = true)
    @XmlPath("freightWeight/@value")
    private Integer freightWeight;
    @Basic
    @Column(name = "freight_real_weight", nullable = true)
    @XmlPath("freightRealWeight/@value")
    private Integer freightRealWeight;
    @Basic
    @Column(name = "freight_weight_std_gross", nullable = true, precision = 0)
    @XmlPath("freightWeightStdGross/@value")
    private Double freightWeightStdGross;
    @Basic
    @Column(name = "freight_weight_std_net", nullable = true, precision = 0)
    @XmlPath("freightWeightStdNet/@value")
    private Double freightWeightStdNet;
    @Basic
    @Column(name = "freight_max_length", nullable = true)
    @XmlPath("freightMaxLength/@value")
    private Integer freightMaxLength;
    @Basic
    @Column(name = "freight_max_width", nullable = true)
    @XmlPath("freightMaxWidth/@value")
    private Integer freightMaxWidth;
    @Basic
    @Column(name = "freight_max_height", nullable = true)
    @XmlPath("freightMaxHeight/@value")
    private Integer freightMaxHeight;
    @Basic
    @Column(name = "freight_senders_mark", nullable = true, length = 200)
    @XmlPath("freightSendersMark/@value")
    private String freightSendersMark;
    @Basic
    @Column(name = "freight_danger_sign_id", nullable = true)
    @XmlPath("freightDangerSignID/@value")
    private Integer freightDangerSignId;
    @Basic
    @Column(name = "freight_danger_sign_name", nullable = true, length = 255)
    @XmlPath("freightDangerSignName/@value")
    private String freightDangerSignName;
    @Basic
    @Column(name = "freight_danger_id", nullable = true)
    @XmlPath("freightDangerID/@value")
    private Integer freightDangerId;
    @Basic
    @Column(name = "freight_danger_name", nullable = true, length = 4000)
    @XmlPath("freightDangerName/@value")
    private String freightDangerName;
    @Basic
    @Column(name = "freight_accident_card_id", nullable = true)
    @XmlPath("freightAccidentCardID/@value")
    private Integer freightAccidentCardId;
    @Basic
    @Column(name = "freight_accident_card", nullable = true)
    @XmlPath("freightAccidentCard/@value")
    private Integer freightAccidentCardNumber;
    @Basic
    @Column(name = "freight_gtd_number", nullable = true, length = 23)
    @XmlPath("freightGTDNumber/@value")
    private String freightGtdNumber;
    @Basic
    @Column(name = "freight_gtd_position", nullable = true, precision = 0)
    @XmlPath("freightGTDPosition/@value")
    private Double freightGtdPosition;
    @Basic
    @Column(name = "freight_bundling", nullable = true)
    @XmlPath("freightBundling/@value")
    private Integer freightBundlingId;
    @OneToMany(mappedBy = "invFreight", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "freightCLS")
    private Collection<EtrFreightClsEntity> freightCls = new ArrayList<>();
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}