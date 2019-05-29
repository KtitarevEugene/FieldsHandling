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
@Table(name = "freight_cls", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice"),
                @Index(columnList = "id_inv_freight")
        })
public class EtrFreightClsEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "cls_transp_clause_id", nullable = true)
    @XmlPath("clsTranspClauseID/@value")
    private Integer clsTranspClauseId;
    @Basic
    @Column(name = "cls_transp_clause_name", nullable = true, length = 4000)
    @XmlPath("clsTranspClauseName/@value")
    private String clsTranspClauseName;
    @Basic
    @Column(name = "cls_custom_text", nullable = true, length = 255)
    @XmlPath("clsCustomText/@value")
    private String clsCustomText;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
    @ManyToOne
    @JoinColumn(name = "id_inv_freight", referencedColumnName = "id", nullable = false)
    @IgnoreField
    private EtrInvFreightEntity invFreight;
}