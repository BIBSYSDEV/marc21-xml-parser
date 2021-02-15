package no.unit.marc;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinePresentationTest {

    public static final String EMPTY_STRING = "";

    public static final String MOCK_XML = "<?xml version='1.0' encoding='UTF-8'?>\n"
            + "<record xmlns='http://www.loc.gov/MARC21/slim'>\n"
            + "          <leader>01044cam a2200301 c 4500</leader>\n"
            + "          <controlfield tag='001'>991325803064702201</controlfield>\n"
            + "          <controlfield tag='005'>20160622160726.0</controlfield>\n"
            + "          <controlfield tag='007'>ta</controlfield>\n"
            + "          <controlfield tag='008'>141124s2013    no#||||j||||||000|0|nob|^</controlfield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='015'>\n"
            + "            <subfield code='a'>1337755</subfield>\n"
            + "            <subfield code='2'>nbf</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='020'>\n"
            + "            <subfield code='a'>9788210053412</subfield>\n"
            + "            <subfield code='q'>ib.</subfield>\n"
            + "            <subfield code='c'>Nkr 249.00</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='035'>\n"
            + "            <subfield code='a'>132580306-47bibsys_network</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='035'>\n"
            + "            <subfield code='a'>(NO-TrBIB)132580306</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='035'>\n"
            + "            <subfield code='a'>(NO-OsBA)0370957</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='040'>\n"
            + "            <subfield code='a'>NO-OsNB</subfield>\n"
            + "            <subfield code='b'>nob</subfield>\n"
            + "            <subfield code='e'>katreg</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1='1' ind2=' ' tag='041'>\n"
            + "            <subfield code='h'>eng</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='042'>\n"
            + "            <subfield code='a'>norbibl</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='044'>\n"
            + "            <subfield code='c'>no</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1='7' ind2='4' tag='082'>\n"
            + "            <subfield code='a'>791.4372</subfield>\n"
            + "            <subfield code='q'>NO-OsNB</subfield>\n"
            + "            <subfield code='2'>5/nor</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1='1' ind2=' ' tag='100'>\n"
            + "            <subfield code='a'>Fisher, Jude</subfield>\n"
            + "            <subfield code='0'>(NO-TrBIB)1093967</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1='1' ind2='0' tag='245'>\n"
            + "            <subfield code='a'>Hobbiten :</subfield>\n"
            + "            <subfield code='b'>Smaugs ødemark i bilder</subfield>\n"
            + "            <subfield code='c'>Jude Fisher ; oversatt fra engelsk av Camilla Eikeland-Sandnes</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1='1' ind2=' ' tag='246'>\n"
            + "            <subfield code='a'>The Hobbit</subfield>\n"
            + "            <subfield code='b'>the desolation of Smaug visual companion</subfield>\n"
            + "            <subfield code='i'>Originaltittel</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='260'>\n"
            + "            <subfield code='a'>Oslo</subfield>\n"
            + "            <subfield code='b'>Tiden</subfield>\n"
            + "            <subfield code='c'>2013</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='300'>\n"
            + "            <subfield code='a'>75 s.</subfield>\n"
            + "            <subfield code='b'>ill.</subfield>\n"
            + "            <subfield code='c'>28 cm</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1='1' ind2=' ' tag='700'>\n"
            + "            <subfield code='a'>Eikeland-Sundnes, Camilla</subfield>\n"
            + "            <subfield code='d'>1978-</subfield>\n"
            + "            <subfield code='4'>trl</subfield>\n"
            + "            <subfield code='0'>(NO-TrBIB)10061339</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1='4' ind2='2' tag='856'>\n"
            + "            <subfield code='3'>Beskrivelse fra forlaget (kort)</subfield>\n"
            + "            <subfield code='u'>http://content.bibsys.no/content/?type=descr_publ_brief&amp;isbn=8210053418</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1='0' ind2='1' tag='852'>\n"
            + "            <subfield code='a'>47BIBSYS_NB</subfield>\n"
            + "            <subfield code='6'>991325803064702202</subfield>\n"
            + "            <subfield code='9'>D</subfield>\n"
            + "            <subfield code='9'>P</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='901'>\n"
            + "            <subfield code='a'>90</subfield>\n"
            + "          </datafield>\n"
            + "          <datafield ind1=' ' ind2=' ' tag='913'>\n"
            + "            <subfield code='a'>Norbok</subfield>\n"
            + "            <subfield code='b'>NB</subfield>\n"
            + "          </datafield>\n"
            + "        </record>";

    public static final String MOCK_LINEPRESENTATION = "*ldr 01044cam a2200301 c 4500\r\n"
            + "*001 991325803064702201\r\n"
            + "*005 20160622160726.0\r\n"
            + "*007 ta\r\n"
            + "*008 141124s2013    no#||||j||||||000|0|nob|^\r\n"
            + "*015## $a1337755 $2nbf\r\n"
            + "*020## $a9788210053412 $qib. $cNkr 249.00\r\n"
            + "*035## $a132580306-47bibsys_network\r\n"
            + "*035## $a(NO-TrBIB)132580306\r\n"
            + "*035## $a(NO-OsBA)0370957\r\n"
            + "*040## $aNO-OsNB $bnob $ekatreg\r\n"
            + "*0411# $heng\r\n"
            + "*042## $anorbibl\r\n"
            + "*044## $cno\r\n"
            + "*08274 $a791.4372 $qNO-OsNB $25/nor\r\n"
            + "*1001# $aFisher, Jude $0(NO-TrBIB)1093967\r\n"
            + "*24510 $aHobbiten : $bSmaugs ødemark i bilder $cJude Fisher ; oversatt fra engelsk av Camilla Eikeland-Sandnes\r\n"
            + "*2461# $aThe Hobbit $bthe desolation of Smaug visual companion $iOriginaltittel\r\n"
            + "*260## $aOslo $bTiden $c2013\r\n"
            + "*300## $a75 s. $bill. $c28 cm\r\n"
            + "*7001# $aEikeland-Sundnes, Camilla $d1978- $4trl $0(NO-TrBIB)10061339\r\n"
            + "*85642 $3Beskrivelse fra forlaget (kort) $uhttp://content.bibsys.no/content/?type=descr_publ_brief&isbn=8210053418\r\n"
            + "*85201 $a47BIBSYS_NB $6991325803064702202 $9D $9P\r\n"
            + "*901## $a90\r\n"
            + "*913## $aNorbok $bNB";


    /**
     *
     * @param sruxml
     * @return
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * Stolen from Marc21XmlParser to help test the convertion to linePresentation.
     */
    private Document asDocumentHelperMethod(String sruxml) throws ParserConfigurationException, SAXException, IOException {
        Document document;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        String removedMarcInSruXml = sruxml.replace(Marc21Constants.MARC_PREFIX, EMPTY_STRING);
        InputSource is = new InputSource(new StringReader(removedMarcInSruXml));
        document = builder.parse(is);

        return document;
    };

    @Test
    public void testConvertingToLinePresentation(){
        try{
            LinePresentation lPress = new LinePresentation(asDocumentHelperMethod(MOCK_XML));
            assertEquals(MOCK_LINEPRESENTATION, lPress.getPresentation());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}