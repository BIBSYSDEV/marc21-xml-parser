package no.unit.marc;

public class TestData {

    public static final String VALID_MARC21_XML_RECORD_ID = "991325803064702201";
    public static final String VALID_MARC21_XML_RECORD_TITLE = "Hobbiten :";
    public static final String VALID_MARC21_XML_RECORD = "<?xml version='1.0' encoding='UTF-8'?>\n"
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
            + "            <subfield code='c'>Jude Fisher;oversatt fra engelsk</subfield>\n"
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
            + "            <subfield code='u'>http://content.bibsys.no/content/?type=descr_publ_brief&amp;isbn=82100534180</subfield>\n"
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

    public static final String separator = System.getProperty("line.separator");
    public static final String LINEPRESENTATION_OF_RECORD = "*ldr 01044cam a2200301 c 4500" + separator
            + "*001 991325803064702201" + separator
            + "*005 20160622160726.0" + separator
            + "*007 ta" + separator
            + "*008 141124s2013    no#||||j||||||000|0|nob|^" + separator
            + "*015## $a1337755 $2nbf" + separator
            + "*020## $a9788210053412 $qib. $cNkr 249.00" + separator
            + "*035## $a132580306-47bibsys_network" + separator
            + "*035## $a(NO-TrBIB)132580306" + separator
            + "*035## $a(NO-OsBA)0370957" + separator
            + "*040## $aNO-OsNB $bnob $ekatreg" + separator
            + "*0411# $heng" + separator
            + "*042## $anorbibl" + separator
            + "*044## $cno" + separator
            + "*08274 $a791.4372 $qNO-OsNB $25/nor" + separator
            + "*1001# $aFisher, Jude $0(NO-TrBIB)1093967" + separator
            + "*24510 $aHobbiten : $bSmaugs ødemark i bilder $cJude Fisher;oversatt fra engelsk" + separator
            + "*2461# $aThe Hobbit $bthe desolation of Smaug visual companion $iOriginaltittel" + separator
            + "*260## $aOslo $bTiden $c2013" + separator
            + "*300## $a75 s. $bill. $c28 cm" + separator
            + "*7001# $aEikeland-Sundnes, Camilla $d1978- $4trl $0(NO-TrBIB)10061339" + separator
            + "*85642 $3Beskrivelse fra forlaget (kort) " +
            "$uhttp://content.bibsys.no/content/?type=descr_publ_brief&isbn=82100534180" + separator
            + "*85201 $a47BIBSYS_NB $6991325803064702202 $9D $9P" + separator
            + "*901## $a90" + separator
            + "*913## $aNorbok $bNB";

    public static final String INVALID_MARC21_XML_RECORD = "<record xmlns=\"http://www.loc.gov/MARC21/slim\">\n"
            + "    <leader>00667caa a2200205 c 4500</leader>\n"
            + "    <controlfield tag=\"001\">991004248644702201</controlfield>\n"
            + "    <controlfield tag=\"005\">20190130103301.0</controlfield>\n"
            + "    <controlfield tag=\"007\">ta</controlfield>\n"
            + "    <controlfield tag=\"008\">100222s2009 xx#||||f||||||000|u|eng|d</controlfield>\n"
            + "    <field tag=\"020\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">1234567892</subfield>\n"
            + "    </datafield>\n"
            + "    </record>";

    public static final String BAD_XML = "<bad xml>><";

    public static final String SEARCH_RETRIEVE_RESPONSE_NO_HITS = "<searchRetrieveResponse xmlns=\"http://www.loc.gov/zing/srw/\">\n" +
            "    <version>1.2</version>\n" +
            "    <numberOfRecords>0</numberOfRecords>\n" +
            "    <records/>\n" +
            "    <extraResponseData xmlns:xb=\"http://www.exlibris.com/repository/search/xmlbeans/\">\n" +
            "        <xb:exact>true</xb:exact>\n" +
            "        <xb:responseDate>2020-02-12T13:20:51+0100</xb:responseDate>\n" +
            "    </extraResponseData>\n" +
            "</searchRetrieveResponse>";

