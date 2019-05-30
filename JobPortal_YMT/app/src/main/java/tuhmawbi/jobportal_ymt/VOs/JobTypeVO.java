package tuhmawbi.jobportal_ymt.VOs;

public class JobTypeVO {

    private String name;
    private int icons;

    public JobTypeVO(String name, int icons) {
        this.name = name;
        this.icons = icons;
    }

    public String getName() {
        return name;
    }

    public int getIcons() {
        return icons;
    }

}
