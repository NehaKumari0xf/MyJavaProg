public class Question
{
    public String question;
    public String option1;
    public String option2;
    public String option3;
    public String option4;
    public String ans;
    public String userans;
    public Question(String question,String op1,String op2,String op3,String op4,String ans)
    {
        this.question=question;
        option1=op1;
        option2=op2;
        option3=op3;
        option4=op4;
        this.ans=ans;
    }
}