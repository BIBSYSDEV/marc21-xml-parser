package no.unit.marc;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Reference {

    @SerializedName("id")
    private String id;
    @SerializedName("mainTitle")
    private String mainTitle;
    @SerializedName("parallelTitle")
    private String paralleltitle;
    @SerializedName("statementOfResponsibility")
    private String statementOfResponsibility;
    @SerializedName("numberOfPartTitle")
    private String numberOfPartTitle;
    @SerializedName("authors")
    private List<AuthorReference> authors;
    @SerializedName("year")
    private String year;
    @SerializedName("isbn")
    private List<String> isbn;
    @SerializedName("issn")
    private List<String> issn;
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("xmlPresentation")
    private String xmlPresentation;
    @SerializedName("linePresentation")
    private String linePresentation;

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

    public List<AuthorReference> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorReference> authors) {
        this.authors = authors;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public void addIsbn(String nextIsbn) {
        if(isbn == null){
            isbn = new ArrayList<>();
        }
        isbn.add(nextIsbn);
    }

    public List<String> getIssn() { return issn; }

    public void addIssn(String nextIssn) {
        if(issn == null){
            issn = new ArrayList<>();
        }
        issn.add(nextIssn);
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

    /**
     * Add an author to the list of authors.
     * @param author the author to add
     */
    public void addAuthor(AuthorReference author) {
        if (authors == null) {
            authors = new ArrayList<>();
        }
        authors.add(author);
    }

}