package ru.generator.models.entities.entity.share.nsi.etran.app.parent.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XMLDateTimeAdapterEtran extends XmlAdapter<String, Date> {
    @Override
    public Date unmarshal(String v) throws Exception {
        if (v == null) return null;
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse(v);
    }

    public String marshal(Date v) throws Exception {
        if (v == null) return null;
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(v);
    }
}
