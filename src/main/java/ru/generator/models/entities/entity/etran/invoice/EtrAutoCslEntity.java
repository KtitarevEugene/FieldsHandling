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
@Table(name = "auto_csl", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice"),
                @Index(columnList = "id_inv_avto")
        })
public class EtrAutoCslEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "seal_type_id", nullable = true)
    @XmlPath("sealTypeID/@value")
    private Integer sealTypeId;
    @Basic
    @Column(name = "seal_type_name", nullable = true, length = 80)
    @XmlPath("sealTypeName/@value")
    private String sealTypeName;
    @Basic
    @Column(name = "seal_marks", nullable = true, length = 20)
    @XmlPath("sealMarks/@value")
    private String sealMarks;
    @Basic
    @Column(name = "seal_quantity", nullable = true)
    @XmlPath("sealQuantity/@value")
    private Integer sealQuantity;
    @Basic
    @Column(name = "seal_year", nullable = true)
    @XmlPath("sealYear/@value")
    private Integer sealYear;
    @Basic
    @Column(name = "seal_owner_type_id", nullable = true)
    @XmlPath("sealOwnerTypeID/@value")
    private Integer sealOwnerTypeId;
    @Basic
    @Column(name = "seal_owner_type_name", nullable = true, length = 255)
    @XmlPath("sealOwnerTypeName/@value")
    private String sealOwnerTypeName;
    @Basic
    @Column(name = "seal_railway_id", nullable = true)
    @XmlPath("sealRailwayID/@value")
    private Integer sealRailwayId;
    @Basic
    @Column(name = "seal_railway_code", nullable = true, length = 4)
    @XmlPath("sealRailwayCode/@value")
    private String sealRailwayCode;
    @Basic
    @Column(name = "seal_railway_name", nullable = true, length = 30)
    @XmlPath("sealRailwayName/@value")
    private String sealRailwayName;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
    @ManyToOne
    @JoinColumn(name = "id_inv_avto", referencedColumnName = "id", nullable = false)
    @IgnoreField
    private EtrInvAutoEntity invAuto;
}