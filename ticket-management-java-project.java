USER REGISTATION AND LOG IN
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, registerButton;

    public Login() {
        // Set up the frame
        setTitle("Login");
        setSize(400, 200);
        setLayout(new GridLayout(3, 2));

        // Create the components
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        // Add action listeners to the buttons
        loginButton.addActionListener(this);
        registerButton.addActionListener(this);

        // Add the components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(registerButton);

        // Set the frame to be visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Handle login
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            // TODO: Check if the username and password are correct
            // If they are correct, proceed to the next screen
            // If they are incorrect, show an error message
        } else if (e.getSource() == registerButton) {
            // Handle registration
            // TODO: Show the registration screen
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
ABOUT PAGE
public class AboutUsPage extends JFrame {

    JButton b1;

    public AboutUsPage() {
        setTitle("About Us Page");
        setBounds(100, 100, 700, 700);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("E:\\mat 104\\RestaurantManagement\\header-2.png"));
        add(background);
        background.setLayout(new FlowLayout());
        b1 = new JButton("BACK");

        background.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new HomePage();
            }
        });

        setBounds(10, 5, 1000, 700);
    }

    public static void main(String[] args) {
        new AboutUsPage();
    }

}
CONTACT US 
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class ContactUs extends JFrame {

    JButton b1;

    public ContactUs() {
        setTitle("Contact Us Page");
        setBounds(100, 100, 700, 700);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("E:\\mat 104\\RestaurantManagement\\Contact.jpeg"));
        add(background);
        background.setLayout(new FlowLayout());
        b1 = new JButton("BACK");

        background.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new HomePage();
            }
        });

        setBounds(10, 5, 1000, 700);
    }

    public static void main(String[] args) {
        new ContactUs();
    }

}
HOME PAGE JAVA 
[11:27 AM, 9/16/2023] Mumu: import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class ContactUs extends JFrame {

    JButton b1;

    public ContactUs() {
        setTitle("Contact Us Page");
        setBounds(100, 100, 700, 700);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("E:\\mat 104\\RestaurantManagement\\Contact.jpeg"));
        add(background);
        background.setLayout(new FlowLayout());
        b1 = new JButton("BACK");

        background.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new HomePage();
            }
        });

        setBounds(10, 5, 1000, 700);
    }

    public static void main(String[] args) {
        new ContactUs();
    }

}
[11:35 AM, 9/16/2023] Mumu: public class HomePage extends JFrame {

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    public HomePage() {
        setTitle("Cinema booking system");
        setBounds(100, 100, 700, 700);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("E:\\mat 104\\RestaurantManagement\\header-2.png"));
        add(background);
        background.setLayout(new FlowLayout());
        b1 = new JButton("LOG IN AS STAFF");
        b2 = new JButton("LOG IN AS MANAGER");
        b3 = new JButton("ABOUT US");
        b4 = new JButton("CONTACT US");

        background.add(b1);
        background.add(b2);
        background.add(b3);
        background.add(b4);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new LogInStaff();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
                new LogInManager();
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
                new AboutUsPage();
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
                new ContactUs();
            }
        });
        setBounds(10, 5, 1000, 700);
    }

    public static void main(String args[]) {
        new HomePage();

    }
}
LAST PAGE JAVA
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class LastPage extends WindowAdapter {

   private Container c, c1;

    JFrame f;
    private Font f1;

    LastPage() {
        f = new JFrame();
        
        JLabel l1,l2;
        f.setTitle("Last Page");

        l1 = new JLabel("Thank You For Your Hard-Work.");


        l1.setBounds(270, 100, 600, 400);
       l2 = new JLabel("Have A Nice Day.");


        l2.setBounds(270, 140, 600, 400);
       
        f.setSize(1000, 700);
        

        c = f.getContentPane();
        
        c.setBackground(Color.CYAN);

        f1 = new Font("Georgia", Font.BOLD, 30);

        l1.setFont(f1);
        l2.setFont(f1);

        f.setLayout(null);
        f.setVisible(true);
        f.add(l2);

        f.add(l1);
        f.addWindowListener(this);
        f.setSize(1000, 700);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
        if (a == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        new LastPage();
    }
}
LOG IN MANAGER
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class LogInManager {

    private Container c, c1;

    JFrame f;
    private Font f1, use, pas;
    private JTextField u;
    private JPasswordField p;

    LogInManager() {
        f = new JFrame();
        f.setTitle("Manager Log In Page");
        JFrame frame1 = new JFrame();
        JLabel l1, user, pass;
        u = new JTextField();
        p = new JPasswordField();

        l1 = new JLabel("Ticket");
        user = new JLabel("Username");
        pass = new JLabel("Password");
        JButton loginButton = new JButton("Login");
        JButton ResetButton = new JButton("Clear");
        JButton backButton = new JButton("BACK");
        l1.setBounds(240, 0, 600, 400);

        user.setBounds(200, 200, 100, 200);
        pass.setBounds(200, 300, 100, 200);
        u.setBounds(350, 287, 300, 30);
        p.setBounds(350, 387, 300, 30);
        loginButton.setBounds(340, 500, 100, 40);
        ResetButton.setBounds(478, 500, 100, 40);
        backButton.setBounds(600, 500, 100, 40);
        f.add(loginButton);
        f.add(ResetButton);
        f.add(backButton);
        f.setSize(1000, 700);
        frame1.setSize(1000, 700);

        c = f.getContentPane();
        c1 = frame1.getContentPane();
        c1.setBackground(Color.GREEN);
        c.setBackground(Color.CYAN);

        f1 = new Font("Arial", Font.BOLD, 70);
        use = new Font("Arial", Font.BOLD, 20);
        pas = new Font("Arial", Font.BOLD, 20);
        u.setFont(use);
        user.setFont(use);
        pass.setFont(pas);
        l1.setFont(f1);
        f.setLayout(null);
        f.setVisible(true);
        f.add(l1);
        f.add(pass);
        f.add(u);
        f.add(p);

        frame1.setVisible(false);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String username = u.getText();
                    String Password = new String(p.getPassword());
                    File f1 = new File("E:\\mat 104\\RestaurantManagement\\admin.txt");
                    Scanner sc = new Scanner(f1);
                    String user = sc.nextLine();
                    String Pass = sc.nextLine();
                    if (username.equals(user) && Password.equals(Pass)) {
                        JOptionPane.showMessageDialog(c, "login Successful");
                        f.setVisible(false);
                        new Ticket();
                    } else {
                        JOptionPane.showMessageDialog(c, "Invalid Username or Password");
                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LogInManager.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        ResetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ResetButton) {
                    u.setText("");
                    p.setText("");
                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                new HomePage();
            }
        });
        f.add(user);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new LogInManager();
    }
}
LOG IN STAFF JAVA
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class LogInStaff {

    private Container c, c1;

    JFrame f;
    private Font f1, use, pas;
    private JTextField u;
    private JPasswordField p;

    LogInStaff() {
        f = new JFrame();
        JFrame frame1 = new JFrame();
        JLabel l1, user, pass;
        u = new JTextField();
        p = new JPasswordField();
        f.setTitle("Staff Log In Page");
        l1 = new JLabel("Code With Food");
        user = new JLabel("Username");
        pass = new JLabel("Password");
        JButton loginButton = new JButton("LOG IN");
        JButton ResetButton = new JButton("CLEAR");
        JButton backButton = new JButton("BACK");
        l1.setBounds(240, 0, 600, 400);

        user.setBounds(200, 200, 100, 200);
        pass.setBounds(200, 300, 100, 200);
        u.setBounds(350, 287, 300, 30);
        p.setBounds(350, 387, 300, 30);
        loginButton.setBounds(340, 500, 100, 40);
        ResetButton.setBounds(478, 500, 100, 40);
        backButton.setBounds(600, 500, 100, 40);

        f.add(loginButton);
        f.add(ResetButton);
        f.add(backButton);
        f.setSize(1000, 700);
        frame1.setSize(1000, 700);

        c = f.getContentPane();
        c1 = frame1.getContentPane();
        c1.setBackground(Color.GREEN);
        c.setBackground(Color.CYAN);

        f1 = new Font("Arial", Font.BOLD, 70);
        use = new Font("Arial", Font.BOLD, 20);
        pas = new Font("Arial", Font.BOLD, 20);
        u.setFont(use);
        user.setFont(use);
        pass.setFont(pas);
        l1.setFont(f1);
        f.setLayout(null);
        f.setVisible(true);
        f.add(l1);
        f.add(pass);
        f.add(u);
        f.add(p);

        frame1.setVisible(false);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String username = u.getText();
                    String Password = new String(p.getPassword());
                    File f1 = new File("E:\\mat 104\\RestaurantManagement\\admins.txt");
                    Scanner sc = new Scanner(f1);
                    String user = sc.nextLine();
                    String Pass = sc.nextLine();
                    if (username.equals(user) && Password.equals(Pass)) {
                        JOptionPane.showMessageDialog(c, "login Successful");
                        f.setVisible(false);

                        new TicketStaff();
                    } else {
                        JOptionPane.showMessageDialog(c, "Invalid Username or Password");
                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LogInStaff.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        ResetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ResetButton) {
                    u.setText("");
                    p.setText("");
                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                new HomePage();
            }
        });
        f.add(user);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new LogInStaff();
    }
}
PLACE ODER JAVA 1
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PlaceOrder1 extends JFrame implements ActionListener {

    private JTable table;
    private DefaultTableModel model;

    private JScrollPane scroll;

    private Container c;

    private JLabel titleLabel, fnLabel, lnLabel, TotalPrice;
    private JTextField fnTf, lnTf, phoneTf, gpaTf, Price;

    private JButton addButton, updateButton, deleteButton, clearButton, confrim, backButton, homeButton, exitButton;

    private String[] columns = { "Item ", "Price" };
    private String[] rows = new String[4];

    public PlaceOrder1() {
        initComponents();
    }

    public void initComponents() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(1000, 900);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.setTitle("Place Order");

        c = this.getContentPane();

        c.setLayout(null);

        c.setBackground(Color.CYAN);

        Font font = new Font("Arial", Font.BOLD, 16);

        titleLabel = new JLabel("Place Order");

        titleLabel.setFont(font);

        titleLabel.setBounds(140, 10, 250, 50);

        c.add(titleLabel);

        fnLabel = new JLabel("Item name");

        fnLabel.setBounds(10, 80, 140, 30);

        fnLabel.setFont(font);

        c.add(fnLabel);

        fnTf = new JTextField();

        fnTf.setBounds(110, 80, 200, 30);

        fnTf.setFont(font);

        c.add(fnTf);

        addButton = new JButton("Add");

        addButton.setBounds(20, 250, 100, 30);

        addButton.setFont(font);

        c.add(addButton);

        lnLabel = new JLabel("Price");
        lnLabel.setBounds(10, 130, 150, 30);
        lnLabel.setFont(font);
        c.add(lnLabel);

        TotalPrice = new JLabel("Total");
        TotalPrice.setBounds(10, 200, 150, 30);
        TotalPrice.setFont(font);
        c.add(TotalPrice);

        lnTf = new JTextField();

        lnTf.setBounds(110, 130, 200, 30);

        lnTf.setFont(font);

        c.add(lnTf);

        Price = new JTextField();
        Price.setBounds(110, 200, 200, 30);
        Price.setFont(font);
        c.add(Price);

        updateButton = new JButton("Update");

        updateButton.setBounds(260, 250, 100, 30);

        updateButton.setFont(font);

        c.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(140, 250, 100, 30);
        c.add(deleteButton);

        deleteButton.setFont(font);

        clearButton = new JButton("clear ");

        clearButton.setBounds(60, 330, 100, 30);

        clearButton.setFont(font);
        c.add(clearButton);

        backButton = new JButton("BACK");

        backButton.setBounds(550, 600, 100, 30);

        backButton.setFont(font);
        c.add(backButton);

        homeButton = new JButton("HOME ");

        homeButton.setBounds(700, 600, 100, 30);

        homeButton.setFont(font);

        c.add(homeButton);

        exitButton = new JButton("EXIT");

        exitButton.setBounds(850, 600, 100, 30);

        exitButton.setFont(font);

        c.add(exitButton);

        confrim = new JButton("Confrim");
        confrim.setBounds(210, 330, 100, 30);
        confrim.setFont(font);
        c.add(confrim);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.PINK);
        table.setBackground(Color.WHITE);

        scroll = new JScrollPane(table);
        scroll.setBounds(450, 60, 500, 265);
        c.add(scroll);

        File fil = new File("E:\\mat 104\\RestaurantManagement\\ticket.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(fil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        String data[][] = new String[14][3];
        String column[] = { "ID", "NAME", "PRICE" };

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = sc.nextLine();
            }

        }
        JTable jt = new JTable(data, column);

        JScrollPane scrol = new JScrollPane(jt);
        scrol.setBounds(10, 400, 500, 265);

        c.add(scrol);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        confrim.addActionListener(this);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new TicketStaff();
            }
        });

        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new HomePage();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new LastPage();
            }
        });

        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {

                int numberOfRow = table.getSelectedRow();

                String f_name = model.getValueAt(numberOfRow, 0).toString();

                String l_name = model.getValueAt(numberOfRow, 1).toString();

                fnTf.setText(f_name);

                lnTf.setText(l_name);

            }
        });

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {
            rows[0] = fnTf.getText();

            rows[1] = lnTf.getText();

            model.addRow(rows);

        } else if (e.getSource() == clearButton) {

            fnTf.setText("");

            lnTf.setText("");

        } else if (e.getSource() == deleteButton) {

            int numberOfRow = table.getSelectedRow();

            if (numberOfRow >= 0) {

                model.removeRow(numberOfRow);

            } else {

                JOptionPane.showMessageDialog(null, "no row has been seleted or no row exits");
            }

        } else if (e.getSource() == updateButton) {

            int numberOfRow = table.getSelectedRow();

            String f_name = fnTf.getText();

            String l_name = lnTf.getText();

            model.setValueAt(f_name, numberOfRow, 0);

            model.setValueAt(l_name, numberOfRow, 1);

        } else if (e.getSource() == confrim) {
            int numrows = table.getRowCount();
            double tot = 0;
            for (int i = 0; i < numrows; i++) {
                double val = Double.valueOf(table.getValueAt(i, 1).toString());
                tot += val;
            }
            Price.setText(Double.toString(tot));

        }
    }

    public static void main(String[] args) {

        new PlaceOrder1();

    }

}
PLACE ODER 2
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PlaceOrder2 extends JFrame implements ActionListener {

    private JTable table;
    private DefaultTableModel model;

    private JScrollPane scroll;

    private Container c;

    private JLabel titleLabel, fnLabel, lnLabel, TotalPrice;
    private JTextField fnTf, lnTf, phoneTf, gpaTf, Price;

    private JButton addButton, updateButton, deleteButton, clearButton, confrim, backButton, homeButton, exitButton;

    private String[] columns = { "Item ", "Price" };
    private String[] rows = new String[4];

    public PlaceOrder2() {
        initComponents();
    }

    public void initComponents() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(1000, 900);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.setTitle("Place Order");

        c = this.getContentPane();

        c.setLayout(null);

        c.setBackground(Color.CYAN);

        Font font = new Font("Arial", Font.BOLD, 16);

        titleLabel = new JLabel("PLACE ORDER");

        titleLabel.setFont(font);

        titleLabel.setBounds(140, 10, 250, 50);

        c.add(titleLabel);

        fnLabel = new JLabel("Item name");

        fnLabel.setBounds(10, 80, 140, 30);

        fnLabel.setFont(font);

        c.add(fnLabel);

        fnTf = new JTextField();

        fnTf.setBounds(110, 80, 200, 30);

        fnTf.setFont(font);

        c.add(fnTf);

        addButton = new JButton("Add");

        addButton.setBounds(20, 250, 100, 30);

        addButton.setFont(font);

        c.add(addButton);

        lnLabel = new JLabel("Price");
        lnLabel.setBounds(10, 130, 150, 30);

        lnLabel.setFont(font);

        c.add(lnLabel);

        TotalPrice = new JLabel("Total");
        TotalPrice.setBounds(10, 200, 150, 30);
        TotalPrice.setFont(font);
        c.add(TotalPrice);

        lnTf = new JTextField();

        lnTf.setBounds(110, 130, 200, 30);

        lnTf.setFont(font);

        c.add(lnTf);

        Price = new JTextField();
        Price.setBounds(110, 200, 200, 30);
        Price.setFont(font);
        c.add(Price);

        updateButton = new JButton("Update");

        updateButton.setBounds(260, 250, 100, 30);

        updateButton.setFont(font);

        c.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(140, 250, 100, 30);
        c.add(deleteButton);

        deleteButton.setFont(font);

        clearButton = new JButton("clear ");

        clearButton.setBounds(60, 330, 100, 30);

        clearButton.setFont(font);
        c.add(clearButton);

        backButton = new JButton("BACK");

        backButton.setBounds(550, 600, 100, 30);

        backButton.setFont(font);
        c.add(backButton);

        homeButton = new JButton("HOME ");

        homeButton.setBounds(700, 600, 100, 30);

        homeButton.setFont(font);

        c.add(homeButton);

        exitButton = new JButton("EXIT");

        exitButton.setBounds(850, 600, 100, 30);

        exitButton.setFont(font);

        c.add(exitButton);

        confrim = new JButton("Confrim");
        confrim.setBounds(210, 330, 100, 30);
        confrim.setFont(font);
        c.add(confrim);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.PINK);
        table.setBackground(Color.WHITE);

        scroll = new JScrollPane(table);
        scroll.setBounds(450, 60, 500, 265);
        c.add(scroll);

        File fil = new File("E:\\mat 104\\RestaurantManagement\\ticket.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(fil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        String data[][] = new String[14][3];
        String column[] = { "ID", "NAME", "PRICE" };

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = sc.nextLine();
            }

        }
        JTable jt = new JTable(data, column);

        JScrollPane scrol = new JScrollPane(jt);
        scrol.setBounds(10, 400, 500, 265);

        c.add(scrol);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        confrim.addActionListener(this);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Ticket();
            }
        });

        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new HomePage();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new LastPage();
            }
        });

        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {

                int numberOfRow = table.getSelectedRow();

                String f_name = model.getValueAt(numberOfRow, 0).toString();

                String l_name = model.getValueAt(numberOfRow, 1).toString();

                fnTf.setText(f_name);

                lnTf.setText(l_name);

            }
        });

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {
            rows[0] = fnTf.getText();

            rows[1] = lnTf.getText();

            model.addRow(rows);

        } else if (e.getSource() == clearButton) {

            fnTf.setText("");

            lnTf.setText("");

        } else if (e.getSource() == deleteButton) {

            int numberOfRow = table.getSelectedRow();

            if (numberOfRow >= 0) {

                model.removeRow(numberOfRow);

            } else {

                JOptionPane.showMessageDialog(null, "no row has been seleted or no row exits");
            }

        } else if (e.getSource() == updateButton) {

            int numberOfRow = table.getSelectedRow();

            String f_name = fnTf.getText();

            String l_name = lnTf.getText();

            model.setValueAt(f_name, numberOfRow, 0);

            model.setValueAt(l_name, numberOfRow, 1);

        } else if (e.getSource() == confrim) {
            int numrows = table.getRowCount();
            double tot = 0;
            for (int i = 0; i < numrows; i++) {
                double val = Double.valueOf(table.getValueAt(i, 1).toString());
                tot += val;
            }
            Price.setText(Double.toString(tot));

        }
    }

    public static void main(String[] args) {

        new PlaceOrder2();

    }

}
STAFF LIST 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class StaffList extends JFrame {

    JFrame f;

    StaffList() {
        f = new JFrame();
        JButton b = new JButton("BACK");
        JButton b1 = new JButton("HOME");
        JFrame f = new JFrame();
        f.setTitle("Available Staff");
        b.setBounds(10, 500, 100, 50);
        b1.setBounds(150, 500, 100, 50);
        File fil = new File("E:\\mat 104\\RestaurantManagement\\staff.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(fil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StaffList.class.getName()).log(Level.SEVERE, null, ex);
        }
        String data[][] = new String[14][3];
        String column[] = {"ID", "NAME", "SALARY"};

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = sc.nextLine();
            }

        }
        JTable jt = new JTable(data, column);

        jt.setBounds(30, 200, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                new Ticket();
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                new HomePage();
            }
        });
        f.add(b);
        f.add(b1);
        f.add(sp);
        f.setSize(1000, 700);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new StaffList();
    }
}
TICKET JAVA
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ticket {

    public Ticket() {

        JFrame frame1 = new JFrame();
        JButton ShowMenu = new JButton("SHOW AVAILABLE FOOD");
        JButton Staff = new JButton("SHOW AVAILABLE STAFF");
        JButton PlaceOrder = new JButton("PLACE ORDER");
        JButton logoutButton = new JButton("LOG OUT");

        logoutButton.setBounds(700, 600, 100, 40);

        frame1.add(logoutButton);
         frame1.setTitle("Ticket-Manager");
          ShowMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame1.setVisible(false);
                new  TicketTable();
            }
        });
           Staff.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame1.setVisible(false);
                new  StaffList();
            }
        });
  PlaceOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               frame1.setVisible(false);
               new  PlaceOrder2();

            }
        });
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame1.setVisible(false);
                new HomePage();
            }
        });
        frame1.setSize(1000, 700);
        frame1.setLayout(null);
        frame1.setVisible(true);
        ShowMenu.setBounds(330, 100, 200, 60);
        Staff.setBounds(330, 200, 200, 60);
        PlaceOrder.setBounds(330, 300, 200, 60);
       
        frame1.add(PlaceOrder);
        frame1.add(Staff);
        frame1.add(ShowMenu);
        frame1.getContentPane().setBackground(Color.CYAN);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Ticket();
    }

}
TICKET TABLE JAVA 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class TicketTable extends JFrame {

    JFrame f;

    TicketTable() {
        f = new JFrame();
        JButton b = new JButton("BACK");

        JButton b1 = new JButton("HOME");
       
 f.setTitle("Available Ticket");
       
        b1.setBounds(250, 400, 100, 50);
       

        b.setBounds(110, 400, 100, 50);
        File fil = new File("E:\\mat 104\\RestaurantManagement\\Ticket.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(fil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        String data[][] = new String[14][3];
        String column[] = {"ID", "NAME", "PRICE"};

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = sc.nextLine();
            }

        }
        JTable jt = new JTable(data, column);

       
        JScrollPane sp = new JScrollPane(jt);
         sp.setBounds(30, 200, 200, 300);
  b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                 f.setVisible(false);
                new Ticket();
            }
        });
    b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
              f.setVisible(false);
                new HomePage();
            }
        });
        
         f.add(b1);
        f.add(b);
        f.add(sp);
        f.setSize(1000, 700);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new  TicketTable();
    }
}
TICKET TABLE 1
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class TicketTable1 extends JFrame {

    JFrame f;

    TicketTable1() {
        f = new JFrame();
        JButton b = new JButton("BACK");

        JButton b1 = new JButton("HOME");

        f.setTitle("Available Ticket");

        b1.setBounds(250, 400, 100, 50);

        b.setBounds(110, 400, 100, 50);
        File fil = new File("E:\\mat 104\\RestaurantManagement\\Ticket.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(fil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        String data[][] = new String[14][3];
        String column[] = {"ID", "NAME", "PRICE"};

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = sc.nextLine();
            }

        }
        JTable jt = new JTable(data, column);

        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(30, 200, 200, 300);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                new TicketStaff();
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                new HomePage();
            }
        });

        f.add(b1);
        f.add(b);
        f.add(sp);
        f.setSize(1000, 700);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TicketTable1();
    }
}