    public static final String SRR_THREE_HITS_ISBN = "978-0-367-19672-1";
    public static final String SRR_THREE_HITS_CORRECT_ID_1 = "999921024491202201";
    public static final String SRR_THREE_HITS_CORRECT_ID_2 = "998611116644702201";

    public static final String SEARCH_RETRIEVE_RESPONSE_THREE_HITS =
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
            "<searchRetrieveResponse xmlns=\"http://www.loc.gov/zing/srw/\">\n" +
            "    <version>1.2</version>\n" +
            "    <numberOfRecords>2</numberOfRecords>\n" +
            "    <records>\n" +
            "        <record>\n" +
            "            <recordSchema>marcxml</recordSchema>\n" +
            "            <recordPacking>xml</recordPacking>\n" +
            "            <recordData>\n" +
            "                <record xmlns=\"http://www.loc.gov/MARC21/slim\">\n" +
            "                    <leader>01368nam  2200325 i 4500</leader>\n" +
            "                    <controlfield tag=\"001\">999920928694002201</controlfield>\n" +
            "                    <controlfield tag=\"006\">m     o  d |</controlfield>\n" +
            "                    <controlfield tag=\"007\">cr cnu||||||||</controlfield>\n" +
            "                    <controlfield tag=\"008\">190828s2020    enk     o     000 0 eng d</controlfield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "                        <subfield code=\"a\">0-429-20386-1</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "                        <subfield code=\"a\">0-429-51226-0</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "                        <subfield code=\"a\">(CKB)4100000008780733</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "                        <subfield code=\"a\">(MiAaPQ)EBC5840040</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "                        <subfield code=\"a\">(EXLCZ)994100000008780733</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"040\">\n" +
            "                        <subfield code=\"a\">MiAaPQ</subfield>\n" +
            "                        <subfield code=\"b\">eng</subfield>\n" +
            "                        <subfield code=\"e\">rda</subfield>\n" +
            "                        <subfield code=\"e\">pn</subfield>\n" +
            "                        <subfield code=\"c\">MiAaPQ</subfield>\n" +
            "                        <subfield code=\"d\">MiAaPQ</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"4\" tag=\"050\">\n" +
            "                        <subfield code=\"a\">HD30.255</subfield>\n" +
            "                        <subfield code=\"b\">.S585 2020</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"0\" ind2=\" \" tag=\"082\">\n" +
            "                        <subfield code=\"a\">658.4083</subfield>\n" +
            "                        <subfield code=\"2\">23</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"1\" ind2=\" \" tag=\"100\">\n" +
            "                        <subfield code=\"a\">Sitkin, Alan,</subfield>\n" +
            "                        <subfield code=\"e\">author.</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"1\" ind2=\"0\" tag=\"245\">\n" +
            "                        <subfield code=\"a\">Absolute essentials of green business /</subfield>\n" +
            "                        <subfield code=\"c\">Alan Sitkin.</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"1\" tag=\"264\">\n" +
            "                        <subfield code=\"a\">London ;</subfield>\n" +
            "                        <subfield code=\"a\">New York, New York :</subfield>\n" +
            "                        <subfield code=\"b\">Routledge,</subfield>\n" +
            "                        <subfield code=\"c\">[2020]</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"4\" tag=\"264\">\n" +
            "                        <subfield code=\"c\">©2020</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"300\">\n" +
            "                        <subfield code=\"a\">1 online resource (127 pages).</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"336\">\n" +
            "                        <subfield code=\"a\">text</subfield>\n" +
            "                        <subfield code=\"b\">txt</subfield>\n" +
            "                        <subfield code=\"2\">rdacontent</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"337\">\n" +
            "                        <subfield code=\"a\">computer</subfield>\n" +
            "                        <subfield code=\"b\">c</subfield>\n" +
            "                        <subfield code=\"2\">rdamedia</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"338\">\n" +
            "                        <subfield code=\"a\">online resource</subfield>\n" +
            "                        <subfield code=\"b\">cr</subfield>\n" +
            "                        <subfield code=\"2\">rdacarrier</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"0\" ind2=\" \" tag=\"490\">\n" +
            "                        <subfield code=\"a\">Absolute essentials of business ; economics</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"588\">\n" +
            "                        <subfield code=\"a\">Description based on print version record.</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"0\" tag=\"650\">\n" +
            "                        <subfield code=\"a\">Business enterprises</subfield>\n" +
            "                        <subfield code=\"x\">Environmental aspects.</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"4\" tag=\"655\">\n" +
            "                        <subfield code=\"a\">Electronic books.</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"776\">\n" +
            "                        <subfield code=\"z\">0-367-19672-7</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "                        <subfield code=\"a\">47BIBSYS_BI</subfield>\n" +
            "                        <subfield code=\"6\">999919947877902215</subfield>\n" +
            "                        <subfield code=\"9\">E</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "                        <subfield code=\"a\">47BIBSYS_UBO</subfield>\n" +
            "                        <subfield code=\"6\">999920170782702204</subfield>\n" +
            "                        <subfield code=\"9\">E</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "                        <subfield code=\"a\">47BIBSYS_UBIN</subfield>\n" +
            "                        <subfield code=\"6\">999920037789802211</subfield>\n" +
            "                        <subfield code=\"9\">E</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"906\">\n" +
            "                        <subfield code=\"a\">BOOK</subfield>\n" +
            "                    </datafield>\n" +
            "                </record>\n" +
            "            </recordData>\n" +
            "            <recordIdentifier>999920928694002201</recordIdentifier>\n" +
            "            <recordPosition>1</recordPosition>\n" +
            "        </record>\n" +
            "        <record>\n" +
            "            <recordSchema>marcxml</recordSchema>\n" +
            "            <recordPacking>xml</recordPacking>\n" +
            "            <recordData>\n" +
            "                <record xmlns=\"http://www.loc.gov/MARC21/slim\">\n" +
            "                    <leader>01096nam a2200265 c 4500</leader>\n" +
            "                    <controlfield tag=\"001\">999921024491202201</controlfield>\n" +
            "                    <controlfield tag=\"005\">20200224132538.0</controlfield>\n" +
            "                    <controlfield tag=\"007\">ta</controlfield>\n" +
            "                    <controlfield tag=\"008\">200224s2020    enka   | |||||00||0 eng|c</controlfield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "                        <subfield code=\"a\">978-0-367-19672-1</subfield>\n" +
            "                        <subfield code=\"q\">innbundet</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"040\">\n" +
            "                        <subfield code=\"a\">NO-TrBIB</subfield>\n" +
            "                        <subfield code=\"b\">nob</subfield>\n" +
            "                        <subfield code=\"e\">rda</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"0\" ind2=\"4\" tag=\"082\">\n" +
            "                        <subfield code=\"a\">658.4083</subfield>\n" +
            "                        <subfield code=\"2\">23/nor</subfield>\n" +
            "                        <subfield code=\"q\">NO-ElHIB</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"1\" ind2=\" \" tag=\"100\">\n" +
            "                        <subfield code=\"a\">Sitkin, Alan</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)10033295</subfield>\n" +
            "                        <subfield code=\"4\">forfatter</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"1\" ind2=\"0\" tag=\"245\">\n" +
            "                        <subfield code=\"a\">Absolute essentials of green business</subfield>\n" +
            "                        <subfield code=\"c\">Alan Sitkin</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"1\" tag=\"260\">\n" +
            "                        <subfield code=\"a\">London</subfield>\n" +
            "                        <subfield code=\"b\">Routledge</subfield>\n" +
            "                        <subfield code=\"c\">2020</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"300\">\n" +
            "                        <subfield code=\"a\">xi, 113 sider</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"336\">\n" +
            "                        <subfield code=\"a\">tekst</subfield>\n" +
            "                        <subfield code=\"0\">http://rdaregistry.info/termList/RDAContentType/1020</subfield>\n" +
            "                        <subfield code=\"2\">rdaco</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"337\">\n" +
            "                        <subfield code=\"a\">uformidlet</subfield>\n" +
            "                        <subfield code=\"0\">http://rdaregistry.info/termList/RDAMediaType/1007</subfield>\n" +
            "                        <subfield code=\"2\">rdamt</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"338\">\n" +
            "                        <subfield code=\"a\">bind</subfield>\n" +
            "                        <subfield code=\"0\">http://rdaregistry.info/termList/RDACarrierType/1049</subfield>\n" +
            "                        <subfield code=\"2\">rdact</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"1\" ind2=\" \" tag=\"490\">\n" +
            "                        <subfield code=\"a\">Absolute essentials of business and economics</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "                        <subfield code=\"a\">Bedriftsledelse</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)HUME07578</subfield>\n" +
            "                        <subfield code=\"2\">humord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "                        <subfield code=\"a\">Samfunnsansvar</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)HUME25719</subfield>\n" +
            "                        <subfield code=\"2\">humord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "                        <subfield code=\"a\">Bærekraftig utvikling</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)HUME20308</subfield>\n" +
            "                        <subfield code=\"2\">humord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "                        <subfield code=\"a\">Markedsføring</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)HUME07755</subfield>\n" +
            "                        <subfield code=\"2\">humord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "                        <subfield code=\"a\">Miljøøkonomi</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)HUME24723</subfield>\n" +
            "                        <subfield code=\"2\">humord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "                        <subfield code=\"a\">47BIBSYS_UBA</subfield>\n" +
            "                        <subfield code=\"6\">999920097613102209</subfield>\n" +
            "                        <subfield code=\"9\">P</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "                        <subfield code=\"a\">47BIBSYS_HH</subfield>\n" +
            "                        <subfield code=\"6\">999919952533902214</subfield>\n" +
            "                        <subfield code=\"9\">P</subfield>\n" +
            "                    </datafield>\n" +
            "                </record>\n" +
            "            </recordData>\n" +
            "            <recordIdentifier>999921024491202201</recordIdentifier>\n" +
            "            <recordPosition>2</recordPosition>\n" +
            "        </record>\n" +
            "        <record>\n" +
            "            <recordSchema>marcxml</recordSchema>\n" +
            "            <recordPacking>xml</recordPacking>\n" +
            "            <recordData>\n" +
            "                <record xmlns=\"http://www.loc.gov/MARC21/slim\">\n" +
            "                    <leader>01095cam a2200325 c 4500</leader>\n" +
            "                    <controlfield tag=\"001\">998611116644702201</controlfield>\n" +
            "                    <controlfield tag=\"005\">20110826164106.0</controlfield>\n" +
            "                    <controlfield tag=\"007\">ta</controlfield>\n" +
            "                    <controlfield tag=\"008\">110826s1986    xx#|||||||||||000|u|und|d</controlfield>\n" +
            "                    <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "                        <subfield code=\"a\">978-0-367-19672-1</subfield>\n" +
            "                        <subfield code=\"q\">innbundet</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">861111664-47bibsys_network</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">(NO-TrBIB)861111664</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"040\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">NO-TrBIB</subfield>\n" +
            "                        <subfield code=\"b\">nob</subfield>\n" +
            "                        <subfield code=\"e\">katreg</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"080\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">621.39</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"080\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">654.1</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"080\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">681.324</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"080\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">681.327.8</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"100\" ind1=\"1\" ind2=\" \">\n" +
            "                        <subfield code=\"a\">Mjølsnes, Stig Frode</subfield>\n" +
            "                        <subfield code=\"d\">1956-</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)90128656</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"245\" ind1=\"1\" ind2=\"0\">\n" +
            "                        <subfield code=\"a\">Bedriftsintern telekommunikasjon</subfield>\n" +
            "                        <subfield code=\"c\">S. F. Mjølsnes, P. Hovde og T. Hystad</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"260\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">Trondheim</subfield>\n" +
            "                        <subfield code=\"b\">Elektronikklaboratoriet ved NTH</subfield>\n" +
            "                        <subfield code=\"c\">1986</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"300\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">VIII, 109, 9, 12 s.</subfield>\n" +
            "                        <subfield code=\"b\">ill.</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"490\" ind1=\"1\" ind2=\" \">\n" +
            "                        <subfield code=\"a\">ELAB rapport</subfield>\n" +
            "                        <subfield code=\"v\">STF44 A86030</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"650\" ind1=\" \" ind2=\"7\">\n" +
            "                        <subfield code=\"a\">Telekommunikasjoner</subfield>\n" +
            "                        <subfield code=\"x\">Internsystemer</subfield>\n" +
            "                        <subfield code=\"2\">tekord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"650\" ind1=\" \" ind2=\"7\">\n" +
            "                        <subfield code=\"a\">Datamaskinnett</subfield>\n" +
            "                        <subfield code=\"2\">tekord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"650\" ind1=\" \" ind2=\"7\">\n" +
            "                        <subfield code=\"a\">Dataoverføring</subfield>\n" +
            "                        <subfield code=\"2\">tekord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"653\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">telekommunikasjon</subfield>\n" +
            "                        <subfield code=\"a\">teleautomatikk</subfield>\n" +
            "                        <subfield code=\"a\">datanett</subfield>\n" +
            "                        <subfield code=\"a\">datateknikk</subfield>\n" +
            "                        <subfield code=\"a\">bedriftskommunikasjon</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"700\" ind1=\"1\" ind2=\" \">\n" +
            "                        <subfield code=\"a\">Hovde, Per</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)90304864</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"700\" ind1=\"1\" ind2=\" \">\n" +
            "                        <subfield code=\"a\">Hystad, Toralf</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)90304797</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"830\" ind1=\" \" ind2=\"0\">\n" +
            "                        <subfield code=\"a\">ELAB rapport (trykt utg.)</subfield>\n" +
            "                        <subfield code=\"v\">STF44 A86030</subfield>\n" +
            "                        <subfield code=\"w\">998010207354702201</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"852\" ind1=\"0\" ind2=\"1\">\n" +
            "                        <subfield code=\"a\">47BIBSYS_NTNU_UB</subfield>\n" +
            "                        <subfield code=\"6\">998611116644702203</subfield>\n" +
            "                        <subfield code=\"9\">P</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"901\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">80</subfield>\n" +
            "                    </datafield>\n" +
            "                </record>\n" +
            "            </recordData>\n" +
            "            <recordIdentifier>998611116644702201</recordIdentifier>\n" +
            "            <recordPosition>1</recordPosition>\n" +
            "        </record>\n" +
            "    </records>\n" +
            "    <extraResponseData xmlns:xb=\"http://www.exlibris.com/repository/search/xmlbeans/\">\n" +
            "        <xb:exact>true</xb:exact>\n" +
            "        <xb:responseDate>2021-02-08T16:00:12+0100</xb:responseDate>\n" +
            "    </extraResponseData>\n" +
            "</searchRetrieveResponse>";

