package no.unit.marc;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class LinePresentation {

    public static final String LDR = "ldr";
    public static final String EMPTY_STRING = "";
    public static final String BLANK = " ";
    public static final char STAR = '*';
    public static final String HASH = "#";
    public static final char DOLLAR = '$';

    private final transient Document doc;

    public LinePresentation(Document doc) {
        this.doc = doc;
    }

    protected String asLinePresentation() {
        StringBuilder lineFormat = new StringBuilder();
        if (doc != null) {
            NodeList leaderNodeList = doc.getElementsByTagName(Marc21Constants.LEADER);
            for (int i = 0; i < leaderNodeList.getLength(); i++) {
                Node item = leaderNodeList.item(i);
                String ldr = item.getFirstChild().getNodeValue();
                lineFormat.append(STAR).append(LDR).append(BLANK).append(ldr).append(System.lineSeparator());
            }
            NodeList controlfieldNodeList = doc.getElementsByTagName(Marc21Constants.CONTROLFIELD);
            for (int i = 0; i < controlfieldNodeList.getLength(); i++) {
                Node item = controlfieldNodeList.item(i);
                String controlfieldValue = item.getFirstChild().getNodeValue();
                String controlfieldTag = ((Element) item).getAttribute(Marc21Constants.TAG);
                lineFormat.append(STAR).append(controlfieldTag).append(BLANK).append(controlfieldValue)
                        .append(System.lineSeparator());
            }
            NodeList datafieldNodeList = doc.getElementsByTagName(Marc21Constants.DATAFIELD);
            for (int i = 0; i < datafieldNodeList.getLength(); i++) {
                Node item = datafieldNodeList.item(i);
                Element element = (Element) item;
                String datafieldInd1 = element.getAttribute(Marc21Constants.IND_1);
                String datafieldTag = element.getAttribute(Marc21Constants.TAG);
                lineFormat.append(STAR).append(datafieldTag);
                if (BLANK.equals(datafieldInd1)) {
                    datafieldInd1 = HASH;
                }
                if (datafieldInd1 != null) {
                    lineFormat.append(EMPTY_STRING).append(datafieldInd1);
                }
                String datafieldInd2 = element.getAttribute(Marc21Constants.IND_2);
                if (BLANK.equals(datafieldInd2)) {
                    datafieldInd2 = HASH;
                }
                if (datafieldInd2 != null) {
                    lineFormat.append(EMPTY_STRING).append(datafieldInd2);
                }
                NodeList subfieldNodes = element.getElementsByTagName(Marc21Constants.SUBFIELD);
                for (int j = 0; j < subfieldNodes.getLength(); j++) {
                    Element subfieldNode = (Element) subfieldNodes.item(j);
                    String codeTag = subfieldNode.getAttribute(Marc21Constants.CODE);
                    String subfieldText = subfieldNode.getTextContent();
                    lineFormat.append(BLANK).append(DOLLAR).append(codeTag).append(subfieldText);
                }
                lineFormat.append(System.lineSeparator());
            }
        }
        return lineFormat.toString().trim();
    }

    public String getPresentation() {
        return this.asLinePresentation();
    }
}
