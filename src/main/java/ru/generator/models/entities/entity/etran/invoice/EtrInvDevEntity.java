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
@Table(name = "inv_dev", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvDevEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "dev_type_id", nullable = true)
    @XmlPath("devTypeID/@value")
    private Integer devTypeId;
    @Basic
    @Column(name = "dev_type_name", nullable = true, length = 80)
    @XmlPath("devTypeName/@value")
    private String devTypeName;
    @Basic
    @Column(name = "dev_number", nullable = true, length = 18)
    @XmlPath("devNumber/@value")
    private String devNumber;
    @Basic
    @Column(name = "dev_owner_country_code", nullable = true, length = 3)
    @XmlPath("devOwnerCountryCode/@value")
    private String devOwnerCountryCode;
    @Basic
    @Column(name = "dev_owner_country_name", nullable = true, length = 65)
    @XmlPath("devOwnerCountryName/@value")
    private String devOwnerCountryName;
    @Basic
    @Column(name = "dev_owner_type_id", nullable = true, length = 3)
    @XmlPath("devOwnerTypeID/@value")
    private String devOwnerTypeId;
    @Basic
    @Column(name = "dev_owner_type_name", nullable = true, length = 255)
    @XmlPath("devOwnerTypeName/@value")
    private String devOwnerTypeName;
    @Basic
    @Column(name = "dev_owner_okpo", nullable = true, length = 10)
    @XmlPath("devOwnerOKPO/@value")
    private String devOwnerOkpo;
    @Basic
    @Column(name = "dev_owner_name", nullable = true, length = 80)
    @XmlPath("devOwnerName/@value")
    private String devOwnerName;
    @Basic
    @Column(name = "dev_quantity", nullable = true)
    @XmlPath("devQuantity/@value")
    private Integer devQuantity;
    @Basic
    @Column(name = "dev_return", nullable = true)
    @XmlPath("devReturn/@value")
    private Integer devReturn;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}