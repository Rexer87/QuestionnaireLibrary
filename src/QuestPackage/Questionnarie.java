package QuestPackage;

import java.util.List;

/**
 *
 * @author Rexer
 */
public class Questionnarie {

    // <editor-fold desc="Propiedades" defaultstate="collapsed">
    private int id;
    private String name;
    private String desc;
    private int totalScore;
    private List<Question> questionList;
    // </editor-fold>

    // <editor-fold desc="Encapsulados" defaultstate="collapsed">
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the totalScore
     */
    public int getTotalScore() {
        return totalScore;
    }

    /**
     * @param totalScore the totalScore to set
     */
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * @return the questionList
     */
    public List<Question> getQuestionList() {
        return questionList;
    }

    /**
     * @param questionList the questionList to set
     */
    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
    // </editor-fold>

    // <editor-fold desc="Constructores" defaultstate="collapsed">
    // </editor-fold>
    
    // <editor-fold desc="Métodos" defaultstate="collapsed">
    // </editor-fold>
}
