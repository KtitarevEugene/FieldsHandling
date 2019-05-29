package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.TimeActiveNsiEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_CL_PRIZVAG", schema = "NSI_ETR")
/**Классификатор типов собственности подвижного состава (для заявок) **/
public class SClPrizvagEntity extends TimeActiveNsiEntity {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME", length = 50)
    private String name;
    @Column(name = "SHORTNAME", length = 5)
    private String shortname;
}
 