package tuhmawbi.jobportal_ymt.VOs;

import com.google.gson.annotations.SerializedName;

public class JobNewsVO {

    @SerializedName("id")
    private String id;
    @SerializedName("auth_id")
    private String authId;
    @SerializedName("company_name")
    private String companyName;
    @SerializedName("job_title")
    private String jobTitle;
    @SerializedName("job_description")
    private String jobDescription;
    @SerializedName("experience")
    private String experience;
    @SerializedName("requirements")
    private String requirements;
    @SerializedName("salary")
    private String salary;
    @SerializedName("location")
    private String location;
    @SerializedName("benefits")
    private String benefits;
    @SerializedName("opportunities")
    private String opportunitiies;
    @SerializedName("category")
    private String category;
    @SerializedName("type")
    private String type;
    @SerializedName("male")
    private String male;
    @SerializedName("female")
    private String female;
    @SerializedName("employer_name")
    private String employerName;
    @SerializedName("employer_email")
    private String employerEmail;
    @SerializedName("employer_contact_no")
    private String employerContactNo;
    @SerializedName("image")
    private String image;

    public JobNewsVO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getOpportunitiies() {
        return opportunitiies;
    }

    public void setOpportunitiies(String opportunitiies) {
        this.opportunitiies = opportunitiies;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerEmail() {
        return employerEmail;
    }

    public void setEmployerEmail(String employerEmail) {
        this.employerEmail = employerEmail;
    }

    public String getEmployerContactNo() {
        return employerContactNo;
    }

    public void setEmployerContactNo(String employerContactNo) {
        this.employerContactNo = employerContactNo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public JobNewsVO(String id, String authId, String companyName, String jobTitle, String jobDescription, String experience, String requirements, String salary, String location, String benefits, String opportunitiies, String category, String type, String male, String female, String employerName, String employerEmail, String employerContactNo, String image) {
        this.id = id;
        this.authId = authId;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.experience = experience;
        this.requirements = requirements;
        this.salary = salary;
        this.location = location;
        this.benefits = benefits;
        this.opportunitiies = opportunitiies;
        this.category = category;
        this.type = type;
        this.male = male;
        this.female = female;
        this.employerName = employerName;
        this.employerEmail = employerEmail;
        this.employerContactNo = employerContactNo;
        this.image = image;
    }
}
