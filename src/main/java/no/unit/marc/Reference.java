package no.unit.marc;

import com.google.gson.annotations.SerializedName;

public class Reference {

    @SerializedName("id")
    private String id;
    @SerializedName("mainTitle")
    private String mainTitle;
    @SerializedName("paralleltitle")
    private String paralleltitle;
    @SerializedName("statementOfResponsibility")
    private String statementOfResponsibility;
    @SerializedName("numberOfPartTitle")
    private String numberOfPartTitle;
    @SerializedName("author")
    private String author;
    @SerializedName("year")
    private String year;
    @SerializedName("isbn")
    private String isbn;
    @SerializedName("issn")
    private String issn;
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("xmlPresentation")
    private String xmlPresentation;
    @SerializedName("linePresentation")
    private String linePresentation ;

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getMainTitle() {
        return this.mainTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatementOfResponsibility() {
        return statementOfResponsibility;
    }

    public void setStatementOfResponsibility(String statementOfResponsibility) {
        this.statementOfResponsibility = statementOfResponsibility;
    }

    public String getNumberOfPartTitle() {
        return numberOfPartTitle;
    }

    public void setNumberOfPartTitle(String numberOfPartTitle) {
        this.numberOfPartTitle = numberOfPartTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getXmlPresentation() {
        return xmlPresentation;
    }

    public void setXmlPresentation(String xmlPresentation) {
        this.xmlPresentation = xmlPresentation;
    }

    public String getLinePresentation() {
        return linePresentation;
    }

    public void setLinePresentation(String linePresentation) {
        this.linePresentation = linePresentation;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setParalleltitle(String paralleltitle) {
        this.paralleltitle = paralleltitle;
    }

    public String getParalleltitle() {
        return paralleltitle;
    }

}