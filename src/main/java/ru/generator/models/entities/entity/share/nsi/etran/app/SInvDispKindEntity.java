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
@Table(name = "S_INV_DISP_KIND", schema = "NSI_ETR")
/**Классификатор видов сообщения. **/
public class SInvDispKindEntity {
    @Id
    @Column(name = "KIND_DISP")
    private Integer kindDisp;
    @Column(name = "NAME", length = 100)
    private String name;
    @Column(name = "ASOUP_CODE", length = 2)
    private String asoupCode;
    @Column(name = "RPP_CODE", length = 2)
    private String rppCode;
    @Column(name = "COMMENTS", length = 255)
    private String comments;
}
 