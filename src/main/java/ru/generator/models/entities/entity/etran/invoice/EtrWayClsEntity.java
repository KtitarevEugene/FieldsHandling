package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.service.annotations.IgnoreField;

import javax.persistence.*;

/**
 * Created by solop on 20.11.2017.
 */
@Data
@Entity
@Table(name = "way_cls", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrWayClsEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "way_transp_clause_id", nullable = true)
    @XmlPath("wayTranspClauseID/@value")
    private Integer wayTranspClauseId;
    @Basic
    @Column(name = "way_transp_clause_name", nullable = true, length = 4000)
    @XmlPath("wayTranspClauseName/@value")
    private String wayTranspClauseName;
    @Basic
    @Column(name = "way_custom_text", nullable = true, length = 255)
    @XmlPath("wayCustomText/@value")
    private String wayCustomText;
    @Basic
    @Column(name = "way_wag_number", nullable = true, precision = 0)
    @XmlPath("wayWagNumber/@value")
    private Double wayWagNumber;
    @Basic
    @Column(name = "way_rw_panish", nullable = true, length = 1)
    @XmlPath("wayRwPanish/@value")
    private String wayRwPanish;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}