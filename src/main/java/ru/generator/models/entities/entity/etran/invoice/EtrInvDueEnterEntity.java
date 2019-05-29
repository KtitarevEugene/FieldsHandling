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
@Table(name = "inv_due_enter", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvDueEnterEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "due_amount", nullable = true, precision = 0)
    @XmlPath("dueAmount/@value")
    private Double dueAmount;
    @Basic
    @Column(name = "due_amount_val", nullable = true, precision = 0)
    @XmlPath("dueAmountVal/@value")
    private Double dueAmountVal;
    @Basic
    @Column(name = "due_currency", nullable = true)
    @XmlPath("dueCurrency/@value")
    private Integer dueCurrencyId;
    @Basic
    @Column(name = "due_currency_name", nullable = true, length = 132)
    @XmlPath("dueCurrencyName/@value")
    private String dueCurrencyName;
    @Basic
    @Column(name = "due_due_type", nullable = true, precision = 0)
    @XmlPath("dueDueType/@value")
    private Double dueDueType;
    @Basic
    @Column(name = "due_due_type_name", nullable = true, length = 255)
    @XmlPath("dueDueTypeName/@value")
    private String dueDueTypeName;
    @Basic
    @Column(name = "car_number", nullable = true, length = 20)
    @XmlPath("carNumber/@value")
    private String carNumber;
    @Basic
    @Column(name = "due_rate", nullable = true, precision = 0)
    @XmlPath("dueRate/@value")
    private Double dueRate;
    @Basic
    @Column(name = "due_tax_sum", nullable = true, precision = 0)
    @XmlPath("dueTaxSum/@value")
    private Double dueTaxSum;
    @Basic
    @Column(name = "due_tax_val", nullable = true, precision = 0)
    @XmlPath("dueTaxVal/@value")
    private Double dueTaxVal;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}