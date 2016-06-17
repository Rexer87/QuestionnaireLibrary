package QuestPackage;

import java.util.List;

/**
 *
 * @author Rexer
 */
public class Question {

    // <editor-fold desc="Propiedades" defaultstate="collapsed">
    private int id;
    private String question;
    private int score;
    private List<Answer> correctAnswerList;
    private List<Integer> correctAnswerListNum;
    private List<Answer> wrongAnswerList;
    private List<Integer> wrongAnswerListNum;
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
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the correctAnswerList
     */
    public List<Answer> getCorrectAnswerList() {
        return correctAnswerList;
    }

    /**
     * @param correctAnswerList the correctAnswerList to set
     */
    public void setCorrectAnswerList(List<Answer> correctAnswerList) {
        this.correctAnswerList = correctAnswerList;
    }

    /**
     * @return the correctAnswerListNum
     */
    public List<Integer> getCorrectAnswerListNum() {
        return correctAnswerListNum;
    }

    /**
     * @param correctAnswerListNum the correctAnswerListNum to set
     */
    public void setCorrectAnswerListNum(List<Integer> correctAnswerListNum) {
        this.correctAnswerListNum = correctAnswerListNum;
    }

    /**
     * @return the wrongAnswerList
     */
    public List<Answer> getWrongAnswerList() {
        return wrongAnswerList;
    }

    /**
     * @param wrongAnswerList the wrongAnswerList to set
     */
    public void setWrongAnswerList(List<Answer> wrongAnswerList) {
        this.wrongAnswerList = wrongAnswerList;
    }

    /**
     * @return the wrongAnswerListNum
     */
    public List<Integer> getWrongAnswerListNum() {
        return wrongAnswerListNum;
    }

    /**
     * @param wrongAnswerListNum the wrongAnswerListNum to set
     */
    public void setWrongAnswerListNum(List<Integer> wrongAnswerListNum) {
        this.wrongAnswerListNum = wrongAnswerListNum;
    }

    // </editor-fold>
    
    // <editor-fold desc="Constructores" defaultstate="collapsed">
    // </editor-fold>
    
    // <editor-fold desc="Métodos" defaultstate="collapsed">
    // </editor-fold>
}
