import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frame extends JFrame  implements ActionListener {

    JTextField text1;
    JTextField text2;
    JTextField text3;
    JTextField text4;
    JButton button1;
    JButton button2;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JTextArea textArea;
    JComboBox comboBox;
  String[] products = {"Smartphone ", "T-shirt", "OOP"};


    public frame() {

//        DefaultListModel<String> l1 = new DefaultListModel<>();
//        l1.addElement("Item1");
//        l1.addElement("Item2");
//        l1.addElement("Item3");
//        l1.addElement("Item4");
//        JList<String> list = new JList<>(l1);
//        list.setBounds(100,100, 75,75);
//        this.add(list);


        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        button1 = new JButton("OK");
        button2 = new JButton("Cancle");
        label1 = new JLabel("Enter your ID");
        label2 = new JLabel("Enter your name");
        label3 = new JLabel("Enter your address");
        label4 = new JLabel("How many products do you want to add to your cart ?");
        label5 = new JLabel("Welcome to Ecommerce system");
        textArea = new JTextArea();
       comboBox = new JComboBox(products);


        this.setTitle("Ecommerce system");
        this.setSize(500, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setLayout(null);
        this.setResizable(false);
        this.setLocation(700, 200);


        this.add(text1);
        this.add(text2);
        this.add(text3);
        this.add(text4);
        this.add(button1);
        this.add(button2);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(comboBox);
        this.add(textArea);
        button1.addActionListener(this);
        button2.addActionListener(this);
       comboBox.addActionListener(this);




        text1.setBounds(20, 60, 200, 20);
        text2.setBounds(20, 120, 200, 20);
        text3.setBounds(20, 180, 200, 20);
        text4.setBounds(20, 240, 200, 20);
        button1.setBounds(130, 350, 70, 30);
        button2.setBounds(270, 350, 100, 30);
        label1.setBounds(20, 30, 200, 20);
        label2.setBounds(20, 90, 200, 20);
        label3.setBounds(20, 150, 200, 20);
        label4.setBounds(20, 210, 400, 20);
        label5.setBounds(150, 5, 200, 30);
        textArea.setBounds(20,390,440,250);
        comboBox.setBounds(40, 280, 100, 25);


    }

    String id, name, address, nproducts;
    int n;
    double totalPrice=0;


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            id = text1.getText().toString();
            name = text2.getText().toString();
            address = text3.getText().toString();
            nproducts = text4.getText();
            n =Integer.parseInt(nproducts);
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            textArea.setText( "Here is your order's summary :\n"+"Order ID : 1 \n"+"Customer ID:"+id+"\n"+"Products:\n"+comboBox.getSelectedItem()+"\n"+"total price"+totalPrice);
            System.out.println(id + "   " + name + "   " + address);
        }
            if(e.getSource()==comboBox){
                System.out.println(comboBox.getSelectedItem());
                for(int i=0;i<n;i++){
                if(comboBox.getSelectedIndex()==0){
                    totalPrice+=599.9;

                }
               else if(comboBox.getSelectedIndex()==1){
                    totalPrice+=19.99;
                }
               else if(comboBox.getSelectedIndex()==2){
                    totalPrice+=39.99;
                }
                System.out.println(totalPrice);
                }
                 //textArea.setText("total price :"+totalPrice);
                System.out.println(totalPrice);

            }

    }

    }