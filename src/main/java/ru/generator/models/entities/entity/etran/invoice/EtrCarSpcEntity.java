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
@Table(name = "car_spc", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice"),
                @Index(columnList = "id_inv_car")
        })
public class EtrCarSpcEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "spc_transp_clause_id", nullable = true)
    @XmlPath("spcTranspClauseID/@value")
    private Integer spcTranspClauseId;
    @Basic
    @Column(name = "spc_transp_clause_name", nullable = true, length = 4000)
    @XmlPath("spcTranspClauseName/@value")
    private String spcTranspClauseName;
    @Basic
    @Column(name = "spc_type_name", nullable = true, length = 255)
    @XmlPath("spcTypeName/@value")
    private String spcTypeName;
    @Basic
    @Column(name = "spc_custom_text", nullable = true, length = 255)
    @XmlPath("spcCustomText/@value")
    private String spcCustomText;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
    @ManyToOne
    @JoinColumn(name = "id_inv_car", referencedColumnName = "id", nullable = false)
    @IgnoreField
    private EtrInvCarEntity invCar;
}