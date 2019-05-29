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
@Table(name = "inv_spc", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvSpcEntity {
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
    @Column(name = "spc_transp_clause_desc", nullable = true, length = 4000)
    @XmlPath("spcTranspClauseDesc/@value")
    private String spcTranspClauseDesc;
    @Basic
    @Column(name = "spc_custom_text", nullable = true, length = 510)
    @XmlPath("spcCustomText/@value")
    private String spcCustomText;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}