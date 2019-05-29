package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_KKR_SALDO_TYPE", schema = "NSI_ETR")
/**Классификатор типов субсчетов **/
public class SKkrSaldoTypeEntity {
    @Id
    @Column(name = "SALDO_TYPE")
    private Integer saldoType;
    @Column(name = "NAME", length = 200)
    private String name;
}
 