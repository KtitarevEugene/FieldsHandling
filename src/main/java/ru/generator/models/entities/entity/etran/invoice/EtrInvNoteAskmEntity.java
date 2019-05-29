package ru.generator.models.entities.entity.etran.invoice;

import ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter.XMLDateTimeAdapterEtran;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by solop on 20.11.2017.
 */
@Data
@Entity
@Table(name = "inv_note_askm", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvNoteAskmEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "note_ntu_mtu_number", nullable = true, length = 255)
    @XmlPath("noteNTU_MTUNumber/@value")
    private String noteNtuMtuNumber;
    @Basic
    @Column(name = "note_ntu_mtu_date", nullable = true)
    @XmlJavaTypeAdapter(XMLDateTimeAdapterEtran.class)
    @XmlPath("noteNTU_MTUDate/@value")
    private Date noteNtuMtuDate;
    @Basic
    @Column(name = "note_ntu_clearance", nullable = true, length = 255)
    @XmlPath("noteNTUClearance/@value")
    private String noteNtuClearance;
    @Basic
    @Column(name = "note_mtu_scheme", nullable = true, length = 255)
    @XmlPath("noteMTUScheme/@value")
    private String noteMtuScheme;
    @OneToMany(mappedBy = "invNoteAskm", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "fastenerProperty")
    private Collection<EtrFastenerPropertyNoteEntity> fastenerPropertyNote = new ArrayList<>();
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
    @OneToMany(mappedBy = "invNoteAskm", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "noteFastener")
    @ModelClass(EtrNoteFastenerEntity.class)
    private Collection<EtrNoteFastenerEntity> noteFastener = new ArrayList<>();
}