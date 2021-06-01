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

    public static final String VALID_SEARCH_RETRIVE_RESPONSE =
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n"
            + "<searchRetrieveResponse xmlns=\"http://www.loc.gov/zing/srw/\">\n"
            + "<version>1.2</version>\n"
            + "<numberOfRecords>2</numberOfRecords>\n"
            + "<records>\n"
                + "<record>\n"
                    + "<recordSchema>marcxml</recordSchema>\n"
                    + "<recordPacking>xml</recordPacking>\n"
                    + "<recordData>\n"
                        + "<record xmlns=\"http://www.loc.gov/MARC21/slim\">\n"
                            + "<leader>01174cam a2200277 c 4500</leader>\n"
                            + "<controlfield tag=\"001\">991401047204702201</controlfield>\n"
                            + "<controlfield tag=\"005\">20190128184903.0</controlfield>\n"
                            + "<controlfield tag=\"007\">ta</controlfield>\n"
                            + "<controlfield tag=\"008\">150209s2014 xx#|||||||||||000|u|eng|d</controlfield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"020\">\n"
                                + "<subfield code=\"a\">9781449345372</subfield>\n"
                                + "<subfield code=\"q\">h.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">140104720-47bibsys_network</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(NO-TrBIB)140104720</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"040\">\n"
                                + "<subfield code=\"a\">NO-TrBIB</subfield>\n"
                                + "<subfield code=\"b\">nob</subfield>\n"
                                + "<subfield code=\"e\">katreg</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"080\">\n"
                                + "<subfield code=\"a\">004.42</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\"4\" tag=\"082\">\n"
                                + "<subfield code=\"a\">006.22</subfield>\n"
                                + "<subfield code=\"q\">NoOU</subfield>\n"
                                + "<subfield code=\"2\">23</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"1\" ind2=\" \" tag=\"100\">\n"
                                + "<subfield code=\"a\">Richardson, Matt</subfield>\n"
                                + "<subfield code=\"4\">aut</subfield>\n"
                                + "<subfield code=\"0\">(NO-TrBIB)13007533</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"1\" ind2=\"0\" tag=\"245\">\n"
                                + "<subfield code=\"a\">Getting started with BeagleBone</subfield>\n"
                                + "<subfield code=\"c\">Matt Richardson</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"260\">\n"
                                + "<subfield code=\"a\">Sebastopol, CA</subfield>\n"
                                + "<subfield code=\"b\">Maker Media</subfield>\n"
                                + "<subfield code=\"c\">cop. 2014</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"300\">\n"
                                + "<subfield code=\"a\">XIII, 126 s.</subfield>\n"
                                + "<subfield code=\"b\">ill.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"500\">\n"
                                + "<subfield code=\"a\">På omslaget: Linux-powered electronic projects with Python and Java script</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n"
                                + "<subfield code=\"a\">Innebygde systemer</subfield>\n"
                                + "<subfield code=\"2\">noubomn</subfield>\n"
                                + "<subfield code=\"0\">(NO-TrBIB)REAL013994</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\" \" tag=\"776\">\n"
                                + "<subfield code=\"t\">Getting started with BeagleBone</subfield>\n"
                                + "<subfield code=\"w\">991416376334702201</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"4\" ind2=\"2\" tag=\"856\">\n"
                                + "<subfield code=\"3\">Beskrivelse fra forlaget (kort)</subfield>\n"
                                + "<subfield code=\"u\">http://content.bibsys.no/content/?type=descr_publ_brief&amp;isbn=1449345379</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"4\" ind2=\"2\" tag=\"856\">\n"
                                + "<subfield code=\"3\">Beskrivelse fra forlaget (lang)</subfield>\n"
                                + "<subfield code=\"u\">http://content.bibsys.no/content/?type=descr_publ_full&amp;=1449345379</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"4\" ind2=\"2\" tag=\"856\">\n"
                                + "<subfield code=\"3\">Omslagsbilde</subfield>\n"
                                + "<subfield code=\"u\">http://innhold.bibsys.no/bilde/forside/?size=mini&amp;id=9781449345372.jpg</subfield>\n"
                                + "<subfield code=\"q\">image/jpeg</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n"
                                + "<subfield code=\"a\">47BIBSYS_UBO</subfield>\n"
                                + "<subfield code=\"6\">991401047204702204</subfield>\n"
                                + "<subfield code=\"9\">P</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n"
                                + "<subfield code=\"a\">47BIBSYS_TEKNMUS</subfield>\n"
                                + "<subfield code=\"6\">991401047204702251</subfield>\n"
                                + "<subfield code=\"9\">P</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"901\">\n"
                                + "<subfield code=\"a\">80</subfield>\n"
                            + "</datafield>\n"
                        + "</record>\n"
                    + "</recordData>\n"
                    + "<recordIdentifier>991401047204702201</recordIdentifier>\n"
                    + "<recordPosition>1</recordPosition>\n"
                + "</record>\n"
                + "<record>\n"
                    + "<recordSchema>marcxml</recordSchema>\n"
                    + "<recordPacking>xml</recordPacking>\n"
                    + "<recordData>\n"
                        + "<record xmlns=\"http://www.loc.gov/MARC21/slim\">\n"
                            + "<leader>01467nam  22003611i 4500</leader>\n"
                            + "<controlfield tag=\"001\">999919992512402201</controlfield>\n"
                            + "<controlfield tag=\"005\">20170816154232.0</controlfield>\n"
                            + "<controlfield tag=\"006\">m o d |</controlfield>\n"
                            + "<controlfield tag=\"007\">cr -n---------</controlfield>\n"
                            + "<controlfield tag=\"008\">131022s2013 caua o 000 0 eng d</controlfield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"020\">\n"
                                + "<subfield code=\"a\">1-4493-4535-2</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"020\">\n"
                                + "<subfield code=\"a\">1-4493-4533-6</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"020\">\n"
                                + "<subfield code=\"a\">1-4493-4537-9</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(CKB)3460000000129323</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(EBL)1443861</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(SSID)ssj0001097128</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(PQKBManifestationID)11604250</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(PQKBTitleCode)TC0001097128</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(PQKBWorkID)11029746</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(PQKB)11688355</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(MiAaPQ)EBC1443861</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(CaSebORM)9781449345365</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"035\">\n"
                                + "<subfield code=\"a\">(EXLCZ)993460000000129323</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"040\">\n"
                                + "<subfield code=\"a\">MiAaPQ</subfield>\n"
                                + "<subfield code=\"b\">eng</subfield>\n"
                                + "<subfield code=\"e\">rda</subfield>\n"
                                + "<subfield code=\"e\">pn</subfield>\n"
                                + "<subfield code=\"c\">MiAaPQ</subfield>\n"
                                + "<subfield code=\"d\">MiAaPQ</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"041\">\n"
                                + "<subfield code=\"a\">eng</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\"4\" tag=\"050\">\n"
                                + "<subfield code=\"a\">TK7895.E42</subfield>\n"
                                + "<subfield code=\"b\">R43 2013</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\"0\" tag=\"082\">\n"
                                + "<subfield code=\"a\">004.16</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"090\">\n"
                                + "<subfield code=\"a\">QA76.774.L46</subfield>\n"
                                + "<subfield code=\"b\">R534 2013</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"1\" ind2=\" \" tag=\"100\">\n"
                                + "<subfield code=\"a\">Richardson, Matt.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"1\" ind2=\"0\" tag=\"245\">\n"
                                + "<subfield code=\"a\">Getting started with BeagleBone /</subfield>\n"
                                + "<subfield code=\"c\">Matt Richardson.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"250\">\n"
                                + "<subfield code=\"a\">1st edition</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\"1\" tag=\"264\">\n"
                                + "<subfield code=\"a\">Sebastopol, California :</subfield>\n"
                                + "<subfield code=\"b\">Maker Media,</subfield>\n"
                                + "<subfield code=\"c\">2013.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"300\">\n"
                                + "<subfield code=\"a\">1 online resource (143 p.)</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"336\">\n"
                                + "<subfield code=\"a\">text</subfield>\n"
                                + "<subfield code=\"b\">txt</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"337\">\n"
                                + "<subfield code=\"a\">computer</subfield>\n"
                                + "<subfield code=\"b\">c</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"338\">\n"
                                + "<subfield code=\"a\">online resource</subfield>\n"
                                + "<subfield code=\"b\">cr</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"347\">\n"
                                + "<subfield code=\"a\">text file</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"520\">\n"
                                + "<subfield code=\"a\">Many people think of Linux as a computer operating system, running on users' desktops and powering servers. But Linux can also be found inside many consumer electronics devices. Whether they're the brains of a cell phone, cable box, or exercise bike, embedded Linux systems blur the distinction between computer and device. Many makers love microcontroller platforms such as Arduino, but as the complexity increases in their projects, they need more power for applications, such as computer vision. The BeagleBone is an embedded Linux board for makers. It's got built-in networking, many inputs an</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"546\">\n"
                                + "<subfield code=\"a\">English</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"500\">\n"
                                + "<subfield code=\"a\">At head of title on cover: Make: the magazine for makers.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"588\">\n"
                                + "<subfield code=\"a\">Description based on print version record.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\"0\" tag=\"630\">\n"
                                + "<subfield code=\"a\">Linux.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\"0\" tag=\"650\">\n"
                                + "<subfield code=\"a\">Embedded computer systems.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\"0\" tag=\"650\">\n"
                                + "<subfield code=\"a\">Electronics</subfield>\n"
                                + "<subfield code=\"v\">Amateurs' manuals.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\"0\" tag=\"650\">\n"
                                + "<subfield code=\"a\">Python (Computer program language)</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\"0\" tag=\"650\">\n"
                                + "<subfield code=\"a\">JavaScript (Computer program language)</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\"4\" tag=\"655\">\n"
                                + "<subfield code=\"a\">Electronic books.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\" \" tag=\"730\">\n"
                                + "<subfield code=\"a\">Make.magazine.</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"776\">\n"
                                + "<subfield code=\"z\">1-322-19104-2</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"776\">\n"
                                + "<subfield code=\"z\">1-4493-4536-0</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n"
                                + "<subfield code=\"a\">47BIBSYS_UBO</subfield>\n"
                                + "<subfield code=\"6\">999920116883702204</subfield>\n"
                                + "<subfield code=\"9\">E</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n"
                                + "<subfield code=\"a\">47BIBSYS_HIT</subfield>\n"
                                + "<subfield code=\"6\">999919788008602210</subfield>\n"
                                + "<subfield code=\"9\">E</subfield>\n"
                            + "</datafield>\n"
                            + "<datafield ind1=\" \" ind2=\" \" tag=\"906\">\n"
                                + "<subfield code=\"a\">BOOK</subfield>\n"
                            + "</datafield>\n"
                        + "</record>\n"
                    + "</recordData>\n"
                    + "<recordIdentifier>999919992512402201</recordIdentifier>\n"
                    + "<recordPosition>2</recordPosition>\n"
                + "</record>\n"
            + "</records>\n"
            + "<extraResponseData xmlns:xb=\"http://www.exlibris.com/repository/search/xmlbeans/\">\n"
            + "<xb:exact>true</xb:exact>\n"
            + "<xb:responseDate>2021-05-26T10:14:57+0200</xb:responseDate>\n"
            + "</extraResponseData>\n"
            + "</searchRetrieveResponse>";

    public static final String TEST_DATA_2 =
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
            "<searchRetrieveResponse xmlns=\"http://www.loc.gov/zing/srw/\">\n" +
            "  <version>1.2</version>\n" +
            "  <numberOfRecords>2</numberOfRecords>\n" +
            "  <records>\n" +
            "    <record>\n" +
            "      <recordSchema>marcxml</recordSchema>\n" +
            "      <recordPacking>xml</recordPacking>\n" +
            "      <recordData>\n" +
            "        <record xmlns=\"http://www.loc.gov/MARC21/slim\">\n" +
            "          <leader>02692nam a22006733u 4500</leader>\n" +
            "          <controlfield tag=\"001\">999919902837102201</controlfield>\n" +
            "          <controlfield tag=\"005\">20170821193423.0</controlfield>\n" +
            "          <controlfield tag=\"006\">m        d</controlfield>\n" +
            "          <controlfield tag=\"007\">cr -n---------</controlfield>\n" +
            "          <controlfield tag=\"008\">140519s2003|||||||     s|||||||||||eng|d</controlfield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">1-107-12642-8</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">0-521-02105-7</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">9786610414512</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">0-511-30641-5</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">0-511-06746-1</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">1-280-41451-0</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">0-511-20338-1</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">0-511-17943-X</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">0-511-54265-8</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(CKB)1000000000107042</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(EBL)217846</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(OCoLC)57254230</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(SSID)ssj0000112040</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(PQKBManifestationID)11133967</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(PQKBTitleCode)TC0000112040</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(PQKBWorkID)10085778</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(PQKB)11298111</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(UkCbUP)CR9780511542657</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(EXLCZ)991000000000107042</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"040\">\n" +
            "            <subfield code=\"a\">AU-PeEL</subfield>\n" +
            "            <subfield code=\"b\">eng</subfield>\n" +
            "            <subfield code=\"c\">AU-PeEL</subfield>\n" +
            "            <subfield code=\"d\">AU-PeEL</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"041\">\n" +
            "            <subfield code=\"a\">eng</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"4\" tag=\"050\">\n" +
            "            <subfield code=\"a\">SB363 .J33 2003</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"0\" tag=\"082\">\n" +
            "            <subfield code=\"a\">634</subfield>\n" +
            "            <subfield code=\"a\">634.11</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"1\" ind2=\" \" tag=\"100\">\n" +
            "            <subfield code=\"a\">Jackson, John E.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"1\" ind2=\"4\" tag=\"245\">\n" +
            "            <subfield code=\"a\">The Biology of Apples and Pears</subfield>\n" +
            "            <subfield code=\"h\">[electronic resource].</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"1\" tag=\"264\">\n" +
            "            <subfield code=\"a\">Cambridge :</subfield>\n" +
            "            <subfield code=\"b\">Cambridge University Press,</subfield>\n" +
            "            <subfield code=\"c\">2003.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"300\">\n" +
            "            <subfield code=\"a\">1 online resource (502 p.)</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"336\">\n" +
            "            <subfield code=\"a\">text</subfield>\n" +
            "            <subfield code=\"b\">txt</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"337\">\n" +
            "            <subfield code=\"a\">computer</subfield>\n" +
            "            <subfield code=\"b\">c</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"338\">\n" +
            "            <subfield code=\"a\">online resource</subfield>\n" +
            "            <subfield code=\"b\">cr</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"1\" ind2=\" \" tag=\"490\">\n" +
            "            <subfield code=\"a\">The Biology of Horticultural Crops</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"500\">\n" +
            "            <subfield code=\"a\">Description based upon print version of record.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\" \" tag=\"505\">\n" +
            "            <subfield code=\"a\">Cover; Half-title; Series-title; Title; Copyright; Contents; Preface; Acknowledgements; Introduction; 1 The growing of apples and pears; 2 Apples and pears and their relatives; 3 Apple and pear root systems: induction, development, structure and function; 4 The graft union, grafting and budding; 5 Mechanisms of rootstock and interstock effects on scion vigour; 6 The shoot system; 7 Leaves, canopies and light interception; 8 Photosynthesis, respiration, and carbohydrate transport, partitioning and storage; 9 Flowers and fruits; 10 Eating quality and its retention; 11 Mineral nutrition</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"8\" ind2=\" \" tag=\"505\">\n" +
            "            <subfield code=\"a\">12 Water relations13 Diseases, pests, and resistance to these; 14 Biotechnology of apples and pears; Cultivar Index; General Index</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"520\">\n" +
            "            <subfield code=\"a\">A comprehensive, up-to-date reference book on the biology of apples and pears.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"546\">\n" +
            "            <subfield code=\"a\">English</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"4\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Apples.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"4\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Fruits.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"4\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Pear.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"0\" tag=\"655\">\n" +
            "            <subfield code=\"a\">Electronic books.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"0\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Apples</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"0\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Pear</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Agriculture</subfield>\n" +
            "            <subfield code=\"2\">HILCC</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Earth &amp; Environmental Sciences</subfield>\n" +
            "            <subfield code=\"2\">HILCC</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Plant Sciences</subfield>\n" +
            "            <subfield code=\"2\">HILCC</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"776\">\n" +
            "            <subfield code=\"z\">0-521-38018-9</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"776\">\n" +
            "            <subfield code=\"z\">0-511-06533-7</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"4\" tag=\"830\">\n" +
            "            <subfield code=\"a\">The Biology of Horticultural Crops</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_UBA</subfield>\n" +
            "            <subfield code=\"6\">999919970005302209</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_UBO</subfield>\n" +
            "            <subfield code=\"6\">999920236918102204</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_HIOA</subfield>\n" +
            "            <subfield code=\"6\">999919971163302212</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_MF</subfield>\n" +
            "            <subfield code=\"6\">999919706753002227</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_NLA</subfield>\n" +
            "            <subfield code=\"6\">999919727248202228</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_NMH</subfield>\n" +
            "            <subfield code=\"6\">999919695307902309</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_UBTO</subfield>\n" +
            "            <subfield code=\"6\">999920132591502205</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_NMBU</subfield>\n" +
            "            <subfield code=\"6\">999919755085202213</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_HIB</subfield>\n" +
            "            <subfield code=\"6\">999920113318202221</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_FHS</subfield>\n" +
            "            <subfield code=\"6\">999919765930002275</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_DIAKON</subfield>\n" +
            "            <subfield code=\"6\">999919690750902247</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_NTNU_UB</subfield>\n" +
            "            <subfield code=\"6\">999919929956002203</subfield>\n" +
            "            <subfield code=\"9\">E</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"906\">\n" +
            "            <subfield code=\"a\">BOOK</subfield>\n" +
            "          </datafield>\n" +
            "        </record>\n" +
            "      </recordData>\n" +
            "      <recordIdentifier>999919902837102201</recordIdentifier>\n" +
            "      <recordPosition>1</recordPosition>\n" +
            "    </record>\n" +
            "    <record>\n" +
            "      <recordSchema>marcxml</recordSchema>\n" +
            "      <recordPacking>xml</recordPacking>\n" +
            "      <recordData>\n" +
            "        <record xmlns=\"http://www.loc.gov/MARC21/slim\">\n" +
            "          <leader>01307cam a2200313 c 4500</leader>\n" +
            "          <controlfield tag=\"001\">990518261864702201</controlfield>\n" +
            "          <controlfield tag=\"005\">20171205184805.0</controlfield>\n" +
            "          <controlfield tag=\"007\">ta</controlfield>\n" +
            "          <controlfield tag=\"008\">051122s2005    xx#|||||||||||000|u|eng|d</controlfield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"020\">\n" +
            "            <subfield code=\"a\">0521021057</subfield>\n" +
            "            <subfield code=\"q\">h.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">051826186-47bibsys_network</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "            <subfield code=\"a\">(NO-TrBIB)051826186</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"040\">\n" +
            "            <subfield code=\"a\">NO-TrBIB</subfield>\n" +
            "            <subfield code=\"b\">nob</subfield>\n" +
            "            <subfield code=\"e\">katreg</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"080\">\n" +
            "            <subfield code=\"a\">581.47</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"080\">\n" +
            "            <subfield code=\"a\">634.1/.8</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"1\" ind2=\" \" tag=\"100\">\n" +
            "            <subfield code=\"a\">Jackson, John E.</subfield>\n" +
            "            <subfield code=\"0\">(NO-TrBIB)90132168</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"1\" ind2=\"0\" tag=\"245\">\n" +
            "            <subfield code=\"a\">The biology of apples and pears</subfield>\n" +
            "            <subfield code=\"c\">John E. Jackson</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"260\">\n" +
            "            <subfield code=\"a\">London</subfield>\n" +
            "            <subfield code=\"b\">Cambridge University Press</subfield>\n" +
            "            <subfield code=\"c\">2005</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"300\">\n" +
            "            <subfield code=\"a\">xii, 488 s.</subfield>\n" +
            "            <subfield code=\"b\">ill.</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Frukter</subfield>\n" +
            "            <subfield code=\"2\">noubomn</subfield>\n" +
            "            <subfield code=\"0\">(NO-TrBIB)REAL001208</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Epler</subfield>\n" +
            "            <subfield code=\"2\">noubomn</subfield>\n" +
            "            <subfield code=\"0\">(NO-TrBIB)REAL004661</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\"7\" tag=\"650\">\n" +
            "            <subfield code=\"a\">Pærer</subfield>\n" +
            "            <subfield code=\"2\">noubomn</subfield>\n" +
            "            <subfield code=\"0\">(NO-TrBIB)REAL000098</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"653\">\n" +
            "            <subfield code=\"a\">epler</subfield>\n" +
            "            <subfield code=\"a\">pærer</subfield>\n" +
            "            <subfield code=\"a\">biologi</subfield>\n" +
            "            <subfield code=\"a\">pomologi</subfield>\n" +
            "            <subfield code=\"a\">frukt</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\" \" tag=\"776\">\n" +
            "            <subfield code=\"t\">Biology of apples and pears</subfield>\n" +
            "            <subfield code=\"w\">991237738814702201</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"4\" ind2=\"2\" tag=\"856\">\n" +
            "            <subfield code=\"3\">Beskrivelse fra forlaget (kort)</subfield>\n" +
            "            <subfield code=\"u\">http://content.bibsys.no/content/?type=descr_publ_brief&amp;isbn=0521021057</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"4\" ind2=\"2\" tag=\"856\">\n" +
            "            <subfield code=\"3\">Beskrivelse fra forlaget (lang)</subfield>\n" +
            "            <subfield code=\"u\">http://content.bibsys.no/content/?type=descr_publ_full&amp;isbn=0521021057</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"4\" ind2=\"2\" tag=\"856\">\n" +
            "            <subfield code=\"3\">Innholdsfortegnelse</subfield>\n" +
            "            <subfield code=\"u\">http://content.bibsys.no/content/?type=toc&amp;isbn=0521021057</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"4\" ind2=\"2\" tag=\"856\">\n" +
            "            <subfield code=\"3\">Omslagsbilde</subfield>\n" +
            "            <subfield code=\"u\">http://innhold.bibsys.no/bilde/forside/?size=mini&amp;id=0521021057.JPG</subfield>\n" +
            "            <subfield code=\"q\">image/jpeg</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\"0\" ind2=\"1\" tag=\"852\">\n" +
            "            <subfield code=\"a\">47BIBSYS_UBO</subfield>\n" +
            "            <subfield code=\"6\">990518261864702204</subfield>\n" +
            "            <subfield code=\"9\">P</subfield>\n" +
            "          </datafield>\n" +
            "          <datafield ind1=\" \" ind2=\" \" tag=\"901\">\n" +
            "            <subfield code=\"a\">80</subfield>\n" +
            "          </datafield>\n" +
            "        </record>\n" +
            "      </recordData>\n" +
            "      <recordIdentifier>990518261864702201</recordIdentifier>\n" +
            "      <recordPosition>2</recordPosition>\n" +
            "    </record>\n" +
            "  </records>\n" +
            "  <extraResponseData xmlns:xb=\"http://www.exlibris.com/repository/search/xmlbeans/\">\n" +
            "    <xb:exact>true</xb:exact>\n" +
            "    <xb:responseDate>2021-05-28T11:07:10+0200</xb:responseDate>\n" +
            "  </extraResponseData>\n" +
            "</searchRetrieveResponse>";

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
