package Student_Manage;

//ѧ����½��Ľ���
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;/*ArrayList;
import java.util.Hashtable;
*/
public  class StudentLogin extends JFrame implements  ActionListener{
	
	Function fun=new Function();		
	//������� 
	JLabel lb1=new JLabel("��ǰ��ѧ����¼����" );//JLabel ���������ʾ�ı���ͼ��
	//JLabel lb2=new JLabel("��ʾ��¼��ǰ��������ѧ�ţ��޸ġ�ɾ������ѧ���޸���Ϣ");
    JTextField ѧ����,����,ѧԺ,������ϵ��ʽ,�־�ס��,�Ǽ�����;//����ѧ��������Ϣ���ı�
    JRadioButton ��,��,��,��;//������ѡ������Ա�ѡ��
    ButtonGroup group1=null;//������ť��
    ButtonGroup group2=null;
    JButton ¼��,��ѯ,ɾ��,�޸�,��ʾ,����;//������Ӧ�Ĳ����İ�ť
    JPanel p1,p2,p3,p4,p5,p6,p7,p8,pv,ph,pb;//���ڲ��ֵ�ͨ��
    
    student_information stu=new student_information();
    ArrayList<student_information> arry=new ArrayList<>();
    
    public StudentLogin(){       //�������Ա��¼��������
        super("ѧ����Ϣ����ϵͳ");
        ѧ����=new JTextField(15);//�����ı���Ϣ�ĵĶ���
        ����=new JTextField(15);
        ������ϵ��ʽ=new JTextField(15);
        ѧԺ=new JTextField(15);
        �־�ס��=new JTextField(15);
        �Ǽ�����=new JTextField(15);
        
        group1=new ButtonGroup();
        ��=new JRadioButton("��");//��ʼ����ѡ��,
        ��=new JRadioButton("��");
        group1.add(��);//�Ѱ�ť��ӵ���ť��
        group1.add(��);
        
        group2=new ButtonGroup();
        ��=new JRadioButton("��");//��ʼ����ѡ��,
        ��=new JRadioButton("��");
        group2.add(��);//�Ѱ�ť��ӵ���ť��
        group2.add(��);
        
        ¼��=new JButton("����ѧ����Ϣ");//������ť����
        //��ѯ=new JButton("��ѯĳ��ѧ����Ϣ");
        //ɾ��=new JButton("ɾ��ѧ����Ϣ");
       // �޸�.setEnabled(false);   //�����޸Ŀؼ�������
        //�޸�=new JButton("�޸�ѧ����Ϣ"); 
        //��ʾ=new JButton("��ʾȫ��ѧ����Ϣ");
        ����=new JButton("���ص�¼����");
    
        pb=new JPanel();
        pb.add(lb1,JLabel.CENTER);
                
        p1=new JPanel();//����һ�����     
        //p1.setLayout(new GridLayout(3,0));
       // p1.add(lb2,JLabel.CENTER);
        p1.add(new JLabel("ѧ��:",JLabel.CENTER));//JLabel.CENTER��ָJLabel�����ĵ㡣CENTER�����ĵ������
        p1.add(ѧ����);
        
        p2=new JPanel();
        p2.add(new JLabel("����:",JLabel.CENTER));
        p2.add(����);
        
        p3=new JPanel();
        p3.add(new JLabel("ѧԺ:",JLabel.CENTER));
        p3.add(ѧԺ);
        
        p4=new JPanel();
        p4.add(new JLabel("������ϵ��ʽ:",JLabel.CENTER));
        p4.add(������ϵ��ʽ);    
        
        p5=new JPanel();
        p5.add(new JLabel("�־�ס��:",JLabel.CENTER));
        p5.add(�־�ס��);
        
        p6=new JPanel();
        p6.add(new JLabel("�Ǽ�����:",JLabel.CENTER));
        p6.add(�Ǽ�����);
        
        p7=new JPanel();
        p7.add(new JLabel("�Ƿ�ȷ��:",JLabel.CENTER));
        p7.add(��);
        p7.add(��);
       
        p8=new JPanel();
        p8.add(new JLabel("�Ƿ��뻼�������ܽӴ�:",JLabel.CENTER));
        p8.add(��);
        p8.add(��);
        
        pv=new JPanel();//���
        pv.setLayout(new GridLayout(7,1));   //��pv������óɵ�����1�е����񲼾�
            
        pv.add(p1);//�����ŵ�������,add()��������
        pv.add(p2);
        pv.add(p3);
        pv.add(p4);
        pv.add(p5);
        pv.add(p6);
        pv.add(p7);
        pv.add(p8);
               
        ph=new JPanel();      
        ph.add(¼��);
       // ph.add(��ѯ);
       // ph.add(�޸�);
       // ph.add(ɾ��);    
       //  ph.add(��ʾ);
        ph.add(����);
               
        Container con=getContentPane();//������������con,ȡ���������
        con.setLayout(new BorderLayout());//���ò���Ϊ�߿򲼾֣��߿򲼾ֶַ���������5����λ����ӿؼ���
        //��û��ָ����λ������ӵ��м䣬�������Ҷ�������չ
        con.add(pb, BorderLayout.NORTH);//Frame����lb���÷���add����,lb������Ϸ�     
        con.add(pv, BorderLayout.CENTER);//pv���м�
        con.add(ph, BorderLayout.SOUTH);//ph���ϱ�
        setDefaultCloseOperation(EXIT_ON_CLOSE);//��һ��Ĭ�ϵĹرղ�����Ҳ�������JFrame���ڵĹرհ�ť�������ʱ���˳�����
        setBounds(100,100,900,450);//setBounds(x,y,width,height); x:���������X���ϵ���� y:���������Y���ϵ���� width:����ĳ��� height:����ĸ߶�
        setVisible(true);//Ŀ����ʹ�ؼ�������ʾ����,����ÿؼ��Ѿ�����ʾ����
          
        //��Ӽ���        
       //��ʾȫ��ѧ����Ϣ
        ¼��.addActionListener(new ActionListener() {
       	   public void actionPerformed(ActionEvent e) {		     		     
       		 String sID = ѧ����.getText();    //��ȡ�ı���������
       		 if(fun.find(sID)!=-1)
       		 {
       			 JOptionPane.showMessageDialog(null, "��ѧ/���Ŷ�Ӧ��ѧ���Ѿ����ڣ�����\n\n��������������޸��Ѿ�¼�����Ϣ");   			 
       			  //����ı���
       			 ѧ����.setText("");
       			 ����.setText("");
       			 ѧԺ.setText("");
       			 ������ϵ��ʽ.setText("");
       			 �־�ס��.setText("");
       			 �Ǽ�����.setText("");
       			 return;
       		 }      		 
       		 String sname = ����.getText();  		 
       		 //���ж�ѧ�ź������Ƿ�Ϊ�գ����Ϊ�գ�ֱ���˳�
       		 if(sID.equals("")||sname.equals(""))
       		 {
       			 JOptionPane.showMessageDialog(null, "¼���ѧ��ѧ�Ż�����Ϊ�գ�����\n\n����������");
       			 return;
       		 }  	   		 	 
         		 String scollege = ѧԺ.getText();     		 
         		 if(scollege.equals(""))//����Ϊ�գ�û������
      			    scollege="--";  		 
         		 String scall = ������ϵ��ʽ.getText();
         		 if(scall.equals(""))
        			  scall="--";
         		 String shome = �־�ס��.getText();
         		if(shome.equals(""))
         		    shome="--";
         		 String stime = �Ǽ�����.getText();
         		if(stime.equals(""))
         		   stime="--";
         		
         		String sinfo1=null;
                 if(��.isSelected()){//ѡ���Ƿ��뻼���нӴ�
                    sinfo1=��.getText();
                 }
                 else{
                     sinfo1=��.getText();
                 } 

       		 //String sinfo2=null;
              //if(��.isSelected()){//ѡ���Ƿ����人
               //  sinfo2=��.getText();
              //}
              //else{
                  //sinfo2=��.getText();
              //}   
              
              String sinfo2=null;
              if(��.isSelected()){//ѡ���Ƿ��뻼���нӴ�
                 sinfo2=��.getText();
              }
              else{
                  sinfo2=��.getText();
              } 
              
              //String sinfo4=null;
              //if(��.isSelected()){//ѡ���Ƿ�У
                // sinfo4=��.getText();
             // }
             // else{
             //     sinfo4=��.getText();
             // } 
         		 stu.setStuID(sID);
         		 stu.setName(sname);
         		 stu.setAge(scollege);
         		 stu.setCallnummber(scall);
         		 stu.setHome_place(shome);
         		 stu.setIdentityID(stime);
         		 stu.setInfo1(sinfo1);
         		 //stu.setInfo2(sinfo2);
         		 stu.setInfo2(sinfo2);
         		 //stu.setInfo4(sinfo4);
         		 
         		 //arry.clear();//	���ԭ�����б��е�����	
         		// Input input=new Input(stu);
         		 System.out.println("��Ϣ����Ա");
         		 System.out.println(stu.fileString());
         		 
         		 fun.add(stu);
         		 fun.writefile();
         		 
         		 JOptionPane.showMessageDialog(null, "¼��ɹ�������");
         		 //dispose();
         		 setVisible(false); 
         		 new ManagerLogin();
         		 
         		  //����ı���
         		 /*
     			ѧ��.setText("");
     			����.setText("");
     			����.setText("");
     			�绰����.setText("");
     		    ��ͥסַ.setText("");
     			���֤����.setText("");
     			group.clearSelection();   //��հ�ť��ѡ״̬
     			*/
       	   }   	   
          });
         /** ��ʾ.addActionListener(new ActionListener() {
     	   public void actionPerformed(ActionEvent e) {     		   
     		  new show_stuall();   	
     		   
     	    }	     		   
          });**/
          
          //��ѯĳ��ѧ����Ϣ           	
       /**      ��ѯ.addActionListener(new ActionListener() {
                   	   public void actionPerformed(ActionEvent e) {      		  
                   		   String sID = ѧ����.getText();    //��ȡ�ı��������� 
                   		   if(sID.equals(""))
                   		     sID="--";       		   
                     		  String sname = ����.getText();  		 
                     		  if(sname.equals(""))
                   			   sname="--";      		 	 
                       	  String scollege = ѧԺ.getText();     		 
                       	  if(scollege.equals(""))             //����Ϊ�գ�û������
                    			    scollege="--";  		 
                       	  String scall = ������ϵ��ʽ.getText();
                       	 if(scall.equals(""))
                       			  scall="--";
                       		 String shome = �־�ס��.getText();
                       		if(shome.equals(""))
                       		    shome="--";
                       		 String stime = �Ǽ�����.getText();
                       		if(stime.equals(""))
                       		   stime="--";
                       		 String sinfo1=null;
                              if(��.isSelected()){//ѡ���Ƿ���
                                 sinfo1=��.getText();
                              }
                              else {
                           	    if(��.isSelected())
                                    sinfo1=��.getText();
                                  else {
             						  sinfo1="--";
             					   }
                              }
                       		 String sinfo2=null;
                              if(��.isSelected()){//ѡ���Ƿ����人
                                 sinfo2=��.getText();
                              }
                              else {
                           	    if(��.isSelected())
                                    sinfo2=��.getText();
                                  else {
             						  sinfo2="--";
             					   }
                              }          		    
                              
                       		 //String sinfo3=null;
                             // if(��.isSelected()){//ѡ���뻼�߽Ӵ�
                               //  sinfo3=��.getText();
                            //  }
                             // else {
                           	    //if(��.isSelected())
                                  //  sinfo3=��.getText();
                                 // else {
             						//  sinfo3="--";
             					  // }
                            //  }
                       		// String sinfo4=null;
                             // if(��.isSelected()){//ѡ���Ƿ�У
                            //     sinfo4=��.getText();
                             // }
                              //else {
                           	    //if(��.isSelected())
                                  //  sinfo4=��.getText();
                                //  else {
             					//	  sinfo4="--";
             					 //  }
                             // }          		             
          	 		 //��Ҫ��ѯ�ķ���������д���ļ�
          	 		FileWriter fw=null;
      				BufferedWriter out=null;  //ѧ��","����","�Ա�","����","�绰����","��ͥסַ","���֤����" };
      				try {
      					 fw = new FileWriter("��ѯʱ��ʱ��ŵ��ļ�.txt");
      					 out = new BufferedWriter(fw);
      					 //����ѧ�ŵ��м��һ���ո�
      					out.write(sID+"  ");
     					 out.write(sname+"  ");
     					 out.write(scollege+"  "); 					   					 
     					 out.write(scall+"  ");
     					 out.write(shome+"  ");
     					 out.write(stime+"  "); 
     					out.write(sinfo1+"  ");
     					out.write(sinfo2+"  ");
     				//	out.write(sinfo3+"  ");
     				//	out.write(sinfo4+"  ");//ÿ�θ���д�룬����ȫ������
     				   					 
     					out.close();
     					fw.close();
     							
      				} catch (IOException e1) {
      					e1.printStackTrace();
      					
      				}     				
      				//��ʼ��ѯ
      				new showones();  
      				
      				//����ı���
      				ѧ����.setText("");
      				����.setText("");
      				ѧԺ.setText("");
      				������ϵ��ʽ.setText("");
      			    �־�ס��.setText("");
      				�Ǽ�����.setText("");
      				group1.clearSelection();
      				group2.clearSelection();
      				
          	    }	     		   
               }); 	  **/ 

    ����.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setVisible(false);      //Ŀ����ʹ�ؼ���������ʾ����
			new Login();
		}
	});
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
