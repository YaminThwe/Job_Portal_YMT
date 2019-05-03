package tuhmawbi.jobportal_ymt.VOs;

import com.google.gson.annotations.SerializedName;

public class JobNewsVO {


    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("category")
    private String category;
    @SerializedName("logo")
    private String logo;
    @SerializedName("description")
    private String description;
    @SerializedName("location")
    private String location;
    @SerializedName("salary")
    private String salary;
    @SerializedName("webLink")
    private String webLink;
    @SerializedName("phNo")
    private String phoneno;
    @SerializedName("importantNote")
    private String importantNote;
    @SerializedName("type")
    private String type;
    @SerializedName("benefits")
    private String benefits;
    @SerializedName("highlights")
    private String highlights;
    @SerializedName("opportunities")
    private String opportunities;
    @SerializedName("companyName")
    private String companyName;
    @SerializedName("interest")
    private String interest;
    @SerializedName("apply")
    private String apply;
    @SerializedName("save")
    private String save;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getImportantNote() {
        return importantNote;
    }

    public void setImportantNote(String importantNote) {
        this.importantNote = importantNote;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public String getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(String opportunities) {
        this.opportunities = opportunities;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public JobNewsVO(String id, String title, String category, String logo, String description, String location, String salary, String webLink, String phoneno, String importantNote, String type, String benefits, String highlights, String opportunities, String companyName, String interest, String apply, String save) {

        this.id = id;
        this.title = title;
        this.category = category;
        this.logo = logo;
        this.description = description;
        this.location = location;
        this.salary = salary;
        this.webLink = webLink;
        this.phoneno = phoneno;
        this.importantNote = importantNote;
        this.type = type;
        this.benefits = benefits;
        this.highlights = highlights;
        this.opportunities = opportunities;
        this.companyName = companyName;
        this.interest = interest;
        this.apply = apply;
        this.save = save;
    }

    public JobNewsVO() {

    }
}
