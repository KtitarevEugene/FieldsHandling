package ru.generator.models.entities.entity.ktlo.invoice;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.models.entities.annotation.Nsi;
import ru.generator.models.entities.entity.share.nsi.etran.app.STInvTranspClauseEntity;
import ru.generator.service.annotations.Description;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;

/**
 * Created by solop on 20.11.2017.
 */
@ApiModel(discriminator = "НАКЛАДНАЯ: Тарифные отметки")
@Data
@Entity
@Table(name = "inv_clause", schema = "invoice",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class InvTarifMarkEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    private String id;

//    @Basic
//    @Column(name = "tarif_mark_code", nullable = true, length = 20)
//    @Description(value = "Код тарифной отметки")
//    private String tarifMarkCode;

    @Nsi(nsiClassEntity = STInvTranspClauseEntity.class)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tarif_mark_id", referencedColumnName = "TRANSPCLAUSE_ID")
    @Description(value = "Тарифная отметка")
    @ModelClass(STInvTranspClauseEntity.class)
    private STInvTranspClauseEntity tarifMark;

    @Basic
    @Column(name = "tarif_mark_text", nullable = true, length = 255)
    @Description(value = "Замечание")
    private String tarifMarkText;


    @Basic
    @Description(value = "Номер вагона")
    @Column(name = "car_number", nullable = true, length = 20)
    private String carNumber;


    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_doc_id", nullable = false)
    @Description(value = "id_invoice")
    @IgnoreField
    private InvoiceEntity invoice;
}