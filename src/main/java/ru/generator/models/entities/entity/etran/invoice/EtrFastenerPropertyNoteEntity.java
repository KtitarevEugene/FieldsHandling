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
@Table(name = "fastener_property_note", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice"),
                @Index(columnList = "id_note_fastener"),
                @Index(columnList = "id_inv_note_askm")
        })
public class EtrFastenerPropertyNoteEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "prop_id", nullable = true)
    @XmlPath("propID/@value")
    private Integer propId;
    @Basic
    @Column(name = "prop_name", nullable = true, length = 4000)
    @XmlPath("propName/@value")
    private String propName;
    @Basic
    @Column(name = "prop_value", nullable = true, length = 4000)
    @XmlPath("propValue/@value")
    private String propValue;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
    @ManyToOne
    @JoinColumn(name = "id_note_fastener", referencedColumnName = "id", nullable = false)
    @IgnoreField
    private EtrNoteFastenerEntity noteFastener;
    @ManyToOne
    @JoinColumn(name = "id_inv_note_askm", referencedColumnName = "id", nullable = false)
    @IgnoreField
    private EtrInvNoteAskmEntity invNoteAskm;
}