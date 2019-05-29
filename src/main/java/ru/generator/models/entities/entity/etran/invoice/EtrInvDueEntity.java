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
@Table(name = "inv_due", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvDueEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "due_type_id", nullable = true)
    @XmlPath("dueTypeID/@value")
    private Integer dueTypeId;
    @Basic
    @Column(name = "due_type", nullable = true, length = 255)
    @XmlPath("dueType/@value")
    private String dueTypeName;
    @Basic
    @Column(name = "car_number", nullable = true, length = 20)
    @XmlPath("carNumber/@value")
    private String carNumber;
    @Basic
    @Column(name = "cont_number", nullable = true, length = 12)
    @XmlPath("contNumber/@value")
    private String contNumber;
    @Basic
    @Column(name = "due_distance_name", nullable = true, length = 80)
    @XmlPath("dueDistanceName/@value")
    private String dueDistanceName;
    @Basic
    @Column(name = "due_calc_distance_name", nullable = true, length = 180)
    @XmlPath("dueCalcDistanceName/@value")
    private String dueCalcDistanceName;
    @Basic
    @Column(name = "due_calc_dist_st_code", nullable = true, length = 6)
    @XmlPath("dueCalcDistStCode/@value")
    private String dueCalcDistStCode;
    @Basic
    @Column(name = "due_calc_dist_st_name", nullable = true, length = 80)
    @XmlPath("dueCalcDistStName/@value")
    private String dueCalcDistStName;
    @Basic
    @Column(name = "dist_min_way", nullable = true, precision = 0)
    @XmlPath("distMinWay/@value")
    private Double distMinWay;
    @Basic
    @Column(name = "due_weight_calc", nullable = true, precision = 0)
    @XmlPath("dueWeightCalc/@value")
    private Double dueWeightCalc;
    @Basic
    @Column(name = "due_amount", nullable = true, precision = 0)
    @XmlPath("dueAmount/@value")
    private Double dueAmount;
    @Basic
    @Column(name = "due_amount_kz", nullable = true, precision = 0)
    @XmlPath("dueAmountKz/@value")
    private Double dueAmountKz;
    @Basic
    @Column(name = "due_currency_id", nullable = true)
    @XmlPath("dueCurrencyID/@value")
    private Integer dueCurrencyId;
    @Basic
    @Column(name = "due_currency", nullable = true, length = 132)
    @XmlPath("dueCurrency/@value")
    private String dueCurrencyName;
    @Basic
    @Column(name = "due_scheme", nullable = true, precision = 0)
    @XmlPath("dueScheme/@value")
    private Double dueScheme;
    @Basic
    @Column(name = "due_tarif_rate", nullable = true, precision = 0)
    @XmlPath("dueTarifRate/@value")
    private Double dueTarifRate;
    @Basic
    @Column(name = "due_suminfr", nullable = true, precision = 0)
    @XmlPath("dueSumInfr/@value")
    private Double dueSumInfr;
    @Basic
    @Column(name = "due_scheme_num_wag", nullable = true, precision = 0)
    @XmlPath("dueSchemeNumWag/@value")
    private Double dueSchemeNumWag;
    @Basic
    @Column(name = "due_tarif_rate_wag", nullable = true, precision = 0)
    @XmlPath("dueTarifRateWag/@value")
    private Double dueTarifRateWag;
    @Basic
    @Column(name = "due_sum_wag", nullable = true, precision = 0)
    @XmlPath("dueSumWag/@value")
    private Double dueSumWag;
    @Basic
    @Column(name = "due_tarif_coef", nullable = true, precision = 0)
    @XmlPath("dueTarifCoef/@value")
    private Double dueTarifCoef;
    @Basic
    @Column(name = "due_tax_sum", nullable = true, precision = 0)
    @XmlPath("dueTaxSum/@value")
    private Double dueTaxSum;
    @Basic
    @Column(name = "due_tax_able", nullable = true)
    @XmlPath("dueTaxAble/@value")
    private Integer dueTaxAble;
    @Basic
    @Column(name = "due_tax_val", nullable = true, precision = 0)
    @XmlPath("dueTaxVal/@value")
    private Double dueTaxVal;
    @Basic
    @Column(name = "due_tax_sum_kz", nullable = true, precision = 0)
    @XmlPath("dueTaxSumKz/@value")
    private Double dueTaxSumKz;
    @Basic
    @Column(name = "due_tax_able_kz", nullable = true)
    @XmlPath("dueTaxAbleKz/@value")
    private Integer dueTaxAbleKz;
    @Basic
    @Column(name = "due_tax_val_kz", nullable = true, precision = 0)
    @XmlPath("dueTaxValKz/@value")
    private Double dueTaxValKz;
    @Basic
    @Column(name = "due_freight_tarif_class", nullable = true, length = 20)
    @XmlPath("dueFreightTarifClass/@value")
    private String dueFreightTarifClass;
    @Basic
    @Column(name = "due_tarif_discount", nullable = true, precision = 0)
    @XmlPath("dueTarifDiscount/@value")
    private Double dueTarifDiscount;
    @Basic
    @Column(name = "due_tarif_percent", nullable = true, precision = 0)
    @XmlPath("dueTarifPercent/@value")
    private Double dueTarifPercent;
    @Basic
    @Column(name = "due_tarif_code", nullable = true, precision = 0)
    @XmlPath("dueTarifCode/@value")
    private Double dueTarifCode;
    @Basic
    @Column(name = "due_currency_rate", nullable = true, precision = 0)
    @XmlPath("dueCurrencyRate/@value")
    private Double dueCurrencyRate;
    @Basic
    @Column(name = "dueis_rzd_due", nullable = true, precision = 0)
    @XmlPath("dueIsRZDDue/@value")
    private Double dueIsRzdDue;
    @Basic
    @Column(name = "due_tarif_discount_gdy_value", nullable = true, precision = 0)
    @XmlPath("dueTarifDiscountGDYvalue/@value")
    private Double dueTarifDiscountGdyValue;
    @Basic
    @Column(name = "due_tarif_percent_gdy_value", nullable = true, precision = 0)
    @XmlPath("dueTarifPercentGDYvalue/@value")
    private Double dueTarifPercentGdyValue;
    @Basic
    @Column(name = "due_tarif_code_gdy_value", nullable = true, precision = 0)
    @XmlPath("dueTarifCodeGDYvalue/@value")
    private Double dueTarifCodeGdyValue;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}