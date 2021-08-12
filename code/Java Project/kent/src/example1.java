//package testaddress;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
 
 
 
public class example1 extends JFrame {
   public static JTable table;
   public static DefaultTableModel model;
     
    public static void MyAddressBook(Container pane) throws FileNotFoundException{
         
        JLabel Name;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
         
        Name = new JLabel("Name:");
        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 0; 
        gbc.anchor = GridBagConstraints.NORTH;       
        pane.add(Name, gbc);
         
        final JTextField textName = new JTextField();
        gbc.weightx = 0.5;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        pane.add(textName, gbc);
         
        JLabel HPhone = new JLabel("Home Phone #:");
        gbc.weightx = 0.5;
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        pane.add(HPhone, gbc);
         
        final JTextField textHPhone = new JTextField();
        gbc.weightx = 0.5;
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        pane.add(textHPhone, gbc);
        
       JLabel CellPhone = new JLabel("Cell Phone #:");
       gbc.weightx = 0.5;
       gbc.gridx = 0;
       gbc.gridy = 1;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(CellPhone, gbc);
        
       final JTextField textCPhone = new JTextField();
       gbc.weightx = 0.5;
       gbc.gridx = 1;
       gbc.gridy = 1;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(textCPhone, gbc);
        
       JLabel Address = new JLabel("Address");
       gbc.weightx = 0.5;
       gbc.gridx = 2;
       gbc.gridy = 1;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(Address, gbc);
        
       final JTextField textAddress = new JTextField();
       gbc.weightx = 0.5;
       gbc.gridx = 3;
       gbc.gridy = 1;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(textAddress, gbc);
        
       JLabel City = new JLabel("City:");
       gbc.weightx = 0.5;
       gbc.gridx = 0;
       gbc.gridy = 2;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(City, gbc);
        
       final JTextField textCity = new JTextField();
       gbc.weightx = 0.5;
       gbc.gridx = 1;
       gbc.gridy = 2;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(textCity, gbc);
        
       JLabel State = new JLabel("State:");
       gbc.weightx = 0.5;
       gbc.gridx = 2;
       gbc.gridy = 2;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(State, gbc);
        
       final JTextField textState = new JTextField();
       gbc.weightx = 0.5;
       gbc.gridx = 3;
       gbc.gridy = 2;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(textState, gbc);
        
       JLabel Zip = new JLabel("Zipcode:");
       gbc.weighty = 0.1;
       gbc.weightx = 0.5;
       gbc.gridx = 0;
       gbc.gridy = 3;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(Zip, gbc);
        
       final JTextField textZip = new JTextField();
       gbc.weighty = 0.1;
       gbc.weightx = 0.5;
       gbc.gridx = 1;
       gbc.gridy = 3;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(textZip, gbc);
        
       JLabel Country = new JLabel("Country:");
       gbc.weightx = 0.5;
       gbc.gridx = 2;
       gbc.gridy = 3;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(Country, gbc);
        
       final JTextField textCountry = new JTextField();
       gbc.weighty = 0.1;
       gbc.weightx = 0.5;
       gbc.gridx = 3;
       gbc.gridy = 3;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(textCountry, gbc);
        
       JButton exit = new JButton("Exit");
       gbc.weightx = 0.5;
       gbc.gridx = 3;
       gbc.gridy = 5;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(exit, gbc);
        
       exit.addActionListener(new ActionListener()
    {
    public void actionPerformed(ActionEvent e)
    {
    if (JOptionPane.showConfirmDialog(null, "Do you really want to quit?", "Quit",
    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
    {
    System.exit(0);
    }
    }
    });
        
       JButton save = new JButton("Save");
       gbc.weightx = 0.5;
       gbc.gridx = 2;
       gbc.gridy = 5;
       gbc.anchor = GridBagConstraints.NORTH;
       pane.add(save, gbc);
        
       JSeparator sep = new JSeparator();
       sep.setPreferredSize(new Dimension(5,1));
       gbc.weighty = 0.2;
       gbc.weightx = 0.5;
       gbc.gridx = 0;
       gbc.gridy = 7;
       gbc.gridwidth = 5;
       gbc.anchor = GridBagConstraints.CENTER;
       pane.add(sep, gbc);
        
               
    table = new JTable();
    JScrollPane scroll = new JScrollPane(table);
    String[] colNames = { "Name:", "Home Phone #:", "Cell Phone #:", "Address",
          "City:", "State:", "Zip Code:", "Country:"};
    model = new DefaultTableModel(colNames, 0);
    final FileInputStream is;    
    File f = new File("E:\\KentronicxZ\\MyAddressBook.txt");
    is = new FileInputStream(f); 
    InsertData(is);
    gbc.weighty = 1;
    gbc.weightx = 0.5;
    gbc.gridx = 0;  
    gbc.gridy = 8;  
    gbc.gridwidth = 4;
    gbc.gridheight = 9;
    gbc.anchor = GridBagConstraints.CENTER;
    pane.add(new JScrollPane(table), gbc);
     
     
    save.addActionListener(new ActionListener() {
              
     @Override
     public void actionPerformed(ActionEvent e) {
     BufferedWriter writer;
     try {
     File file = new File("E:\\KentronicxZ\\MyAddressBook.txt");
     writer = new BufferedWriter(new FileWriter("E:\\KentronicxZ\\MyAddressBook.txt",true));
     writer.write(textName.getText() + "\t" + textHPhone.getText() 
     + "\t" + textCPhone.getText() + "\t" + textAddress.getText() + "\t"
     + textCity.getText() + "\t" + textState.getText() + "\t" + 
     textZip.getText() + "\t" + textCountry.getText());
     writer.newLine();
     writer.close();
     } catch(FileNotFoundException ex) {
     } catch (IOException ex) {
     }
        Scanner scan = new Scanner(is);
        String[] array;
        while (scan.hasNextLine()) {
        String line = scan.nextLine();
        if(line.indexOf(",")>-1)
            array = line.split(",");
        else
            array = line.split("\t");
        Object[] data = new Object[array.length];
        System.arraycopy(array, 0, data, 0, array.length);
        model.addRow(data);
    }
    table.setModel(model);
     }});
    }
                       
 
        
 public static void InsertData(FileInputStream is){
    Scanner scan = new Scanner(is);
    String[] array;
    while (scan.hasNextLine()) {
        String line = scan.nextLine();
        if(line.indexOf(",")>-1)
            array = line.split(",");
        else
            array = line.split("\t");
        Object[] data = new Object[array.length];
        System.arraycopy(array, 0, data, 0, array.length);
        model.addRow(data);
    }
    table.setModel(model);
     
     
}
 
 
    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame = new example1();
        frame.setTitle("My Address Book");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyAddressBook(frame.getContentPane());
        frame.setVisible(true);
    }
}