package ru.generator.models.entities.entity.share.nsi.etran.app;

import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import ru.generator.models.entities.entity.share.nsi.etran.app.parent.NsiEtran;
import ru.generator.service.annotations.Description;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "row")
@Entity
@Table(name = "S_DOC_LINK_TYPE", schema = "NSI_ETR")
/**Справочник типов связи документов. **/
public class SDocLinkTypeEntity implements NsiEtran {
    @Id
    @XmlPath("DOC_LINK_TYPE_ID/@value")
    @Column(name = "DOC_LINK_TYPE_ID")
    @Description(value = "Идентификатор типа связи")
    private Integer docLinkTypeId;
    @XmlPath("NAME1/@value")
    @Column(name = "NAME1", length = 1000)
    @Description(value = "Название связи, если документ является «родителем»")
    private String name1;
    @XmlPath("NAME2/@value")
    @Column(name = "NAME2", length = 1000)
    @Description(value = "Название связи, если документ является «потомком»")
    private String name2;
}
 