    public static final String SRR_ONE_HIT_MAIN_TITLE = "Bedriftsintern telekommunikasjon";
    public static final String SRR_ONE_HIT_ID = "998611116644702201";
    public static final String SRR_ONE_HIT_YEAR = "1986";
    public static final String SEARCH_RETRIEVE_RESPONSE_ONE_HIT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<searchRetrieveResponse xmlns=\"http://www.loc.gov/zing/srw/\">\n" +
            "    <version>1.2</version>\n" +
            "    <numberOfRecords>1</numberOfRecords>\n" +
            "    <records>\n" +
            "        <record>\n" +
            "            <recordSchema>marcxml</recordSchema>\n" +
            "            <recordPacking>xml</recordPacking>\n" +
            "            <recordData>\n" +
            "                <record xmlns=\"http://www.loc.gov/MARC21/slim\">\n" +
            "                    <leader>01095cam a2200325 c 4500</leader>\n" +
            "                    <controlfield tag=\"001\">998611116644702201</controlfield>\n" +
            "                    <controlfield tag=\"005\">20110826164106.0</controlfield>\n" +
            "                    <controlfield tag=\"007\">ta</controlfield>\n" +
            "                    <controlfield tag=\"008\">110826s1986    xx#|||||||||||000|u|und|d</controlfield>\n" +
            "                    <datafield tag=\"020\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">978-0-367-19672-1</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">861111664-47bibsys_network</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">(NO-TrBIB)861111664</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"040\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">NO-TrBIB</subfield>\n" +
            "                        <subfield code=\"b\">nob</subfield>\n" +
            "                        <subfield code=\"e\">katreg</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"080\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">621.39</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"080\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">654.1</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"080\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">681.324</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"080\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">681.327.8</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"100\" ind1=\"1\" ind2=\" \">\n" +
            "                        <subfield code=\"a\">Mjølsnes, Stig Frode</subfield>\n" +
            "                        <subfield code=\"d\">1956-</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)90128656</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"245\" ind1=\"1\" ind2=\"0\">\n" +
            "                        <subfield code=\"a\">Bedriftsintern telekommunikasjon</subfield>\n" +
            "                        <subfield code=\"c\">S. F. Mjølsnes, P. Hovde og T. Hystad</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"260\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">Trondheim</subfield>\n" +
            "                        <subfield code=\"b\">Elektronikklaboratoriet ved NTH</subfield>\n" +
            "                        <subfield code=\"c\">1986</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"300\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">VIII, 109, 9, 12 s.</subfield>\n" +
            "                        <subfield code=\"b\">ill.</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"490\" ind1=\"1\" ind2=\" \">\n" +
            "                        <subfield code=\"a\">ELAB rapport</subfield>\n" +
            "                        <subfield code=\"v\">STF44 A86030</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"650\" ind1=\" \" ind2=\"7\">\n" +
            "                        <subfield code=\"a\">Telekommunikasjoner</subfield>\n" +
            "                        <subfield code=\"x\">Internsystemer</subfield>\n" +
            "                        <subfield code=\"2\">tekord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"650\" ind1=\" \" ind2=\"7\">\n" +
            "                        <subfield code=\"a\">Datamaskinnett</subfield>\n" +
            "                        <subfield code=\"2\">tekord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"650\" ind1=\" \" ind2=\"7\">\n" +
            "                        <subfield code=\"a\">Dataoverføring</subfield>\n" +
            "                        <subfield code=\"2\">tekord</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"653\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">telekommunikasjon</subfield>\n" +
            "                        <subfield code=\"a\">teleautomatikk</subfield>\n" +
            "                        <subfield code=\"a\">datanett</subfield>\n" +
            "                        <subfield code=\"a\">datateknikk</subfield>\n" +
            "                        <subfield code=\"a\">bedriftskommunikasjon</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"700\" ind1=\"1\" ind2=\" \">\n" +
            "                        <subfield code=\"a\">Hovde, Per</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)90304864</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"700\" ind1=\"1\" ind2=\" \">\n" +
            "                        <subfield code=\"a\">Hystad, Toralf</subfield>\n" +
            "                        <subfield code=\"0\">(NO-TrBIB)90304797</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"830\" ind1=\" \" ind2=\"0\">\n" +
            "                        <subfield code=\"a\">ELAB rapport (trykt utg.)</subfield>\n" +
            "                        <subfield code=\"v\">STF44 A86030</subfield>\n" +
            "                        <subfield code=\"w\">998010207354702201</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"852\" ind1=\"0\" ind2=\"1\">\n" +
            "                        <subfield code=\"a\">47BIBSYS_NTNU_UB</subfield>\n" +
            "                        <subfield code=\"6\">998611116644702203</subfield>\n" +
            "                        <subfield code=\"9\">P</subfield>\n" +
            "                    </datafield>\n" +
            "                    <datafield tag=\"901\" ind1=\" \" ind2=\" \">\n" +
            "                        <subfield code=\"a\">80</subfield>\n" +
            "                    </datafield>\n" +
            "                </record>\n" +
            "            </recordData>\n" +
            "            <recordIdentifier>998611116644702201</recordIdentifier>\n" +
            "            <recordPosition>1</recordPosition>\n" +
            "        </record>\n" +
            "    </records>\n" +
            "    <nextRecordPosition>3</nextRecordPosition>\n" +
            "    <extraResponseData xmlns:xb=\"http://www.exlibris.com/repository/search/xmlbeans/\">\n" +
            "        <xb:exact>true</xb:exact>\n" +
            "        <xb:responseDate>2020-02-12T11:02:17+0100</xb:responseDate>\n" +
            "    </extraResponseData>\n" +
            "</searchRetrieveResponse>";
}
