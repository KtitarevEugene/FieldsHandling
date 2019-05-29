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
@Table(name = "S_FASTENING", schema = "NSI_ETR")
/**Классификатор нормативных документов по размещению и креплению грузов **/
public class SFasteningEntity extends TimeActiveNsiEntity {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PREV_ID")
    private Integer prevId;
    @Column(name = "CATHEGORY", length = 100)
    private String cathegory;
    @Column(name = "BOOK_TYPE")
    private Integer bookType;
    @Column(name = "DATA", length = 200)
    private String data;
    @Column(name = "DEPNORMDOC_ID")
    private Integer depnormdocId;
    @Column(name = "STRUCT_ID")
    private Integer structId;
}
 