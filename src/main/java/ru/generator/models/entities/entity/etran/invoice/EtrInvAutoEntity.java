package ru.generator.models.entities.entity.etran.invoice;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by solop on 20.11.2017.
 */
@Data
@Entity
@Table(name = "inv_auto", schema = "etran_inv",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class EtrInvAutoEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @XmlPath("ID/@value")
    private String id;
    @Basic
    @Column(name = "auto_vin", nullable = true, length = 50)
    @XmlPath("autoVIN/@value")
    private String autoVin;
    @Basic
    @Column(name = "auto_length", nullable = true)
    @XmlPath("autoLength/@value")
    private Integer autoLength;
    @Basic
    @Column(name = "auto_weight_dep", nullable = true)
    @XmlPath("autoWeightDep/@value")
    private Integer autoWeightDep;
    @Basic
    @Column(name = "auto_weight", nullable = true)
    @XmlPath("autoWeight/@value")
    private Integer autoWeight;
    @Basic
    @Column(name = "auto_places_quantity", nullable = true)
    @XmlPath("autoPlacesQuantity/@value")
    private Integer autoPlacesQuantity;
    @Basic
    @Column(name = "auto_ite_type_id", nullable = true)
    @XmlPath("autoIteTypeID/@value")
    private Integer autoIteTypeId;
    @Basic
    @Column(name = "auto_car_order", nullable = true)
    @XmlPath("autoCarOrder/@value")
    private Integer autoCarOrder;
    @OneToMany(mappedBy = "invAuto", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "autoCSL")
    @ModelClass(EtrAutoCslEntity.class)
    private Collection<EtrAutoCslEntity> autoCsls = new ArrayList<>();
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_id", nullable = false),
            @JoinColumn(name = "inv_last_oper", referencedColumnName = "inv_last_oper", nullable = false)})
    @IgnoreField
    private EtrInvoiceEntity invoice;
}