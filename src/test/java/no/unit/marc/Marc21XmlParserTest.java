package no.unit.marc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Marc21XmlParserTest {

    public static final String MOCK_ID = "991004248644702201";
    public static final String MOCK_TITLE = "Emotions and legal judgements :";

    public static final String MOCK_XML = "<record xmlns=\"http://www.loc.gov/MARC21/slim\">\n"
            + "    <leader>00667caa a2200205 c 4500</leader>\n"
            + "    <controlfield tag=\"001\">991004248644702201</controlfield>\n"
            + "    <controlfield tag=\"005\">20190130103301.0</controlfield>\n"
            + "    <controlfield tag=\"007\">ta</controlfield>\n"
            + "    <controlfield tag=\"008\">100222s2009 xx#||||f||||||000|u|eng|d</controlfield>\n"
            + "    <datafield tag=\"020\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">1234567892</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"020\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">1234567891</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"022\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">4234567890</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"022\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">3234567890</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"022\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">2234567890</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"022\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">1234567890</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">100424864-47bibsys_network</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">(NO-TrBIB)100424864</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"040\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">NO-TrBIB</subfield>\n"
            + "        <subfield code=\"b\">nob</subfield>\n"
            + "        <subfield code=\"e\">katreg</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"100\" ind1=\"1\" ind2=\" \">\n"
            + "        <subfield code=\"a\">Gabriel, Ute.</subfield>\n"
            + "        <subfield code=\"4\">aut</subfield>\n"
            + "        <subfield code=\"0\">(NO-TrBIB)8071732</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"245\" ind1=\"1\" ind2=\"0\">\n"
            + "        <subfield code=\"a\">Emotions and legal judgements :</subfield>\n"
            + "        <subfield code=\"b\">normative issues and empirical findings</subfield>\n"
            + "        <subfield code=\"c\">Ute Gabriel</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"260\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"c\">2009</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"300\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">S. 157-172</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"773\" ind1=\"0\" ind2=\" \">\n"
            + "        <subfield code=\"t\">Social psychology of punishment of crime</subfield>\n"
            + "        <subfield code=\"d\">Chichester : Wiley-Blackwell, 2009</subfield>\n"
            + "        <subfield code=\"z\">9780470515990</subfield>\n"
            + "        <subfield code=\"w\">991001073034702201</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"901\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">80</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"914\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">Scientific</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"915\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">1</subfield>\n"
            + "    </datafield>\n"
            + "</record>";

    public static final String MOCK_FAULTY_XML = "<record xmlns=\"http://www.loc.gov/MARC21/slim\">\n"
            + "    <leader>00667caa a2200205 c 4500</leader>\n"
            + "    <controlfield tag=\"001\">991004248644702201</controlfield>\n"
            + "    <controlfield tag=\"005\">20190130103301.0</controlfield>\n"
            + "    <controlfield tag=\"007\">ta</controlfield>\n"
            + "    <controlfield tag=\"008\">100222s2009 xx#||||f||||||000|u|eng|d</controlfield>\n"
            + "    <field tag=\"020\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">1234567892</subfield>\n"
            + "    </datafield>\n"
            + "    </record>";

    @Test
    public void testXmlNotStartingWithRecordTag() {
        String faulty_xml = "<recordData>" + MOCK_XML + "</recordData>";
        assertThrows(Marc21XmlParserException.class, () -> {
            Marc21XmlParser.parse(faulty_xml);
        });
    }

    @Test
    public void testXmlContainingErrors() {
        Marc21XmlParser parser = new Marc21XmlParser();
        assertThrows(Marc21XmlParserException.class, () -> {
            Marc21XmlParser.parse(MOCK_FAULTY_XML);
        });

    }

    @Test
    public void testParsing() {
        Marc21XmlParser parser = new Marc21XmlParser();
        try{
            Reference reference = parser.parse(MOCK_XML);
            assertEquals(MOCK_ID, reference.getId());
            assertEquals(MOCK_TITLE, reference.getMainTitle());
        }
        catch(Marc21XmlParserException e){
            System.out.println(e);
        }
    }
}