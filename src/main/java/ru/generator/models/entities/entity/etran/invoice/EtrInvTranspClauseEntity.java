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
@Table(name = "inv_transp_clause", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvTranspClauseEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "transp_clause_id", nullable = true)
    @XmlPath("transpClauseID/@value")
    private Integer transpClauseId;
    @Basic
    @Column(name = "transp_clause_name", nullable = true, length = 4000)
    @XmlPath("transpClauseName/@value")
    private String transpClauseName;
    @Basic
    @Column(name = "transp_clause_tarif_mark", nullable = true, length = 20)
    @XmlPath("transpClauseTarifMark/@value")
    private String transpClauseTarifMark;
    @Basic
    @Column(name = "transp_clause_custom_text", nullable = true, length = 255)
    @XmlPath("transpClauseCustomText/@value")
    private String transpClauseCustomText;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}