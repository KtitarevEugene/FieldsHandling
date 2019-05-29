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
@Table(name = "S_DOC_STATE", schema = "NSI_ETR")
/**Названия состояний документов **/
public class SDocStateEntity {
    @Id
    @Column(name = "STATE")
    private Integer state;
    @Column(name = "NAME", length = 255)
    private String name;
    @Column(name = "STATEKEY")
    private Integer statekey;
    @Column(name = "FOLDER", length = 20)
    private String folder;
    @Column(name = "DOC_TYPE_ID")
    private Integer docTypeId;
}
 