package ru.generator.models.entities.entity.ktlo.invoice;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import io.swagger.annotations.ApiModel;
import ru.generator.service.annotations.Description;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import ru.generator.models.entities.annotation.Nsi;
import ru.generator.models.entities.entity.share.nsi.etran.app.SCurrencyEntity;
import ru.generator.models.entities.entity.share.nsi.etran.app.STInvDueTypesEntity;
import ru.generator.service.annotations.IgnoreField;
import ru.generator.service.annotations.ModelClass;

import javax.persistence.*;

/**
 * Created by solop on 20.11.2017.
 */
@ApiModel("НАКЛАДНАЯ: Провозные платежи и сборы")
@Data
@Entity
@Table(name = "inv_due", schema = "invoice",
        indexes = {
                @Index(columnList = "id_invoice")
        })
public class InvDueEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    private String id;

    @Nsi(nsiClassEntity = STInvDueTypesEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "due_type_ID", referencedColumnName = "INVDUETYPE_ID")
    @Description(value = "Тип сбора ID по таблице T_INV_DUE_TYPES ")
    @ModelClass(STInvDueTypesEntity.class)
    private STInvDueTypesEntity dueType;

    @Basic
    @Column(name = "due_car_number", nullable = true, length = 20)
    @Description(value = "Номер вагона ")
    private String dueCarNumber;

    @Basic
    @Column(name = "due_enter_place", nullable = true, length = 20)
    @Description(value = "Место ввода : DUE -  по отправлению, DUE_ENTER - по входу, DUE_ARRIVE - по прибытию")
    private String dueEnterPlace;

    @Basic
    @Column(name = "dist_min_way", nullable = true, precision = 0)
    @Description(value = "Расстояние")
    private Double distMinWay;

    @Basic
    @Column(name = "due_weight_calc", nullable = true, precision = 0)
    @Description(value = "Расчетная масса (кг)")
    private Double dueWeightCalc;

    @Basic
    @Column(name = "due_amount", nullable = true, precision = 0)
    @Description(value = "Сумма в рублях")
    private Double dueAmount;

    @Nsi(nsiClassEntity = SCurrencyEntity.class, type = Nsi.Type.ID)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "due_currency_Id", referencedColumnName = "CUR_ID")
    @Description(value = "Идентификатор валюты (CUR_ID по НСИ - CURRENCY)")
    @ModelClass(SCurrencyEntity.class)
    private SCurrencyEntity dueCurrency;

    @Basic
    @Column(name = "due_rate", nullable = true, precision = 0)
    @Description(value = "Курс валюты ")
    private Double dueRate;

    @Basic
    @Column(name = "due_amount_val", nullable = true, precision = 0)
    @Description(value = "Сумма в валюте ")
    private Double dueAmountVal;

    @Basic
    @Column(name = "due_scheme", nullable = true, precision = 0)
    @Description(value = "Cхема инфрастр")
    private Double dueScheme;

    @Basic
    @Column(name = "due_currency_rate", nullable = true, precision = 0)
    @Description(value = "Базовая ставка в валюте")
    private Double dueCurrencyRate;


    @Basic
    @Column(name = "due_distance_name", nullable = true, length = 40)
    @Description(value = "Дистанция - cтанция, на которой взимаются сборы")
    private String dueDistanceName;

    @Basic
    @Column(name = "due_calc_distance_name", nullable = true, length = 180)
    @Description(value = "Дистанция - дистанция взимания сбора ")
    private String dueCalcDistanceName;


    @Basic
    @Column(name = "due_pay_currency", nullable = true, precision = 0)
    @Description(value = "Плата в валюте")
    private Double duePayCurrency;


    @Basic
    @Column(name = "due_scheme_num_wag", nullable = true, precision = 0)
    @Description(value = "Cхема вагон")
    private Double dueSchemeNumWag;

    @Basic
    @Column(name = "due_tarif_rate_wag", nullable = true, precision = 0)
    @Description(value = "Ставка вагон (руб.)")
    private Double dueTarifRateWag;

    @Basic
    @Column(name = "due_sum_wag", nullable = true, precision = 0)
    @Description(value = "Сумма вагон (руб.)")
    private Double dueSumWag;

    @Basic
    @Column(name = "due_tarif_coef", nullable = true, precision = 0)
    @Description(value = "Коэффициент к тарифу")
    private Double dueTarifCoef;

    @Basic
    @Column(name = "due_tax_sum", nullable = true, precision = 0)
    @Description(value = "Сумма налога")
    private Double dueTaxSum;

    @Basic
    @Column(name = "due_tax_able", nullable = true)
    @Description(value = "Облагается налогом 1 - Облагается, 0 - Не облагается")
    private Integer dueTaxAble;

    @Basic
    @Column(name = "due_tax_val", nullable = true, precision = 0)
    @Description(value = "Ставка налога")
    private Double dueTaxVal;

    @Basic
    @Column(name = "due_freight_tarif_class", nullable = true, length = 20)
    @Description(value = "Тарифный класс груза ")
    private String dueFreightTarifClass;

    @Basic
    @Column(name = "due_tarif_discount", nullable = true, precision = 0)
    @Description(value = "Скидка по исключительному тарифу ")
    private Double dueTarifDiscount;

    @Basic
    @Column(name = "due_tarif_percent", nullable = true, precision = 0)
    @Description(value = "Процентное изменение тарифа ")
    private Double dueTarifPercent;

    @Basic
    @Column(name = "due_tarif_code", nullable = true, precision = 0)
    @Description(value = "Код применяемого тарифа ")
    private Double dueTarifCode;

    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_invoice", referencedColumnName = "invoice_doc_id", nullable = false)
    @Description(value = "id_invoice")
    @IgnoreField
    private InvoiceEntity invoice;
}