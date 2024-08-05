import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
public class QuestionWindow extends JFrame {
    private Question questions[];
    JLabel qLabel,op1Label,op2Label,op3Label,op4Label;
    JLabel timerLabel;
    int currentQuestionNo;
    public QuestionWindow()
    {
        setTitle("Questions");
        setSize(400,200);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        qLabel=new JLabel("");
        add(qLabel,BorderLayout.NORTH);


        JPanel optionsPanel=new JPanel(new GridLayout(2,2));
        op1Label=new JLabel();
        op2Label=new JLabel();
        op3Label=new JLabel();
        op4Label=new JLabel();
        optionsPanel.add(op1Label);
        optionsPanel.add(op2Label);
        optionsPanel.add(op3Label);
        optionsPanel.add(op4Label);
        add(optionsPanel,BorderLayout.CENTER);

        timerLabel=new JLabel();
        add(timerLabel,BorderLayout.SOUTH);
        
        questions=new Question[5];

        questions[0]=new Question("How many keywords C has?","10","42","78","32","d");
        questions[1]=new Question("Who develop C?","Dennis Retchie","Jamses Gosling","Ken thompson","Lee Martin","a");
        questions[2]=new Question("Capital of Bihar?","Gaya","Patna","Muzzafarpur","Bhagalpur","b");
        questions[3]=new Question("Holi Kab hai?","22 March","24 March","28 March","23 March","b");
        questions[4]=new Question("Who is the chief minister of Bihar?","Tejashvi yadav","Vijay Kumar Sinha","Nitish Kumar","Lalau Yadav","c");

        currentQuestionNo=0;
        showQuestion(currentQuestionNo);
        TimerThread td=new TimerThread();
        td.start();
        

    }
    private void showQuestion(int qn)
    {
    qLabel.setText("Q."+questions[qn].question);
    op1Label.setText("A. "+questions[qn].option1);
    op2Label.setText("B. "+questions[qn].option2);
    op3Label.setText("C. "+questions[qn].option3);
    op4Label.setText("D. "+questions[qn].option4);        
    }

    class TimerThread extends Thread
    {
        @Override
        public void run()
        {
            int time;
        do
        {

            time=15;
            //show time
            timerLabel.setText(time+"");
            do
            {
                try
                {
                    sleep(1000);
                }catch(Exception ex)
                {

                }
                time--;
                //show Time
                timerLabel.setText(time+"");
            }while(time>0);
            currentQuestionNo++;
            if(currentQuestionNo==5)
            {
                JOptionPane.showMessageDialog(QuestionWindow.this,"Exam Over");
                break;
            }
            showQuestion(currentQuestionNo);
        }while(true);
        }
    }
    
}

