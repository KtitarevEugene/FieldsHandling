package ru.generator.models.entities.entity.share.nsi.etran.app.parent;

import ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter.XMLDateTimeAdapterEtran;
import ru.generator.service.annotations.Description;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public class TimeActiveNsiEntity implements Serializable {

    @XmlJavaTypeAdapter(value = XMLDateTimeAdapterEtran.class)
    @XmlPath("RECDATENEW/@value")
    @Column(name = "recdatenew")
    @Description(value = "Дата появления записи в таблице")
    private Date recDateNew;

    @XmlJavaTypeAdapter(value = XMLDateTimeAdapterEtran.class)
    @XmlPath("RECDATEBEGIN/@value")
    @Column(name = "recdatebegin")
    @Description(value = "Дата ввода в действие")
    private Date recDateBegin;

    @XmlJavaTypeAdapter(value = XMLDateTimeAdapterEtran.class)
    @XmlPath("RECDATEEND/@value")
    @Column(name = "recdateend")
    @Description(value = "Дата вывода из действия")
    private Date recDateEnd;
}
