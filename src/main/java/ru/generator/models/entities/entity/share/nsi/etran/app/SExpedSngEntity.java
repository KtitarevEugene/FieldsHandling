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
@Table(name = "S_EXPED_SNG", schema = "NSI_ETR")
/**Классификатор экспедиторов **/
public class SExpedSngEntity extends TimeActiveNsiEntity {
    @Id
    @Column(name = "EXPED_SNG_ID")
    private Integer expedSngId;
    @Column(name = "CN_ID")
    private Integer cnId;
    @Column(name = "CODE", length = 20)
    private String code;
    @Column(name = "NAME", length = 250)
    private String name;
    @Column(name = "SHORTNAME", length = 60)
    private String shortname;
}
 