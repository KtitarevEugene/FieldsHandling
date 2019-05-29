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
@Table(name = "S_PC_ACC_TYPE", schema = "NSI_ETR")
/**Классификатор типов договоров с плательщиком/экспедитором **/
public class SPcAccTypeEntity {
    @Id
    @Column(name = "ACCTYPE_ID")
    private Integer acctypeId;
    @Column(name = "NAME", length = 255)
    private String name;
    @Column(name = "CODE")
    private Integer code;
    @Column(name = "WITHNDS")
    private Integer withnds;
}
 