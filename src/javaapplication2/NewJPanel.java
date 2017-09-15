/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

//import static javaapplication2.DerbyConnect1.achievements;


/**
 *
 * @author Admin
 */
public class NewJPanel extends javax.swing.JFrame {
  String content="Dear Sir/Madam,\n" +
"\n" +
"I am writing this reference at the request of XX YY, who is applying for a Master program in your university. I have known XX for four years as his scientific adviser and mentor.\n" +
"\n" +
"During this time XX, has showed himself as a promising young specialist and researcher. His major specialization in COURSE, but as an exception for academic achievements, XX was allowed by our faculty to write his projects and degree thesis in the field of Cryptography under Computer Security and Applied Algebra Department.\n" +
"\n" +
"As his mentor I have had an opportunity to observe the student's participation and overall progress. I would rate the student's overall performance as excellent, because he has got only excellent marks and has achieved marked results in different academic and student fields.\n" +
"\n" +
"XX showed immense working efficiency and competitive knowledge and skills in his chosen field by having successfully self-studied some of majors of another specialization.\n" +
"\n" +
"XX’s 3rd year joint project “About effective elliptic curve discrete logarithm problem solution” contained interesting ideas and solutions of problems arising in Galua field arithmetic. While publication of student works is an unusual matter and is exclusive, a revised variant of his work is now in process of publication in XXXX State Technical  University’s scientific journal. Alex is broad-minded and has interests in different areas of mathematics and computer science. He has an unusual thinking style and ability to combine methods and ideas from different disciplines.**\n" +
"\n" +
"This gained him success in ACM ICPC contests in our region and in international competitions, including 1rd and 2th places in ACM ICPC NEERC Western Subregional Contest in 2008 and 2007. XX YY is an initiative, hard-working and responsible student with high energy level. He is able to carry out big amount of work on his own and is always involved in some activity.**\n" +
"\n" +
"Right now XX is preparing for a student science conference in XXXXXX with his work as a speaker from our University and is working on his next project, that is directly connected cryptography and parallel- and supercomputing under my supervision. XX is actively involved in university’s life. He participates in various university volunteer arrangements and is a leader of a student study group, dedicated to programming and Microsoft technologies.**\n" +
"\n" +
"I evaluate XX as intelligent, dependable, dedicated person, who is ready to achieve his goals. I am positive, that XX would be a tremendous asset to your program and I highly recommend him to you without reservation. If you have any further questions with regard to her background or qualifications, please do not hesitate to contact me.\n" +
"\n" +
"Sincerely, \n" +
"Associate Professor Peter Johnson\n" +
"\n" +
"Thakur College Of Engineering \n" +
"Email address: xxxxx@gmail.com\n" +
"Phone number: 1 123 456 789";
    /**
     * Creates new form NewJPanel
     */
    public NewJPanel() {
        initComponents();
           String name = NewJFrame.framename;
         String surname= NewJFrame.framesurname;
         String branch=NewJFrame.framebranch1;
          //float pointer=NewJFrame2.avg_pointer;
          String strength= DerbyConnect1.strength_from_db;
         // String weakness=NewJFrame2.weakness;
          String achievements1=DerbyConnect1.achievement_from_db;
           String project=NewJFrame1.project;
           //...........................
          
           String where_we_met=NewJFrame1.where_we_met;
           String relationship=NewJFrame1.relationship;
           String teachername=NewJFrame1.teachername;
           String next_project=NewJFrame2.next_project;
           String email=NewJFrame1.email;
             String mobile=NewJFrame1.mobile;  
       content=content.replaceAll("scientific adviser and mentor",relationship);
              content=content.replaceAll("COURSE",branch);
              content=content.replaceAll("Cryptography under Computer Security and Applied Algebra Department",project);
              content=content.replaceAll("mentor",relationship);
             content=content.replaceAll("About effective elliptic curve discrete logarithm problem solution",project); 
       content=content.replaceAll("Associate Professor Peter Johnson",teachername);
       content=content.replaceAll("ACM ICPC contests in our region and in international competitions, including 1rd and 2th places in ACM ICPC NEERC Western Subregional Contest in 2008 and 2007",achievements1);
          content=content.replaceAll("student science conference in KKKKK with his work as a speaker from our University and is working on his next project, that is directly connected cryptography and parallel- and supercomputing under my supervision  ",next_project); 
        content=content.replaceAll("xxxxx@gmail.com",email);
         content=content.replaceAll("XX",name);
          content=content.replaceAll("1 123 456 789",mobile);
       content=content.replaceAll("YY",surname);
         jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
       jTextArea1.setText(content); 
       //..................................
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setTitle("Letter of recommandation");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
 

}
