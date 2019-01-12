package exercise.learning.ReactorExercise.model;

/**
 * Model representation of a Comic Object.
 * As of verison 0.1 a Title, SubTitle and Year should be enough to identify each record.
 *
 * @author Leigh Edwards
 */
public class Comic {

    private String comicId;
    private String title;
    private String subTitle;
    private String year;

    /**
     * Title only constructor
     *
     * @param title the title to set
     */
    public Comic(String title) {
        this.title = title;
    }

    /**
     * An all-fields constructor
     *
     * @param comicId the comicId to set
     * @param title the title to set
     * @param subTitle the subTitle to set
     * @param year the year to set
     */
    public Comic(String comicId, String title, String subTitle, String year) {
        this.comicId = comicId;
        this.title = title;
        this.subTitle = subTitle;
        this.year = year;
    }

    /**
     * @return a comicId
     */
    public String getComicId() {
        return comicId;
    }

    /**
     * @param comicId the comicId to set
     */
    public void setComicId(String comicId) {
        this.comicId = comicId;
    }

    /**
     * @return a title
     */
    public String getTitle() {
        return title;
    }

    /**
      * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return a subTitle
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * @param subTitle the subTitle to set
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * @return a publishing year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the publishing year to set
     */
    public void setYear(String year) {
        this.year = year;
    }
}
